package school.mjc.stage0.loops.task2;

public class PrimeNumbers {
    public void printPrimeNumbers(int printToInclusive) {

        int startValue = 2;
        while (startValue <= printToInclusive) {
            int divider = 2;
            while (divider <= startValue) {
                if (divider == startValue) {
                    System.out.println(startValue);
                    break;
                }
                if (startValue % divider == 0) {
                    break;
                } else {
                    divider++;
                }

            }
            startValue++;
        }

    }

}
