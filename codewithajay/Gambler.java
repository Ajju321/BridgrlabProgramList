package com.codewithajay;
import java.util.Scanner;
public class Gambler { 

    public static void main(String[] args) {
//        int stake  = Integer.parseInt(args[0]);    // gambler's stating bankroll
//        int goal   = Integer.parseInt(args[1]);    // gambler's desired bankroll
//        int trials = Integer.parseInt(args[2]);    // number of trials to perform
    	int stake,goal,trials;
    	Scanner sc=new Scanner (System.in);
    	System.out.println("Enter the stake goal and trilas ");
    	stake=sc.nextInt();
    	goal=sc.nextInt();
    	trials=sc.nextInt();

        int bets = 0;        
        int wins = 0;       

        for (int t = 0; t < trials; t++) {


            int cash = stake;
            while (cash > 0 && cash < goal) {
                bets++;
                if (Math.random() < 0.5) cash++;    
                else      cash--;     
            }
            if (cash == goal) wins++;                
        }

        // print results
        System.out.println(wins + " wins of " + trials);
        System.out.println("Percent of games won = " + 100.0 * wins / trials);
        System.out.println("Avg # bets           = " + 1.0 * bets / trials);
    }

}
