package Oct12_StringPrograms;

public class ReverseEachWordOfaString {

    public static void main(String[] args) {

        String str = "Selenium with java";    // muineleS htiw avaj
        String[] words=str.split(" ");// {"selenium","with","java"
        String result ="";
        for(String word:words){

            String revWord ="";
            for(int i = word.length()-1;i>=0;i-- ){
                revWord = revWord  + word.charAt(i);
            }
            result = result + revWord + " ";
        }

        System.out.println(result);






    }
}
