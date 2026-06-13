package GameImplement;

public class Validation {

    public static boolean validate(int num, int target, int count) {

        if(num < 1 || num > 100){
            System.out.println("Please enter a number between 1 and 100.");
            return false;
        }

        if(num == target){
            System.out.println("Congratulations! You guessed the correct number in "
                    + count + " attempts.");
            return true;
        }

        if(num > target){
            System.out.println("Incorrect! The number is less than " + num + ".");
        } else {
            System.out.println("Incorrect! The number is greater than " + num + ".");
        }

        return false;
    }
}