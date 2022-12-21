import java.io.*;

public class hw14_5 {
	public static void main(String args[]) throws IOException {
		char data[] = new char[128];
		FileReader fr = new FileReader("C:\\Users\\WIN\\eclipse-workspace\\Java14\\src\\donkey.txt");
		fr.skip(9);
		int num = fr.read(data);
		String str = new String(data, 0, num);
		System.out.println("Characters read= " + num);
		System.out.println(str);
		fr.close();
	}
}
