package com.github.alrafeea.och.util;

import java.io.IOException;
import java.net.URL;

import com.fasterxml.jackson.core.JsonParseException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.github.alrafeea.och.bean.SearchInfo;


public class JSONParser {

	public static SearchInfo parse(String url) throws JsonParseException, JsonMappingException, IOException{
		
		ObjectMapper mapper = new ObjectMapper();
		return mapper.readValue(new URL(url), SearchInfo.class);
		
	}
	
}
