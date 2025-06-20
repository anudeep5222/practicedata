package first;

public class vowelCounter {

	public static void main(String[] args) {
		String text="Hi eclipse iam Anudeep";
		String vowel="aeiou";
		int vowelCount=0;
		int consonantsCount=0;
		for(int i=0;i<text.length();i++) {
			char ch=text.charAt(i);
		
			if(ch == 'a' || ch =='e' ||ch == 'i' || ch =='o' || ch=='u') {
				vowelCount++;
			}
				
			else {
				consonantsCount++;
			}
		}
		System.out.println("vowels are "+vowelCount+" consonants "+consonantsCount);
		// TODO Auto-generated method
	}	
}		