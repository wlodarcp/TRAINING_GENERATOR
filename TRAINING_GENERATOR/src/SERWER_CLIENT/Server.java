package SERWER_CLIENT;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;

public class Server {
    private final int serverPort;

    public Server(int serverPort){
        this.serverPort = serverPort;
    }

    public void start(){
        try{
            ServerSocket serverSocket = new ServerSocket(this.serverPort);

            while (true){
                Socket in = serverSocket.accept();
                Runnable runnable = new ThreadServerWorker(this, in);
                Thread thread = new Thread(runnable);
                thread.start();
            }
        }catch (IOException ex){
            ex.printStackTrace();
        }
    }




}
