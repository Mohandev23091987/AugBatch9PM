package Oct12_StringPrograms;

public class AddNumbersInaString {

    public static void main(String[] args) {

        String str = "Moha2nm4jk9jklj6";   //21

        int sum = 0;

        for(char c : str.toCharArray()){

            if(Character.isDigit(c)){
                sum = sum + Character.getNumericValue(c);  // c - '0'
            }
        }

        System.out.println(sum);


        //second program


        String str2 = "Moha23nm41jk9jklj6";  //23+41+9+6
         int result = 0;
         String number ="";

        for(char c : str2.toCharArray()){
            if(Character.isDigit(c)){
                number = number + c;         //
            }else if(!number.equals("")){
                result = result + Integer.parseInt(number);  //
                number ="";
            }
        }

        if(!number.equals(""))
          result=  result + Integer.parseInt(number);

        System.out.println(result);


        // mohan is tutor => MOhan Is Tutor 

    }
}
