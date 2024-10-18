import java.util.Scanner;
class PalindromeString{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        String str;
        System.out.print("enter a string : " );
        str = sc.next();

        int len = 0;
        len = str.length();
        System.out.println("lenght of " + str + " is " + len);

        checkPalindromeString(str);
    }

    private static void checkPalindromeString(String str)
    {
        String newStr = str;
        String revStr = "";
        //reverse str
        for (int count=newStr.length()-1; count>=0; count--)
        {
            revStr += newStr.charAt(count);
        }
        //checking newStr is eqals to revStr
        if (newStr.equals(revStr))
        {
            System.out.println(newStr + " is a Palindrome string...");
        } else {
            System.out.println(newStr + " is Not Palindrome string...");
        }
        return;
    }
}
