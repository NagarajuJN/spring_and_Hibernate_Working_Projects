package com.nagaraj.springMVCregistrer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageSerivceImpl implements MessageService {

	@Autowired
	MessageDAO message;
	/**
	 * 
	 */
	public MessageSerivceImpl() {
			super();
			System.out.println("in MSImpl no-arg constr");
	}

	@Override
	public String getQuote() {
		System.out.println("in MSImpl---> in getQuote() ");
		return message.getAQouteFromDb();
	}

}
