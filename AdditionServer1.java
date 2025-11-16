import java.io.*;
import java.net.*;

class AdditionServer1
{
    public static void main(String [] args) throws Exception
    {
        System.out.println("Server is running...");
        
        // Create server socket at port 2100
        ServerSocket serverSocket = new ServerSocket(2100);
        System.out.println("Server is waiting at port number 2100...");

        // Wait for client connection
        Socket socket = serverSocket.accept();
        System.out.println("Client request accepted by server.");

        // Close sockets (optional for this demo)
        socket.close();
        serverSocket.close();
    }
}
