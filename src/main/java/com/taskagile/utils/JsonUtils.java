package com.taskagile.utils;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public final class JsonUtils {
	
	public static final Logger log = LoggerFactory.getLogger(JsonUtils.class);

	public static String toJson(Object o) {
		ObjectMapper objectMapper = new ObjectMapper();
		try {
			return objectMapper.writeValueAsString(o);
		}catch(JsonProcessingException e) {
			log.error("toJSON으로 변환하는데 에러가 발생",e);
			return null;
		}
	}

}
