import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = null;
        InputStream inputStream =null;
        OutputStream outputStream = null;
        BufferedWriter writer =null;
        BufferedReader reader =null;

        try{
            socket = new Socket("localhost", 8888);
            inputStream = socket.getInputStream();
            outputStream = socket.getOutputStream();
            writer = new BufferedWriter(outputStream);
            reader = new BufferedReader(inputStream);

            Scanner scanner = new Scanner(System.in);

            while(true){
                String message = scanner.nextLine();
                writer.write(message);
                writer.newLine();
                writer.flush();

                System.out.println("server;" + reader.readLine());
                if (message.equalsIgnoreCase("bye")){
                    break;
                }
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }
        finally {
            if (socket != null) {
                socket = null;
            }
            if (inputStream != null) {
                inputStream = null;
            }
            if (outputStream != null) {
                outputStream = null;
            }
            if (writer != null) {
                writer = null;
            }
            if (reader != null) {
                reader = null;
            }
        }
    }
}
