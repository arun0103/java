package toGit;

import java.util.ArrayList;
import java.util.Random;

public class GenerateRandom {
	public static void main(String[] args) {
		ArrayList<Student> firstBatch = new ArrayList<>();
		Student Anil = new Student("Anil",1);
		Student Sameer = new Student("Sameer",2);
		Student Arun= new Student("Arun",3);
		Student Bhavna = new Student("Bhavna",4);
		Student Pratibh = new Student("Pratibh",5);
		Student Shankar = new Student("Shankar",6);
		Student Keshab = new Student("Keshab",8);
		Student Symon = new Student("Symon",7);
		
		
		firstBatch.add(Anil);
		firstBatch.add(Sameer);
		firstBatch.add(Bhavna);
		firstBatch.add(Shankar);
		firstBatch.add(Keshab);
		firstBatch.add(Pratibh);
		firstBatch.add(Symon);
		firstBatch.add(Arun);
		
		Random generator  = new Random();
		int index = generator.nextInt(7);
		
		Student s = firstBatch.get(index);
		
		switch (s.name) {
		case "Anil":
			System.out.println("It's ur turn " + s.name +" Roll no: "+ s.ROLL);
			break;
		
		case "Sameer":
			System.out.println("It's ur turn " + s.name +" Roll no: "+ s.ROLL);
			break;
		
		case "Arun":
				System.out.println("It's ur turn " + s.name +" Roll no: "+ s.ROLL);
				break;
		
		case "Bhavna":
			System.out.println("It's ur turn " + s.name +" Roll no: "+ s.ROLL);
			break;
		
		case "Pratibh":
			System.out.println("It's ur turn " + s.name +" Roll no: "+ s.ROLL);
			break;
			
		case "Shankar":
			System.out.println("It's ur turn " + s.name +" Roll no: "+ s.ROLL);
			break;
			
		case "Symon":
			System.out.println("It's ur turn " + s.name +" Roll no: "+ s.ROLL);
			break;
			
		case "Keshab":
			System.out.println("It's ur turn " +s.name + " Roll no: "+ s.ROLL);
			break;
			
		default:
			System.out.println("No ones turn");
			break;
		}
	}
	
}
