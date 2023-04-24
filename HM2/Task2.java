public class Task2 {
    public static void main(String[] args) {
        try {
            int d = 0;
            double catchedRes1 = 5 / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } 
        catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }   
    }
}
