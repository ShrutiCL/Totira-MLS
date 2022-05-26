package com.cl.totira.MLSWrapper.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.cl.totira.MLSWrapper.model.MLSCollection;

public interface MLSRepository extends MongoRepository<MLSCollection, String>{

	
	 @Query(value="{Community:'?0'}", fields="{'Ml_num' : 1, 'ad_text' : 1}")
	    List<MLSCollection> findAll(String community);
	
	public long count();
	
}
