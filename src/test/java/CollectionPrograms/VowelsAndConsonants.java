package CollectionPrograms;

public class VowelsAndConsonants {

    public static void main(String[] args) {

        String str = "Mohan is a QA trainer";

        StringBuilder vowels = new StringBuilder();
        StringBuilder consonants = new StringBuilder();

        int vowelsCount = 0;
        int consonantsCount =0;

        for(int i=0;i<str.length();i++){

            char ch =str.charAt(i);

            if(Character.isLetter(ch)){

                ch = Character.toLowerCase(ch);

                if( ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' ||ch == 'u'){
                     vowels.append(ch).append(" ");
                    vowelsCount++;
                } else{
                    consonants.append(ch).append(" ");
                    consonantsCount++;
                }


            }


        }


        System.out.println("Vowels : "+vowels);
        System.out.println("Vowels Count : "+vowelsCount);
        System.out.println("Consonants : "+consonants);
        System.out.println("Vowels : "+consonantsCount);








    }

}
