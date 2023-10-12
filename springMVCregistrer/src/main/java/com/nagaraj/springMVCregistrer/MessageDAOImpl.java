package com.nagaraj.springMVCregistrer;

import org.springframework.stereotype.Repository;

@Repository   // use to do the interaction with a DB
public class MessageDAOImpl implements MessageDAO {

	
	
	/**
	 * 
	 */
	public MessageDAOImpl() {
		super();
		System.out.println("in MDAO impl no-org constr");
	
	}

	@Override
	public String getAQouteFromDb() {
		// TODO Auto-generated method stub
		return "Never give Up ....!";
	}

}
