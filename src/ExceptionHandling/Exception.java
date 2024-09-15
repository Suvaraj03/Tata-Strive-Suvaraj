package ExceptionHandling;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Exception {
	public static void NameFinder(String path, int num) {
		// TODO Auto-generated method stub
		String name = "";
		String names = "";
		try (FileReader fr = new FileReader(path); BufferedReader br = new BufferedReader(fr)) {
			while ((name = br.readLine()) != null) {
				if (num == NameSum(name)) {
					names += name + "";
				}
			}
			if (names == "") {
				System.out.println("There is no matching name with your lucky number");
			} else {
				System.out.println(names);
			}
		} catch (FileNotFoundException e) {
			System.out.println(e);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	private static int NameSum(String name) {
		int sum = 0;
		for (char ch : name.toLowerCase().toCharArray()) {
			sum += ch - 'a' + 1;

		}
		return sum;
	}

}
