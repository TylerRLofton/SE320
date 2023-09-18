public class problem2 {
    public static void main(String[] args) {
        int[] randomInts = new int[100];
        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = (int)(Math.random() * 100);
        }

        boolean valid = false;
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        while (!valid) {
            try {
                System.out.print("Enter an index: ");
                int index = input.nextInt();
                System.out.println("The number at index " + index + " is " + randomInts[index]);
                valid = true;
            } catch (Exception e) {
                System.out.println("Out of bounds.");
                input.nextLine();
            }
        }
    }
}
