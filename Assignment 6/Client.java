import java.io.*;
import java.net.*;

public class Client {

    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 5000);
        BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
        BufferedReader userIn = new BufferedReader(new InputStreamReader(System.in));
        PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

        while (true) {
            System.out.print("Enter weight in kilograms: ");
            String weightStr = userIn.readLine();

            System.out.print("Enter height meters: ");
            String heightStr = userIn.readLine();

            out.println(weightStr);
            out.println(heightStr);

            String bmiStr = in.readLine();
            double bmi = Double.parseDouble(bmiStr);
            System.out.println("BMI: " + bmi);
        }
    }
}