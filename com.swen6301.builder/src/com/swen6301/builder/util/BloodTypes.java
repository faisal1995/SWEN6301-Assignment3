package com.swen6301.builder.util;

import java.util.Random;


/**
 * Enum For Blood Types
 * 
 * @return a random Blood Type.
 */
public enum BloodTypes {

	ANEG("A", '-'), APOS("A", '+'), BNEG("B", '-'), BPOS("B", '+'),
	ONEG("O", '-'), OPOS("O", '+'), ABNEG("AB", '-'), ABPOS("AB", '+'),
	NONE("None",'\0');


	private String name;
	private char sign;

	private BloodTypes(String name, char sign) {

		this.name = name;
		this.sign = sign;
	}

	public String getName() {
		return name;
	}

	public char getSign() {
		return sign;
	}


	public static BloodTypes getRand() {
    	RandomEnum<BloodTypes> r = new RandomEnum<BloodTypes>(BloodTypes.class);

    	BloodTypes Rand = r.random();
		return Rand;

	}

	private static class RandomEnum<E extends Enum<E>> {

		        private static final Random RND = new Random();
		        private final E[] values;

		        public RandomEnum(Class<E> token) {
		            values = token.getEnumConstants();
		        }

		        public E random() {
		            return values[RND.nextInt(values.length)];
		        }
		    }
}
