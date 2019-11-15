package com.swen6301.builder.util;

import java.util.Random;
/**
 * Enum For Gender
 * 
 * @return a random Gender.
 */
public enum Sex {

	MALE("Male"), Female("Female"), NONE("None");


	private String name;

	private Sex(String name) {

		this.name = name;
	}

	public String getName() {
		return name;
	}



	public static Sex getRand() {
    	RandomEnum<Sex> r = new RandomEnum<Sex>(Sex.class);

    	Sex Rand = r.random();
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
