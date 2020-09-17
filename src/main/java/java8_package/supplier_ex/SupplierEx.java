package java8_package.supplier_ex;

import java.util.function.Supplier;

public class SupplierEx {
    public static void main(String[] args) {
        Supplier supplier=()->"Pavan";

        String s = (String) supplier.get();
        System.out.println(s);
    }
}
