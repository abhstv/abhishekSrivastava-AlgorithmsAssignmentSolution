package com.greatlearning.driver;
import java.util.Scanner;
import com.greatlearning.model.*;

public class Stockers extends StockData {

    public static void main(String[] args) {
        Stockers stocker1 = new Stockers();
        stocker1.setStocks();
        Scanner sc = new Scanner(System.in);
        int selection;
        do {
            System.out.println("1. Display the companies stock price in ascending order");
            System.out.println("2. Display the companies stock price in descending order");
            System.out.println("3. Display the total no of companies for which stock prices rose today");
            System.out.println("4. Display the total no of companies for which stock prices declined today");
            System.out.println("5. Search a specific stock price");
            System.out.println("6. press 0 for exit");
            System.out.println("-----------------------------------------");
            selection = sc.nextInt();
            switch (selection){
                case 1:
                System.out.println("Stock prices in ascending order are :");
                stocker1.sorting(1);
                System.out.println();
                break;
                case 2:
                System.out.println("Stock prices in descending order are :");
                stocker1.sorting(2);
                System.out.println();
                break;
                case 3:
                System.out.println("Total no of companies whose stock price rose today : "+stocker1.getCountTrue());
                System.out.println();
                break;
                case 4:
                System.out.println("Total no of companies whose stock price declined today : "+stocker1.getCountFalse());
                System.out.println();
                break;
                case 5:
                double searchKey = sc.nextDouble();
                stocker1.searching(searchKey);
                System.out.println();
                break;
                case 0:
                System.out.println("Exited successfully");
                break;
                default:
                System.out.println("please select between 0 to 5");
                System.out.println();
                break;
            }
        } while (selection != 0);
        

    }
    
}
