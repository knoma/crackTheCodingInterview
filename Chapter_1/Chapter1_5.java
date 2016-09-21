public class Chapter1_5 {

	public static void main (String [] args){
 		System.out.println(isOneEditaway("maher", "mahe"));
		System.out.println(isOneEditaway("maher", "maher"));
		System.out.println(isOneEditaway("mahe", "maher"));
		System.out.println(isOneEditaway("mahe", "maherr"));
		System.out.println(isOneEditaway("mahirr", "maher"));
		System.out.println(isOneEditAway("maher", "agnes"));



	}

	private static boolean isOneEditaway(String first, String second){
		if(first.length() == second.length()) return oneEditReplacement(first, second);
		if (first.length() +1 == second.length()) return oneEditInsert(first, second); 
		if (first.length() == second.length() +1) return oneEditInsert(first, second);

		return false; 
	}


	private static boolean oneEditInsert(String first, String second){

		int index1 = 0;
		int index2 = 0;

	while(index2 < second.length()  && index1  < first.length()){
		if(first.charAt(index1) != second.charAt(index2)){
			if (index1 != index2) {
				return false;
			}
			index2 ++;
		} else {
			index2++;
			index1++;
		}
	} 
		return true;
	}


	private static boolean oneEditReplacement(String first, String second){

		boolean foundDifference = false;

		for (int i =0; i  < first.length(); i++) {
			if (first.charAt(i)  != second.charAt(i)) {
				if (foundDifference) {
					return false;
				}
				foundDifference = true;
			}
		}
		return true;
	}


	private  static boolean isOneEditAway(String first, String second){

		if(Math.abs(first.length() - second.length()) > 1) return false;

		String s1 = first.length() < second.length() ? first : second;
		String s2 = first.length() < second.length() ? second : first;

		int index1 = 0;
		int index2 = 0;

		boolean foundDifference = false;

		while (index2 < s2.length() && index1 < s1.length()) {
			if(first.charAt(index1) != second.charAt(index1)){
				if (foundDifference) {
					return false;
				}
				foundDifference = true;

				if (first.length()  == second.length()) {
					index1++;
				}

			} else {
				index1 ++;
			}
			index2 ++;
		} 
		return true;
	}
}