package com.company;

public class ProductDB {


    public String GetProductInfo(String upcCode){

        return switch (upcCode) {
            case "1" -> ("Basic car wash");
            case "2" -> ("Deluxe car wash");
            case "3" -> ("Supreme car wash");
            default -> ("Not an option");
        };
        //return Product;
    }

}
