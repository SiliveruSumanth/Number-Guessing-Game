package GameImplement;
import java.util.Random;
public class NumGame {
    public static void start(){
        Random rand=new Random();
        final int randgen=rand.nextInt(1,100);
        TakeInput t=new TakeInput();
        Welcoming w=new Welcoming();
        w.greet();
        System.out.print("\nEnter your choice : ");
        int choice=t.takeInput();
        System.out.println();
        String option="";
        int chances=0;
        switch(choice){
            case 1:
                chances+=10;
                option="Easy";
                break;
            case 2:
                chances+=5;
                option="Medium";
                break;
            case 3:
                chances+=2;
                option="Hard";
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println("Great! You have selected the "+option+ " difficulty level.\n" +
                "Let's start the game!\n");
        Validation valdit=new Validation();
        int count=1;
        while(count <= chances){
            System.out.print("Enter your guess: ");
            int guess = t.takeInput();

            if(Validation.validate(guess, randgen, count)){
                return; // game ends
            }

            count++;
        }
        System.out.println("\nSorry! You have failed to guess the number in "+chances+" attempts.\nThe correct answer is "+randgen);
    }
}
