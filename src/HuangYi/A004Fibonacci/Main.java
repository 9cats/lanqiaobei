package HuangYi.A004Fibonacci;

import java.util.*;

public class Main {
	public static void main(String args[]) {
		Integer n = new Scanner(System.in).nextInt();
		Integer f1 = 1, f2 = 1, f = 1;
		for(int i = 2;i < n; i++) {
			if(i%2 == 0) {
				f = f1 = (f1 + f2)%10007;
			}
			else {
				f = f2 = (f1 + f2)%10007;
			}
		}
		System.out.println(f%10007);
	}
}
