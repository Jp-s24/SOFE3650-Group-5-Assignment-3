package com.company;

import java.util.Scanner;

public class CashRegister {

    private String currentUPC;
    private ProductDB db ;
    private final Display display;
    private final TicketPrinter ticketPrinter;
    private Scanner scan;

    public CashRegister(Display display, TicketPrinter ticketPrinter) {
        currentUPC = "";
        scan = new Scanner(System.in);
        db = new ProductDB();
        this.display = display;
        this.ticketPrinter = ticketPrinter;
    }


    public void setCurrentProductUPCCode(String UPCCode){
        this.currentUPC = UPCCode;
    }

    public void getCurrentProductInfo(){

        String output = db.GetProductInfo(this.currentUPC);
        display.displayText(output);
        ticketPrinter.displayText(output);
    }

}
