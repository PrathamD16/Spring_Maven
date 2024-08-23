package com.pack.invoice;

import com.pack.product.Product;

public class InvoiceGenerator {
    private Product p;

    public InvoiceGenerator(Product p) {
        this.p = p;
    }

    public void displayInvoice(){
        System.out.println(p.toString());
    }
}
