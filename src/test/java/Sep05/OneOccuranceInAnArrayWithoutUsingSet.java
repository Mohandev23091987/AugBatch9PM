package Sep05;

public class OneOccuranceInAnArrayWithoutUsingSet {
        public static void main(String[] args) {
            int[] input = {10,2, 3, 3,7,7,9,9};
            for (int i = 0; i < input.length; i++) {
                boolean isDuplicate = false;
                for (int j = i+1; j < input.length; j++) {
                    if (input[i] == input[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                // Print only if it is not duplicate
                if (!isDuplicate) {
                    System.out.println(input[i]);
                }
            }

        }
    }

