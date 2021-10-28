package com.CollectionSortExamples;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListAssignment {
	 
	public static void findSumandMean(ArrayList<Integer> arr) {
		double sum=0;
		for(int i = 0; i < arr.size(); i++) {
			sum+=arr.get(i);
		}
		System.out.println("Sum of the elements of Array List is : "+sum);
		double mean=sum/arr.size();
		System.out.println("Mean of the elements of Array List is : "+mean);
	}
	public static double findMedian(ArrayList<Integer> arr) {
		Collections.sort(arr);
		if(arr.size() % 2 == 1)
			return arr.get((arr.size() + 1)/ 2 - 1);
		else {
				double lower = arr.get(arr.size() / 2 - 1);
			    double higher = arr.get(arr.size() / 2);
			    return (lower+higher) / 2.0;
		}
	}

	public static void main(String[] args) {
		ArrayList<Integer> arr=new ArrayList<Integer>();
		arr.add(9);
		arr.add(2);
		arr.add(10);
		arr.add(7);
		arr.add(8);
		System.out.println("Elements of Array List are : "+arr);
		findSumandMean(arr);
		System.out.println("Median of the elements of Array List is : "+findMedian(arr));
		
	}

}
