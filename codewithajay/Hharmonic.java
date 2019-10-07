package com.codewithajay;

public class Hharmonic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		double sum=0;
		double harmonic=Double.parseDouble(args[0]);
        while(harmonic> 0)

        {

          sum= sum + (double) 1 /harmonic;

             harmonic--;

             System.out.println(+sum);

        }
		
		System.out.println("1+ 1/1+ 1/2 + 1/3 + 1/4 + 1/5 + 1/6 ....+ 1/n = "+sum);
	}

}
