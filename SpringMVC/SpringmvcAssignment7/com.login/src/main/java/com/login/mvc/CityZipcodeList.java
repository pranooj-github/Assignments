package com.login.mvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Component;

@Component
public class CityZipcodeList {

	Map<String, String> zipCodes = new HashMap<>();

	public CityZipcodeList() {
		zipCodes.put("123456", "Ghaziabad");
		zipCodes.put("223456", "Modinagar");
		zipCodes.put("323456", "Meerut");
		zipCodes.put("423456", "Amristar");
		
	}

	public Map<String, String> getZipCodes() {
		return zipCodes;
	}

	public void setZipCodes(Map<String, String> zipCodes) {
		this.zipCodes = zipCodes;
	}

}
