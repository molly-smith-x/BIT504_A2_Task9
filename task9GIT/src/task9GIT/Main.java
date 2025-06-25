package task9GIT;

import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
    	
    	System.out.println("Hello from Task 9!");
    	System.out.println("How are you today?");
    	String feeling = scanner.nextLine();
    	
    	System.out.println("You are " + feeling + "! This is Task 9 for BIT504.");

    	scanner.close();
    }
}



