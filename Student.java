package com.test;

class Undergrad extends Student{
	Undergrad(String name, String id , int age){
		super(name,id,age);
	}
	@Override
	public Boolean isPassed(double grade){
		if(grade>=70.0) {
			return super.isPassed(grade);
		}
		return false;
	}
}
class Grad extends Student{
	Grad(String name, String id , int age){
		super(name,id,age);
	}
	@Override
	public Boolean isPassed(double grade){
		if(grade>=80.0) {
			return super.isPassed(grade);
		}	
		return false;
	}
}

public class Student {
	  private String name;
	    protected String id;
	 Double grade;
	   public int age;
	   	    public Student(String name, String id, int age) {
	        this.name=name;
	        this.id=id;
	        this.age=age;
	   	    }
	   	 Boolean isPassed ( double grade) {
	   		 return true;
	   	 }
	   	public static void main(String[] args) {
	   		Undergrad ugrad = new Undergrad("Nazeer","73", 22);
	   		System.out.println("undergrad is passed : "+ ugrad.isPassed(50));
			Grad grad = new Grad("Ahmad","72",23);
			System.out.println("grad is passed : "+ grad.isPassed(90));
			

	}
	}

	    
