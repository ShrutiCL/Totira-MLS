package com.cl.totira.MLSWrapper;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

import org.apache.commons.lang.StringUtils;
import org.dozer.DozerBeanMapper;
import org.realtors.rets.client.CommonsHttpClient;
import org.realtors.rets.client.GetObjectRequest;
import org.realtors.rets.client.RetsException;
import org.realtors.rets.client.RetsHttpClient;
import org.realtors.rets.client.RetsSession;
import org.realtors.rets.client.RetsVersion;
import org.realtors.rets.client.SearchRequest;
import org.realtors.rets.client.SearchResultImpl;
import org.realtors.rets.client.SingleObjectResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.cl.totira.MLSWrapper.model.MLSCollection;
import com.cl.totira.MLSWrapper.model.MLSCollectionPOJO;
import com.cl.totira.MLSWrapper.repository.MLSRepository;
import com.cl.totira.utils.MapperUtil;

@SpringBootApplication
@EnableMongoRepositories
public class MLSWrapperApplication implements CommandLineRunner{

	@Autowired
	MLSRepository mlsRepo;

	SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy hh:mm:ss a");
	SimpleDateFormat formatter1 = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.S");


	public static void main(String[] args) {
		SpringApplication.run(MLSWrapperApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("MLSWrapperApplication.run(): Start");
		getMLSListing();
		//createMLSListItem();
		//showAllListing();
		System.out.println("MLSWrapperApplication.run(): End");
	}

	//Get MLS listing
	void getMLSListing()
	{
		//Create a RetsHttpClient (other constructors provide configuration i.e. timeout, gzip capability)
		RetsHttpClient httpClient = new CommonsHttpClient();
		RetsVersion retsVersion = RetsVersion.RETS_10;

		String loginUrl = "http://retsau.torontomls.net:6103/rets-treb3pv/server/login";
		String username = "EV19pho";
		String password = "4M$9h53";

		//Create a RetesSession with RetsHttpClient
		RetsSession session = new RetsSession(loginUrl, httpClient, retsVersion);    

		//Set method as GET or POST
		session.setMethod("POST");
		try {
			//Login
			System.out.println("MLSWrapperApplication.getMLSListing(): Before RETS login");
			session.login(username, password);
			System.out.println("MLSWrapperApplication.getMLSListing(): After RETS login");

		} catch (RetsException e) {
			System.out.println("MLSWrapperApplication.getMLSListing(): Exception while RETS login");
			e.printStackTrace();
		}

		String sResource = "Property";
		String sClass = "ResidentialProperty";
		String sQuery = "((Area_code=01),(Ml_num=C5455086))";

		//Query=((Area_code=01),(Ml_num=C5464416)
		//Create a SearchRequest
		SearchRequest request = new SearchRequest(sResource, sClass, sQuery);
		System.out.println("MLSWrapperApplication.getMLSListing(): Check 1");

		//Select only available fields
		//String select ="field1,field2,field3,field4,field5";
		//String select ="field4";
		//	request.setSelect(select);
		System.out.println("MLSWrapperApplication.getMLSListing(): Check 2");
		//Set request to retrive count if desired
		request.setCountFirst();
		System.out.println("MLSWrapperApplication.getMLSListing(): Check 3");
		SearchResultImpl response;
		try {
			//Execute the search
			response= (SearchResultImpl) session.search(request);
			System.out.println("MLSWrapperApplication.getMLSListing(): check 4");
			System.out.println("MLSWrapperApplication.getMLSListing(): check 5: Rows: "+response.getRowCount());
			System.out.println("MLSWrapperApplication.getMLSListing(): check 6:"+response.toString());

			//Print out count and columns
			int count = response.getCount();
			System.out.println("COUNT: " + count);
			System.out.println("COLUMNS: " + StringUtils.join(response.getColumns(), "\t"));

			//Iterate over, print records
			for (int row = 0; row < response.getRowCount(); row++){
				//createMLSListItem();
				//System.out.println("ROW "+ row +": " + StringUtils.join(response.getRow(row), "\t"));
				String[] resp=response.getRow(row);
				System.out.println("ROW "+ row +": "+resp.toString());

				if(resp!=null) {
					createMLSListItem(resp,session);
				}
			}
		} catch (RetsException e) {
			e.printStackTrace();
		} 
		finally {
			if(session != null) { 
				try {
					session.logout(); 
				} 
				catch(RetsException e) {
					e.printStackTrace();
				}
			}
		}

	}

	//CREATE
	void createMLSListItem(String[] resp,RetsSession session) {
		System.out.println("Data creation started...");
		MapperUtil mapper = new MapperUtil();
		MLSCollectionPOJO pojo;
		//MLSCollection collection;

		try {
			pojo = createPojo(resp);
			String ml_num=pojo.getMl_num();
			List<String> imagesList=getImage(ml_num,session);
			/*
			 * List<String> imagesList=Arrays.asList(
			 * "Users/rakeshk/Downloads/demo/downloadedImages/C5443495-1.jpeg",
			 * "Users/rakeshk/Downloads/demo/downloadedImages/C5443495-2.jpeg");
			 */
			pojo.setImages(imagesList);
			//pojo=		mapper.map(resp, pojo);
			mlsRepo.save(new MLSCollection(pojo));

		} catch (ParseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println("Data creation complete...");

	}
	private List<String> getImage(String ml_num, RetsSession session) {
		String sResource = "Property";
		String objType   = "Photo";
		String seqNum 	= "*"; // * denotes get all pictures associated with id (from Rets Spec)
		List<String> idsList = Arrays.asList(ml_num);
		List<String> imagesList = new ArrayList();
		try {
			//Create a GetObjectRequeset
			GetObjectRequest req = new GetObjectRequest(sResource, objType);
			System.out.println("Check 1");
			//Add the list of ids to request on (ids can be determined from records)
			Iterator<String> idsIter = idsList.iterator();
			while(idsIter.hasNext()) {
				req.addObject(idsIter.next(), seqNum);
			}
			System.out.println("Check 2");
			//Execute the retrieval of objects 
			Iterator<SingleObjectResponse> singleObjectResponseIter = session.getObject(req).iterator();
			System.out.println("Check 3");
			//Iterate over each Object 
			while (singleObjectResponseIter.hasNext()) {
				System.out.println("Check 4");
				SingleObjectResponse sor = (SingleObjectResponse)singleObjectResponseIter.next();

				//Retrieve in info and print
				String type =			sor.getType();
				String contentID = 		sor.getContentID();
				String objectID = 		sor.getObjectID();
				String description = 	sor.getDescription();
				String location = 		sor.getLocation();
				InputStream is = 		sor.getInputStream();

				System.out.print("type:" + type);
				System.out.print(" ,contentID:" + contentID);
				System.out.print(" ,objectID:" + objectID);
				System.out.println(" ,description:" + description);
				System.out.println("location:" + location); 

				//Download object
				try {
					String dest			= "/Users/rakeshk/Downloads/demo/downloadedImages/";
					int size = is.available();
					String filename = dest + contentID +"-" + objectID + ".jpeg";
					OutputStream out = new FileOutputStream(new File(filename)); 
					int read = 0;
					byte[] bytes = new byte[1024];

					while ((read = is.read(bytes)) != -1) {

						out.write(bytes, 0, read);
					}

					is.close();
					out.flush();
					out.close();

					System.out.println("New file with size " + size + " created: " + filename);
					imagesList.add(filename);
				} catch (IOException e) {
					System.out.println(e.getMessage());
				}

			}

		} catch (RetsException e) {
			e.printStackTrace();
		}
		finally {
			/*if(session != null) {
				try {
					session.logout();
				}
				catch (RetsException e) {
					e.printStackTrace();
				}
			}*/
		}
		return imagesList;		
	}

	private MLSCollectionPOJO createPojo(String[] resp) throws ParseException {
		MLSCollectionPOJO pojo= new MLSCollectionPOJO();

		pojo.setA_c(resp[0]);
		pojo.setAccess_prop1(resp[1]);
		pojo.setAccess_prop2(resp[2]);
		pojo.setAcres(resp[3]);
		pojo.setAd_text(resp[4]);
		if(resp[5]!=null && resp[5].trim().length()!=0) {
			pojo.setAddl_mo_fee(Double.parseDouble(resp[5]));
		}else {
			pojo.setAddl_mo_fee(Double.parseDouble("0"));
		}
		pojo.setAddr(resp[6]);
		pojo.setAll_inc(resp[7]);
		pojo.setAlt_power1(resp[8]);
		pojo.setAlt_power2(resp[9]);
		pojo.setApt_num(resp[10]);
		pojo.setArea(resp[11]);
		pojo.setArea_code(resp[12]);
		if(resp[13]!=null && resp[13].trim().length()!=0) {
			pojo.setAss_year(Double.parseDouble(resp[13]));
		}else {
			pojo.setAss_year(Double.parseDouble("0"));
		}
		if(resp[14]!=null && resp[14].trim().length()!=0) {
			pojo.setBath_tot(Double.parseDouble(resp[14]));
		}else {
			pojo.setBath_tot(Double.parseDouble("0")); 
		}
		if(resp[15]!=null && resp[15].trim().length()!=0) {
			pojo.setBr(Double.parseDouble(resp[15]));
		}else {
			pojo.setBr(Double.parseDouble("0"));
		}
		if(resp[16]!=null && resp[16].trim().length()!=0) {
			pojo.setBr_plus(Double.parseDouble(resp[16]));
		}else {
			pojo.setBr_plus(Double.parseDouble("0"));
		}
		pojo.setBsmt1_out(resp[17]);
		pojo.setBsmt2_out(resp[18]);
		pojo.setCable(resp[19]);
		pojo.setCac_inc(resp[20]);
		if(resp[21]!=null && resp[21].trim().length()!=0) {
			pojo.setCd(formatter.parse(resp[21]));
		}else {
			pojo.setCd(null);
		}
		pojo.setCentral_vac(resp[22]);
		pojo.setCert_lvl(resp[23]);
		if(resp[24]!=null && resp[24].trim().length()!=0) {
			pojo.setCndsold_xd(formatter1.parse(resp[24]));//2022-06-03 00:00:00.0
		}else {
			pojo.setCndsold_xd(null);
		}
		pojo.setCom_coopb(resp[25]);
		pojo.setComel_inc(resp[26]);
		pojo.setCommunity(resp[27]);
		pojo.setCommunity_code(resp[28]);
		pojo.setComp_pts(resp[29]);
		pojo.setCond(resp[30]);
		pojo.setConstr1_out(resp[31]);
		pojo.setConstr2_out(resp[32]);
		pojo.setCounty(resp[33]);
		pojo.setCross_st(resp[34]);
		pojo.setDen_fr(resp[35]);
		if(resp[36]!=null && resp[36].trim().length()!=0) {
			pojo.setDepth(Double.parseDouble(resp[36]));
		}else {
			pojo.setDepth(Double.parseDouble("0"));
		}
		pojo.setDisp_addr(resp[37]);
		if(resp[38]!=null && resp[38].trim().length()!=0) {
			pojo.setDom(Double.parseDouble(resp[38]));
		}else {
			pojo.setDom(Double.parseDouble("0"));
		}
		pojo.setDrive(resp[39]);
		if(resp[40]!=null && resp[40].trim().length()!=0) {
			pojo.setDt_sus(formatter1.parse(resp[40]));
		}else {
			pojo.setDt_sus(null);
		}
		if(resp[41]!=null && resp[41].trim().length()!=0) {
			pojo.setDt_ter(formatter.parse(resp[41]));
		}else {
			pojo.setDt_ter(null);
		}
		pojo.setEasement_rest1(resp[42]);
		pojo.setEasement_rest2(resp[43]);
		pojo.setEasement_rest3(resp[44]);
		pojo.setEasement_rest4(resp[45]);
		pojo.setElec(resp[46]);
		pojo.setElevator(resp[47]);
		pojo.setEnergy_cert(resp[48]);
		pojo.setExtras(resp[49]);
		pojo.setFarm_agri(resp[50]);
		pojo.setFpl_num(resp[51]);
		if(resp[52]!=null && resp[52].trim().length()!=0) {
			pojo.setFront_ft(Double.parseDouble(resp[52]));
		}else {
			pojo.setFront_ft(Double.parseDouble("0"));
		}
		pojo.setFuel(resp[53]);
		pojo.setFurnished(resp[54]);
		if(resp[55]!=null && resp[55].trim().length()!=0) {
			pojo.setGar_spaces(Double.parseDouble(resp[55]));
		}else {
			pojo.setGar_spaces(Double.parseDouble("0"));
		}
		pojo.setGar_type(resp[56]);
		pojo.setGas(resp[57]);
		pojo.setGreen_pis(resp[58]);
		pojo.setHandi_equipped(resp[59]);
		pojo.setHeat_inc(resp[60]);
		pojo.setHeating(resp[61]);
		pojo.setHydro_inc(resp[62]);
		if(resp[63]!=null && resp[63].trim().length()!=0) {
			pojo.setInput_date(formatter1.parse(resp[63]));
		}else {
			pojo.setInput_date(null);
		}
		pojo.setInternet(resp[64]);
		pojo.setIrreg(resp[65]);
		if(resp[66]!=null && resp[66].trim().length()!=0) {
			pojo.setKit_plus(Double.parseDouble(resp[66]));
		}else {
			pojo.setKit_plus(Double.parseDouble("0"));
		}
		pojo.setLaundry(resp[67]);
		pojo.setLaundry_lev(resp[68]);
		if(resp[69]!=null && resp[69].trim().length()!=0) {
			pojo.setLd(formatter1.parse(resp[69]));
		}else {
			pojo.setLd(null);
		}
		pojo.setLease(resp[70]);
		pojo.setLease_term(resp[71]);
		pojo.setLegal_desc(resp[72]);
		pojo.setLevel1(resp[73]);
		pojo.setLevel10(resp[74]);
		pojo.setLevel11(resp[75]);
		pojo.setLevel12(resp[76]);
		pojo.setLevel2(resp[77]);
		pojo.setLevel3(resp[78]);
		pojo.setLevel4(resp[79]);
		pojo.setLevel5(resp[80]);
		pojo.setLevel6(resp[81]);
		pojo.setLevel7(resp[82]);
		pojo.setLevel8(resp[83]);
		pojo.setLevel9(resp[84]);
		pojo.setLink_comment(resp[85]);
		pojo.setLink_yn(resp[86]);
		pojo.setLot_fr_inc(resp[87]);
		pojo.setLotsz_code(resp[88]);
		if(resp[89]!=null && resp[89].trim().length()!=0) {
			pojo.setLp_dol(Double.parseDouble(resp[89]));
		}else {
			pojo.setLp_dol(Double.parseDouble("0"));
		}
		pojo.setLsc(resp[90]);
		pojo.setLse_terms(resp[91]);
		pojo.setMl_num(resp[92]);
		if(resp[93]!=null && resp[93].trim().length()!=0) {
			pojo.setMmap_col(Double.parseDouble(resp[93]));
		}else {
			pojo.setMmap_col(Double.parseDouble("0"));
		}
		if(resp[94]!=null && resp[94].trim().length()!=0) {
			pojo.setMmap_page(Double.parseDouble(resp[94]));
		}else {
			pojo.setMmap_page(Double.parseDouble("0"));
		}
		pojo.setMmap_row(resp[95]);
		pojo.setMunicipality(resp[96]);
		pojo.setMunicipality_code(resp[97]);
		pojo.setMunicipality_district(resp[98]);
		if(resp[99]!=null && resp[99].trim().length()!=0) {
			pojo.setNum_kit(Double.parseDouble(resp[99]));
		}else {
			pojo.setNum_kit(Double.parseDouble("0"));
		}
		pojo.setOcc(resp[100]);
		if(resp[101]!=null && resp[101].trim().length()!=0) {
			pojo.setOh_date1(formatter.parse(resp[101]));
		}else {
			pojo.setOh_date1(null);
		}		
		if(resp[102]!=null && resp[102].trim().length()!=0) {
			pojo.setOh_date2(formatter.parse(resp[102]));
		}else {
			pojo.setOh_date2(null);
		}
		if(resp[103]!=null && resp[103].trim().length()!=0) {
			pojo.setOh_date3(formatter.parse(resp[103]));
		}else {
			pojo.setOh_date3(null);
		}
		if(resp[104]!=null && resp[104].trim().length()!=0) {
			pojo.setOh_date4(formatter.parse(resp[104]));
		}else {
			pojo.setOh_date4(null);
		}
		if(resp[105]!=null && resp[105].trim().length()!=0) {
			pojo.setOh_date5(formatter.parse(resp[105]));
		}else {
			pojo.setOh_date5(null);
		}
		if(resp[106]!=null && resp[106].trim().length()!=0) {
			pojo.setOh_date6(formatter.parse(resp[106]));
		}else {
			pojo.setOh_date6(null);
		}
		if(resp[107]!=null && resp[107].trim().length()!=0) {
			pojo.setOh_dt_stamp(formatter.parse(resp[107]));
		}else {
			pojo.setOh_dt_stamp(null);
		}
		pojo.setOh_from1(resp[108]);
		pojo.setOh_from2(resp[109]);
		pojo.setOh_from3(resp[110]);
		pojo.setOh_from4(resp[111]);
		pojo.setOh_from5(resp[112]);
		pojo.setOh_from6(resp[113]);
		pojo.setOh_Link1(resp[114]);
		pojo.setOh_Link2(resp[115]);
		pojo.setOh_Link3(resp[116]);
		pojo.setOh_Link4(resp[117]);
		pojo.setOh_Link5(resp[118]);
		pojo.setOh_Link6(resp[119]);
		pojo.setOh_to1(resp[120]);
		pojo.setOh_to2(resp[121]);
		pojo.setOh_to3(resp[122]);
		pojo.setOh_to4(resp[123]);
		pojo.setOh_to5(resp[124]);
		pojo.setOh_to6(resp[125]);
		pojo.setOh_Type1(resp[126]);
		pojo.setOh_Type2(resp[127]);
		pojo.setOh_Type3(resp[128]);
		pojo.setOh_Type4(resp[129]);
		pojo.setOh_Type5(resp[130]);
		pojo.setOh_Type6(resp[131]);
		if(resp[132]!=null && resp[132].trim().length()!=0) {
			pojo.setOrig_dol(Double.parseDouble(resp[132]));
		}else {
			pojo.setOrig_dol(Double.parseDouble("0"));
		}
		pojo.setOth_struc1_out(resp[133]);
		pojo.setOth_struc2_out(resp[134]);
		pojo.setOutof_area(resp[135]);
		pojo.setParcel_id(resp[136]);
		if(resp[137]!=null && resp[137].trim().length()!=0) {
			pojo.setPark_chgs(Double.parseDouble(resp[137]));
		}else {
			pojo.setPark_chgs(Double.parseDouble("0"));
		}
		if(resp[138]!=null && resp[138].trim().length()!=0) {
			pojo.setPark_spcs(Double.parseDouble(resp[138]));
		}else {
			pojo.setPark_spcs(Double.parseDouble("0"));
		}
		pojo.setPay_freq(resp[139]);
		if(resp[140]!=null && resp[140].trim().length()!=0) {
			pojo.setPerc_dif(Double.parseDouble(resp[140]));
		}else {
			pojo.setPerc_dif(Double.parseDouble("0"));
		}
		if(resp[141]!=null && resp[141].trim().length()!=0) {
			pojo.setPix_updt(formatter1.parse(resp[141]));
		}else {
			pojo.setPix_updt(null);
		}
		pojo.setPool(resp[142]);
		if(resp[143]!=null && resp[143].trim().length()!=0) {
			pojo.setPoss_date(formatter1.parse(resp[143]));
		}else {
			pojo.setPoss_date(null);
		}
		pojo.setPotl(resp[144]);
		pojo.setPr_lsc(resp[145]);
		pojo.setPrkg_inc(resp[146]);
		pojo.setProp_feat1_out(resp[147]);
		pojo.setProp_feat2_out(resp[148]);
		pojo.setProp_feat3_out(resp[149]);
		pojo.setProp_feat4_out(resp[150]);
		pojo.setProp_feat5_out(resp[151]);
		pojo.setProp_feat6_out(resp[152]);
		pojo.setProp_mgmt(resp[153]);
		pojo.setPvt_ent(resp[154]);
		pojo.setRetirement(resp[155]);
		pojo.setRltr(resp[156]);
		pojo.setRm1_dc1_out(resp[157]);
		pojo.setRm1_dc2_out(resp[158]);
		pojo.setRm1_dc3_out(resp[159]);
		if(resp[160]!=null && resp[160].trim().length()!=0) {
			pojo.setRm1_len(Double.parseDouble(resp[160]));
		}else {
			pojo.setRm1_len(Double.parseDouble("0"));
		}
		pojo.setRm1_out(resp[161]);
		if(resp[162]!=null && resp[162].trim().length()!=0) {
			pojo.setRm1_wth(Double.parseDouble(resp[162]));
		}else {
			pojo.setRm1_wth(Double.parseDouble("0"));
		}
		pojo.setRm10_dc1_out(resp[163]);
		pojo.setRm10_dc2_out(resp[164]);
		pojo.setRm10_dc3_out(resp[165]);
		if(resp[166]!=null && resp[166].trim().length()!=0) {
			pojo.setRm10_len(Double.parseDouble(resp[166]));
		}else {
			pojo.setRm10_len(Double.parseDouble("0"));
		}
		pojo.setRm10_out(resp[167]);
		if(resp[168]!=null && resp[168].trim().length()!=0) {
			pojo.setRm10_wth(Double.parseDouble(resp[168]));
		}else {
			pojo.setRm10_wth(Double.parseDouble("0"));
		}
		pojo.setRm11_dc1_out(resp[169]);
		pojo.setRm11_dc2_out(resp[170]);
		pojo.setRm11_dc3_out(resp[171]);
		if(resp[172]!=null && resp[172].trim().length()!=0) {
			pojo.setRm11_len(Double.parseDouble(resp[172]));
		}else {
			pojo.setRm11_len(Double.parseDouble("0"));
		}
		pojo.setRm11_out(resp[173]);
		if(resp[174]!=null && resp[174].trim().length()!=0) {
			pojo.setRm11_wth(Double.parseDouble(resp[174]));
		}else {
			pojo.setRm11_wth(Double.parseDouble("0"));
		}
		pojo.setRm12_dc1_out(resp[175]);
		pojo.setRm12_dc2_out(resp[176]);
		pojo.setRm12_dc3_out(resp[177]);
		if(resp[178]!=null && resp[178].trim().length()!=0) {
			pojo.setRm12_len(Double.parseDouble(resp[178]));
		}else {
			pojo.setRm12_len(Double.parseDouble("0"));
		}
		pojo.setRm12_out(resp[179]);
		if(resp[180]!=null && resp[180].trim().length()!=0) {
			pojo.setRm12_wth(Double.parseDouble(resp[180]));
		}else {
			pojo.setRm12_wth(Double.parseDouble("0"));
		}
		pojo.setRm2_dc1_out(resp[181]);
		pojo.setRm2_dc2_out(resp[182]);
		pojo.setRm2_dc3_out(resp[183]);
		if(resp[184]!=null && resp[184].trim().length()!=0) {
			pojo.setRm2_len(Double.parseDouble(resp[184]));
		}else {
			pojo.setRm2_len(Double.parseDouble("0"));
		}
		pojo.setRm2_out(resp[185]);
		if(resp[186]!=null && resp[186].trim().length()!=0) {
			pojo.setRm2_wth(Double.parseDouble(resp[186]));
		}else {
			pojo.setRm2_wth(Double.parseDouble("0"));
		}
		pojo.setRm3_dc1_out(resp[187]);
		pojo.setRm3_dc2_out(resp[188]);
		pojo.setRm3_dc3_out(resp[189]);
		if(resp[190]!=null && resp[190].trim().length()!=0) {
			pojo.setRm3_len(Double.parseDouble(resp[190]));
		}else {
			pojo.setRm3_len(Double.parseDouble("0"));
		}
		pojo.setRm3_out(resp[191]);
		if(resp[192]!=null && resp[192].trim().length()!=0) {
			pojo.setRm3_wth(Double.parseDouble(resp[192]));
		}else {
			pojo.setRm3_wth(Double.parseDouble("0"));
		}
		pojo.setRm4_dc1_out(resp[193]);
		pojo.setRm4_dc2_out(resp[194]);
		pojo.setRm4_dc3_out(resp[195]);
		if(resp[196]!=null && resp[196].trim().length()!=0) {
			pojo.setRm4_len(Double.parseDouble(resp[196]));
		}else {
			pojo.setRm4_len(Double.parseDouble("0"));
		}
		pojo.setRm4_out(resp[197]);
		if(resp[198]!=null && resp[198].trim().length()!=0) {
			pojo.setRm4_wth( Double.parseDouble(resp[198]));
		}else {
			pojo.setRm4_wth(Double.parseDouble("0"));
		}
		pojo.setRm5_dc1_out(resp[199]);
		pojo.setRm5_dc2_out(resp[200]);
		pojo.setRm5_dc3_out(resp[201]);
		if(resp[202]!=null && resp[202].trim().length()!=0) {
			pojo.setRm5_len(Double.parseDouble(resp[202]));
		}else {
			pojo.setRm5_len(Double.parseDouble("0"));
		}
		pojo.setRm5_out(resp[203]);
		if(resp[204]!=null && resp[204].trim().length()!=0) {
			pojo.setRm5_wth(Double.parseDouble(resp[204]));
		}else {
			pojo.setRm5_wth(Double.parseDouble("0"));
		}
		pojo.setRm6_dc1_out(resp[205]);
		pojo.setRm6_dc2_out(resp[206]);
		pojo.setRm6_dc3_out(resp[207]);
		if(resp[208]!=null && resp[208].trim().length()!=0) {
			pojo.setRm6_len(Double.parseDouble(resp[208]));
		}else {
			pojo.setRm6_len(Double.parseDouble("0"));
		}
		pojo.setRm6_out(resp[209]);
		if(resp[210]!=null && resp[210].trim().length()!=0) {
			pojo.setRm6_wth(Double.parseDouble(resp[210]));
		}else {
			pojo.setRm6_wth(Double.parseDouble("0"));
		}
		pojo.setRm7_dc1_out(resp[211]);
		pojo.setRm7_dc2_out(resp[212]);
		pojo.setRm7_dc3_out(resp[213]);
		if(resp[214]!=null && resp[214].trim().length()!=0) {
			pojo.setRm7_len(Double.parseDouble(resp[214]));
		}else {
			pojo.setRm7_len(Double.parseDouble("0"));
		}
		pojo.setRm7_out(resp[215]);
		if(resp[216]!=null && resp[216].trim().length()!=0) {
			pojo.setRm7_wth(Double.parseDouble(resp[216]));
		}else {
			pojo.setRm7_wth(Double.parseDouble("0"));
		}
		pojo.setRm8_dc1_out(resp[217]);
		pojo.setRm8_dc2_out(resp[218]);
		pojo.setRm8_dc3_out(resp[219]);
		if(resp[220]!=null && resp[220].trim().length()!=0) {
			pojo.setRm8_len(Double.parseDouble(resp[220]));
		}else {
			pojo.setRm8_len(Double.parseDouble("0"));
		}
		pojo.setRm8_out(resp[221]);
		if(resp[222]!=null && resp[222].trim().length()!=0) {
			pojo.setRm8_wth(Double.parseDouble(resp[222]));
		}else {
			pojo.setRm8_wth(Double.parseDouble("0"));
		}
		pojo.setRm9_dc1_out(resp[223]);
		pojo.setRm9_dc2_out(resp[224]);
		pojo.setRm9_dc3_out(resp[225]);
		if(resp[226]!=null && resp[226].trim().length()!=0) {
			pojo.setRm9_len(Double.parseDouble(resp[226]));
		}else {
			pojo.setRm9_len(Double.parseDouble("0"));
		}
		pojo.setRm9_out(resp[227]);
		if(resp[228]!=null && resp[228].trim().length()!=0) {
			pojo.setRm9_wth(Double.parseDouble(resp[228]));
		}else {
			pojo.setRm9_wth(Double.parseDouble("0"));
		}
		if(resp[229]!=null && resp[229].trim().length()!=0) {
			pojo.setRms(Double.parseDouble(resp[229]));
		}else {
			pojo.setRms(Double.parseDouble("0"));
		}
		if(resp[230]!=null && resp[230].trim().length()!=0) {
			pojo.setRooms_plus(Double.parseDouble(resp[230]));
		}else {
			pojo.setRooms_plus(Double.parseDouble("0"));
		}
		pojo.setRural_svc1(resp[231]);
		pojo.setRural_svc2(resp[232]);
		pojo.setRural_svc3(resp[233]);
		pojo.setRural_svc4(resp[234]);
		pojo.setRural_svc5(resp[235]);
		pojo.setS_r(resp[236]);
		pojo.setSewage1(resp[237]);
		pojo.setSewage2(resp[238]);
		pojo.setSewer(resp[239]);
		pojo.setShore_allow(resp[240]);
		pojo.setShoreline_exp(resp[241]);
		pojo.setShoreline1(resp[242]);
		pojo.setShoreline2(resp[243]);
		if(resp[244]!=null && resp[244].trim().length()!=0) {
			pojo.setSp_dol(Double.parseDouble(resp[244]));
		}else {
			pojo.setSp_dol(Double.parseDouble("0"));
		}
		pojo.setSpec_des1_out(resp[245]);
		pojo.setSpec_des2_out(resp[246]);
		pojo.setSpec_des3_out(resp[247]);
		pojo.setSpec_des4_out(resp[248]);
		pojo.setSpec_des5_out(resp[249]);
		pojo.setSpec_des6_out(resp[250]);
		pojo.setSqft(resp[251]);
		pojo.setSt(resp[252]);
		pojo.setSt_dir(resp[253]);
		pojo.setSt_num(resp[254]);
		pojo.setSt_sfx(resp[255]);
		pojo.setStatus(resp[256]);
		pojo.setStyle(resp[257]);
		if(resp[258]!=null && resp[258].trim().length()!=0) {
			pojo.setTaxes(Double.parseDouble(resp[258]));
		}else {
			pojo.setTaxes(Double.parseDouble("0"));
		}
		if(resp[259]!=null && resp[259].trim().length()!=0) {
			pojo.setTd(formatter.parse(resp[259]));
		}else {
			pojo.setTd(null);
		}
		if(resp[260]!=null && resp[260].trim().length()!=0) {
			pojo.setTimestamp_sql(formatter1.parse(resp[260]));
		}else {
			pojo.setTimestamp_sql(null);
		}
		if(resp[261]!=null && resp[261].trim().length()!=0) {
			pojo.setTot_park_spcs(Double.parseDouble(resp[261]));
		}else {
			pojo.setTot_park_spcs(Double.parseDouble("0"));
		}
		pojo.setTour_url(resp[262]);
		if(resp[263]!=null && resp[263].trim().length()!=0) {
			pojo.setTv(Double.parseDouble(resp[263]));
		}else {
			pojo.setTv(Double.parseDouble("0"));
		}
		pojo.setType_own_srch(resp[264]);
		pojo.setType_own1_out(resp[265]);
		pojo.setUffi(resp[266]);
		if(resp[267]!=null && resp[267].trim().length()!=0) {
			pojo.setUnavail_dt(formatter1.parse(resp[267]));
		}else {
			pojo.setUnavail_dt(null);
		}
		pojo.setUtil_cable(resp[268]);
		pojo.setUtil_tel(resp[269]);
		pojo.setVend_pis(resp[270]);
		if(resp[271]!=null && resp[271].trim().length()!=0) {
			pojo.setVtour_updt(formatter.parse(resp[271]));
		}else {
			pojo.setVtour_updt(null);
		}
		pojo.setWater(resp[272]);
		pojo.setWater_acc_bldg1(resp[273]);
		pojo.setWater_acc_bldg2(resp[274]);
		pojo.setWater_body(resp[275]);
		pojo.setWater_del_feat1(resp[276]);
		pojo.setWater_del_feat2(resp[277]);
		pojo.setWater_feat1(resp[278]);
		pojo.setWater_feat2(resp[279]);
		pojo.setWater_feat3(resp[280]);
		pojo.setWater_feat4(resp[281]);
		pojo.setWater_feat5(resp[282]);
		if(resp[283]!=null && resp[283].trim().length()!=0) {
			pojo.setWater_front(Double.parseDouble(resp[283]));
		}else {
			pojo.setWater_front(Double.parseDouble("0"));
		}
		pojo.setWater_inc(resp[284]);
		pojo.setWater_type(resp[285]);
		pojo.setWaterfront(resp[286]);
		if(resp[287]!=null && resp[287].trim().length()!=0) {
			pojo.setWcloset_p1(Double.parseDouble(resp[287]));
		}else {
			pojo.setWcloset_p1(Double.parseDouble("0"));
		}
		if(resp[288]!=null && resp[288].trim().length()!=0) {
			pojo.setWcloset_p2(Double.parseDouble(resp[288]));
		}else {
			pojo.setWcloset_p2(Double.parseDouble("0"));
		}
		if(resp[289]!=null && resp[289].trim().length()!=0) {
			pojo.setWcloset_p3(Double.parseDouble(resp[289]));
		}else {
			pojo.setWcloset_p3(Double.parseDouble("0"));
		}
		if(resp[290]!=null && resp[290].trim().length()!=0) {
			pojo.setWcloset_p4(Double.parseDouble(resp[290]));
		}else {
			pojo.setWcloset_p4(Double.parseDouble("0"));
		}
		if(resp[291]!=null && resp[291].trim().length()!=0) {
			pojo.setWcloset_p5(Double.parseDouble(resp[291]));
		}else {
			pojo.setWcloset_p5(Double.parseDouble("0"));
		}
		if(resp[292]!=null && resp[292].trim().length()!=0) {
			pojo.setWcloset_t1(Double.parseDouble(resp[292]));
		}else {
			pojo.setWcloset_t1(Double.parseDouble("0"));
		}
		pojo.setWcloset_t1lvl(resp[293]);
		if(resp[294]!=null && resp[294].trim().length()!=0) {
			pojo.setWcloset_t2(Double.parseDouble(resp[294]));
		}else {
			pojo.setWcloset_t2(Double.parseDouble("0"));
		}
		pojo.setWcloset_t2lvl(resp[295]);
		if(resp[296]!=null && resp[296].trim().length()!=0) {
			pojo.setWcloset_t3(Double.parseDouble(resp[296]));
		}else {
			pojo.setWcloset_t3(Double.parseDouble("0"));
		}
		pojo.setWcloset_t3lvl(resp[297]);
		if(resp[298]!=null && resp[298].trim().length()!=0) {
			pojo.setWcloset_t4(Double.parseDouble(resp[298]));
		}else {
			pojo.setWcloset_t4(Double.parseDouble("0"));
		}
		pojo.setWcloset_t4lvl(resp[299]);
		if(resp[300]!=null && resp[300].trim().length()!=0) {
			pojo.setWcloset_t5(Double.parseDouble(resp[300]));
		}else {
			pojo.setWcloset_t5(Double.parseDouble("0"));
		}
		pojo.setWcloset_t5lvl(resp[301]);
		pojo.setWtr_suptyp(resp[302]);
		if(resp[303]!=null && resp[303].trim().length()!=0) {
			pojo.setXd(formatter1.parse(resp[303]));
		}else {
			pojo.setXd(null);
		}
		if(resp[304]!=null && resp[304].trim().length()!=0) {
			pojo.setXdtd(formatter1.parse(resp[304]));
		}else {
			pojo.setXdtd(null);
		}
		if(resp[305]!=null && resp[305].trim().length()!=0) {
			pojo.setYr(Double.parseDouble(resp[305]));
		}else {
			pojo.setYr(Double.parseDouble("0"));
		}
		pojo.setYr_built(resp[306]);
		pojo.setZip(resp[307]);
		pojo.setZoning(resp[308]);
		pojo.setPortion_property_lease1_out(resp[309]);
		pojo.setPortion_property_lease2_out(resp[310]);
		pojo.setPortion_property_lease3_out(resp[311]);
		pojo.setPortion_property_lease4_out(resp[312]);
		pojo.setPortion_property_lease_srch(resp[313]);
		pojo.setPortion_lease_comments(resp[314]);
		pojo.setAssignment(resp[315]);
		pojo.setFractional_ownership(resp[316]);

		return pojo;
	}

	//create dummy
	void createMLSListItem() {
		System.out.println("Data creation started...");
		mlsRepo.save(new MLSCollection("Central Air", "Great Opportunity To Rent A Fully Renovated Brand New Room(6-Month-Old) In Prime Old Cabbagetown 3 Story Detached Property. High Ceiling, Large Window, High-Speed Internet, Fitness Room, Gaming/Tv Room, Laundry Room, Modern Kitchen For Each Fl, New Bathroom, 2nd & 3rd Fl Deck, All-Inclusive Rent. Occupancy Immediate, Desirable Downtown Living, Minutes To Subway, Public Transportation, Coffee Shop, Restaurant, Supermarket, Hospital, All Amenities, And More.", "Cabbagetown-South St. James Town", "C5443495"));
		mlsRepo.save(new MLSCollection("Wall Unit", "Beautiful 2 Bedroom 1 Bathroom Unit With Parking In Sought After Lawrence Park. Over 800 Square Feet, Lovely Open Concept Kitchen Living Room, With Newer Appliances. Located Close To Transit/Highways, Shopping, Restaurants, & Amazing Schools!", "Lawrence Park North", "C5464416"));
		System.out.println("Data creation complete...");
	}

	//Show All Listing
	public void showAllListing() {
		System.out.println("fetch strt");
		mlsRepo.findAll().forEach(item -> System.out.println(getListingDetails(item)));
		System.out.println("fetch end");
	}
	public String getListingDetails(MLSCollection item) {

		System.out.println(
				"Ac Name: " + item.getA_c() + 
				", \nAd Text: " + item.getAd_text() +
				", \nCommnity: " + item.getCommunity()
				);

		return "";
	}

}