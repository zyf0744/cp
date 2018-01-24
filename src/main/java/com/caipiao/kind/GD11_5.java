package com.caipiao.kind;

public class GD11_5 {
	public static void main(String[] args) {
		int[] num = new int[] {1,2,3,4,5,6,7,8,9,10,11};
		java.util.Random rd=new java.util.Random();
		int[] i = new int[5];
		
		for(int o = 0; o<i.length;o++) {
			
			for(int ii = 0; ii<i.length;ii++) {
				int n = rd.nextInt(11)+1;
				if(i[ii]==n) {
					
				}
			   }
			System.out.println(i);
		}
		
	}
}
