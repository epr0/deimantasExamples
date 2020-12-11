package lt.sdacademy.fundamentalscoding.practicalexercisestogether.calculator.refactored;

import java.util.Scanner;

public class RefactoredCalculatorMain {
    public static void main(String[] args) {
        Scanner numberScanner = new Scanner(System.in);
        Scanner actionScanner = new Scanner(System.in);

        boolean calculateOn = true;
        double result = 0;

        while (calculateOn) {
            double firstNum = getNumberInput(numberScanner, "Įveskite pirmą skaičių");
            double secondNum = getNumberInput(numberScanner, "Įveskite antrą skaičių");
            String action = getActionInput(actionScanner, "Pasirinkite, kokį veiksmą norite daryti: + - * /");

            result = getResult(result, firstNum, secondNum, action);
            System.out.println("Gautas rezultatas: " + result);

            String userAnswerOnCalculation = getUserAnswerOnCalculation(actionScanner);

            if (userAnswerOnCalculation.equalsIgnoreCase("NE")) {
                calculateOn = false;
            }
        }
    }

    private static String getUserAnswerOnCalculation(Scanner actionScanner) {
        System.out.println("Jei norite skaičiuoti dar kartą įveskite: TAIP, kitu atveju NE");
        return actionScanner.nextLine();
    }

    private static double getNumberInput(Scanner numberScanner, String message) {
        System.out.println(message);
        return numberScanner.nextDouble();
    }

    private static String getActionInput(Scanner actionScanner, String message) {
        System.out.println(message);
        return actionScanner.nextLine();
    }

    private static double getResult(double result, double firstNum, double secondNum, String action) {
        switch (action) {
            case ("+"): {
                result = firstNum + secondNum;
                break;
            }
            case ("-"): {
                result = firstNum - secondNum;
                break;
            }
            case ("*"): {
                result = firstNum * secondNum;
                break;
            }
            case ("/"): {
                result = firstNum / secondNum;
                break;
            }
            default: {
                System.out.println("Veiksmas nebuvo rastas");
                break;
            }
        }
        return result;
    }
}
