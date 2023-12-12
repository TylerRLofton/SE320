import java.io.*;
import java.net.*;

public class Server {
    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(5000);

        System.out.println("Server started");
        System.out.println("Waiting for a client ...");

        Socket client = socket.accept();
        System.out.println("Client accepted");

        PrintWriter out = new PrintWriter(client.getOutputStream(), true);
        BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

        while (true) {
            String weightStr = in.readLine();
            double weight = Double.parseDouble(weightStr);

            String heightStr = in.readLine();
            double height = Double.parseDouble(heightStr);

            double bmi = weight / (height * height);

            out.println(bmi);
        }
    }
}