import java.util.*;

class StringFirstIndex {
    public static void ChangingString(String str) {
        char[] charArray = str.toCharArray();

        for (int i = 0; i < charArray.length; i++) {
            if (((int) charArray[i] >= 65 && (int) charArray[i] <= 90) || ((int) charArray[i] >= 97 && (int) charArray[i] <= 122) || (int) charArray[i] == 32) {
                if ((int) charArray[i] >= 65 && (int) charArray[i] <= 90) {
                    System.out.println("String already starting with an uppercase letter.");
                }
                else {
					if((int) charArray[i] == 32)
					{
						continue; 
					}
                    charArray[i] = (char) ((int) charArray[i] - 32);
                    System.out.println("Modified string: " + new String(charArray));
                }
            } else {
                System.out.println("Strings can only contain alphabet letters.");
                return;
            }
        }
    }

    public static void main(String... fdg) {
        System.out.print("Enter a string: ");
        String teststring = new Scanner(System.in).nextLine();
        ChangingString(teststring);
    }
}
