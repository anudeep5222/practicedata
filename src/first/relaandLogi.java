package first;

public class relaandLogi {

	public static void main(String[] args) {
		int age=23;
		boolean hasLicense=true;
		System.out.println("age>21"+(age>21));
		System.out.println("age<=30"+(age<=30));
		System.out.println("age==25"+(age==25));
		System.out.println("age!=20"+(age!=30));
		// TODO Auto-generated method stub
		System.out.println("can drive"+(age>=16 &&hasLicense));
		System.out.println("Is teenager or senior"+(age>=13 && age<=19||age>65));
		System.out.println("Not eligible"+!(age>=18));
		boolean result =(5>3)||(10/0==0);
		System.out.println("short-circuit result "+result);

	}

}
