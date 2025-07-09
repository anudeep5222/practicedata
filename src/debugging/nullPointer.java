package debugging;


public class nullPointer {
    public static void main(String[] args) {
        String message = null;

        if (message != null && message.length() > 0) {
        	
            System.out.println("Message is not empty");
        } else {
            System.out.println("Message is null or empty");
        }
    }
}
