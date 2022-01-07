package com.example.level2lesson6;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerTryWithResourse {
    final static int PORT = 8189;
    public static void main(String[] args) {


        try(ServerSocket server = new ServerSocket(PORT)) {
            System.out.println("Server is connected");
            try (Socket socket = server.accept()){
                System.out.println("Client is connected");
                Scanner in = new Scanner(socket.getInputStream());
                PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
                while (true) {
                    String str = in.nextLine();
                    if (str.equals("end")) {
                        System.out.println("Client is disconnected");
                        break;
                    }
                    System.out.println("Client: " + str);
                    out.println("Echo: " + str);
                }
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
