package lt.sdacademy.fundamentals.object_oriented.access.package4;

public class MethodInvocation {

    int seconds = 10;

    public static void main(String[] args) throws InterruptedException {
        for(int i = 3; i > 0; i--) {
            startCountdown(i);
        }
        drawShape();

    }

    static void drawShape() throws InterruptedException {
        for(int i = 0; i < 3; i++) {
            System.out.println("**    **     **");
            Thread.sleep(500);
        }
        System.out.println("||||||||     **");
        Thread.sleep(500);
        for(int i = 0; i < 3; i++) {
            System.out.println("**    **     **");
            Thread.sleep(500);
        }
        System.out.println("**    **     **");
    }

    static void startCountdown(int number) throws InterruptedException {
        System.out.println(number);
        Thread.sleep(1000);
    }
}
