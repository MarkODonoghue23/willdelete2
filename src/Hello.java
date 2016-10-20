
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hi");

        int numYears = 10;
        float principal = 10000.0f;
        float interestRate = 5.0f;
        float amount = (float)(principal * Math.pow( (1 + (interestRate/100.0f)), numYears));
        System.out.println(amount);

    }
}
