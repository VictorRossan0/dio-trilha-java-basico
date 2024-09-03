package com.iphone.model;

import com.iphone.interfaces.MusicPlayer;
import com.iphone.interfaces.Phone;
import com.iphone.interfaces.WebBrowser;

public class IPhone implements MusicPlayer, Phone, WebBrowser {
    private String model;
    private int storage;

    public IPhone(String model, int storage) {
        this.model = model;
        this.storage = storage;
    }

    // Getters para model e storage
    public String getModel() {
        return model;
    }

    public int getStorage() {
        return storage;
    }

    // Método para exibir informações do iPhone
    public void showInfo() {
        System.out.println("Modelo: " + model);
        System.out.println("Armazenamento: " + storage + "GB");
    }

    // Métodos da interface MusicPlayer
    public void play() {
        System.out.println("Reproduzindo música...");
    }

    public void pause() {
        System.out.println("Música pausada.");
    }

    public void stop() {
        System.out.println("Música parada.");
    }

    public void createPlaylist(String name) {
        System.out.println("Playlist '" + name + "' criada.");
    }

    // Métodos da interface Phone
    public void makeCall(String number) {
        System.out.println("Ligando para " + number + "...");
    }

    public void receiveCall(String number) {
        System.out.println("Recebendo chamada de " + number + "...");
    }

    public void addContact(String name, String number) {
        System.out.println("Contato " + name + " com número " + number + " adicionado.");
    }

    // Métodos da interface WebBrowser
    public void browse(String url) {
        System.out.println("Navegando para " + url + "...");
    }

    public void addBookmark(String url) {
        System.out.println("URL " + url + " adicionada aos favoritos.");
    }
}
