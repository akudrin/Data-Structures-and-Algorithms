package com.akudrin.code.bitmanipulation;

import java.util.BitSet;

public class BitSetAPI {

	public static void main(String[] args) {

		/*
		 * boolean[] bits = new boolean[1024];
		 * System.out.println(ClassLayout.parseInstance(bits).toPrintable());
		 * 
		 * BitSet bitSet = new BitSet(1024);
		 * 
		 * System.out.println(GraphLayout.parseInstance(bitSet).toPrintable());
		 * 
		 * // BitSet instance from a given long[] BitSet bitSetA = BitSet.valueOf(new
		 * long[] { 42, 12 });
		 * 
		 * System.out.println(GraphLayout.parseInstance(bitSetA).toPrintable());
		 */

		BitSet bits1 = new BitSet(16);
		System.out.println(bits1.get(0));
		BitSet bits2 = new BitSet(16);

		// set some bits
		for (int i = 0; i < 16; i++) {
			if ((i % 2) == 0)
				bits1.set(i);
			if ((i % 5) != 0)
				bits2.set(i);
		}

		System.out.println("Initial pattern in bits1: ");
		System.out.println(bits1);
		System.out.println("Length: " + bits1.length());
		System.out.println("Number of set bits: " + bits1.cardinality());
		bits1.stream().forEach(System.out::println);
		System.out.println("\nInitial pattern in bits2: ");
		System.out.println(bits2);

		// AND bits
		bits2.and(bits1);
		System.out.println("\nbits2 AND bits1: ");
		System.out.println(bits2);

		// OR bits
		bits2.or(bits1);
		System.out.println("\nbits2 OR bits1: ");
		System.out.println(bits2);

		// XOR bits
		bits2.xor(bits1);
		System.out.println("\nbits2 XOR bits1: ");
		System.out.println(bits2);

	}

}
