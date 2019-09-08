package com.secure;

import java.util.Random;

public class Util {
	
	public static Integer getRandomNumber(Integer max, Integer min) {
		Random random = new Random();
		return random.nextInt((max - min) + 1) + min;
	}

}
