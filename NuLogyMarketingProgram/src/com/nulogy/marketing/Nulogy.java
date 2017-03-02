package com.nulogy.marketing;

import java.text.DecimalFormat;
import java.util.Scanner;
/*
 * @Author: Sonchita Nag
 * Date: 01-Mar-2017
 * ClasName: Nulogy
 * 
 * */
public class Nulogy {

	/*
	 * MethodName: calculateFlatMarkup
	 * Return: Double
	 * This method calculates the marked up price of the commodity
	 * 
	 * */
	public Double calculateFlatMarkup(Double price){
		Double calculatedPrice = price + (price*0.05);
		return calculatedPrice;
	}
	
	/*
	 * MethodName: calculatePeopleMarkup
	 * Return: Double
	 * This method calculates the price hike of the commodity due to manpower involvement
	 * 
	 * */
	public Double calculatePeopleMarkup(Double price,int ppl){
		Double result = price * ppl * 0.012;
		return result;
	}
	
	/*
	 * MethodName: calculateItemMarkup
	 * Return: Double
	 * This method calculates the price increase of the commodity based on the type of it
	 * 
	 * */
	public Double calculateItemMarkup(Double price,String item){
		Double result = 0.0;
		
		if(item.equalsIgnoreCase("food")){
			result = price * 0.13;
		}
		else if (item.equalsIgnoreCase("drugs")){
			result = price * 0.075;
		}
		else if (item.equalsIgnoreCase("electronics")){
			result = price * 0.02;
		}
		else result = 0.0;
		return result;
	}

	/* main method */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		DecimalFormat df = new DecimalFormat("#.##"); 
		Nulogy obj = new Nulogy();
		Scanner sc = new Scanner(System.in);

		    System.out.println("Price:");
		    Double a = sc.nextDouble();
		    System.out.println("Person:");
		    int b = sc.nextInt();
		    System.out.println("Item:");
		    String c = sc.next();
		      
		    Double p = obj.calculateFlatMarkup(a);
		
		    Double totalPrice = p + obj.calculatePeopleMarkup(p, b) + obj.calculateItemMarkup(p, c);
		System.out.println("Your total price is $" + df.format(totalPrice));
		

	}
	

}
