package lt.sdacademy.fundamentals.input_output.basic_output;

import java.util.Date;
import java.util.Scanner;

public class Example4 {

    /*
    Print out gas station receipt

    1. Paklausti kokio tipo degalai buvo pilti? (pvz.: Diesel, Petrol, Gas)
    2. Paklausti kurioje koloneje buvo piltasi? (pvz.: 1, 2, 3...)
    2. Paklausti kiek litru kuro buvo pilta? (pvz.: 12.2)
    3. Paklausti litro kainos? (bonus: sukurti kintamuosius, kurie laiko atitinkamo kuro tipo kaina)
    4. Apskaiciuoti bendra suma
    5. Graziai atvaizduoti ceki consoleje :)

     */






    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Kiek buvo pilta litru kuro?");
        double litrai = scanner.nextDouble();
        System.out.println("Kokia litro kaina?");
        double kaina = scanner.nextDouble();
        double bendraSuma = kaina * litrai;

        System.out.println("Koks buvo kuro tipas?");

        char kuroTipas = scanner.next().charAt(0);
        // 'D' - Diesel
        // 'P' - Petrol
        String kuroTipoString;

        if(kuroTipas == 'D') {
            kuroTipoString = "Dyzelis";
        } else if (kuroTipas == 'P'){
            kuroTipoString = "Benzinas";
        } else {
            kuroTipoString = "Kuro tipas nepasirinktas";
        }

        //cekio spausdinimo logika
        System.out.println("+------------------------+");
        System.out.println("|                        |");
        System.out.println("|      Degaline Viada    |");
        System.out.println("|                        |");
        System.out.println("| 2020-03-29  15:21      |");
        System.out.println("|                        |");
        System.out.println("| Litrai      :   "+ litrai+"    |");
        System.out.println("| Eur/Litras  : € "+kaina+"    |");
        System.out.println("|                        |");
        System.out.println("| Suma        : € "+bendraSuma+"   |");
        System.out.println("|                        |");
        System.out.println("+------------------------+");


        boolean arTaiTiesa = true;
        int skaiciu2;
        if (arTaiTiesa == true) {
            skaiciu2 = 5;
        } else {
            skaiciu2 = 1;
        }

        int skaicius = arTaiTiesa == true ? 5 : 1;



    }
}
