import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
//        Accepting an input string from the user
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input String : ");

        String str = scanner.nextLine();
        scanner.close();
//        converting all input to lowercase
        str = str.toLowerCase();
//        initializing the vowel and consonant  counts to zero
        int vowel_count = 0 , consonant_count = 0 ;

        for (int i = 0; i<str.length(); i++){
//            checking whether a character is a vowel
            if ( str.charAt(i)== 'a'|| str.charAt(i)=='e'||str.charAt(i)=='i' || str.charAt(i)=='o'||str.charAt(i)=='u'){
//                if any of the characters at the count is equal to any of the vowels defined int he if statement above,  then we will begin counting them
                vowel_count++;
            }
//            the else if below will now check the consonants in the input field
            else if ( str.charAt(i)>='a' && str.charAt(i)<='z'){
//                count the characters between a and z that are not vowels as consonants
                consonant_count++;
            }
        }
        System.out.println("Number of vowels : " + vowel_count);
        System.out.println("Number of consonants : "+ consonant_count);
    }
}
