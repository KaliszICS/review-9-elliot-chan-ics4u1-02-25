public class PracticeProblem {

	public static void main(String args[]) {

	}
	public static int lettersToFive(String s, char c) {
		int iterator = 0, count = 0;
		while(iterator < s.length()) {
			
			if(s.charAt(iterator) == c)
				count++;
			iterator++;
			
			if(count == 5)
				return iterator;
		}
		return -1;
	}
	public static int countLetter(String s, char c) {
		int count = 0;
		for(int i = 0; i < s.length(); i++) {
			if(s.charAt(i) ==  c)
				count++;
		}
		return count;
	}
	public static int oddSum(int num1, int num2) {
		int total = 0;

		int startNum = Math.min(num1, num2);
		int finishNum = Math.max(num1, num2);

		for(int i = startNum; i <= finishNum; i++) {
			if(i % 2 != 0)
				total+=i;
		}
		return total;
	}


}
