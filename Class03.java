#1
import java.io.*;

public class hw14_7 {
	public static void main(String args[]) throws IOException {
		int count = 0;
		String str;
		FileReader fr = new FileReader("C:\\Users\\WIN\\eclipse-workspace\\Java14\\src\\donkey.txt");
		BufferedReader bfr = new BufferedReader(fr);

		while ((str = bfr.readLine()) != null) {
			if (count == 1)
				bfr.skip(14);
			System.out.println(str);
			count++;
		}
		fr.close();
	}
}

#2
import java.io.*;

public class hw14_8 {
	public static void main(String args[]) throws IOException {
		FileReader fr1 = new FileReader("C:\\Users\\WIN\\eclipse-workspace\\Java14\\src\\aaa.txt");
		FileReader fr2 = new FileReader("C:\\Users\\WIN\\eclipse-workspace\\Java14\\src\\bbb.txt");
		FileWriter fw = new FileWriter("C:\\Users\\WIN\\eclipse-workspace\\Java14\\src\\ccc.txt");
		BufferedReader bfr1 = new BufferedReader(fr1);
		BufferedReader bfr2 = new BufferedReader(fr2);
		BufferedWriter bfw = new BufferedWriter(fw);
		String str;

		while ((str = bfr1.readLine()) != null) {
			bfw.write(str);
			bfw.newLine();
		}

		while ((str = bfr2.readLine()) != null) {
			bfw.write(str);
			bfw.newLine();
		}

		bfw.flush();
		fw.close();
		fr1.close();
		fr2.close();
	}
}

#3
import java.io.*;

public class hw14_9 {
	public static void main(String args[]) throws IOException {
		FileReader fr1 = new FileReader("C:\\Users\\WIN\\eclipse-workspace\\Java14\\src\\aaa.txt");
		FileReader fr2 = new FileReader("C:\\Users\\WIN\\eclipse-workspace\\Java14\\src\\bbb.txt");
		FileReader fr3 = new FileReader("C:\\Users\\WIN\\eclipse-workspace\\Java14\\src\\ccc.txt");
		BufferedReader bfr1 = new BufferedReader(fr1);
		BufferedReader bfr2 = new BufferedReader(fr2);
		BufferedReader bfr3 = new BufferedReader(fr3);
		String str;

		System.out.println("aaa.txt");
		while ((str = bfr1.readLine()) != null)
			System.out.println(str);

		System.out.println("\nbbb.txt");
		while ((str = bfr2.readLine()) != null)
			System.out.println(str);

		System.out.println("\nccc.txt");
		while ((str = bfr3.readLine()) != null)
			System.out.println(str);

		fr1.close();
		fr2.close();
		fr3.close();
	}
}

#4

import java.io.*;

public class hw14_10 {
	public static void main(String args[]) throws IOException {
		FileWriter fw = new FileWriter("C:\\Users\\WIN\\eclipse-workspace\\Java14\\src\\rand.txt");
		FileWriter fw2 = new FileWriter("C:\\Users\\WIN\\eclipse-workspace\\Java14\\src\\rand2.txt");
		FileReader fr = new FileReader("C:\\Users\\WIN\\eclipse-workspace\\Java14\\src\\rand.txt");
		BufferedWriter bfw = new BufferedWriter(fw);
		BufferedWriter bfw2 = new BufferedWriter(fw2);
		BufferedReader bfr = new BufferedReader(fr);
		String str;
		int i, max, min, arr[] = new int[1000];
		long sum = 0L;

		for (i = 1; i <= 1000; i++) {
			Double num = new Double(Math.random() * 100000);
			str = Integer.toString(num.intValue());

			bfw.write(str);
			bfw.newLine();
		}
		bfw.flush();
		fw.close();

		i = 0;
		max = 0;
		min = 100000;
		while ((str = bfr.readLine()) != null) {
			arr[i] = Integer.parseInt(str);
			sum += arr[i];
			if (max < arr[i])
				max = arr[i];
			if (min > arr[i])
				min = arr[i];
			i++;
		}
		System.out.println("Maximum=" + max + ",Minimum=" + min);
		System.out.println("Average=" + sum / 1000);

		bubble_sort(arr);
		for (i = 0; i < 1000; i++) {
			str = Integer.toString(arr[i]);
			bfw2.write(str);
			bfw2.newLine();
		}
		bfw2.flush();
		fw2.close();
	}

	public static void bubble_sort(int a[]) {
		int i, j, temp;
		boolean flag = true;

		for (i = 1; (i < a.length) && (flag == true); i++) {
			flag = false; // 將 flat 設為 flase
			for (j = 0; j < (a.length - i); j++)
				if (a[j] > a[j + 1]) {
					temp = a[j]; // 對換陣列內的值
					a[j] = a[j + 1];
					a[j + 1] = temp;
					flag = true; // 對調後將 flag 設為 true
				}
		}
		return;
	}
}
