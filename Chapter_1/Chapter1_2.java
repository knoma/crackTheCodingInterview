public class Chapter1_2 {
	
	public static void main (String[] args){
		System.out.println(isPermutaion("tax","xat"));
		System.out.println(isPermutaion("tax","xai"));

		System.out.println(isPermutaionSorted("tax","xat"));
		System.out.println(isPermutaionSorted("tax","xai"));
	}

	private static boolean isPermutaion(String s, String t){
		if(s.length() != t.length()) return false;

		int[] ints = new int [128];
		char[] chars = s.toCharArray();

		for (int c : chars) {
			ints[c]++;
		}

		for (int i = 0; i < t.length(); i++) {
			
 			int c = t.charAt(i);
			ints[c]--;	
			if(ints[c] < 0) return false;
		}
	return true;
	}

	private static boolean isPermutaionSorted(String s, String t){
		return sort(s).equals(sort(t));
	}

	private static String sort(String s){

 		char[] chars = s.toCharArray();
 		java.util.Arrays.sort(chars);
		return new String(chars);
	}
}