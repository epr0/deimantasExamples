package lt.sdacademy.fundamentals.input_output.basic_output;

public class Example2 {

    public static void main(String[] args) {

        System.out.println("printl išspausdina pranešimą ir nukelia žymeklį į sekančią eilutę");
        System.out.print("print išspausdina pranešimą, bet žymeklis lieka toje pačioje eilutėje, bet naujos eilutės žymeklį perkeliame ranka\n");

        String sentence = "paprastas tekstas";
        System.out.printf("printf leidžia išspausdinti pranešimą %s\n", sentence);

        int decimalValue = 10;
        System.out.printf("...arba skaičių su kableliu: %d\n", decimalValue);

        double floatingPointValue = 15.12514;
        System.out.printf("...arba apvalinti reikšmes: %.2f\n", floatingPointValue);

        String otherSentence = "dinamiškai!";
        System.out.printf("...arba viską kartu: %d %.2f %s\n", decimalValue, floatingPointValue, otherSentence);

    }

}
