public class assertions {
    public static void main (String[] args){
        int num = Integer.parseInt(System.console().readLine("Enter a number between 0 and 10: "));
        assert (num <= 10 && num >= 0) : "The entered number is out of range.";
        System.out.println("The number you entered is: " + num);
    }
}
