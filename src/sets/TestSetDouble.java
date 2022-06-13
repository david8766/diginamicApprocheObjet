package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		// Exercise 1
		// Learn how to handle a set of doubles
		HashSet<Double> hs = new HashSet<Double>();
		hs.add(1.5);
		hs.add(8.25);
		hs.add(-7.32);
		hs.add(13.3);
		hs.add(-12.45);
		hs.add(148.5);
		hs.add(0.01);
		for (Double integer : hs) {
			System.out.println(integer);
		}
		System.out.println("-----------------------------------");

		// Max
		Object[] arr = hs.toArray();
		Double maxNum = (Double) arr[0];
		for (Double integer : hs) {
			if (integer > maxNum) {
				maxNum = integer;
			}
		}
		System.out.println("Nombre max = " + maxNum);
		System.out.println("-----------------------------------");

		// Remove minimum
		Double minNum = (Double) arr[0];
		for (Double integer : hs) {
			if (integer < minNum) {
				minNum = integer;
			}
		}
		hs.remove(minNum);
		for (Double integer : hs) {
			System.out.println(integer);
		}
		System.out.println("le plus petit était : " + minNum);

	}

}
