package sets;

import java.util.HashSet;

public class TestSetDouble {

	public static void main(String[] args) {
		// Exercise 1
		// Learn how to handle a set of doubles
		HashSet<Integer> hs = new HashSet<Integer>();
		hs.add((int) 1.5);
		hs.add((int) 8.25);
		hs.add((int) -7.32);
		hs.add((int) 13.3);
		hs.add((int) -12.45);
		hs.add((int) 148.5);
		hs.add((int) 0.01);
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		System.out.println("-----------------------------------");

		// Max
		Object[] arr = hs.toArray();
		int maxNum = (int) arr[0];
		for (Integer integer : hs) {
			if (integer > maxNum) {
				maxNum = integer;
			}
		}
		System.out.println("Nombre max = " + maxNum);
		System.out.println("-----------------------------------");

		// Remove minimum
		int minNum = (int) arr[0];
		for (Integer integer : hs) {
			if (integer < minNum) {
				minNum = integer;
			}
		}
		hs.remove(minNum);
		for (Integer integer : hs) {
			System.out.println(integer);
		}
		System.out.println("le plus petit était : " + minNum);

	}

}
