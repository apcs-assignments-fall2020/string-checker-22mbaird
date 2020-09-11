import java.util.Scanner;

public class MyMain {
    
    // Counts the number of 'a', 'b', and 'c' chars in str
    public static int countABC(String str) {
        int counter = 0;
        String strlow = str.toLowerCase();
        for (int i=0 ; i<strlow.length(); i++){
            char abcs = strlow.charAt(i);
            if(abcs=='a'){
                counter++;
            }
            else if(abcs == 'b'){
                counter++;
            }
            else if(abcs == 'c'){
                counter++;
            }
            else {
                counter = 0;
            }
        }
            return counter;
    }

    // Checks to see whether or not str contains 'The' or 'the'
    public static boolean containsThe(String str) {
        String strl = str.toLowerCase();
        Boolean strthe = strl.contains("the");
        if (strthe = true){
            return true;
        }
        else{
            return false;
        }
        
    }

    // Checks whether str is a palindrome or not
    public static boolean isPalindrome(String str) {
        int x = 0;
        int y = str.length()-1;
        String str1 = str.toLowerCase();
        while (x<y){
            if (str.charAt(x)!=str1.charAt(y)){
                return false;
            }
            x++;
            y--;
        }
        return true;
    }
    
    
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("String: ");
        String abccheck = scan.nextLine();
        System.out.println(countABC(abccheck));
        System.out.print("String: ");
        String thecheck = scan.nextLine();
        System.out.println(containsThe(thecheck));
        System.out.print("String: ");
        String palicheck = scan.nextLine();
        System.out.println(isPalindrome(palicheck));
        
    }
}
