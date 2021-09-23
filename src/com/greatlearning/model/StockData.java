package com.greatlearning.model;

import com.greatlearning.utility.*;
import java.util.Scanner;
import java.util.Arrays;

public class StockData extends BinarySearch {

    private double stocks [];
    int num_Stocks;
    Scanner sc = new Scanner(System.in);
    public void setStocks(){
        System.out.println("Enter the no of campanies");
        num_Stocks = sc.nextInt();
        stocks  = new double [num_Stocks];
        for (int i = 0; i<stocks.length; i++){
            System.out.println("Enter current stock price of company "+ (i+1));
            stocks[i]= sc.nextDouble();
            priceRise();
        }
    }
    boolean bool;
    private int countTrue = 0;
    private int CountFalse = 0;
    public int getCountTrue() {
        return countTrue;
    }
    public int getCountFalse() {
        return CountFalse;
    }
    public void priceRise(){
        System.out.println("Whether company's stock price rose today compare to yesterday?");
        //bool = sc.nextBoolean();
        String x = sc.next();
        bool = Boolean.parseBoolean(x);
        if (bool == true){
            countTrue++;
        }
        if (bool == false){
            CountFalse++;
        }

    }
    public void sorting(int selection){             // To sort the Stocks and display
        sortArray(stocks, 0, stocks.length-1, selection);
        for (double element : stocks)
            System.out.print(element+" ");
        System.out.println();
    }
    public void searching(double searchKey){            // To search specific stock
		sortArray (stocks, 0, stocks.length-1, 1);
		searchValues(stocks, searchKey);
    }
}
