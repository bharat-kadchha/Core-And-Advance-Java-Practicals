package leb_2.threading;

import java.util.Scanner;

public class BankingTest {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("enter amount =");
		int amount = scanner.nextInt();
		scanner.close();
		Transaction transaction = new Transaction();
		withDrawThread withdrawThread = new withDrawThread(transaction, amount);
		depositThread depositThread = new depositThread(transaction, amount);
		depositThread1 depositThread1 = new depositThread1(transaction, amount);
		// transaction.start();

	}

}

class Transaction {
	int total = 20000;

	synchronized void withdraw(int value) throws InterruptedException {
		if (total < value) {
			System.out.println("balance not avaliable ... pls wait");
			try {
				wait();
			} catch (InterruptedException e) {

			}

		}
		System.out.println("balance avaliable ...");
		total -= value;
		System.out.println("withdow =" + value);
		System.out.println(" now reamining balance =" + total);

	}

	synchronized void deposit(int value) {

		total += value;
		System.out.println("deposit amount =" + total);

		notify();
	}

	synchronized void deposit1(int value) {

		total += value;
		System.out.println("deposit amount =" + total);

		notifyAll();
	}

}

class withDrawThread extends Thread {
	Transaction transaction;
	int amount;
	Thread thread;

	public withDrawThread(Transaction transaction, int amount) {

		this.transaction = transaction;
		this.amount = amount;
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		try {
			transaction.withdraw(amount);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

class depositThread extends Thread {
	Transaction transaction;
	int amount;
	Thread thread;

	public depositThread(Transaction transaction, int amount) {

		this.transaction = transaction;
		this.amount = amount;
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		transaction.deposit(amount);
	}
}

class depositThread1 extends Thread {
	Transaction transaction;
	int amount;
	Thread thread;

	public depositThread1(Transaction transaction, int amount) {

		this.transaction = transaction;
		this.amount = amount;
		thread = new Thread(this);
		thread.start();
	}

	public void run() {
		transaction.deposit1(amount);
	}
}