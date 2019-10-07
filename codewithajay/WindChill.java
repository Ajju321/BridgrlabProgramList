package com.codewithajay;

public class WindChill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int compound,w;
		
		double t=Integer.parseInt(args[0]);

		double v=Integer.parseInt(args[1]);
		compound = (int) Math.pow(t, v);
  
		//w=(int) (35.74+0.6215t+(0.4275 t-35.75)v*0.16*0.16);
	}

}
