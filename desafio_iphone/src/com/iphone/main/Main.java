package com.iphone.main;

import com.iphone.model.IPhone;

public class Main {
    public static void main(String[] args) {
        IPhone myIPhone = new IPhone("iPhone 14", 256);

        // Exibir informações do iPhone
        myIPhone.showInfo();

        // Usando como reprodutor musical
        myIPhone.play();
        myIPhone.pause();
        myIPhone.createPlaylist("Rock Classics");

        // Usando como telefone
        myIPhone.makeCall("123-456-7890");
        myIPhone.receiveCall("098-765-4321");
        myIPhone.addContact("John Doe", "123-456-7890");

        // Usando como navegador
        myIPhone.browse("www.google.com");
        myIPhone.addBookmark("www.youtube.com");
    }
}
