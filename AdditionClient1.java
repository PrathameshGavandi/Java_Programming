import java.io.*;
import java.net.*;

class AdditionClient1
{
    public static void main(String [] args) throws Exception
    {
        System.out.println("Client is running...");

        // Connect to server on localhost, port 2100
        Socket socket = new Socket("localhost", 2100);
        System.out.println("Server successfully connected.");

        
    }
}
