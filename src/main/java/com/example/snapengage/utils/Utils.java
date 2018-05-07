package com.example.snapengage.utils;

import java.math.BigInteger;
import java.util.UUID;

public class Utils {
	public static UUID getCleanUUID(String str) {
		String s = str.replace("-", "");
		UUID uuid = new UUID(
		        new BigInteger(s.substring(0, 16), 16).longValue(),
		        new BigInteger(s.substring(16), 16).longValue());
		
		return uuid;
	}

}
