import java.util.Random;

public class RandomNumber {
    public static void main(String[] args) {

        Random ran = new Random();
        int randomNumber = ran.nextInt(11)+5;

        System.out.println("Random Number = "+randomNumber);

        int randomMath = (int) (Math.random()*12)+5;
        System.out.println("Random = "+randomMath);

    }
}
