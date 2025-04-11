package javaviradonojiraya.javacore.ZZFthreads.test;

import javaviradonojiraya.javacore.ZZFthreads.services.EmailDeliveryService;
import javaviradonojiraya.javacore.ZZFthreads.domain.Members;

import javax.swing.*;

public class EmailDeliveryTest01 {
    public static void main(String[] args) {
        Members members = new Members();
        Thread naruto = new Thread(new EmailDeliveryService(members), "Naruto");
        Thread nagato = new Thread(new EmailDeliveryService(members), "Nagato");

        nagato.start();
        naruto.start();

        while (true){
            String email = JOptionPane.showInputDialog(" Entre com seu email: ");
            if (email == null ||  email.isEmpty()){
                members.close();
                break;
            }
            members.addMemberEmail(email);
        }

    }
}
