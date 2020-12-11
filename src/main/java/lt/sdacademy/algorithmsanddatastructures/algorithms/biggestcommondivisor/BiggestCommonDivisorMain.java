package lt.sdacademy.algorithmsanddatastructures.algorithms.biggestcommondivisor;

public class BiggestCommonDivisorMain {

    private static int FIRST_NUM = 18;
    private static int SECOND_NUM = 24;

    public static void main(String[] args) {
        System.out.printf("Didziausias bendras daliklis: %d", biggestCommonDivisor());
    }

    private static int biggestCommonDivisor() {
        while (FIRST_NUM != SECOND_NUM) {
            if (FIRST_NUM > SECOND_NUM) {
                FIRST_NUM -= SECOND_NUM;
            } else {
                SECOND_NUM -= FIRST_NUM;
            }
        }
        return FIRST_NUM;
    }
}
