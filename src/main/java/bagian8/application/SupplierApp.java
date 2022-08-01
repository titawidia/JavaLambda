package bagian8.application;

import java.util.function.Supplier;

public class SupplierApp {
    public static void main(String[] args) {

        // Interface Supplier
        Supplier<String> supplier = () -> "Aera Hye Ren";

        System.out.println(supplier.get());
    }
}
