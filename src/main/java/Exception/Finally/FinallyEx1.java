package Exception.Finally;

class Demo{
    private static int c = 0;
         static int k;

    Demo() {
        this.k = 9;
    }


    static int generateAirthmeticException() {
        return 5/c;
    }
}
public class FinallyEx1 {
    public static void main(String[] args) {
        try {
            Demo.generateAirthmeticException();
        }
        catch (ArrayIndexOutOfBoundsException E){
            System.out.println("I am in Catch Block");
            E.printStackTrace(System.out);
        }
        finally {
            System.out.println("I am in finally block");
        }
        System.out.println(" I am in Main thread");


    }
}
