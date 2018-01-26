package com.caipiao.kind.rule;

import java.util.Arrays;

import org.apache.commons.lang3.ArrayUtils;

import com.caipiao.kind.Kind;

/**
 * 广东11选5生成规则类
 * @author Administrator
 *
 */
public class GD11_5 implements Kind {
	
	public static void main(String[] args) {
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

	/*
	 * 返回结果
	 * @see com.caipiao.kind.Kind#getResult()
	 */
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
		Arrays.sort(i); //排序
		return Arrays.toString(i);//转成字符串
	}

	public static String get() {
		return new GD11_5().getResult();
	}
}
