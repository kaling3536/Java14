#1
InputStream、OutputStream 類別是用來處理「位元串流」,也就是二進位檔,同時它
也可以處理純文字檔。Reader、Writer 類別則是用來處理「字元串流」,也就是純文
字檔。

#2
import java.util.Scanner;
import java.lang.String;

public class hw14_2 {
	public static void main(String args[]) {
		Scanner scn = new Scanner(System.in);
		String str;

		System.out.print("輸入字串:");
		str = scn.nextLine();

		System.out.println("轉換成大寫: " + str.toUpperCase());
	}
}

#3
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class hw14_3 {
	public static void main(String args[]) throws IOException {
		int n, sum = 0;
		BufferedReader buf;
		String str;
		buf = new BufferedReader(new InputStreamReader(System.in));

		System.out.print("輸入一個整數: ");
		str = buf.readLine();
		n = Integer.parseInt(str);

		for (int i = 1; i <= n; i++)
			sum += i;
		System.out.println("1+2+...+" + n + "=" + sum);
	}
}
