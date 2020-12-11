package lt.sdacademy.fundamentals.methods.example1;

public class SwissKnife {

    void pjaukSuPeiliu() {
        System.out.println("Atsilenkiu peiliuka ir pjaunu... ");
    }

    void kirpkSuZirklem() {
        System.out.println("Kerpu kerpu...Cik cik cik");
    }

    void panaudokKamsciatrauki() {
        System.out.println("POP! Vynas atkimstas.. Nealkoholinis aisku.");
    }

    double ismatuokIlgi(double matuojamoObjektoIlgis) {
        double paklaida = 0.1;
        return matuojamoObjektoIlgis + paklaida;
    }

    boolean arKarstas(double temperatura) {
        if(temperatura > 36) {
            return true;
        } else {
            return false;
        }
    }
}
