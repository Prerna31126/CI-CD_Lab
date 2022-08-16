

import java.util.Scanner;

public class Triangle_Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       System.out.println("Enter first side of a triangle");
       int a = sc.nextInt();
       System.out.println("Enter second side of a triangle");
       int b = sc.nextInt();
       System.out.println("Enter third side of a triangle");
       int c = sc.nextInt();
       if(a==b && b==c) {
    	   System.out.println("Equilateral triangle");
       }
       else if((a==b && b!=c) || (a!=b && b==c)) {
    	   System.out.println("Isosceles triangle");
       }
       else {
    	   System.out.println("Scalene triangle");
       }
    	   
	}
}

