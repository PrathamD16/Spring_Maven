package com.app.pack.dao;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.app.pack.model.Product;
import com.app.pack.controller.ProductController;
import org.hibernate.query.Query;

public class ProductDao {


    public Product getProduct(int id){
         Product obj = null;
         Session sess = ProductController.getSessionFactory().openSession();
         try {
             String Hqlquery = "from product where productId = :id";
             @SuppressWarnings("rawtypes")
             Query query = sess.createQuery(Hqlquery);
             query.setParameter("productId", id);
             obj = (Product)query.getSingleResult();
         }catch(Exception e){
            e.printStackTrace();
         }
//         finally {
//             sess.flush();
//             sess.close();
//         }
         return obj;
    }

    public void ProductSave(Product pr)
    {
        Transaction trn=null;
        try {
            Session sess=ProductController.getSessionFactory().openSession();
            trn= sess.beginTransaction();
            sess.save(pr);
            trn.commit();
        }
        catch(Exception e)
        {
            if(trn !=null)
            {
                trn.rollback();

            }
            e.printStackTrace();
        }
    }

    public List <Product> getProducts()
    {

        try (Session session=ProductController.getSessionFactory().openSession())
        {//parallel to sql select query
            return session.createQuery("from Product",Product.class).list();

        }
    }
}

