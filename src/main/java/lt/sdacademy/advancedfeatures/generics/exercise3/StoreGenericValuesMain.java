package lt.sdacademy.advancedfeatures.generics.exercise3;

import java.util.List;

public class StoreGenericValuesMain {

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        StoreGenericValues values = new StoreGenericValues();

        values.storeValue("Tekstas");
        values.storeValue(123);
        values.storeValue(12.4);

        List items = values.getItems();

        for (Object item : items) {
            System.out.println("Item in list: " + item);
        }
    }
}
