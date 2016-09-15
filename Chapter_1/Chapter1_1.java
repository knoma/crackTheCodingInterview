class Chapter1_1 {

	public static void main( String[] args){
		System.out.println(isUnique("Halio"));
		System.out.println(isUnique("Hallo"));

	}

	private static boolean isUnique(String str){
		if(str.length() > 128) return false;

		boolean[] bools = new boolean[128];

		char[] chars = str.toCharArray();

		for (int c : chars) {
		 	if(bools[c]) return false;
		 	bools[c] = true;
		 } 
		 return true;
	}
}