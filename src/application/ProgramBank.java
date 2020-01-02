package application;

import java.util.*;
import java.util.ArrayList;

import entities.Acount;
import entities.BusinesAcount;
import entities.SavingsAcount;

public class ProgramBank {
	public static void main(String[] args) {
		Acount acc = new Acount(1001, "Alex", 0.0);
		BusinesAcount bacc = new BusinesAcount(1002, "Maria", 0.0, 500.0);
		
		//Upcasting
		Acount acc1 = bacc;
		acc1.getBalance();
		Acount acc2 = new BusinesAcount(1001, "Paulo", 0.0, 200.0);
		Acount acc3 = new SavingsAcount(1004, "Ana", 0.0, 0.01);
		
		//Downcasting
		BusinesAcount acc4 = (BusinesAcount) acc2;
		acc4.loan(100.0);
		//BusinesAcount acc5= (BusinesAcount) acc3;
		if (acc3 instanceof BusinesAcount) {
			BusinesAcount acc5= (BusinesAcount) acc3;
			acc5.loan(500.0);
			System.out.println("Loan");
		}
		if (acc3 instanceof SavingsAcount) {
			SavingsAcount acc5 = (SavingsAcount) acc3;
			acc5.upadateBalance();
			System.out.println("Update");
		}
		
		//Sobreposição, palavra super, anotação @Override
		Acount acc6 = new Acount(1001, "Alex", 1000.0);
		acc6.withdraw(200.0);
		System.out.println(acc6);
		
		Acount acc7 = new SavingsAcount(1002, "Maria", 1000.0, 0.01);
		acc7.withdraw(200.0);
		System.out.println(acc7);
		
		Acount acc8 = new BusinesAcount(1009, "Lucas", 1000.0, 500.0);
		acc8.withdraw(200.0);
		System.out.println(acc8);
		
		//Polimorfismo
		Acount x = new Acount(1020, "Alex", 1000.0);
		Acount y = new SavingsAcount(1023, "Maria", 1000.0, 0.01);
		
		
		System.out.println(x.getBalance());
		System.out.println(y.getBalance());
		
		System.out.println("--------------------------------");
		List<Acount> listar = new ArrayList<>();
		listar.add(new SavingsAcount(1001, "Ana", 1010.0, 0.01));
		listar.add(new SavingsAcount(1002, "Joice", 2010.0, 0.02));
		listar.add(new SavingsAcount(1003, "Paula", 4010.0, 0.03));
		listar.add(new SavingsAcount(1004, "Crlos", 51010.0, 0.03));
		listar.add(new BusinesAcount(1005, "Fernado", 1010.0, 0.01));
		listar.add(new BusinesAcount(1006, "Paulo", 1010.0, 0.01));
		listar.add(new BusinesAcount(1007, "Jefferson", 1010.0, 0.01));
		
		double sum = 0.0;
		for(Acount account : listar) {
			sum += account.getBalance();
		}
		
		System.out.printf("Total Balance: %.2f%n", sum);
		
		for(Acount account : listar) {
			account.deposit(100.0);
		}
		
		for(Acount account : listar) {
			System.out.printf("Updated balance for accoutn %d: %,2f%n", account.getNumber(), account.getBalance());
		}
	}
}

