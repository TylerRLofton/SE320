public class problem2 {
    public static void main(String[] args) {
        int[] randomInts = new int[100];
        for (int i = 0; i < randomInts.length; i++) {
            randomInts[i] = (int)(Math.random() * 100);
        }
        for (int i = 0; i < randomInts.length; i++) {
            System.out.print(randomInts[i] + " ");
        }

        boolean valid = false;
        java.util.Scanner input = new java.util.Scanner(System.in);
        
        while (!valid) {
            try {
                System.out.print("\nEnter an index: ");
                int index = input.nextInt();
                System.out.println("The number at index " + index + " is " + randomInts[index]);
                valid = true;
                input.close();
            } catch (Exception e) {
                System.out.println("Out of bounds.");
                input.nextLine();
            }
        }
    }
}
