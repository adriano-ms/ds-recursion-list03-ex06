package view;

import java.util.Scanner;

import controller.SumController;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		SumController s = new SumController();
		
		System.out.println(s.sum(sc.nextInt()));
		
		sc.close();
	}

}
