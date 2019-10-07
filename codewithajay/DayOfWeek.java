package com.codewithajay;

public class DayOfWeek {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String monthString;
		int d=Integer.parseInt(args[0]); //for days
		int m=Integer.parseInt(args[1]);//for month
		int y=Integer.parseInt(args[2]); //for the year
		
		int y0=y-(14-m)/12;
		int x=y0+y0/4-y0/100+y0/400;
		int m0=m+12*((14-m)/12)-2;
		int d0= (d+x+31*m0/12)%7;
		
		//System.out.println("days : "+d0+" month : "+m0+" year "+y0);
		//System
		switch(d0)
		{
		case 1:System.out.println("monday");break;
		case 2:System.out.println("tuesday");break;
		case 3:System.out.println("wendesday");break;
		case 4:System.out.println("thurseday");break;
		case 5:System.out.println("friday");break;
		case 6:System.out.println("saturday");break;
		case 7:System.out.println("sunday");break;
		default:System.out.println("wrong days please check");
		}
		switch (m) {
        case 1:  monthString = "January";
        System.out.println(monthString);
                 break;
        case 2:  monthString = "February";
        System.out.println(monthString);
                 break;
        case 3:  monthString = "March";
        System.out.println(monthString);
                 break;
        case 4:  monthString = "April";
        System.out.println(monthString);
                 break;
        case 5:  monthString = "May";
        System.out.println(monthString);
                 break;
        case 6:  monthString = "June";
        System.out.println(monthString);
                 break;
        case 7:  monthString = "July";
        System.out.println(monthString);
                 break;
        case 8:  monthString = "August";
        System.out.println(monthString);
                 break;
        case 9:  monthString = "September";
        System.out.println(monthString);
                 break;
        case 10: monthString = "October";
        System.out.println(monthString);
                 break;
        case 11: monthString = "November";
        System.out.println(monthString);
                 break;
        case 12: monthString = "December";
        System.out.println(monthString);
                 break;
        default: monthString = "Invalid month";
                 break;
    }
	}

}
