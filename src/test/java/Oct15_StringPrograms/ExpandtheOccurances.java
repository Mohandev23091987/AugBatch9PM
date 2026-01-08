package Oct15_StringPrograms;

public class ExpandtheOccurances {

    public static void main(String[] args) {

        String str = "a7b4c8";
        StringBuilder result = new StringBuilder();

        for(int i=0; i<str.length();i++){  //a

            char ch = str.charAt(i);    //a
            if(Character.isLetter(ch)){
                if(i+1<str.length() && Character.isDigit(str.charAt(i+1))){   //1<6   '4'
                    int count = Character.getNumericValue(str.charAt(i+1));  //4
                    for( int j=0;j <count;j++){
                        result.append(ch);
                    }
                }
            }

        }

        System.out.println(result.toString());





    }
}
