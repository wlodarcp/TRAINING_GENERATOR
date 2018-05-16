package SERWER_CLIENT;

import java.io.*;
import java.net.Socket;
import java.net.UnknownHostException;

public class Client extends User {
    private final String serverName;
    private final int severPort;
    private Socket socket;
    private static InputStream serverIn;
    private static OutputStream serverOut;
    private BufferedReader bufferedIn;
    private static ObjectOutputStream objectOutputStreamToServer;
    private static ObjectInputStream objectInputStream;

    public Client(String serverName, int severPort){
        this.serverName = serverName;
        this.severPort = severPort;
    }

    public void connect() {
        try {

            this.socket = new Socket(this.serverName, this.severPort);
            System.out.println("Client port is: " + this.socket.getLocalPort());

            this.serverOut = this.socket.getOutputStream();
            System.out.println("OutputStream ok");

            this.serverIn = this.socket.getInputStream();
            System.out.println("InputStream ok");


            this.objectOutputStreamToServer = new ObjectOutputStream(serverOut);
            System.out.println("ObjectOutputStream ok");

            objectOutputStreamToServer.flush();



            this.objectInputStream = new ObjectInputStream(serverIn);
            System.out.println("ObjectInputStream ok");


        } catch (UnknownHostException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
