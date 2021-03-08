package ZooServer;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.ServerSocket;
import java.net.Socket;
import java.sql.SQLException;

public class Main {
    private static ServerSocket ss;
    private static Socket s;
    private static BufferedReader br;
    private static InputStreamReader isr;
    private static String message;
    private static DataBase db;

    public static void main(String[] args) {
        boolean flag = false;
        try {
            while (true) {

                ss = new ServerSocket(20000);
                s = ss.accept();
                isr = new InputStreamReader(s.getInputStream()); //to receive the data
                br = new BufferedReader(isr);
                message = br.readLine();
                System.out.println(message);

                //Connection to DataBase
                if (message.equals("connect")){
                    db = new DataBase();
                    try {
                        db.connect();
                        flag = true;
                        System.out.println("Connection Establish Welcome to DataBase Test");
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                }
                if (flag == true && message.equals("exit")){
                    db.disconnect();
                    System.out.println("Connection to DB has closed");
                    flag = false;
                }
                if (message.equals("login")){
                    try {
                        String name = db.getUserName(0);
                        System.out.println(name);
                    } catch (SQLException throwable) {
                        throwable.printStackTrace();
                    }
                }
                isr.close();
                br.close();
                ss.close();
                s.close();

            }



        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}