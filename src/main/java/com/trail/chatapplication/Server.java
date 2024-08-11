import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {
        Socket socket = null;
        InputStream inputStream =null;
        OutputStream outputStream = null;
        BufferedWriter writer =null;
        BufferedReader reader =null;
        ServerSocket serverSocket = null;


        serverSocket = new ServerSocket(8888);

        while(true){

            try{
                socket = serverSocket.accept();
                inputStream = new InputStreamReader(socket.getInputStream());
                outputStream = new ObjectOutputStream(socket.getOutputStream());

                writer = new BufferedWriter(inputStream);
                reader = new BufferedReader(outputStream);

                while (true){
                    Scanner scanner = new Scanner(System.in);
                    String  message = reader.readLine();

                    System.out.println("user1" + message);



                    if(message.equalsIgnoreCase("bye")){
                        break;
                    }
                }

            }
            catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
