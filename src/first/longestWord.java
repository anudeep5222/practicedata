package first;

public class longestWord {
	public static String longword(String sentence) {
		String[] words=sentence.split("\\s+");
		String longest="";
		for(String word : words) {
			word =word.replaceAll("[^a-zA-Z]",  "");
			if(word.length() > longest.length()) {
				longest=word;
			}
		}
		return longest;
	}
	

	public static void main(String[] args) {
		String text ="the quick brown fox jumps over the lazy dog";
		System.out.println("Longest word: "+ longword(text));
		// TODO Auto-generated method stub

	}

}
