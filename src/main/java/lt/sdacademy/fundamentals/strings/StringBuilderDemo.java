package lt.sdacademy.fundamentals.strings;

public class StringBuilderDemo {

    public static void main(String[] args) {
        //Note, string are immutable almost all of the time.

        String string = new String("Zaliasis");
       // string.concat(" Vanagas");
        String string2 = string.concat(" Vanagas");
        System.out.println(string2);
        System.out.println(string);

        //StringBuffer and StringBuilder are used
        //mutable, thread safe for synchronisation.
        StringBuffer buffer = new StringBuffer("Raudonas");
        //Vis dar vienas ir tas pats objektas
        buffer.append(" Tigras");
        buffer.replace(0,8, "Baltas");
        buffer.delete(0,2);

        System.out.println(buffer);

        //Faster than stringBuffer
        StringBuilder builder = new StringBuilder("Geltonas");
        builder.append("Lokys").append(" Paukstis").append("Varnas");
        builder.replace(0,8, "Baltasis ");
        builder.delete(8, 10);

        System.out.println(builder);


    }
}
