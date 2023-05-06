import java.util.Scanner;

public class PatikaProje {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Bir sayı giriniz: ");
		int num = input.nextInt(), tmp, f1 = 0, f2 = 1;
		System.out.print(num + " Elemanlı Fibonacci Serisi : ");
		if (num > 0) {
			System.out.print(f1 + " ");
		}
		if (num > 1) {
			System.out.print(f2 + " ");
		}
		for (int i = 2; i < num; i++) {
			tmp = f1;
			f1 = f2;
			f2 += tmp;
			System.out.print(f2 + " ");
		}
	}

}
