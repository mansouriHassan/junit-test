package com.junit.test;

public class App {
	
	public App() {
		System.out.println("this is a constructor");
	}
	
	/*
	 public int biggestNumber(int[] list)
    {
    	return 0;
    }
	 */
	/*
	public int biggestNumber(int[] list)
    {
		int index, max = Integer.MAX_VALUE;
    	for(index = 0; index < list.length - 1; index++) {
    		if(list[index] > max) {
    			max = list[index];
    		}
    	}
    	return max;
    }
    */
	/*
	public int biggestNumber(int[] list)
    {
		int index, max = 0;
    	for(index = 0; index < list.length - 1; index++) {
    		if(list[index] > max) {
    			max = list[index];
    		}
    	}
    	return max;
    }
    */
	/*
	public int biggestNumber(int[] list)
    {
		int index, max = 0;
    	for(index = 0; index < list.length; index++) {
    		if(list[index] > max) {
    			max = list[index];
    		}
    	}
    	return max;
    }
    */
	/*
	public int biggestNumber(int[] list)
    {
		int index, max = Integer.MIN_VALUE;
    	for(index = 0; index < list.length; index++) {
    		if(list[index] > max) {
    			max = list[index];
    		}
    	}
    	return max;
    }
    */
	public int biggestNumber(int[] list)
    {
    	if(list == null) 
    		throw new invalidListException("list is null");
    	int index;
    	int max = Integer.MIN_VALUE;
    	for(index = 0; index < list.length; index++) {
    		if(list[index] > max) {
    			max = list[index];
    		}
    	}
    	return max;
    }
}
