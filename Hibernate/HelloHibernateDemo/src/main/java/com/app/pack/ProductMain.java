package com.app.pack;

import java.util.List;

import com.app.pack.model.Product;
import com.app.pack.dao.ProductDao;

public class ProductMain {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        ProductDao prdao=new ProductDao();
//        Product pr=new Product("Pen", 34.45);
//        Product pr2 =new Product("Pant", 56.32);
//        Product pr3 =new Product("Shirt", 56.32);
//        prdao.ProductSave(pr);
//        prdao.ProductSave(pr2);
//        prdao.ProductSave(pr3);
//        List<Product> prods=prdao.getProducts();
//        prods.forEach(p->System.out.println(p));
        System.out.println(prdao.getProduct(5));
    }

}