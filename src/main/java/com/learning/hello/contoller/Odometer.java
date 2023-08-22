package com.learning.hello.contoller;

public class Odometer {
	int reading =0;
	
public Odometer(int startReading) {
  reading= startReading;
}
public int getCurrentReading() {
	return reading;}

public int incrementReadingBy(int k,int n) {
	for(int i=0;i<k;i++) {
		n++;
	while(!isAscending(n)) {
		n++;
	}
}
		return n;	
}
public int decrementReadingBy(int k) {
    for(int i=0;i<k;i++) {
    	reading=previousOdometerReading();
    }
    return reading;
}
		
//public  int largestNumber(int n){
//	int count=0,ans=0;
//	count=countOfDigit(n);
//	for(int i=count;i>0;i--){
//		ans=ans*10+(10-i);
//	}
//	return (ans);
//}
//
//public int smallestNumber(int n){
//	int ans=0,count=0;
//	count=countOfDigit(n);
//	for(int i=1;i<=count;i++){
//		ans=ans*10+(i);
//	}
//	return (ans);
//}
//
//public int countOfDigit(int n){
//	int ans=0,c=0;
//	List<Integer>numberList=new ArrayList<Integer>();
//	while(n!=0){
//		ans=n%10;
//		numberList.add(ans);
//		n=n/10;	
//		c+=1;
//	}
//	return c;
//}

public  int nextOdometerReading(){
	while(true){
		reading++;
		if(isAscending(reading)) {
			return reading;
			}		
		}
	}
		
public int previousOdometerReading(){
	while(true) {
		reading--;
		if(isAscending(reading)) {
			return reading;
		}
	}
}			

public  boolean isAscending(int n){
	String str= Integer.toString(n);
	for(int i=1;i<str.length();i++) {
		if(str.charAt(i)<=str.charAt(i-1)) {
			return false;	
		}
	}
	return true;
		
}
	
//public void reset() {
//	this.reading=getMinimunReading(getSize(this.reading()));
	
	

public int size() {
	return Integer.toString(reading).length();
		
} 
	}



