package SERWER_CLIENT;

import java.io.*;
import java.net.Socket;

public class ThreadServerWorker implements Runnable {
    private Socket incoming;
    private final Server server;
    private ObjectOutputStream objectOutputStream;

    public ThreadServerWorker(Server server, Socket incoming){
        this.server = server;
        this.incoming = incoming;
    }

    @Override
    public void run(){
        try{
            this.handleClientConnection();
        }catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }

    private void handleClientConnection() throws IOException, ClassNotFoundException {
        InputStream inputStream = incoming.getInputStream();
        ObjectInputStream objectInputStream = new ObjectInputStream(inputStream);
        System.out.println("Stworzono obiekt input");

        OutputStream outputStream = this.incoming.getOutputStream();
        this.objectOutputStream = new ObjectOutputStream(outputStream);
        System.out.println("Stworzono obiekt output");

        Object incomingObject;

        //while (true){
          //  incomingObject = objectInputStream.readObject();
        //}
    }
}
