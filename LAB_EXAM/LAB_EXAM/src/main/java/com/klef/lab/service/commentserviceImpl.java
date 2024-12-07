package com.klef.lab.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.klef.lab.model.comment;
@Service
public class commentserviceImpl implements commentservice{

	@Override
	public List<comment> getAllComments() {
		// TODO Auto-generated method stub
		final String API_URL = "https://jsonplaceholder.typicode.com/comments";
		 RestTemplate restTemplate = new RestTemplate();
	        comment[] comments = restTemplate.getForObject(API_URL, comment[].class);
	        return Arrays.asList(comments);
		
	}

}
