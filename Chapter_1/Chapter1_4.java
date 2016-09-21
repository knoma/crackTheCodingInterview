public class Chapter1_4 {

	public static void main (String [] args){
 		String s = "Tact Coa";
		System.out.println(isPermutaionOfPalindrome(s));
		System.out.println(isPermutaionOfPalindrome2(s));

	}

	private static boolean isPermutaionOfPalindrome(String s){
		int[]  table = buildCharFreqquencyTable(s);
		return checkMaxOneOdd(table);
	}

	private static int[] buildCharFreqquencyTable(String s){

		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

		for (char c : s.toCharArray()) {
			int x = getCharNumber(c);
			if(x != -1){
				table[x]++;
			}
		}
		return table;
	}

	private static int getCharNumber(Character c){
		int a = Character.getNumericValue('a');
		int z = Character.getNumericValue('z');
		int val = Character.getNumericValue(c);

		if(a <= val && val <= z){
			return val - a;
		}
		return -1;
	}

	private static boolean checkMaxOneOdd(int[] table){
		boolean foundOdd = false;

		for (int count : table) {
			if(count % 2 == 1){
				if(foundOdd)
				return false;
			}
			foundOdd = true;
		}
		return true;
	}


	private static boolean isPermutaionOfPalindrome2(String s){
		int countOdd =0;

		int[] table = new int[Character.getNumericValue('z') - Character.getNumericValue('a') + 1];

		for (char c : s.toCharArray()) {
			int x = getCharNumber(c);

			if(x != -1){
				table[x]++;
				if (table[x] % 2 ==1) {
					countOdd++;
				} else {
					countOdd --;
				}
			}
		}
		return countOdd < 1;
	}
}