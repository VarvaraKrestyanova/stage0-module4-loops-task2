package school.mjc.stage0.loops.task2;

public class Multiplication {
    public void printMultiplied(int multiplyByAndToInclusive) {
        int value = 0;

        while (value <= Math.abs(multiplyByAndToInclusive) && multiplyByAndToInclusive != 0) {
            System.out.println(value * multiplyByAndToInclusive);
            value++;
        }
    }
}
