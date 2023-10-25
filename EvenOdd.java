public class EvenOdd {
    public static void main(String[] args) {
        int randomNum;
        randomNum = (int) (Math.random() * (100) + 1);
        System.out.println("Numer is: " + randomNum);
        // Checking Even or Odd
        if (randomNum % 2 == 0) {
            //Printing If Num Is Even
            System.out.println("Random Number is Even");
        }
        else {
            //Printing If Num Is Odd
            System.out.println("Rando Number is Odd");
        }
    }
}
