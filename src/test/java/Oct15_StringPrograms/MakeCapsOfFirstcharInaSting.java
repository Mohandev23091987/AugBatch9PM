package Oct15_StringPrograms;

public class MakeCapsOfFirstcharInaSting {

    public static void main(String[] args) {

        String str = "quality assurance automation testing";

        StringBuilder result = new StringBuilder();

        for(String word: str.split(" ")){  //quality

            result.append(Character.toUpperCase(word.charAt(0)))  // q => Q
                    .append(word.substring(1))  //Q+uality
                    .append(" ");//Q+uality

        }

        System.out.println(result.toString().trim());



    }
}


//aaaabbbbccc => a4b4c3

//a4b4c3 =>aaaabbbbccc