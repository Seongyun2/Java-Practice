import java.util.*;
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);	
		String st = in.next();
        for (int i = 0; i < st.length(); i++){
            char c = st.charAt(i);
            if (Character.isLowerCase(c)){
                c = Character.toUpperCase(c);
            }
            else if (Character.isUpperCase(c))
                c = Character.toLowerCase(c);
		    System.out.print(c);
        }

	}
}