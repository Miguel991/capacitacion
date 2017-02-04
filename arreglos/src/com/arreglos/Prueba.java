package com.arreglos;

public class Prueba {

	public static void main(String[] args) {

		String[] list = new String[3];
		list[0] = "a";
		list[1] = "b";
		list[2] = "c";
		
		int n = 0;
		int n1 = 1;
		int n2 = 2;

		for (int a = 0; a < 1; a++) {
			System.out.println(list[n]+list[n1]+list[n2]);
			System.out.println(list[n]+list[n2]+list[n1]);
			for (int b = 1; b < 2; b++) {
				System.out.println(list[n1]+list[n]+list[n2]);
				System.out.println(list[n1]+list[n2]+list[n]);
				for (int c = 2; c < 3; c++) {
					System.out.println(list[n2]+list[n1]+list[n]);
					System.out.println(list[n2]+list[n]+list[n1]);
				}

			}

		}

	}

}
