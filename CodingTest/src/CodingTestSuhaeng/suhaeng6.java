package CodingTestSuhaeng;

import java.util.Scanner;

public class suhaeng6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		for(int i = 1; i <= 3; i++) {
			System.out.println("================================");
			System.out.print("계좌번호 입력 : ");
			Account acc = new Account(sc.next());
			acc.balancePrint();
			System.out.println();
			
			System.out.print("입금할 금액 : ");
			acc.deposi(sc.nextInt());
			acc.balancePrint();
		}
	}

}

class Account {
	String acc_num;
	int amo = 0;
	Account(String a){
		acc_num = a;
	}
	void deposi(int amo) {
		this.amo += amo;
	}
	void balancePrint() {
		System.out.println("계좌번호 "+acc_num+"의 현재 잔액 : "+amo);
	}
}