public class Chapter1_6 {
	

	public static void main(String[] args){
		System.out.println(compress("aabccccccccccccccccccccaaa"));


	}


	private static String compressBad(String str){
		StringBuilder compressedString = new StringBuilder();
		int countConsecutive = 0;

		for (int i =0; i < str.length(); i++) {
			countConsecutive++;
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				compressedString.append(str.charAt(i));
				compressedString.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return compressedString.length() < str.length() ? compressedString.toString() : str;
	}

	private static String compress(String str){
		int finalLength =  countCompression(str);
		if(finalLength >= str.length()) return str;

		StringBuilder sb = new StringBuilder(finalLength);
		int countConsecutive =0;

		for (int i =0; i < str.length(); i++) {
			countConsecutive++;
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i + 1)) {
				sb.append(str.charAt(i));
				sb.append(countConsecutive);
				countConsecutive = 0;
			}
		}
		return sb.toString();
	}


	private static int countCompression(String str){
		int countConsecutive = 0;
		int compressedLength =0;

		for (int i =0 ; i  < str.length(); i++) {
			countConsecutive++;
			if(i + 1 >= str.length() || str.charAt(i) != str.charAt(i +1)) {
				compressedLength += 1 + String.valueOf(countConsecutive).length();
				System.out.println(compressedLength);

				countConsecutive = 0;
			} 
		}
						System.out.println(compressedLength);

		return compressedLength;
	}
}