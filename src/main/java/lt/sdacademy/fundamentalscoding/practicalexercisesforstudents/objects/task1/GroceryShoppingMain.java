package lt.sdacademy.fundamentalscoding.practicalexercisesforstudents.objects.task1;

import java.util.Scanner;

public class GroceryShoppingMain {

    public static void main(String[] args) {
        Product[] products = new Product[5];

        enterProduct(products);
        totalPriceForProduct(products);
    }

    private static void enterProduct(Product[] products) {
        Scanner inputScanner = new Scanner(System.in);

        int i = 0;
        while (i < 5) {
            products[i] = new Product();

            System.out.println("Įveskite produkto pavadinimą");
            products[i].setName(inputScanner.nextLine());

            System.out.println("Įveskite produkto kainą");
            products[i].setPrice(inputScanner.nextDouble());

            inputScanner.nextLine();
            i++;
        }
    }

    private static void totalPriceForProduct(Product[] products) {
        double total = 0;

        for (Product product : products) {
            total += product.getPrice();
        }

        System.out.println("Kaina už visus produktus: " + total);
    }
}
