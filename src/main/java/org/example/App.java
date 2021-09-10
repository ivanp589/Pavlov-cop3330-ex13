package org.example;

import java.util.Scanner;

import static java.lang.System.out;

/**
 * Hello world!
 *
 */
public class App 
{
    static Scanner in = new Scanner(System.in);
    public static void main( String[] args )
    {

      //  System.out.println( "Hello World!" );
        App math = new App();
        App ask = new App();
        double prin = ask.amount();
        double rate = ask.rate();
        int years = ask.years();
        int times = ask.comp();
        double total1 = math.calc(rate,years, prin, times);
        double total = math.rounds(total1);
        out.println(String.format("$%.2f invested at %.2f" +
                "%% for %d years compounded %d times per year is $%.2f.",prin,rate,years, times, total));
        //out.println(String.format("%f ",total));
    }

    private double amount(){
        out.print("What is the principal amount? ");
        return in.nextDouble();
    }
    private double rate(){
        out.print("What is the rate? ");
        return in.nextDouble();
    }
    private int years(){
        out.print("What is the number of years? ");
        return in.nextInt();
    }
    private int comp(){
        out.print("What is the number of times the interest is compounded per year? ");
        return in.nextInt();
    }
    private double calc(double rate,double years,double prin,double times){
        double sum = 1;

        for(int x=0;x<(times*years);x++){
            sum *=(1+(rate/100)/times);
        }
        double calc = prin*(sum);
        out.println(String.format("this is  calc %f ", calc));
        return calc;

    }
    private double rounds( double total1){
        double roundOff=Math.ceil(total1*100)/100;
        return roundOff;
    }
}
