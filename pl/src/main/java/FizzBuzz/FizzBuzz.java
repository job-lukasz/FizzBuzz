//Utworzone przez jaska
package FizzBuzz;

public class FizzBuzz {
	public String calculate(int i) {
		String answer = "";
		if (isFizz(i)) {
			answer+="Fizz";
		}
		if (isBuzz(i)) {
			answer+="Buzz";
		}
		else if (!isFizz(i)){
			answer = String.valueOf(i);
		}
		return answer;
	}

	private boolean isModulo(int dividend, int divisor) {
		return dividend % divisor == 0;
	}

	private boolean isFizz(int i) {
		return isModulo(i, 3) || checkContains(i,"3");
	}

	private boolean isBuzz(int i) {
		return isModulo(i, 5) || checkContains(i,"5");
	}

	public static boolean checkContains(int i, String ContainsNumber) {
		String s = Integer.toString(i);
		if (s.contains(ContainsNumber))
			return true;
		return false;
	}
}
