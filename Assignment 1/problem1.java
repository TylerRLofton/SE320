public class problem1 {
    public static void main(String[] args) {
        java.util.Scanner input = new java.util.Scanner(System.in);
        int num1 = 0;
        int num2 = 0;
        boolean valid = false;
        
        while (!valid) {
            try {
                System.out.print("Enter the first number: ");
                num1 = input.nextInt();
                System.out.print("Enter the second number: ");
                num2 = input.nextInt();
                valid = true;
                System.out.println(num1 + " + " + num2 + " = " + (num1 + num2));
            } catch (Exception e) {
                System.out.println("Invalid input.");
                input.nextLine();
            }
        }
    }
}