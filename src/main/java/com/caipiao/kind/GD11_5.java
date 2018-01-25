package com.caipiao.kind;

import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.redirectedUrl;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

public class GD11_5 implements Kind {
	public static void main(String[] args) {
		// int[] num = new int[] {1,2,3,4,5,6,7,8,9,10,11};
		java.util.Random rd = new java.util.Random();
		int[] i = new int[5];

		for (int o = 0; o < i.length; o++) {
			int n = rd.nextInt(11) + 1;
			while (ArrayUtils.contains(i, n)) {
				n = rd.nextInt(11) + 1;
			}
			i[o] = n;
		}
		System.out.println(Arrays.toString(i));

	}

	public String getResult() {
		java.util.Random rd = new java.util.Random();
		int[] i = new int[5];

		for (int o = 0; o < i.length; o++) {
			int n = rd.nextInt(11) + 1;
			while (ArrayUtils.contains(i, n)) {
				n = rd.nextInt(11) + 1;
			}
			i[o] = n;
		}
		Arrays.sort(i);
		return Arrays.toString(i);
	}

	public static String get() {
		return new GD11_5().getResult();
	}
}
