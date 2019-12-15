package interview;

import java.nio.charset.MalformedInputException;

public class WithOutLoop {

	public static void loop(int i) {

		if (i <= 10) {
			System.out.println(i);
			loop(i + 1);
		}

	}

	public static void main(String[] args) {
		loop(1);
	}

}
