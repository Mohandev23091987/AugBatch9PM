package XpathAndXpathAxes;


//checkeed Exception
public class InvalidAgeException extends Exception {


    public InvalidAgeException() {
        super();
    }
    public InvalidAgeException(String message) {
        super(message);
    }
    public InvalidAgeException(String message, Throwable cause) {
        super(message, cause);
    }

    public void registerUser(String name, int age)  {

        try {
            if (age < 18) {
                throw new InvalidAgeException("Age must greater than 18");
            }

        }
        catch(InvalidAgeException e){
            System.out.println(e.getCause());
        }

    }

    public static void main(String[] args) {

        InvalidAgeException obj = new InvalidAgeException();
        obj.registerUser("mohan",10);
    }




}
