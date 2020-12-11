package lt.sdacademy.advancedfeatures.exceptions;

public class UncheckedExceptionExample {
    // Checked exception'ai iškrenta, kai klasė nėra rasta, nerastas duomenų failas ir pan.
    // Unchecked exception'ai iškrenta, programos vykdymo metu, kai masyvos ribos peržengtos, kai yra dalyba iš nulio ir pan.

    public static void main(String args[]) {
        int a = 30;
        int b = 0;

        int c = a / b;
        System.out.print("Result: " + c);
    }
}
