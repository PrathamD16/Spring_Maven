package com.pack;
import com.pack.hello.HelloGreet;
import com.pack.invoice.InvoiceGenerator;
import com.pack.student_pack.Students;
import com.pack.ticket.Ticket;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainHello {
    public static void main(String[] args) {
        ApplicationContext context1 = new ClassPathXmlApplicationContext("hello.xml");
//        HelloGreet obj = (HelloGreet) context1.getBean("hello_id");
//        System.out.println(obj.getMsg());

//        Ticket obj = (Ticket) context1.getBean("ticket_id");
//        System.out.println(obj.getDate());
//        System.out.println(obj.getId());

//        Students obj = (Students) context1.getBean("student_info");
//        System.out.println(obj.toString());

        InvoiceGenerator obj = (InvoiceGenerator) context1.getBean("invoice_id");
        obj.displayInvoice();
    }
}
