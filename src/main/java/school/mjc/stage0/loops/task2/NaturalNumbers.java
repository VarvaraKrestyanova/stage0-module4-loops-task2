package school.mjc.stage0.loops.task2;

public class NaturalNumbers {
    public void naturalNumbersPrinter(int lastPrinted) {
        int value = 0;
        while (value <= lastPrinted) {
            System.out.println(value);
            value++;
        }
    }
}
