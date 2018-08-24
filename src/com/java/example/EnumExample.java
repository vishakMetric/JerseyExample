package com.java.example;

public class EnumExample {
	
	enum WeekDays {
		Sun, Mon, Tue, Wed, Thu, Fri, Sat
	}
	
	enum Student {
		John(11), Bella(10), Sam(13), Viraaj(9);
		
		private int age;
		int getAge() { 
			return age; 
		}
		
		private Student(int age) {
			this.age = age;
		}
	}
	public static void main(String[]args) {
		WeekDays wk;
		wk = WeekDays.Sun;
		System.out.println(wk);
		System.out.println(Student.John.getAge());
		System.out.println(Student.valueOf("Sam").getAge());
		
		Student [] sArray = Student.values();
		
		for(Student s : sArray) {
			System.out.println(s.name()+":::"+s.getAge());
		}
	}

}
