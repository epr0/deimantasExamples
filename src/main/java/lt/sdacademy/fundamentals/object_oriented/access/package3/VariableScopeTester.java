package lt.sdacademy.fundamentals.object_oriented.access.package3;

public class VariableScopeTester {

    public static void main(String[] args) {
        int skaicius = 5;
        System.out.println(skaicius); //they are in the same scope

        if(skaicius == 5 ) {
            System.out.println("YES");
            int skaicius2 = 3;
            System.out.println(skaicius2);
        }

        //System.out.println(skaicius2);
    }
}
