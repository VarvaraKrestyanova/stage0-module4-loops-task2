package school.mjc.stage0.loops.task2;

public class EvenNumbersPrinter {
    public void printEvenNumbers(int printTillInclusive) {

        int value = 0;
        while (value <= printTillInclusive) {
            if (value % 2 == 0) {
                System.out.println(value);
            }
            value++;
        }

    }
}
