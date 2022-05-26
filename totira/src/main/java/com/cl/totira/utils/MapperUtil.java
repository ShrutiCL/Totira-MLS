/**
 * 
 */
package com.cl.totira.utils;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.dozer.DozerBeanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * @author JoShi
 *
 */

@Component
public class MapperUtil {

	@Autowired
	DozerBeanMapper dozerBeanMapper;

	public <T, S> T map(S s, Class<T> targetClass) {
		return dozerBeanMapper.map(s, targetClass);
	}

	public <T, S> List<T> map(List<S> s, Class<T> targetClass) {
		return s.parallelStream().map(obj -> map(obj, targetClass)).collect(Collectors.toList());
	}

}
