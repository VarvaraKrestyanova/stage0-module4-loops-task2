package school.mjc.stage0.loops.task2;

public class FactorialNumbers {
    public void printFactorialRow(int printToInclusive) {

        int startValue = 1;
        int res = startValue;
        if (printToInclusive >= 0) System.out.println(1);
        while (startValue <= printToInclusive) {
            res = res * startValue;
            System.out.println(res);
            startValue++;
        }

    }
}
