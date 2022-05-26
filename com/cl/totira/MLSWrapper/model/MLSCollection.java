package com.cl.totira.MLSWrapper.model;

import java.util.Date;
import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("MLSD")
public class MLSCollection {
	@Id
	private String id;

	//MLS Data
	private String A_c;
	private String Access_prop1;
	private String Access_prop2;
	private String Acres;
	private String Ad_text;
	private double Addl_mo_fee;
	private String Addr;
	private String All_inc;
	private String Alt_power1;
	private String Alt_power2;
	private String Apt_num;
	private String Area;
	private String Area_code;
	private double Ass_year;
	private double Bath_tot;
	private double Br;
	private double Br_plus;
	private String Bsmt1_out;
	private String Bsmt2_out;
	private String Cable;
	private String Cac_inc;
	private Date Cd;
	private String Central_vac;
	private String Cert_lvl;
	private Date Cndsold_xd;
	private String Com_coopb;
	private String Comel_inc;
	private String Community;
	private String Community_code;
	private String Comp_pts;
	private String Cond;
	private String Constr1_out;
	private String Constr2_out;
	private String County;
	private String Cross_st;
	private String Den_fr;
	private double Depth;
	private String Disp_addr;
	private double Dom;
	private String Drive;
	private Date Dt_sus;
	private Date Dt_ter;
	private String Easement_rest1;
	private String Easement_rest2;
	private String Easement_rest3;
	private String Easement_rest4;
	private String Elec;
	private String Elevator;
	private String Energy_cert;
	private String Extras;
	private String Farm_agri;
	private String Fpl_num;
	private double Front_ft;
	private String Fuel;
	private String Furnished;
	private double Gar_spaces;
	private String Gar_type;
	private String Gas;
	private String Green_pis;
	private String Handi_equipped;
	private String Heat_inc;
	private String Heating;
	private String Hydro_inc;
	private Date Input_date;
	private String Internet;
	private String Irreg;
	private double Kit_plus;
	private String Laundry;
	private String Laundry_lev;
	private Date Ld;
	private String Lease;
	private String Lease_term;
	private String Legal_desc;
	private String Level1;
	private String Level10;
	private String Level11;
	private String Level12;
	private String Level2;
	private String Level3;
	private String Level4;
	private String Level5;
	private String Level6;
	private String Level7;
	private String Level8;
	private String Level9;
	private String Link_comment;
	private String Link_yn;
	private String Lot_fr_inc;
	private String Lotsz_code;
	private double Lp_dol;
	private String Lsc;
	private String Lse_terms;
	private String Ml_num;
	private double Mmap_col;
	private double Mmap_page;
	private String Mmap_row;
	private String Municipality;
	private String Municipality_code;
	private String Municipality_district;
	private double Num_kit;
	private String Occ;
	private Date Oh_date1;
	private Date Oh_date2;
	private Date Oh_date3;
	private Date Oh_date4;
	private Date Oh_date5;
	private Date Oh_date6;
	private Date Oh_dt_stamp;
	private String Oh_from1;
	private String Oh_from2;
	private String Oh_from3;
	private String Oh_from4;
	private String Oh_from5;
	private String Oh_from6;
	private String Oh_Link1;
	private String Oh_Link2;
	private String Oh_Link3;
	private String Oh_Link4;
	private String Oh_Link5;
	private String Oh_Link6;
	private String Oh_to1;
	private String Oh_to2;
	private String Oh_to3;
	private String Oh_to4;
	private String Oh_to5;
	private String Oh_to6;
	private String Oh_Type1;
	private String Oh_Type2;
	private String Oh_Type3;
	private String Oh_Type4;
	private String Oh_Type5;
	private String Oh_Type6;
	private double Orig_dol;
	private String Oth_struc1_out;
	private String Oth_struc2_out;
	private String Outof_area;
	private String Parcel_id;
	private double Park_chgs;
	private double Park_spcs;
	private String Pay_freq;
	private double Perc_dif;
	private Date Pix_updt;
	private String Pool;
	private Date Poss_date;
	private String Potl;
	private String Pr_lsc;
	private String Prkg_inc;
	private String Prop_feat1_out;
	private String Prop_feat2_out;
	private String Prop_feat3_out;
	private String Prop_feat4_out;
	private String Prop_feat5_out;
	private String Prop_feat6_out;
	private String Prop_mgmt;
	private String Pvt_ent;
	private String Retirement;
	private String Rltr;
	private String Rm1_dc1_out;
	private String Rm1_dc2_out;
	private String Rm1_dc3_out;
	private double Rm1_len;
	private String Rm1_out;
	private double Rm1_wth;
	private String Rm10_dc1_out;
	private String Rm10_dc2_out;
	private String Rm10_dc3_out;
	private double Rm10_len;
	private String Rm10_out;
	private double Rm10_wth;
	private String Rm11_dc1_out;
	private String Rm11_dc2_out;
	private String Rm11_dc3_out;
	private double Rm11_len;
	private String Rm11_out;
	private double Rm11_wth;
	private String Rm12_dc1_out;
	private String Rm12_dc2_out;
	private String Rm12_dc3_out;
	private double Rm12_len;
	private String Rm12_out;
	private double Rm12_wth;
	private String Rm2_dc1_out;
	private String Rm2_dc2_out;
	private String Rm2_dc3_out;
	private double Rm2_len;
	private String Rm2_out;
	private double Rm2_wth;
	private String Rm3_dc1_out;
	private String Rm3_dc2_out;
	private String Rm3_dc3_out;
	private double Rm3_len;
	private String Rm3_out;
	private double Rm3_wth;
	private String Rm4_dc1_out;
	private String Rm4_dc2_out;
	private String Rm4_dc3_out;
	private double Rm4_len;
	private String Rm4_out;
	private double Rm4_wth;
	private String Rm5_dc1_out;
	private String Rm5_dc2_out;
	private String Rm5_dc3_out;
	private double Rm5_len;
	private String Rm5_out;
	private double Rm5_wth;
	private String Rm6_dc1_out;
	private String Rm6_dc2_out;
	private String Rm6_dc3_out;
	private double Rm6_len;
	private String Rm6_out;
	private double Rm6_wth;
	private String Rm7_dc1_out;
	private String Rm7_dc2_out;
	private String Rm7_dc3_out;
	private double Rm7_len;
	private String Rm7_out;
	private double Rm7_wth;
	private String Rm8_dc1_out;
	private String Rm8_dc2_out;
	private String Rm8_dc3_out;
	private double Rm8_len;
	private String Rm8_out;
	private double Rm8_wth;
	private String Rm9_dc1_out;
	private String Rm9_dc2_out;
	private String Rm9_dc3_out;
	private double Rm9_len;
	private String Rm9_out;
	private double Rm9_wth;
	private double Rms;
	private double Rooms_plus;
	private String Rural_svc1;
	private String Rural_svc2;
	private String Rural_svc3;
	private String Rural_svc4;
	private String Rural_svc5;
	private String S_r;
	private String Sewage1;
	private String Sewage2;
	private String Sewer;
	private String Shore_allow;
	private String Shoreline_exp;
	private String Shoreline1;
	private String Shoreline2;
	private double Sp_dol;
	private String Spec_des1_out;
	private String Spec_des2_out;
	private String Spec_des3_out;
	private String Spec_des4_out;
	private String Spec_des5_out;
	private String Spec_des6_out;
	private String Sqft;
	private String St;
	private String St_dir;
	private String St_num;
	private String St_sfx;
	private String Status;
	private String Style;
	private double Taxes;
	private Date Td;
	private Date Timestamp_sql;
	private double Tot_park_spcs;
	private String Tour_url;
	private double Tv;
	private String Type_own_srch;
	private String Type_own1_out;
	private String Uffi;
	private Date Unavail_dt;
	private String Util_cable;
	private String Util_tel;
	private String Vend_pis;
	private Date Vtour_updt;
	private String Water;
	private String Water_acc_bldg1;
	private String Water_acc_bldg2;
	private String Water_body;
	private String Water_del_feat1;
	private String Water_del_feat2;
	private String Water_feat1;
	private String Water_feat2;
	private String Water_feat3;
	private String Water_feat4;
	private String Water_feat5;
	private double Water_front;
	private String Water_inc;
	private String Water_type;
	private String Waterfront;
	private double Wcloset_p1;
	private double Wcloset_p2;
	private double Wcloset_p3;
	private double Wcloset_p4;
	private double Wcloset_p5;
	private double Wcloset_t1;
	private String Wcloset_t1lvl;
	private double Wcloset_t2;
	private String Wcloset_t2lvl;
	private double Wcloset_t3;
	private String Wcloset_t3lvl;
	private double Wcloset_t4;
	private String Wcloset_t4lvl;
	private double Wcloset_t5;
	private String Wcloset_t5lvl;
	private String Wtr_suptyp;
	private Date Xd;
	private Date Xdtd;
	private double Yr;
	private String Yr_built;
	private String Zip;
	private String Zoning;
	private String Portion_property_lease1_out;
	private String Portion_property_lease2_out;
	private String Portion_property_lease3_out;
	private String Portion_property_lease4_out;
	private String Portion_property_lease_srch;
	private String Portion_lease_comments;
	private String Assignment;
	private String Fractional_ownership;
	private List<String> images;


	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getA_c() {
		return A_c;
	}



	public void setA_c(String a_c) {
		A_c = a_c;
	}



	public String getAccess_prop1() {
		return Access_prop1;
	}



	public void setAccess_prop1(String access_prop1) {
		Access_prop1 = access_prop1;
	}



	public String getAccess_prop2() {
		return Access_prop2;
	}



	public void setAccess_prop2(String access_prop2) {
		Access_prop2 = access_prop2;
	}



	public String getAcres() {
		return Acres;
	}



	public void setAcres(String acres) {
		Acres = acres;
	}



	public String getAd_text() {
		return Ad_text;
	}



	public void setAd_text(String ad_text) {
		Ad_text = ad_text;
	}



	public double getAddl_mo_fee() {
		return Addl_mo_fee;
	}



	public void setAddl_mo_fee(double addl_mo_fee) {
		Addl_mo_fee = addl_mo_fee;
	}



	public String getAddr() {
		return Addr;
	}



	public void setAddr(String addr) {
		Addr = addr;
	}



	public String getAll_inc() {
		return All_inc;
	}



	public void setAll_inc(String all_inc) {
		All_inc = all_inc;
	}



	public String getAlt_power1() {
		return Alt_power1;
	}



	public void setAlt_power1(String alt_power1) {
		Alt_power1 = alt_power1;
	}



	public String getAlt_power2() {
		return Alt_power2;
	}



	public void setAlt_power2(String alt_power2) {
		Alt_power2 = alt_power2;
	}



	public String getApt_num() {
		return Apt_num;
	}



	public void setApt_num(String apt_num) {
		Apt_num = apt_num;
	}



	public String getArea() {
		return Area;
	}



	public void setArea(String area) {
		Area = area;
	}



	public String getArea_code() {
		return Area_code;
	}



	public void setArea_code(String area_code) {
		Area_code = area_code;
	}



	public double getAss_year() {
		return Ass_year;
	}



	public void setAss_year(double ass_year) {
		Ass_year = ass_year;
	}



	public double getBath_tot() {
		return Bath_tot;
	}



	public void setBath_tot(double bath_tot) {
		Bath_tot = bath_tot;
	}



	public double getBr() {
		return Br;
	}



	public void setBr(double br) {
		Br = br;
	}



	public double getBr_plus() {
		return Br_plus;
	}



	public void setBr_plus(double br_plus) {
		Br_plus = br_plus;
	}



	public String getBsmt1_out() {
		return Bsmt1_out;
	}



	public void setBsmt1_out(String bsmt1_out) {
		Bsmt1_out = bsmt1_out;
	}



	public String getBsmt2_out() {
		return Bsmt2_out;
	}



	public void setBsmt2_out(String bsmt2_out) {
		Bsmt2_out = bsmt2_out;
	}



	public String getCable() {
		return Cable;
	}



	public void setCable(String cable) {
		Cable = cable;
	}



	public String getCac_inc() {
		return Cac_inc;
	}



	public void setCac_inc(String cac_inc) {
		Cac_inc = cac_inc;
	}



	public Date getCd() {
		return Cd;
	}



	public void setCd(Date cd) {
		Cd = cd;
	}



	public String getCentral_vac() {
		return Central_vac;
	}



	public void setCentral_vac(String central_vac) {
		Central_vac = central_vac;
	}



	public String getCert_lvl() {
		return Cert_lvl;
	}



	public void setCert_lvl(String cert_lvl) {
		Cert_lvl = cert_lvl;
	}



	public Date getCndsold_xd() {
		return Cndsold_xd;
	}



	public void setCndsold_xd(Date cndsold_xd) {
		Cndsold_xd = cndsold_xd;
	}



	public String getCom_coopb() {
		return Com_coopb;
	}



	public void setCom_coopb(String com_coopb) {
		Com_coopb = com_coopb;
	}



	public String getComel_inc() {
		return Comel_inc;
	}



	public void setComel_inc(String comel_inc) {
		Comel_inc = comel_inc;
	}



	public String getCommunity() {
		return Community;
	}



	public void setCommunity(String community) {
		Community = community;
	}



	public String getCommunity_code() {
		return Community_code;
	}



	public void setCommunity_code(String community_code) {
		Community_code = community_code;
	}



	public String getComp_pts() {
		return Comp_pts;
	}



	public void setComp_pts(String comp_pts) {
		Comp_pts = comp_pts;
	}



	public String getCond() {
		return Cond;
	}



	public void setCond(String cond) {
		Cond = cond;
	}



	public String getConstr1_out() {
		return Constr1_out;
	}



	public void setConstr1_out(String constr1_out) {
		Constr1_out = constr1_out;
	}



	public String getConstr2_out() {
		return Constr2_out;
	}



	public void setConstr2_out(String constr2_out) {
		Constr2_out = constr2_out;
	}



	public String getCounty() {
		return County;
	}



	public void setCounty(String county) {
		County = county;
	}



	public String getCross_st() {
		return Cross_st;
	}



	public void setCross_st(String cross_st) {
		Cross_st = cross_st;
	}



	public String getDen_fr() {
		return Den_fr;
	}



	public void setDen_fr(String den_fr) {
		Den_fr = den_fr;
	}



	public double getDepth() {
		return Depth;
	}



	public void setDepth(double depth) {
		Depth = depth;
	}



	public String getDisp_addr() {
		return Disp_addr;
	}



	public void setDisp_addr(String disp_addr) {
		Disp_addr = disp_addr;
	}



	public double getDom() {
		return Dom;
	}



	public void setDom(double dom) {
		Dom = dom;
	}



	public String getDrive() {
		return Drive;
	}



	public void setDrive(String drive) {
		Drive = drive;
	}



	public Date getDt_sus() {
		return Dt_sus;
	}



	public void setDt_sus(Date dt_sus) {
		Dt_sus = dt_sus;
	}



	public Date getDt_ter() {
		return Dt_ter;
	}



	public void setDt_ter(Date dt_ter) {
		Dt_ter = dt_ter;
	}



	public String getEasement_rest1() {
		return Easement_rest1;
	}



	public void setEasement_rest1(String easement_rest1) {
		Easement_rest1 = easement_rest1;
	}



	public String getEasement_rest2() {
		return Easement_rest2;
	}



	public void setEasement_rest2(String easement_rest2) {
		Easement_rest2 = easement_rest2;
	}



	public String getEasement_rest3() {
		return Easement_rest3;
	}



	public void setEasement_rest3(String easement_rest3) {
		Easement_rest3 = easement_rest3;
	}



	public String getEasement_rest4() {
		return Easement_rest4;
	}



	public void setEasement_rest4(String easement_rest4) {
		Easement_rest4 = easement_rest4;
	}



	public String getElec() {
		return Elec;
	}



	public void setElec(String elec) {
		Elec = elec;
	}



	public String getElevator() {
		return Elevator;
	}



	public void setElevator(String elevator) {
		Elevator = elevator;
	}



	public String getEnergy_cert() {
		return Energy_cert;
	}



	public void setEnergy_cert(String energy_cert) {
		Energy_cert = energy_cert;
	}



	public String getExtras() {
		return Extras;
	}



	public void setExtras(String extras) {
		Extras = extras;
	}



	public String getFarm_agri() {
		return Farm_agri;
	}



	public void setFarm_agri(String farm_agri) {
		Farm_agri = farm_agri;
	}



	public String getFpl_num() {
		return Fpl_num;
	}



	public void setFpl_num(String fpl_num) {
		Fpl_num = fpl_num;
	}



	public double getFront_ft() {
		return Front_ft;
	}



	public void setFront_ft(double front_ft) {
		Front_ft = front_ft;
	}



	public String getFuel() {
		return Fuel;
	}



	public void setFuel(String fuel) {
		Fuel = fuel;
	}



	public String getFurnished() {
		return Furnished;
	}



	public void setFurnished(String furnished) {
		Furnished = furnished;
	}



	public double getGar_spaces() {
		return Gar_spaces;
	}



	public void setGar_spaces(double gar_spaces) {
		Gar_spaces = gar_spaces;
	}



	public String getGar_type() {
		return Gar_type;
	}



	public void setGar_type(String gar_type) {
		Gar_type = gar_type;
	}



	public String getGas() {
		return Gas;
	}



	public void setGas(String gas) {
		Gas = gas;
	}



	public String getGreen_pis() {
		return Green_pis;
	}



	public void setGreen_pis(String green_pis) {
		Green_pis = green_pis;
	}



	public String getHandi_equipped() {
		return Handi_equipped;
	}



	public void setHandi_equipped(String handi_equipped) {
		Handi_equipped = handi_equipped;
	}



	public String getHeat_inc() {
		return Heat_inc;
	}



	public void setHeat_inc(String heat_inc) {
		Heat_inc = heat_inc;
	}



	public String getHeating() {
		return Heating;
	}



	public void setHeating(String heating) {
		Heating = heating;
	}



	public String getHydro_inc() {
		return Hydro_inc;
	}



	public void setHydro_inc(String hydro_inc) {
		Hydro_inc = hydro_inc;
	}



	public Date getInput_date() {
		return Input_date;
	}



	public void setInput_date(Date input_date) {
		Input_date = input_date;
	}



	public String getInternet() {
		return Internet;
	}



	public void setInternet(String internet) {
		Internet = internet;
	}



	public String getIrreg() {
		return Irreg;
	}



	public void setIrreg(String irreg) {
		Irreg = irreg;
	}



	public double getKit_plus() {
		return Kit_plus;
	}



	public void setKit_plus(double kit_plus) {
		Kit_plus = kit_plus;
	}



	public String getLaundry() {
		return Laundry;
	}



	public void setLaundry(String laundry) {
		Laundry = laundry;
	}



	public String getLaundry_lev() {
		return Laundry_lev;
	}



	public void setLaundry_lev(String laundry_lev) {
		Laundry_lev = laundry_lev;
	}



	public Date getLd() {
		return Ld;
	}



	public void setLd(Date ld) {
		Ld = ld;
	}



	public String getLease() {
		return Lease;
	}



	public void setLease(String lease) {
		Lease = lease;
	}



	public String getLease_term() {
		return Lease_term;
	}



	public void setLease_term(String lease_term) {
		Lease_term = lease_term;
	}



	public String getLegal_desc() {
		return Legal_desc;
	}



	public void setLegal_desc(String legal_desc) {
		Legal_desc = legal_desc;
	}



	public String getLevel1() {
		return Level1;
	}



	public void setLevel1(String level1) {
		Level1 = level1;
	}



	public String getLevel10() {
		return Level10;
	}



	public void setLevel10(String level10) {
		Level10 = level10;
	}



	public String getLevel11() {
		return Level11;
	}



	public void setLevel11(String level11) {
		Level11 = level11;
	}



	public String getLevel12() {
		return Level12;
	}



	public void setLevel12(String level12) {
		Level12 = level12;
	}



	public String getLevel2() {
		return Level2;
	}



	public void setLevel2(String level2) {
		Level2 = level2;
	}



	public String getLevel3() {
		return Level3;
	}



	public void setLevel3(String level3) {
		Level3 = level3;
	}



	public String getLevel4() {
		return Level4;
	}



	public void setLevel4(String level4) {
		Level4 = level4;
	}



	public String getLevel5() {
		return Level5;
	}



	public void setLevel5(String level5) {
		Level5 = level5;
	}



	public String getLevel6() {
		return Level6;
	}



	public void setLevel6(String level6) {
		Level6 = level6;
	}



	public String getLevel7() {
		return Level7;
	}



	public void setLevel7(String level7) {
		Level7 = level7;
	}



	public String getLevel8() {
		return Level8;
	}



	public void setLevel8(String level8) {
		Level8 = level8;
	}



	public String getLevel9() {
		return Level9;
	}



	public void setLevel9(String level9) {
		Level9 = level9;
	}



	public String getLink_comment() {
		return Link_comment;
	}



	public void setLink_comment(String link_comment) {
		Link_comment = link_comment;
	}



	public String getLink_yn() {
		return Link_yn;
	}



	public void setLink_yn(String link_yn) {
		Link_yn = link_yn;
	}



	public String getLot_fr_inc() {
		return Lot_fr_inc;
	}



	public void setLot_fr_inc(String lot_fr_inc) {
		Lot_fr_inc = lot_fr_inc;
	}



	public String getLotsz_code() {
		return Lotsz_code;
	}



	public void setLotsz_code(String lotsz_code) {
		Lotsz_code = lotsz_code;
	}



	public double getLp_dol() {
		return Lp_dol;
	}



	public void setLp_dol(double lp_dol) {
		Lp_dol = lp_dol;
	}



	public String getLsc() {
		return Lsc;
	}



	public void setLsc(String lsc) {
		Lsc = lsc;
	}



	public String getLse_terms() {
		return Lse_terms;
	}



	public void setLse_terms(String lse_terms) {
		Lse_terms = lse_terms;
	}



	public String getMl_num() {
		return Ml_num;
	}



	public void setMl_num(String ml_num) {
		Ml_num = ml_num;
	}



	public double getMmap_col() {
		return Mmap_col;
	}



	public void setMmap_col(double mmap_col) {
		Mmap_col = mmap_col;
	}



	public double getMmap_page() {
		return Mmap_page;
	}



	public void setMmap_page(double mmap_page) {
		Mmap_page = mmap_page;
	}



	public String getMmap_row() {
		return Mmap_row;
	}



	public void setMmap_row(String mmap_row) {
		Mmap_row = mmap_row;
	}



	public String getMunicipality() {
		return Municipality;
	}



	public void setMunicipality(String municipality) {
		Municipality = municipality;
	}



	public String getMunicipality_code() {
		return Municipality_code;
	}



	public void setMunicipality_code(String municipality_code) {
		Municipality_code = municipality_code;
	}



	public String getMunicipality_district() {
		return Municipality_district;
	}



	public void setMunicipality_district(String municipality_district) {
		Municipality_district = municipality_district;
	}



	public double getNum_kit() {
		return Num_kit;
	}



	public void setNum_kit(double num_kit) {
		Num_kit = num_kit;
	}



	public String getOcc() {
		return Occ;
	}



	public void setOcc(String occ) {
		Occ = occ;
	}



	public Date getOh_date1() {
		return Oh_date1;
	}



	public void setOh_date1(Date oh_date1) {
		Oh_date1 = oh_date1;
	}



	public Date getOh_date2() {
		return Oh_date2;
	}



	public void setOh_date2(Date oh_date2) {
		Oh_date2 = oh_date2;
	}



	public Date getOh_date3() {
		return Oh_date3;
	}



	public void setOh_date3(Date oh_date3) {
		Oh_date3 = oh_date3;
	}



	public Date getOh_date4() {
		return Oh_date4;
	}



	public void setOh_date4(Date oh_date4) {
		Oh_date4 = oh_date4;
	}



	public Date getOh_date5() {
		return Oh_date5;
	}



	public void setOh_date5(Date oh_date5) {
		Oh_date5 = oh_date5;
	}



	public Date getOh_date6() {
		return Oh_date6;
	}



	public void setOh_date6(Date oh_date6) {
		Oh_date6 = oh_date6;
	}



	public Date getOh_dt_stamp() {
		return Oh_dt_stamp;
	}



	public void setOh_dt_stamp(Date oh_dt_stamp) {
		Oh_dt_stamp = oh_dt_stamp;
	}



	public String getOh_from1() {
		return Oh_from1;
	}



	public void setOh_from1(String oh_from1) {
		Oh_from1 = oh_from1;
	}



	public String getOh_from2() {
		return Oh_from2;
	}



	public void setOh_from2(String oh_from2) {
		Oh_from2 = oh_from2;
	}



	public String getOh_from3() {
		return Oh_from3;
	}



	public void setOh_from3(String oh_from3) {
		Oh_from3 = oh_from3;
	}



	public String getOh_from4() {
		return Oh_from4;
	}



	public void setOh_from4(String oh_from4) {
		Oh_from4 = oh_from4;
	}



	public String getOh_from5() {
		return Oh_from5;
	}



	public void setOh_from5(String oh_from5) {
		Oh_from5 = oh_from5;
	}



	public String getOh_from6() {
		return Oh_from6;
	}



	public void setOh_from6(String oh_from6) {
		Oh_from6 = oh_from6;
	}



	public String getOh_Link1() {
		return Oh_Link1;
	}



	public void setOh_Link1(String oh_Link1) {
		Oh_Link1 = oh_Link1;
	}



	public String getOh_Link2() {
		return Oh_Link2;
	}



	public void setOh_Link2(String oh_Link2) {
		Oh_Link2 = oh_Link2;
	}



	public String getOh_Link3() {
		return Oh_Link3;
	}



	public void setOh_Link3(String oh_Link3) {
		Oh_Link3 = oh_Link3;
	}



	public String getOh_Link4() {
		return Oh_Link4;
	}



	public void setOh_Link4(String oh_Link4) {
		Oh_Link4 = oh_Link4;
	}



	public String getOh_Link5() {
		return Oh_Link5;
	}



	public void setOh_Link5(String oh_Link5) {
		Oh_Link5 = oh_Link5;
	}



	public String getOh_Link6() {
		return Oh_Link6;
	}



	public void setOh_Link6(String oh_Link6) {
		Oh_Link6 = oh_Link6;
	}



	public String getOh_to1() {
		return Oh_to1;
	}



	public void setOh_to1(String oh_to1) {
		Oh_to1 = oh_to1;
	}



	public String getOh_to2() {
		return Oh_to2;
	}



	public void setOh_to2(String oh_to2) {
		Oh_to2 = oh_to2;
	}



	public String getOh_to3() {
		return Oh_to3;
	}



	public void setOh_to3(String oh_to3) {
		Oh_to3 = oh_to3;
	}



	public String getOh_to4() {
		return Oh_to4;
	}



	public void setOh_to4(String oh_to4) {
		Oh_to4 = oh_to4;
	}



	public String getOh_to5() {
		return Oh_to5;
	}



	public void setOh_to5(String oh_to5) {
		Oh_to5 = oh_to5;
	}



	public String getOh_to6() {
		return Oh_to6;
	}



	public void setOh_to6(String oh_to6) {
		Oh_to6 = oh_to6;
	}



	public String getOh_Type1() {
		return Oh_Type1;
	}



	public void setOh_Type1(String oh_Type1) {
		Oh_Type1 = oh_Type1;
	}



	public String getOh_Type2() {
		return Oh_Type2;
	}



	public void setOh_Type2(String oh_Type2) {
		Oh_Type2 = oh_Type2;
	}



	public String getOh_Type3() {
		return Oh_Type3;
	}



	public void setOh_Type3(String oh_Type3) {
		Oh_Type3 = oh_Type3;
	}



	public String getOh_Type4() {
		return Oh_Type4;
	}



	public void setOh_Type4(String oh_Type4) {
		Oh_Type4 = oh_Type4;
	}



	public String getOh_Type5() {
		return Oh_Type5;
	}



	public void setOh_Type5(String oh_Type5) {
		Oh_Type5 = oh_Type5;
	}



	public String getOh_Type6() {
		return Oh_Type6;
	}



	public void setOh_Type6(String oh_Type6) {
		Oh_Type6 = oh_Type6;
	}



	public double getOrig_dol() {
		return Orig_dol;
	}



	public void setOrig_dol(double orig_dol) {
		Orig_dol = orig_dol;
	}



	public String getOth_struc1_out() {
		return Oth_struc1_out;
	}



	public void setOth_struc1_out(String oth_struc1_out) {
		Oth_struc1_out = oth_struc1_out;
	}



	public String getOth_struc2_out() {
		return Oth_struc2_out;
	}



	public void setOth_struc2_out(String oth_struc2_out) {
		Oth_struc2_out = oth_struc2_out;
	}



	public String getOutof_area() {
		return Outof_area;
	}



	public void setOutof_area(String outof_area) {
		Outof_area = outof_area;
	}



	public String getParcel_id() {
		return Parcel_id;
	}



	public void setParcel_id(String parcel_id) {
		Parcel_id = parcel_id;
	}



	public double getPark_chgs() {
		return Park_chgs;
	}



	public void setPark_chgs(double park_chgs) {
		Park_chgs = park_chgs;
	}



	public double getPark_spcs() {
		return Park_spcs;
	}



	public void setPark_spcs(double park_spcs) {
		Park_spcs = park_spcs;
	}



	public String getPay_freq() {
		return Pay_freq;
	}



	public void setPay_freq(String pay_freq) {
		Pay_freq = pay_freq;
	}



	public double getPerc_dif() {
		return Perc_dif;
	}



	public void setPerc_dif(double perc_dif) {
		Perc_dif = perc_dif;
	}



	public Date getPix_updt() {
		return Pix_updt;
	}



	public void setPix_updt(Date pix_updt) {
		Pix_updt = pix_updt;
	}



	public String getPool() {
		return Pool;
	}



	public void setPool(String pool) {
		Pool = pool;
	}



	public Date getPoss_date() {
		return Poss_date;
	}



	public void setPoss_date(Date poss_date) {
		Poss_date = poss_date;
	}



	public String getPotl() {
		return Potl;
	}



	public void setPotl(String potl) {
		Potl = potl;
	}



	public String getPr_lsc() {
		return Pr_lsc;
	}



	public void setPr_lsc(String pr_lsc) {
		Pr_lsc = pr_lsc;
	}



	public String getPrkg_inc() {
		return Prkg_inc;
	}



	public void setPrkg_inc(String prkg_inc) {
		Prkg_inc = prkg_inc;
	}



	public String getProp_feat1_out() {
		return Prop_feat1_out;
	}



	public void setProp_feat1_out(String prop_feat1_out) {
		Prop_feat1_out = prop_feat1_out;
	}



	public String getProp_feat2_out() {
		return Prop_feat2_out;
	}



	public void setProp_feat2_out(String prop_feat2_out) {
		Prop_feat2_out = prop_feat2_out;
	}



	public String getProp_feat3_out() {
		return Prop_feat3_out;
	}



	public void setProp_feat3_out(String prop_feat3_out) {
		Prop_feat3_out = prop_feat3_out;
	}



	public String getProp_feat4_out() {
		return Prop_feat4_out;
	}



	public void setProp_feat4_out(String prop_feat4_out) {
		Prop_feat4_out = prop_feat4_out;
	}



	public String getProp_feat5_out() {
		return Prop_feat5_out;
	}



	public void setProp_feat5_out(String prop_feat5_out) {
		Prop_feat5_out = prop_feat5_out;
	}



	public String getProp_feat6_out() {
		return Prop_feat6_out;
	}



	public void setProp_feat6_out(String prop_feat6_out) {
		Prop_feat6_out = prop_feat6_out;
	}



	public String getProp_mgmt() {
		return Prop_mgmt;
	}



	public void setProp_mgmt(String prop_mgmt) {
		Prop_mgmt = prop_mgmt;
	}



	public String getPvt_ent() {
		return Pvt_ent;
	}



	public void setPvt_ent(String pvt_ent) {
		Pvt_ent = pvt_ent;
	}



	public String getRetirement() {
		return Retirement;
	}



	public void setRetirement(String retirement) {
		Retirement = retirement;
	}



	public String getRltr() {
		return Rltr;
	}



	public void setRltr(String rltr) {
		Rltr = rltr;
	}



	public String getRm1_dc1_out() {
		return Rm1_dc1_out;
	}



	public void setRm1_dc1_out(String rm1_dc1_out) {
		Rm1_dc1_out = rm1_dc1_out;
	}



	public String getRm1_dc2_out() {
		return Rm1_dc2_out;
	}



	public void setRm1_dc2_out(String rm1_dc2_out) {
		Rm1_dc2_out = rm1_dc2_out;
	}



	public String getRm1_dc3_out() {
		return Rm1_dc3_out;
	}



	public void setRm1_dc3_out(String rm1_dc3_out) {
		Rm1_dc3_out = rm1_dc3_out;
	}



	public double getRm1_len() {
		return Rm1_len;
	}



	public void setRm1_len(double rm1_len) {
		Rm1_len = rm1_len;
	}



	public String getRm1_out() {
		return Rm1_out;
	}



	public void setRm1_out(String rm1_out) {
		Rm1_out = rm1_out;
	}



	public double getRm1_wth() {
		return Rm1_wth;
	}



	public void setRm1_wth(double rm1_wth) {
		Rm1_wth = rm1_wth;
	}



	public String getRm10_dc1_out() {
		return Rm10_dc1_out;
	}



	public void setRm10_dc1_out(String rm10_dc1_out) {
		Rm10_dc1_out = rm10_dc1_out;
	}



	public String getRm10_dc2_out() {
		return Rm10_dc2_out;
	}



	public void setRm10_dc2_out(String rm10_dc2_out) {
		Rm10_dc2_out = rm10_dc2_out;
	}



	public String getRm10_dc3_out() {
		return Rm10_dc3_out;
	}



	public void setRm10_dc3_out(String rm10_dc3_out) {
		Rm10_dc3_out = rm10_dc3_out;
	}



	public double getRm10_len() {
		return Rm10_len;
	}



	public void setRm10_len(double rm10_len) {
		Rm10_len = rm10_len;
	}



	public String getRm10_out() {
		return Rm10_out;
	}



	public void setRm10_out(String rm10_out) {
		Rm10_out = rm10_out;
	}



	public double getRm10_wth() {
		return Rm10_wth;
	}



	public void setRm10_wth(double rm10_wth) {
		Rm10_wth = rm10_wth;
	}



	public String getRm11_dc1_out() {
		return Rm11_dc1_out;
	}



	public void setRm11_dc1_out(String rm11_dc1_out) {
		Rm11_dc1_out = rm11_dc1_out;
	}



	public String getRm11_dc2_out() {
		return Rm11_dc2_out;
	}



	public void setRm11_dc2_out(String rm11_dc2_out) {
		Rm11_dc2_out = rm11_dc2_out;
	}



	public String getRm11_dc3_out() {
		return Rm11_dc3_out;
	}



	public void setRm11_dc3_out(String rm11_dc3_out) {
		Rm11_dc3_out = rm11_dc3_out;
	}



	public double getRm11_len() {
		return Rm11_len;
	}



	public void setRm11_len(double rm11_len) {
		Rm11_len = rm11_len;
	}



	public String getRm11_out() {
		return Rm11_out;
	}



	public void setRm11_out(String rm11_out) {
		Rm11_out = rm11_out;
	}



	public double getRm11_wth() {
		return Rm11_wth;
	}



	public void setRm11_wth(double rm11_wth) {
		Rm11_wth = rm11_wth;
	}



	public String getRm12_dc1_out() {
		return Rm12_dc1_out;
	}



	public void setRm12_dc1_out(String rm12_dc1_out) {
		Rm12_dc1_out = rm12_dc1_out;
	}



	public String getRm12_dc2_out() {
		return Rm12_dc2_out;
	}



	public void setRm12_dc2_out(String rm12_dc2_out) {
		Rm12_dc2_out = rm12_dc2_out;
	}



	public String getRm12_dc3_out() {
		return Rm12_dc3_out;
	}



	public void setRm12_dc3_out(String rm12_dc3_out) {
		Rm12_dc3_out = rm12_dc3_out;
	}



	public double getRm12_len() {
		return Rm12_len;
	}



	public void setRm12_len(double rm12_len) {
		Rm12_len = rm12_len;
	}



	public String getRm12_out() {
		return Rm12_out;
	}



	public void setRm12_out(String rm12_out) {
		Rm12_out = rm12_out;
	}



	public double getRm12_wth() {
		return Rm12_wth;
	}



	public void setRm12_wth(double rm12_wth) {
		Rm12_wth = rm12_wth;
	}



	public String getRm2_dc1_out() {
		return Rm2_dc1_out;
	}



	public void setRm2_dc1_out(String rm2_dc1_out) {
		Rm2_dc1_out = rm2_dc1_out;
	}



	public String getRm2_dc2_out() {
		return Rm2_dc2_out;
	}



	public void setRm2_dc2_out(String rm2_dc2_out) {
		Rm2_dc2_out = rm2_dc2_out;
	}



	public String getRm2_dc3_out() {
		return Rm2_dc3_out;
	}



	public void setRm2_dc3_out(String rm2_dc3_out) {
		Rm2_dc3_out = rm2_dc3_out;
	}



	public double getRm2_len() {
		return Rm2_len;
	}



	public void setRm2_len(double rm2_len) {
		Rm2_len = rm2_len;
	}



	public String getRm2_out() {
		return Rm2_out;
	}



	public void setRm2_out(String rm2_out) {
		Rm2_out = rm2_out;
	}



	public double getRm2_wth() {
		return Rm2_wth;
	}



	public void setRm2_wth(double rm2_wth) {
		Rm2_wth = rm2_wth;
	}



	public String getRm3_dc1_out() {
		return Rm3_dc1_out;
	}



	public void setRm3_dc1_out(String rm3_dc1_out) {
		Rm3_dc1_out = rm3_dc1_out;
	}



	public String getRm3_dc2_out() {
		return Rm3_dc2_out;
	}



	public void setRm3_dc2_out(String rm3_dc2_out) {
		Rm3_dc2_out = rm3_dc2_out;
	}



	public String getRm3_dc3_out() {
		return Rm3_dc3_out;
	}



	public void setRm3_dc3_out(String rm3_dc3_out) {
		Rm3_dc3_out = rm3_dc3_out;
	}



	public double getRm3_len() {
		return Rm3_len;
	}



	public void setRm3_len(double rm3_len) {
		Rm3_len = rm3_len;
	}



	public String getRm3_out() {
		return Rm3_out;
	}



	public void setRm3_out(String rm3_out) {
		Rm3_out = rm3_out;
	}



	public double getRm3_wth() {
		return Rm3_wth;
	}



	public void setRm3_wth(double rm3_wth) {
		Rm3_wth = rm3_wth;
	}



	public String getRm4_dc1_out() {
		return Rm4_dc1_out;
	}



	public void setRm4_dc1_out(String rm4_dc1_out) {
		Rm4_dc1_out = rm4_dc1_out;
	}



	public String getRm4_dc2_out() {
		return Rm4_dc2_out;
	}



	public void setRm4_dc2_out(String rm4_dc2_out) {
		Rm4_dc2_out = rm4_dc2_out;
	}



	public String getRm4_dc3_out() {
		return Rm4_dc3_out;
	}



	public void setRm4_dc3_out(String rm4_dc3_out) {
		Rm4_dc3_out = rm4_dc3_out;
	}



	public double getRm4_len() {
		return Rm4_len;
	}



	public void setRm4_len(double rm4_len) {
		Rm4_len = rm4_len;
	}



	public String getRm4_out() {
		return Rm4_out;
	}



	public void setRm4_out(String rm4_out) {
		Rm4_out = rm4_out;
	}



	public double getRm4_wth() {
		return Rm4_wth;
	}



	public void setRm4_wth(double rm4_wth) {
		Rm4_wth = rm4_wth;
	}



	public String getRm5_dc1_out() {
		return Rm5_dc1_out;
	}



	public void setRm5_dc1_out(String rm5_dc1_out) {
		Rm5_dc1_out = rm5_dc1_out;
	}



	public String getRm5_dc2_out() {
		return Rm5_dc2_out;
	}



	public void setRm5_dc2_out(String rm5_dc2_out) {
		Rm5_dc2_out = rm5_dc2_out;
	}



	public String getRm5_dc3_out() {
		return Rm5_dc3_out;
	}



	public void setRm5_dc3_out(String rm5_dc3_out) {
		Rm5_dc3_out = rm5_dc3_out;
	}



	public double getRm5_len() {
		return Rm5_len;
	}



	public void setRm5_len(double rm5_len) {
		Rm5_len = rm5_len;
	}



	public String getRm5_out() {
		return Rm5_out;
	}



	public void setRm5_out(String rm5_out) {
		Rm5_out = rm5_out;
	}



	public double getRm5_wth() {
		return Rm5_wth;
	}



	public void setRm5_wth(double rm5_wth) {
		Rm5_wth = rm5_wth;
	}



	public String getRm6_dc1_out() {
		return Rm6_dc1_out;
	}



	public void setRm6_dc1_out(String rm6_dc1_out) {
		Rm6_dc1_out = rm6_dc1_out;
	}



	public String getRm6_dc2_out() {
		return Rm6_dc2_out;
	}



	public void setRm6_dc2_out(String rm6_dc2_out) {
		Rm6_dc2_out = rm6_dc2_out;
	}



	public String getRm6_dc3_out() {
		return Rm6_dc3_out;
	}



	public void setRm6_dc3_out(String rm6_dc3_out) {
		Rm6_dc3_out = rm6_dc3_out;
	}



	public double getRm6_len() {
		return Rm6_len;
	}



	public void setRm6_len(double rm6_len) {
		Rm6_len = rm6_len;
	}



	public String getRm6_out() {
		return Rm6_out;
	}



	public void setRm6_out(String rm6_out) {
		Rm6_out = rm6_out;
	}



	public double getRm6_wth() {
		return Rm6_wth;
	}



	public void setRm6_wth(double rm6_wth) {
		Rm6_wth = rm6_wth;
	}



	public String getRm7_dc1_out() {
		return Rm7_dc1_out;
	}



	public void setRm7_dc1_out(String rm7_dc1_out) {
		Rm7_dc1_out = rm7_dc1_out;
	}



	public String getRm7_dc2_out() {
		return Rm7_dc2_out;
	}



	public void setRm7_dc2_out(String rm7_dc2_out) {
		Rm7_dc2_out = rm7_dc2_out;
	}



	public String getRm7_dc3_out() {
		return Rm7_dc3_out;
	}



	public void setRm7_dc3_out(String rm7_dc3_out) {
		Rm7_dc3_out = rm7_dc3_out;
	}



	public double getRm7_len() {
		return Rm7_len;
	}



	public void setRm7_len(double rm7_len) {
		Rm7_len = rm7_len;
	}



	public String getRm7_out() {
		return Rm7_out;
	}



	public void setRm7_out(String rm7_out) {
		Rm7_out = rm7_out;
	}



	public double getRm7_wth() {
		return Rm7_wth;
	}



	public void setRm7_wth(double rm7_wth) {
		Rm7_wth = rm7_wth;
	}



	public String getRm8_dc1_out() {
		return Rm8_dc1_out;
	}



	public void setRm8_dc1_out(String rm8_dc1_out) {
		Rm8_dc1_out = rm8_dc1_out;
	}



	public String getRm8_dc2_out() {
		return Rm8_dc2_out;
	}



	public void setRm8_dc2_out(String rm8_dc2_out) {
		Rm8_dc2_out = rm8_dc2_out;
	}



	public String getRm8_dc3_out() {
		return Rm8_dc3_out;
	}



	public void setRm8_dc3_out(String rm8_dc3_out) {
		Rm8_dc3_out = rm8_dc3_out;
	}



	public double getRm8_len() {
		return Rm8_len;
	}



	public void setRm8_len(double rm8_len) {
		Rm8_len = rm8_len;
	}



	public String getRm8_out() {
		return Rm8_out;
	}



	public void setRm8_out(String rm8_out) {
		Rm8_out = rm8_out;
	}



	public double getRm8_wth() {
		return Rm8_wth;
	}



	public void setRm8_wth(double rm8_wth) {
		Rm8_wth = rm8_wth;
	}



	public String getRm9_dc1_out() {
		return Rm9_dc1_out;
	}



	public void setRm9_dc1_out(String rm9_dc1_out) {
		Rm9_dc1_out = rm9_dc1_out;
	}



	public String getRm9_dc2_out() {
		return Rm9_dc2_out;
	}



	public void setRm9_dc2_out(String rm9_dc2_out) {
		Rm9_dc2_out = rm9_dc2_out;
	}



	public String getRm9_dc3_out() {
		return Rm9_dc3_out;
	}



	public void setRm9_dc3_out(String rm9_dc3_out) {
		Rm9_dc3_out = rm9_dc3_out;
	}



	public double getRm9_len() {
		return Rm9_len;
	}



	public void setRm9_len(double rm9_len) {
		Rm9_len = rm9_len;
	}



	public String getRm9_out() {
		return Rm9_out;
	}



	public void setRm9_out(String rm9_out) {
		Rm9_out = rm9_out;
	}



	public double getRm9_wth() {
		return Rm9_wth;
	}



	public void setRm9_wth(double rm9_wth) {
		Rm9_wth = rm9_wth;
	}



	public double getRms() {
		return Rms;
	}



	public void setRms(double rms) {
		Rms = rms;
	}



	public double getRooms_plus() {
		return Rooms_plus;
	}



	public void setRooms_plus(double rooms_plus) {
		Rooms_plus = rooms_plus;
	}



	public String getRural_svc1() {
		return Rural_svc1;
	}



	public void setRural_svc1(String rural_svc1) {
		Rural_svc1 = rural_svc1;
	}



	public String getRural_svc2() {
		return Rural_svc2;
	}



	public void setRural_svc2(String rural_svc2) {
		Rural_svc2 = rural_svc2;
	}



	public String getRural_svc3() {
		return Rural_svc3;
	}



	public void setRural_svc3(String rural_svc3) {
		Rural_svc3 = rural_svc3;
	}



	public String getRural_svc4() {
		return Rural_svc4;
	}



	public void setRural_svc4(String rural_svc4) {
		Rural_svc4 = rural_svc4;
	}



	public String getRural_svc5() {
		return Rural_svc5;
	}



	public void setRural_svc5(String rural_svc5) {
		Rural_svc5 = rural_svc5;
	}



	public String getS_r() {
		return S_r;
	}



	public void setS_r(String s_r) {
		S_r = s_r;
	}



	public String getSewage1() {
		return Sewage1;
	}



	public void setSewage1(String sewage1) {
		Sewage1 = sewage1;
	}



	public String getSewage2() {
		return Sewage2;
	}



	public void setSewage2(String sewage2) {
		Sewage2 = sewage2;
	}



	public String getSewer() {
		return Sewer;
	}



	public void setSewer(String sewer) {
		Sewer = sewer;
	}



	public String getShore_allow() {
		return Shore_allow;
	}



	public void setShore_allow(String shore_allow) {
		Shore_allow = shore_allow;
	}



	public String getShoreline_exp() {
		return Shoreline_exp;
	}



	public void setShoreline_exp(String shoreline_exp) {
		Shoreline_exp = shoreline_exp;
	}



	public String getShoreline1() {
		return Shoreline1;
	}



	public void setShoreline1(String shoreline1) {
		Shoreline1 = shoreline1;
	}



	public String getShoreline2() {
		return Shoreline2;
	}



	public void setShoreline2(String shoreline2) {
		Shoreline2 = shoreline2;
	}



	public double getSp_dol() {
		return Sp_dol;
	}



	public void setSp_dol(double sp_dol) {
		Sp_dol = sp_dol;
	}



	public String getSpec_des1_out() {
		return Spec_des1_out;
	}



	public void setSpec_des1_out(String spec_des1_out) {
		Spec_des1_out = spec_des1_out;
	}



	public String getSpec_des2_out() {
		return Spec_des2_out;
	}



	public void setSpec_des2_out(String spec_des2_out) {
		Spec_des2_out = spec_des2_out;
	}



	public String getSpec_des3_out() {
		return Spec_des3_out;
	}



	public void setSpec_des3_out(String spec_des3_out) {
		Spec_des3_out = spec_des3_out;
	}



	public String getSpec_des4_out() {
		return Spec_des4_out;
	}



	public void setSpec_des4_out(String spec_des4_out) {
		Spec_des4_out = spec_des4_out;
	}



	public String getSpec_des5_out() {
		return Spec_des5_out;
	}



	public void setSpec_des5_out(String spec_des5_out) {
		Spec_des5_out = spec_des5_out;
	}



	public String getSpec_des6_out() {
		return Spec_des6_out;
	}



	public void setSpec_des6_out(String spec_des6_out) {
		Spec_des6_out = spec_des6_out;
	}



	public String getSqft() {
		return Sqft;
	}



	public void setSqft(String sqft) {
		Sqft = sqft;
	}



	public String getSt() {
		return St;
	}



	public void setSt(String st) {
		St = st;
	}



	public String getSt_dir() {
		return St_dir;
	}



	public void setSt_dir(String st_dir) {
		St_dir = st_dir;
	}



	public String getSt_num() {
		return St_num;
	}



	public void setSt_num(String st_num) {
		St_num = st_num;
	}



	public String getSt_sfx() {
		return St_sfx;
	}



	public void setSt_sfx(String st_sfx) {
		St_sfx = st_sfx;
	}



	public String getStatus() {
		return Status;
	}



	public void setStatus(String status) {
		Status = status;
	}



	public String getStyle() {
		return Style;
	}



	public void setStyle(String style) {
		Style = style;
	}



	public double getTaxes() {
		return Taxes;
	}



	public void setTaxes(double taxes) {
		Taxes = taxes;
	}



	public Date getTd() {
		return Td;
	}



	public void setTd(Date td) {
		Td = td;
	}



	public Date getTimestamp_sql() {
		return Timestamp_sql;
	}



	public void setTimestamp_sql(Date timestamp_sql) {
		Timestamp_sql = timestamp_sql;
	}



	public double getTot_park_spcs() {
		return Tot_park_spcs;
	}



	public void setTot_park_spcs(double tot_park_spcs) {
		Tot_park_spcs = tot_park_spcs;
	}



	public String getTour_url() {
		return Tour_url;
	}



	public void setTour_url(String tour_url) {
		Tour_url = tour_url;
	}



	public double getTv() {
		return Tv;
	}



	public void setTv(double tv) {
		Tv = tv;
	}



	public String getType_own_srch() {
		return Type_own_srch;
	}



	public void setType_own_srch(String type_own_srch) {
		Type_own_srch = type_own_srch;
	}



	public String getType_own1_out() {
		return Type_own1_out;
	}



	public void setType_own1_out(String type_own1_out) {
		Type_own1_out = type_own1_out;
	}



	public String getUffi() {
		return Uffi;
	}



	public void setUffi(String uffi) {
		Uffi = uffi;
	}



	public Date getUnavail_dt() {
		return Unavail_dt;
	}



	public void setUnavail_dt(Date unavail_dt) {
		Unavail_dt = unavail_dt;
	}



	public String getUtil_cable() {
		return Util_cable;
	}



	public void setUtil_cable(String util_cable) {
		Util_cable = util_cable;
	}



	public String getUtil_tel() {
		return Util_tel;
	}



	public void setUtil_tel(String util_tel) {
		Util_tel = util_tel;
	}



	public String getVend_pis() {
		return Vend_pis;
	}



	public void setVend_pis(String vend_pis) {
		Vend_pis = vend_pis;
	}



	public Date getVtour_updt() {
		return Vtour_updt;
	}



	public void setVtour_updt(Date vtour_updt) {
		Vtour_updt = vtour_updt;
	}



	public String getWater() {
		return Water;
	}



	public void setWater(String water) {
		Water = water;
	}



	public String getWater_acc_bldg1() {
		return Water_acc_bldg1;
	}



	public void setWater_acc_bldg1(String water_acc_bldg1) {
		Water_acc_bldg1 = water_acc_bldg1;
	}



	public String getWater_acc_bldg2() {
		return Water_acc_bldg2;
	}



	public void setWater_acc_bldg2(String water_acc_bldg2) {
		Water_acc_bldg2 = water_acc_bldg2;
	}



	public String getWater_body() {
		return Water_body;
	}



	public void setWater_body(String water_body) {
		Water_body = water_body;
	}



	public String getWater_del_feat1() {
		return Water_del_feat1;
	}



	public void setWater_del_feat1(String water_del_feat1) {
		Water_del_feat1 = water_del_feat1;
	}



	public String getWater_del_feat2() {
		return Water_del_feat2;
	}



	public void setWater_del_feat2(String water_del_feat2) {
		Water_del_feat2 = water_del_feat2;
	}



	public String getWater_feat1() {
		return Water_feat1;
	}



	public void setWater_feat1(String water_feat1) {
		Water_feat1 = water_feat1;
	}



	public String getWater_feat2() {
		return Water_feat2;
	}



	public void setWater_feat2(String water_feat2) {
		Water_feat2 = water_feat2;
	}



	public String getWater_feat3() {
		return Water_feat3;
	}



	public void setWater_feat3(String water_feat3) {
		Water_feat3 = water_feat3;
	}



	public String getWater_feat4() {
		return Water_feat4;
	}



	public void setWater_feat4(String water_feat4) {
		Water_feat4 = water_feat4;
	}



	public String getWater_feat5() {
		return Water_feat5;
	}



	public void setWater_feat5(String water_feat5) {
		Water_feat5 = water_feat5;
	}



	public double getWater_front() {
		return Water_front;
	}



	public void setWater_front(double water_front) {
		Water_front = water_front;
	}



	public String getWater_inc() {
		return Water_inc;
	}



	public void setWater_inc(String water_inc) {
		Water_inc = water_inc;
	}



	public String getWater_type() {
		return Water_type;
	}



	public void setWater_type(String water_type) {
		Water_type = water_type;
	}



	public String getWaterfront() {
		return Waterfront;
	}



	public void setWaterfront(String waterfront) {
		Waterfront = waterfront;
	}



	public double getWcloset_p1() {
		return Wcloset_p1;
	}



	public void setWcloset_p1(double wcloset_p1) {
		Wcloset_p1 = wcloset_p1;
	}



	public double getWcloset_p2() {
		return Wcloset_p2;
	}



	public void setWcloset_p2(double wcloset_p2) {
		Wcloset_p2 = wcloset_p2;
	}



	public double getWcloset_p3() {
		return Wcloset_p3;
	}



	public void setWcloset_p3(double wcloset_p3) {
		Wcloset_p3 = wcloset_p3;
	}



	public double getWcloset_p4() {
		return Wcloset_p4;
	}



	public void setWcloset_p4(double wcloset_p4) {
		Wcloset_p4 = wcloset_p4;
	}



	public double getWcloset_p5() {
		return Wcloset_p5;
	}



	public void setWcloset_p5(double wcloset_p5) {
		Wcloset_p5 = wcloset_p5;
	}



	public double getWcloset_t1() {
		return Wcloset_t1;
	}



	public void setWcloset_t1(double wcloset_t1) {
		Wcloset_t1 = wcloset_t1;
	}



	public String getWcloset_t1lvl() {
		return Wcloset_t1lvl;
	}



	public void setWcloset_t1lvl(String wcloset_t1lvl) {
		Wcloset_t1lvl = wcloset_t1lvl;
	}



	public double getWcloset_t2() {
		return Wcloset_t2;
	}



	public void setWcloset_t2(double wcloset_t2) {
		Wcloset_t2 = wcloset_t2;
	}



	public String getWcloset_t2lvl() {
		return Wcloset_t2lvl;
	}



	public void setWcloset_t2lvl(String wcloset_t2lvl) {
		Wcloset_t2lvl = wcloset_t2lvl;
	}



	public double getWcloset_t3() {
		return Wcloset_t3;
	}



	public void setWcloset_t3(double wcloset_t3) {
		Wcloset_t3 = wcloset_t3;
	}



	public String getWcloset_t3lvl() {
		return Wcloset_t3lvl;
	}



	public void setWcloset_t3lvl(String wcloset_t3lvl) {
		Wcloset_t3lvl = wcloset_t3lvl;
	}



	public double getWcloset_t4() {
		return Wcloset_t4;
	}



	public void setWcloset_t4(double wcloset_t4) {
		Wcloset_t4 = wcloset_t4;
	}



	public String getWcloset_t4lvl() {
		return Wcloset_t4lvl;
	}



	public void setWcloset_t4lvl(String wcloset_t4lvl) {
		Wcloset_t4lvl = wcloset_t4lvl;
	}



	public double getWcloset_t5() {
		return Wcloset_t5;
	}



	public void setWcloset_t5(double wcloset_t5) {
		Wcloset_t5 = wcloset_t5;
	}



	public String getWcloset_t5lvl() {
		return Wcloset_t5lvl;
	}



	public void setWcloset_t5lvl(String wcloset_t5lvl) {
		Wcloset_t5lvl = wcloset_t5lvl;
	}



	public String getWtr_suptyp() {
		return Wtr_suptyp;
	}



	public void setWtr_suptyp(String wtr_suptyp) {
		Wtr_suptyp = wtr_suptyp;
	}



	public Date getXd() {
		return Xd;
	}



	public void setXd(Date xd) {
		Xd = xd;
	}



	public Date getXdtd() {
		return Xdtd;
	}



	public void setXdtd(Date xdtd) {
		Xdtd = xdtd;
	}



	public double getYr() {
		return Yr;
	}



	public void setYr(double yr) {
		Yr = yr;
	}



	public String getYr_built() {
		return Yr_built;
	}



	public void setYr_built(String yr_built) {
		Yr_built = yr_built;
	}



	public String getZip() {
		return Zip;
	}



	public void setZip(String zip) {
		Zip = zip;
	}



	public String getZoning() {
		return Zoning;
	}



	public void setZoning(String zoning) {
		Zoning = zoning;
	}



	public String getPortion_property_lease1_out() {
		return Portion_property_lease1_out;
	}



	public void setPortion_property_lease1_out(String portion_property_lease1_out) {
		Portion_property_lease1_out = portion_property_lease1_out;
	}



	public String getPortion_property_lease2_out() {
		return Portion_property_lease2_out;
	}



	public void setPortion_property_lease2_out(String portion_property_lease2_out) {
		Portion_property_lease2_out = portion_property_lease2_out;
	}



	public String getPortion_property_lease3_out() {
		return Portion_property_lease3_out;
	}



	public void setPortion_property_lease3_out(String portion_property_lease3_out) {
		Portion_property_lease3_out = portion_property_lease3_out;
	}



	public String getPortion_property_lease4_out() {
		return Portion_property_lease4_out;
	}



	public void setPortion_property_lease4_out(String portion_property_lease4_out) {
		Portion_property_lease4_out = portion_property_lease4_out;
	}



	public String getPortion_property_lease_srch() {
		return Portion_property_lease_srch;
	}



	public void setPortion_property_lease_srch(String portion_property_lease_srch) {
		Portion_property_lease_srch = portion_property_lease_srch;
	}



	public String getPortion_lease_comments() {
		return Portion_lease_comments;
	}



	public void setPortion_lease_comments(String portion_lease_comments) {
		Portion_lease_comments = portion_lease_comments;
	}



	public String getAssignment() {
		return Assignment;
	}



	public void setAssignment(String assignment) {
		Assignment = assignment;
	}



	public String getFractional_ownership() {
		return Fractional_ownership;
	}



	public void setFractional_ownership(String fractional_ownership) {
		Fractional_ownership = fractional_ownership;
	}



	public List<String> getImages() {
		return images;
	}



	public void setImages(List<String> images) {
		this.images = images;
	}



	public MLSCollection(String A_c, String Ad_text, String Community, String Ml_num) {
		super();
		this.A_c = A_c;
		this.Ad_text = Ad_text;
		this.Community = Community;
		this.Ml_num = Ml_num;
	}

	public MLSCollection(MLSCollectionPOJO pojo) {
		super();
		A_c = pojo.getA_c();
		Access_prop1 = pojo.getAccess_prop1();
		Access_prop2 = pojo.getAccess_prop2();
		Acres = pojo.getAcres();
		Ad_text = pojo.getAd_text();
		Addl_mo_fee = pojo.getAddl_mo_fee();
		Addr = pojo.getAddr();
		All_inc = pojo.getAll_inc();
		Alt_power1 = pojo.getAlt_power1();
		Alt_power2 = pojo.getAlt_power2();
		Apt_num = pojo.getApt_num();
		Area = pojo.getArea();
		Area_code = pojo.getArea_code();
		Ass_year = pojo.getAss_year();
		Bath_tot = pojo.getBath_tot();
		Br = pojo.getBr();
		Br_plus = pojo.getBr_plus();
		Bsmt1_out = pojo.getBsmt1_out();
		Bsmt2_out = pojo.getBsmt2_out();
		Cable = pojo.getCable();
		Cac_inc = pojo.getCac_inc();
		Cd = pojo.getCd();
		Central_vac = pojo.getCentral_vac();
		Cert_lvl = pojo.getCert_lvl();
		Cndsold_xd = pojo.getCndsold_xd();
		Com_coopb = pojo.getCom_coopb();
		Comel_inc = pojo.getComel_inc();
		Community = pojo.getCommunity();
		Community_code = pojo.getCommunity_code();
		Comp_pts = pojo.getComp_pts();
		Cond = pojo.getCond();
		Constr1_out = pojo.getConstr1_out();
		Constr2_out = pojo.getConstr2_out();
		County = pojo.getCounty();
		Cross_st = pojo.getCross_st();
		Den_fr = pojo.getDen_fr();
		Depth = pojo.getDepth();
		Disp_addr = pojo.getDisp_addr();
		Dom = pojo.getDom();
		Drive = pojo.getDrive();
		Dt_sus = pojo.getDt_sus();
		Dt_ter = pojo.getDt_ter();
		Easement_rest1 = pojo.getEasement_rest1();
		Easement_rest2 = pojo.getEasement_rest2();
		Easement_rest3 = pojo.getEasement_rest3();
		Easement_rest4 = pojo.getEasement_rest4();
		Elec = pojo.getElec();
		Elevator = pojo.getElevator();
		Energy_cert = pojo.getEnergy_cert();
		Extras = pojo.getExtras();
		Farm_agri = pojo.getFarm_agri();
		Fpl_num = pojo.getFpl_num();
		Front_ft = pojo.getFront_ft();
		Fuel = pojo.getFuel();
		Furnished = pojo.getFurnished();
		Gar_spaces = pojo.getGar_spaces();
		Gar_type = pojo.getGar_type();
		Gas = pojo.getGas();
		Green_pis = pojo.getGreen_pis();
		Handi_equipped = pojo.getHandi_equipped();
		Heat_inc = pojo.getHeat_inc();
		Heating = pojo.getHeating();
		Hydro_inc = pojo.getHydro_inc();
		Input_date = pojo.getInput_date();
		Internet = pojo.getInternet();
		Irreg = pojo.getIrreg();
		Kit_plus = pojo.getKit_plus();
		Laundry = pojo.getLaundry();
		Laundry_lev = pojo.getLaundry_lev();
		Ld = pojo.getLd();
		Lease = pojo.getLease();
		Lease_term = pojo.getLease_term();
		Legal_desc = pojo.getLegal_desc();
		Level1 = pojo.getLevel1();
		Level10 = pojo.getLevel10();
		Level11 = pojo.getLevel11();
		Level12 = pojo.getLevel12();
		Level2 = pojo.getLevel2();
		Level3 = pojo.getLevel3();
		Level4 = pojo.getLevel4();
		Level5 = pojo.getLevel5();
		Level6 = pojo.getLevel6();
		Level7 = pojo.getLevel7();
		Level8 = pojo.getLevel8();
		Level9 = pojo.getLevel9();
		Link_comment = pojo.getLink_comment();
		Link_yn = pojo.getLink_yn();
		Lot_fr_inc = pojo.getLot_fr_inc();
		Lotsz_code = pojo.getLotsz_code();
		Lp_dol = pojo.getLp_dol();
		Lsc = pojo.getLsc();
		Lse_terms = pojo.getLse_terms();
		Ml_num = pojo.getMl_num();
		Mmap_col = pojo.getMmap_col();
		Mmap_page = pojo.getMmap_page();
		Mmap_row = pojo.getMmap_row();
		Municipality = pojo.getMunicipality();
		Municipality_code = pojo.getMunicipality_code();
		Municipality_district = pojo.getMunicipality_district();
		Num_kit = pojo.getNum_kit();
		Occ = pojo.getOcc();
		Oh_date1 = pojo.getOh_date1();
		Oh_date2 = pojo.getOh_date2();
		Oh_date3 = pojo.getOh_date3();
		Oh_date4 = pojo.getOh_date4();
		Oh_date5 = pojo.getOh_date5();
		Oh_date6 = pojo.getOh_date6();
		Oh_dt_stamp = pojo.getOh_dt_stamp();
		Oh_from1 = pojo.getOh_from1();
		Oh_from2 = pojo.getOh_from2();
		Oh_from3 = pojo.getOh_from3();
		Oh_from4 = pojo.getOh_from4();
		Oh_from5 = pojo.getOh_from5();
		Oh_from6 = pojo.getOh_from6();
		Oh_Link1 = pojo.getOh_Link1();
		Oh_Link2 = pojo.getOh_Link2();
		Oh_Link3 = pojo.getOh_Link3();
		Oh_Link4 = pojo.getOh_Link4();
		Oh_Link5 = pojo.getOh_Link5();
		Oh_Link6 = pojo.getOh_Link6();
		Oh_to1 = pojo.getOh_to1();
		Oh_to2 = pojo.getOh_to2();
		Oh_to3 = pojo.getOh_to3();
		Oh_to4 = pojo.getOh_to4();
		Oh_to5 = pojo.getOh_to5();
		Oh_to6 = pojo.getOh_to6();
		Oh_Type1 = pojo.getOh_Type1();
		Oh_Type2 = pojo.getOh_Type2();
		Oh_Type3 = pojo.getOh_Type3();
		Oh_Type4 = pojo.getOh_Type4();
		Oh_Type5 = pojo.getOh_Type5();
		Oh_Type6 = pojo.getOh_Type6();
		Orig_dol = pojo.getOrig_dol();
		Oth_struc1_out = pojo.getOth_struc1_out();
		Oth_struc2_out = pojo.getOth_struc2_out();
		Outof_area = pojo.getOutof_area();
		Parcel_id = pojo.getParcel_id();
		Park_chgs = pojo.getPark_chgs();
		Park_spcs = pojo.getPark_spcs();
		Pay_freq = pojo.getPay_freq();
		Perc_dif = pojo.getPerc_dif();
		Pix_updt = pojo.getPix_updt();
		Pool = pojo.getPool();
		Poss_date = pojo.getPoss_date();
		Potl = pojo.getPotl();
		Pr_lsc = pojo.getPr_lsc();
		Prkg_inc = pojo.getPrkg_inc();
		Prop_feat1_out = pojo.getProp_feat1_out();
		Prop_feat2_out = pojo.getProp_feat2_out();
		Prop_feat3_out = pojo.getProp_feat3_out();
		Prop_feat4_out = pojo.getProp_feat4_out();
		Prop_feat5_out = pojo.getProp_feat5_out();
		Prop_feat6_out = pojo.getProp_feat6_out();
		Prop_mgmt = pojo.getProp_mgmt();
		Pvt_ent = pojo.getPvt_ent();
		Retirement = pojo.getRetirement();
		Rltr = pojo.getRltr();
		Rm1_dc1_out = pojo.getRm1_dc1_out();
		Rm1_dc2_out = pojo.getRm1_dc2_out();
		Rm1_dc3_out = pojo.getRm1_dc3_out();
		Rm1_len = pojo.getRm1_len();
		Rm1_out = pojo.getRm1_out();
		Rm1_wth = pojo.getRm1_wth();
		Rm10_dc1_out = pojo.getRm10_dc1_out();
		Rm10_dc2_out = pojo.getRm10_dc2_out();
		Rm10_dc3_out = pojo.getRm10_dc3_out();
		Rm10_len = pojo.getRm10_len();
		Rm10_out = pojo.getRm10_out();
		Rm10_wth = pojo.getRm10_wth();
		Rm11_dc1_out = pojo.getRm11_dc1_out();
		Rm11_dc2_out = pojo.getRm11_dc2_out();
		Rm11_dc3_out = pojo.getRm11_dc3_out();
		Rm11_len = pojo.getRm11_len();
		Rm11_out = pojo.getRm11_out();
		Rm11_wth = pojo.getRm11_wth();
		Rm12_dc1_out = pojo.getRm12_dc1_out();
		Rm12_dc2_out = pojo.getRm12_dc2_out();
		Rm12_dc3_out = pojo.getRm12_dc3_out();
		Rm12_len = pojo.getRm12_len();
		Rm12_out = pojo.getRm12_out();
		Rm12_wth = pojo.getRm12_wth();
		Rm2_dc1_out = pojo.getRm2_dc1_out();
		Rm2_dc2_out = pojo.getRm2_dc2_out();
		Rm2_dc3_out = pojo.getRm2_dc3_out();
		Rm2_len = pojo.getRm2_len();
		Rm2_out = pojo.getRm2_out();
		Rm2_wth = pojo.getRm2_wth();
		Rm3_dc1_out = pojo.getRm3_dc1_out();
		Rm3_dc2_out = pojo.getRm3_dc2_out();
		Rm3_dc3_out = pojo.getRm3_dc3_out();
		Rm3_len = pojo.getRm3_len();
		Rm3_out = pojo.getRm3_out();
		Rm3_wth = pojo.getRm3_wth();
		Rm4_dc1_out = pojo.getRm4_dc1_out();
		Rm4_dc2_out = pojo.getRm4_dc2_out();
		Rm4_dc3_out = pojo.getRm4_dc3_out();
		Rm4_len = pojo.getRm4_len();
		Rm4_out = pojo.getRm4_out();
		Rm4_wth = pojo.getRm4_wth();
		Rm5_dc1_out = pojo.getRm5_dc1_out();
		Rm5_dc2_out = pojo.getRm5_dc2_out();
		Rm5_dc3_out = pojo.getRm5_dc3_out();
		Rm5_len = pojo.getRm5_len();
		Rm5_out = pojo.getRm5_out();
		Rm5_wth = pojo.getRm5_wth();
		Rm6_dc1_out = pojo.getRm6_dc1_out();
		Rm6_dc2_out = pojo.getRm6_dc2_out();
		Rm6_dc3_out = pojo.getRm6_dc3_out();
		Rm6_len = pojo.getRm6_len();
		Rm6_out = pojo.getRm6_out();
		Rm6_wth = pojo.getRm6_wth();
		Rm7_dc1_out = pojo.getRm7_dc1_out();
		Rm7_dc2_out = pojo.getRm7_dc2_out();
		Rm7_dc3_out = pojo.getRm7_dc3_out();
		Rm7_len = pojo.getRm7_len();
		Rm7_out = pojo.getRm7_out();
		Rm7_wth = pojo.getRm7_wth();
		Rm8_dc1_out = pojo.getRm8_dc1_out();
		Rm8_dc2_out = pojo.getRm8_dc2_out();
		Rm8_dc3_out = pojo.getRm8_dc3_out();
		Rm8_len = pojo.getRm8_len();
		Rm8_out = pojo.getRm8_out();
		Rm8_wth = pojo.getRm8_wth();
		Rm9_dc1_out = pojo.getRm9_dc1_out();
		Rm9_dc2_out = pojo.getRm9_dc2_out();
		Rm9_dc3_out = pojo.getRm9_dc3_out();
		Rm9_len = pojo.getRm9_len();
		Rm9_out = pojo.getRm9_out();
		Rm9_wth = pojo.getRm9_wth();
		Rms = pojo.getRms();
		Rooms_plus = pojo.getRooms_plus();
		Rural_svc1 = pojo.getRural_svc1();
		Rural_svc2 = pojo.getRural_svc2();
		Rural_svc3 = pojo.getRural_svc3();
		Rural_svc4 = pojo.getRural_svc4();
		Rural_svc5 = pojo.getRural_svc5();
		S_r = pojo.getS_r();
		Sewage1 = pojo.getSewage1();
		Sewage2 = pojo.getSewage2();
		Sewer = pojo.getSewer();
		Shore_allow = pojo.getShore_allow();
		Shoreline_exp = pojo.getShoreline_exp();
		Shoreline1 = pojo.getShoreline1();
		Shoreline2 = pojo.getShoreline2();
		Sp_dol = pojo.getSp_dol();
		Spec_des1_out = pojo.getSpec_des1_out();
		Spec_des2_out = pojo.getSpec_des2_out();
		Spec_des3_out = pojo.getSpec_des3_out();
		Spec_des4_out = pojo.getSpec_des4_out();
		Spec_des5_out = pojo.getSpec_des5_out();
		Spec_des6_out = pojo.getSpec_des6_out();
		Sqft = pojo.getSqft();
		St = pojo.getSt();
		St_dir = pojo.getSt_dir();
		St_num = pojo.getSt_num();
		St_sfx = pojo.getSt_sfx();
		Status = pojo.getStatus();
		Style = pojo.getStyle();
		Taxes = pojo.getTaxes();
		Td = pojo.getTd();
		Timestamp_sql = pojo.getTimestamp_sql();
		Tot_park_spcs = pojo.getTot_park_spcs();
		Tour_url = pojo.getTour_url();
		Tv = pojo.getTv();
		Type_own_srch = pojo.getType_own_srch();
		Type_own1_out = pojo.getType_own1_out();
		Uffi = pojo.getUffi();
		Unavail_dt = pojo.getUnavail_dt();
		Util_cable = pojo.getUtil_cable();
		Util_tel = pojo.getUtil_tel();
		Vend_pis = pojo.getVend_pis();
		Vtour_updt = pojo.getVtour_updt();
		Water = pojo.getWater();
		Water_acc_bldg1 = pojo.getWater_acc_bldg1();
		Water_acc_bldg2 = pojo.getWater_acc_bldg2();
		Water_body = pojo.getWater_body();
		Water_del_feat1 = pojo.getWater_del_feat1();
		Water_del_feat2 = pojo.getWater_del_feat2();
		Water_feat1 = pojo.getWater_feat1();
		Water_feat2 = pojo.getWater_feat2();
		Water_feat3 = pojo.getWater_feat3();
		Water_feat4 = pojo.getWater_feat4();
		Water_feat5 = pojo.getWater_feat5();
		Water_front = pojo.getWater_front();
		Water_inc = pojo.getWater_inc();
		Water_type = pojo.getWater_type();
		Waterfront = pojo.getWaterfront();
		Wcloset_p1 = pojo.getWcloset_p1();
		Wcloset_p2 = pojo.getWcloset_p2();
		Wcloset_p3 = pojo.getWcloset_p3();
		Wcloset_p4 = pojo.getWcloset_p4();
		Wcloset_p5 = pojo.getWcloset_p5();
		Wcloset_t1 = pojo.getWcloset_t1();
		Wcloset_t1lvl = pojo.getWcloset_t1lvl();
		Wcloset_t2 = pojo.getWcloset_t2();
		Wcloset_t2lvl = pojo.getWcloset_t2lvl();
		Wcloset_t3 = pojo.getWcloset_t3();
		Wcloset_t3lvl = pojo.getWcloset_t3lvl();
		Wcloset_t4 = pojo.getWcloset_t4();
		Wcloset_t4lvl = pojo.getWcloset_t4lvl();
		Wcloset_t5 = pojo.getWcloset_t5();
		Wcloset_t5lvl = pojo.getWcloset_t5lvl();
		Wtr_suptyp = pojo.getWtr_suptyp();
		Xd = pojo.getXd();
		Xdtd = pojo.getXdtd();
		Yr = pojo.getYr();
		Yr_built = pojo.getYr_built();
		Zip = pojo.getZip();
		Zoning = pojo.getZoning();
		Portion_property_lease1_out = pojo.getPortion_property_lease1_out();
		Portion_property_lease2_out = pojo.getPortion_property_lease2_out();
		Portion_property_lease3_out = pojo.getPortion_property_lease3_out();
		Portion_property_lease4_out = pojo.getPortion_property_lease4_out();
		Portion_property_lease_srch = pojo.getPortion_property_lease_srch();
		Portion_lease_comments = pojo.getPortion_lease_comments();
		Assignment = pojo.getAssignment();
		Fractional_ownership = pojo.getFractional_ownership();
		images=pojo.getImages();
	}


}
