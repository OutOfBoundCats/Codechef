/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

 class Codechef {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		int t = scn.nextInt();
		while (t > 0) {
			int n = scn.nextInt();
			int[][] arr = new int[n + 1][n + 1];
			int[] j = new int[2 * n];

			for (int i = 1; i <= 2 * n - 1; i++) {
				j[i] = i;
			}
			HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
			for (int i = 1; i <= n; i++) {
				map.put(i, new ArrayList<Integer>());
			}
			if (n == 0) {
				System.out.println("Boo");
			} else if (doofish(arr, j, 1, 1, n, map)) {
				System.out.println("Hooray");
				for (int i = 1; i <= n; i++) {
					for (int k = 1; k <= n; k++) {
						System.out.print(arr[i][k] + "  ");
					}
					System.out.println();
				}
			} else {
				System.out.println("Boo");
			}
			t--;

		}

	}

	private static boolean doofish(int[][] arr, int[] j, int row, int col, int n,
			HashMap<Integer, ArrayList<Integer>> map) {
		if (row > n) {

			return true;
		}

		if (col > n) {
			return doofish(arr, j, row + 1, 1, n, map);
		}
		for (int i = 1; i < j.length; i++) {
			if (can_place(arr, row, col, j, j[i], n, map)) {
				arr[row][col] = j[i];
				ArrayList<Integer> list = map.get(row);
				list.add(j[i]);
				map.put(row, list);
				if (row != col) {
					list = map.get(col);
					list.add(j[i]);
					map.put(col, list);
				}

				boolean ans = doofish(arr, j, row, col + 1, n, map);
				if (ans) {
					return true;
				}
				list = map.get(row);
				list.remove(list.indexOf(j[i]));
				map.put(row, list);
				if (row != col) {
					list = map.get(col);
					list.remove(list.indexOf(j[i]));
					map.put(col, list);
				}

			}
		}
		arr[row][col] = 0;
		return false;

	}

	private static boolean can_place(int[][] arr, int row, int col, int[] l, int var, int n,
		HashMap<Integer, ArrayList<Integer>> map) {
		ArrayList<Integer> list = map.get(row);
		if (list.contains(var)) {
			ArrayList<Integer> array_list = new ArrayList<Integer>();
			for(int i=0;i<l.length;i++) {
				array_list.add(l[i]);
			}
			if (list.containsAll(array_list)){
				return true;
			}
			array_list.clear();
			return false;
		}
		if (row != col) {
			list = map.get(col);
			if (list.contains(var)) {
				ArrayList<Integer> array_list = new ArrayList<Integer>();
				for(int i=0;i<l.length;i++) {
					array_list.add(l[i]);
				}
				if (list.containsAll(array_list)){
					return true;
				}
				array_list.clear();
				return false;
			}

		}

		return true;
	}

}
