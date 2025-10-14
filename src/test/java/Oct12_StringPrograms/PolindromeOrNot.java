package Oct12_StringPrograms;

public class PolindromeOrNot {

    public static void main(String[] args) {

        String str = "madam";        // mohan => nahom    //madam => madam
        String rev = "";//nahom
        for(int i=str.length()-1;i>=0;i--){
            rev = rev + str.charAt(i);
        }

        if(str.equals(rev)){
            System.out.println(str+" is a polindrome");
        }else
        {
            System.out.println(str+" is not a polindrome");
        }

        String str2 ="madhghjghjghjgjhgjhghjgjhgjhgdam";   //mohan
        boolean isPolindrome = true;


        for(int m=0; m<str2.length()/2;m++){
            if(str2.charAt(m)!=str2.charAt(str2.length()-m-1)){
                isPolindrome=false;
                break;
            }
        }

       if(isPolindrome)
           System.out.println(str2 + "is a polindrome");
       else
           System.out.println(str2 + "is not a polindrome");





    }
}
