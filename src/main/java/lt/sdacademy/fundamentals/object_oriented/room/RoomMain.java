package lt.sdacademy.fundamentals.object_oriented.room;

import java.util.Scanner;

public class RoomMain {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Iveskite kambario ilgi");
        int width = scanner.nextInt();

        System.out.println("Iveskite kambario ploti");
        int length = scanner.nextInt();

        Room room = new Room(width, length);

        int squareOfRoom = squareOfRoom(room.getLength(), room.getWidth());

        System.out.println("Kambario plotas: " + squareOfRoom);
    }

    private static int squareOfRoom(int length, int width) {
        return (length * width);
    }

}
