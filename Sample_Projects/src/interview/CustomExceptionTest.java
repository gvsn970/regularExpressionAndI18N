package interview;

class TooOldException extends RuntimeException {
	TooOldException(String s) {
		super(s);
	}
}

public class CustomExceptionTest {

	public static void main(String[] args) {
		int a = 55;
		if (a < 77) {
			throw new TooOldException("ExceptionCustom");
		}
	}
}
