import java.io.*;
import java.net.*;

public class ServerMulti {

    public static void main(String[] args) throws IOException {
        ServerSocket socket = new ServerSocket(5000);

        System.out.println("Server started");
        System.out.println("Waiting for clients ...");

        while (true) {
            Socket client = socket.accept();
            System.out.println("Client accepted");

            Thread clientThread = new Thread(new ClientHandler(client));
            clientThread.start();
        }
    }

    static class ClientHandler implements Runnable {
        private Socket client;

        public ClientHandler(Socket client) {
            this.client = client;
        }

        @Override
        public void run() {
            try {
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
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    client.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
