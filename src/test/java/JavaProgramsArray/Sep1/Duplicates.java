package JavaProgramsArray.Sep1;


public class Duplicates {
    public static void main(String[] args) {
        int[] arr = {4, 7, 2, 4, 9, 7, 1, 2};

        System.out.print("Unique elements: ");
        for (int i = 0; i < arr.length; i++) {
            boolean isUnique = true;

            for (int j = 0; j < arr.length; j++) {
                if (i != j && arr[i] == arr[j]) {
                    isUnique = false;
                    break;
                }
            }

            if (!isUnique) {
                System.out.print(arr[i] + " ");
            }
        }
    }
}



