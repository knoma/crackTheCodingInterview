public class Chapter1_3 {

	public static void main (String[] args){
		String s = "Mr John Smith                   ";
		char[] chars = s.toCharArray();
		replaceSpaces(chars, 14);
		System.out.println(new String(chars));
	}

	private static void replaceSpaces( char[] str, int trueLength){

		int spaceCount  = 0, index, i = 0;

		for (i = 0; i < trueLength; i++) {
			if (str[i] ==' ') {
				spaceCount++;
			}
		}

		index = trueLength + spaceCount * 2;

		if(trueLength < str.length) str[trueLength] ='\0'; // END OF ARRAY
		for (i = trueLength -1; i >= 0; i--) {
			if (str[i] == ' ') {
				str[index - 1] = '0';
				str[index - 2] = '2';
				str[index - 3] = '%';
				index = index -3;
			} else {
				str[index -1] = str[i];
				index --;
			}
		}
	}

}