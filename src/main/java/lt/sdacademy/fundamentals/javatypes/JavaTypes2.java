package lt.sdacademy.fundamentals.javatypes;

public class JavaTypes2 {

    public static int dienosMetuose = 365;

    //data type - type of data, how the computer interprets/understands the data.

    public static void main(String[] args) {

        /*
        5 and "5"
         */
        int skaicius = 5;
        boolean arPicaSkani = true;
        String eilute = "Labas";
        String eilute2 = new String("Labas");
        System.out.println(eilute.equalsIgnoreCase(eilute2));
        System.out.println(eilute == eilute2);
        eilute = eilute2;
        System.out.println(eilute);
        System.out.println(eilute == eilute2);

        //object is an instance of a class and class is a data type

        //how we create a variable?

        //1. declare
        //2. initialize

        int greitis;
        greitis = 80;
        boolean pamaciauGreicioZenkla50 = true;

        System.out.println("mano greitis:" + greitis);

        if(pamaciauGreicioZenkla50) {
            greitis = 55;
        }

        System.out.println("mano greitis dabar: " + greitis);

    }
}
