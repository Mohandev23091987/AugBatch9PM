package Oct6;

public class SingleTonPattern {

   // 1)private static instance of class
    private volatile static SingleTonPattern singleTonPattern;

    //2.Create private constructor
   private SingleTonPattern(){
    }

    //3)public static method to provide access to object to other classes


//    public synchronized static SingleTonPattern getInstance(){
//       if(singleTonPattern==null){
//           singleTonPattern = new SingleTonPattern();
//       }
//       return singleTonPattern;
//    }

 public static SingleTonPattern getInstance(){
       if(singleTonPattern==null){
           synchronized (SingleTonPattern.class){
               if(singleTonPattern==null){
                   singleTonPattern = new SingleTonPattern();
               }
           }
       }
       return singleTonPattern;
    }


    public void printMessage(){
        System.out.println("This is singleton");
    }

}
