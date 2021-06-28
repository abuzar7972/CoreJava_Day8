package com.bl.linecomparison;

import java.util.Scanner;

public class UserInterfaceImpl {
public void startingDisplay() {
		
		// TODO Auto-generated method stub
		System.out.println("Welcome to Line Comparison Computation Program on Master Branch");
	}
public void UC1() {
	Scanner scanner =  new Scanner(System.in);
	System.out.print("Enter value of X1::");
	int x1 = scanner.nextInt();
	System.out.print("Enter value of X2::");
	int x2 = scanner.nextInt();
	System.out.print("Enter value of Y1::");
	int y1 = scanner.nextInt();
	System.out.print("Enter value of Y2::");
	int y2 = scanner.nextInt();
	int line = (int) Math.sqrt((int) Math.pow(x2-x1, 2) + ((int) Math.pow(y2-y1, 2)));
	System.out.println("Line:: " +line);
		}
public void UC2() {
	Scanner scanner =  new Scanner(System.in);
	System.out.print("Enter value of X1::");
	int x1 = scanner.nextInt();
	System.out.print("Enter value of X2::");
	int x2 = scanner.nextInt();
	System.out.print("Enter value of Y1::");
	int y1 = scanner.nextInt();
	System.out.print("Enter value of Y2::");
	int y2 = scanner.nextInt();
	int line1 = (int) Math.sqrt((int) Math.pow(x2-x1, 2) + ((int) Math.pow(y2-y1, 2)));
	System.out.println("Line:: " +line1);
	System.out.print("Enter value of X1::");
	int x11 = scanner.nextInt();
	System.out.print("Enter value of X2::");
	int x22 = scanner.nextInt();
	System.out.print("Enter value of Y1::");
	int y11 = scanner.nextInt();
	System.out.print("Enter value of Y2::");
	int y22 = scanner.nextInt();
	int line2 = (int) Math.sqrt((int) Math.pow(x22-x11, 2) + ((int) Math.pow(y22-y11, 2)));
	System.out.println("Line:: " +line2);
	System.out.println("line1 and line are equal : "+(line1==line2));
		}
public void UC3() {
	Scanner scanner =  new Scanner(System.in);
	System.out.print("Enter value of X1::");
	int x1 = scanner.nextInt();
	System.out.print("Enter value of X2::");
	int x2 = scanner.nextInt();
	System.out.print("Enter value of Y1::");
	int y1 = scanner.nextInt();
	System.out.print("Enter value of Y2::");
	int y2 = scanner.nextInt();
	int line1 = (int) Math.sqrt((int) Math.pow(x2-x1, 2) + ((int) Math.pow(y2-y1, 2)));
	System.out.println("Line:: " +line1);
	System.out.print("Enter value of X1::");
	int x11 = scanner.nextInt();
	System.out.print("Enter value of X2::");
	int x22 = scanner.nextInt();
	System.out.print("Enter value of Y1::");
	int y11 = scanner.nextInt();
	System.out.print("Enter value of Y2::");
	int y22 = scanner.nextInt();
	int line2 = (int) Math.sqrt((int) Math.pow(x22-x11, 2) + ((int) Math.pow(y22-y11, 2)));
	System.out.println("Line:: " +line2);
	System.out.println("Line2 is grater:: " +(line1<line2));
	
		}
public void UC4() {
	Scanner scanner =  new Scanner(System.in);
	System.out.print("Enter value of X1::");
	int x1 = scanner.nextInt();
	System.out.print("Enter value of X2::");
	int x2 = scanner.nextInt();
	System.out.print("Enter value of Y1::");
	int y1 = scanner.nextInt();
	System.out.print("Enter value of Y2::");
	int y2 = scanner.nextInt();
	int line1 = (int) Math.sqrt((int) Math.pow(x2-x1, 2) + ((int) Math.pow(y2-y1, 2)));
	System.out.println("Line:: " +line1);
	System.out.print("Enter value of X1::");
	int x11 = scanner.nextInt();
	System.out.print("Enter value of X2::");
	int x22 = scanner.nextInt();
	System.out.print("Enter value of Y1::");
	int y11 = scanner.nextInt();
	System.out.print("Enter value of Y2::");
	int y22 = scanner.nextInt();
	int line2 = (int) Math.sqrt((int) Math.pow(x22-x11, 2) + ((int) Math.pow(y22-y11, 2)));
	System.out.println("Line:: " +line2);
	System.out.println("Line2 is grater:: " +(line1<line2));
	System.out.println("line1 and line are equal : "+(line1==line2));
	
		}
}

