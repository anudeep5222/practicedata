package first;

public class Stringrotation{
	
	public static boolean isRotation(String str1,String str2) {
		return (str1.length()==str2.length() && ((str1+str2)).contains(str2));
		
	}
	public static void main(String[] args) {
		String str1="abcd";
		String str2="bcda";
		System.out.println(isRotation(str1,str2) ? "rotation" : "not rotation");
		

				
			
		
		
		
	}
}
		