package SERWER_CLIENT;

public class ClientMain {
    public static void main(String[] args) {
        Client klient = new Client("localhost", 8888);
        klient.connect();
    }
}
