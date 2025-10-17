package hw4constructor;

public class Student {
	
	    String name;
	    int id;
	    char gender;
	    float grade;
	    boolean isProgrammer;

	    // Default constructor
	    public Student() {
	        System.out.println("This is all about Student.");
	    }

	    // Parameterized constructor
		public Student(String name, int id, char gender, float grade, boolean isProgrammer) {
			super();
			this.name = name;
			this.id = id;
			this.gender= gender;
			this.grade = grade;
			this.isProgrammer = isProgrammer;
			
			
	   System.out.println("Student Name: " + name + ", ID: " + id + ", Gender: " + gender 
		                + ", Grade: " + grade + " and Java Programmer? Ans: " + isProgrammer);
		}

	    // Parameterized constructor
	   
	}




/*
 *   public Student(String name, int id, String gender, float grade, boolean isProgrammer) {
	        this.name = name;
	        this.id = id;
	        this.gender = gender;
	        this.grade = grade;
	        this.isProgrammer = isProgrammer;

	        System.out.println("Student Name: " + name + ", ID: " + id + ", Gender: " + gender 
	                + ", Grade: " + grade + " and Java Programmer? Ans: " + isProgrammer);
	    }
	}
 */





