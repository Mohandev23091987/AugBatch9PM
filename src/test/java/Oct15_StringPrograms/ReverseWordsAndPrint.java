package Oct15_StringPrograms;

public class ReverseWordsAndPrint {


    public static void main(String[] args) {


        String str = "Welcome world mohan";    //  ===> Welcome world world Welcome
        String reverse = "";

//        String[] words = str.split(" ");
//
//        for(int i=words.length-1;i>=0; i--){`
//            reverse = reverse+words[i] + " ";
//
//        }

        for(String word:str.split(" ")){  // "Welcome","world"
            reverse =  word +" "+ reverse;    //word welcome
        }


        System.out.println(str+" "+reverse);




    }
}
