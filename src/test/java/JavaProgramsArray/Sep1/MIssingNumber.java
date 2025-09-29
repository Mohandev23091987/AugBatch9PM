package JavaProgramsArray.Sep1;

public class MIssingNumber {

    public static void main(String[] args) {

        int[] arr = {1,2,3,7,8,9,10};

        for(int i=1; i<=10;i++){    //4
            boolean found =false;

            for( int j : arr){
                if( i==j) {     // 4==10
                    found = true;
                    break;
                }
            }

            if(found == false)  //true==false
                System.out.println(i);
            }

        }
    }

