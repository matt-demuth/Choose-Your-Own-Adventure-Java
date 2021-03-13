
package demuthindividualproject;

import java.util.Locale;
import java.util.Random;
import java.util.Scanner;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author mattd
 */
public class Forest {
;
    Images I = new Images();
    char letterSelection;
    int numSelection;
    String[] myNames = new String[]
    {"HANK", "HENRY", "HOWARD", "HOLT", "HAROLD", "HECTOR"};
    String input;
    String name;
    int Max = 6;
    int Min = 1;
    int guessesLeft;
    Scanner keyboard = new Scanner(System.in);
 
    public void forestStage1() throws LineUnavailableException, InterruptedException
    {
        //Stop all sounds so appropriate class sound can play
        Sound.SELECT.play();
        Sound.TROLL.stop();
        Sound.MAINSTAGE.stop();
        Sound.MEADOWLOOP.stop();
        Sound.FORESTLOOP2.loop();
        Sound.FORESTLOOP.loop();
        I.forestImage();
        System.out.println("\t\t\t The Forest creaks and moans as the sun fades away");
        System.out.println("\t\t\t You look around, it seems like the whole place is alive");
        Thread.sleep(3000);
        System.out.println("\t\t\t Lost in paranoia you bump right into something");
        System.out.println("\t\t\t You look up and see a hooded figure. \n");
        Thread.sleep(6000);
        I.forestWomanImage();
        Thread.sleep(4000);
        System.out.println("\t\t\t You apologize and realize the figure is an old Woman");  
        System.out.println("\t\t\t She stands before you her frail body blocking the path");
        Thread.sleep(3000);
        System.out.println("\t\t\t After a few breaf moments of silence she holds out a shiny red apple");
        System.out.println("\t\t\t\t" +"\"Take this apple my dear the journey is long you'll need a snack\"" + "\n\n");
        Thread.sleep(5000);
        forestWoman();
    }
    
    public void forestWoman() throws LineUnavailableException, InterruptedException
    {
        Admin a = new Admin();
        System.out.println("\t\t\t What should you do? \n" 
        + "\t\t\t Enter \n"
        + "\t\t\t T: To Take the Apple \n"
        + "\t\t\t P: To Push past her");
        letterSelection = keyboard.next().toUpperCase().charAt(0);
        //Switch case used for selection
        switch (letterSelection) { 
        case 'T': 
            System.out.println("\t\t\t You take the shiny apple and thank the woman before continuing");
            Thread.sleep(3000);
            System.out.println("\t\t\t You Skip along the path devouring the delicious apple its the best you've ever had \n");
            Thread.sleep(5000);
            System.out.println("\t\t\t Suddenly you can't breathe!");
            Thread.sleep(2000);
            System.out.println("\t\t\t You choke and cough but you can't find any air.");
            Thread.sleep(2000);
            System.out.println("\t\t\t Everything begins to fade and you crash to the ground. \n");
            a.gameOver();
        break;
        case 'P':
            //Sound effect play
            Sound.CACKLE.play();
            System.out.println("\t\t\t The woman cackles as you try to move past");
            Thread.sleep(1000);
            System.out.println("\t\t\t\t" +"\"You won't get away that easily\"");
            Thread.sleep(4000);
            System.out.println("\t\t\t She attempts to block you but you shove her to the ground and quickly run");
            forestStage2();
        break;
        default:
            System.out.println("\t\t\t Thats not a valid choice");
            forestWoman();
        break;
        
    }
}
    public void forestStage2() throws LineUnavailableException, InterruptedException
    {
        System.out.println("\t\t\t What a creep! Lurking in the forest offering people apples.\n");
        Thread.sleep(3000);
        System.out.println("\t\t\t A chill creeps up your spine but you try to forget her as you push on");
        Thread.sleep(4000);
        System.out.println("\t\t\t You walk for a short while seeing every manner of creepy thing\n");
        System.out.println("\t\t\t Finally! A ray of sunlight spears through the trees, it must be the end!");
        Thread.sleep(4000);
        System.out.println("\t\t\t You rush forward desperate to escape this creepy place.");
        System.out.println("\t\t\t You stop dead in your tracks just short of the edge of the forest.\n");
        Thread.sleep(6000);
        System.out.println("\t\t\t There blocking the path is a cart filled with wood.");
        I.woodCutter();
        System.out.println("\t\t\t A man holding a silver axe stands next to it chopping wood.");
        Thread.sleep(3000);
            System.out.println("\t\t\t\t" +" \"Halt! Who Approaches?\" the burly man asks");
            Thread.sleep(3000);
        System.out.println("\t\t\t" +"\"I am nobody\" you respond");
        Thread.sleep(3000);
            System.out.println("\t\t\t\t" +" \"Very well nobody, you may turn around and leave for this is my forest\"");
            Thread.sleep(3000);
        System.out.println("\t\t\t" + "\"But i must get to my grandmothers, she lives just beyond this forest surely you have seen her.\"");
            Thread.sleep(3000);
            System.out.println("\t\t\t\t" +" \"I haven't seen anyone for i am blind.\"");
            Thread.sleep(3000);
        System.out.println("\t\t\t" +"\"Whoever heard of a blind woodsman\" you say with a chuckle");
        Thread.sleep(3000);
            System.out.println("\t\t\t\t" +" \"Have you ever seen a tree move?\"");
            Thread.sleep(3000);
        System.out.println("\t\t\t" +" \"Well no but mr. Woodsman i must get past\"");
        System.out.println("\t\t\t\t" +" \"Verywell, if you can guess my name in 5 guesses i will let you pass\"");
        Thread.sleep(3000);
        System.out.println("\t\t\t\t" + "\"I will even give you a hint my name begins with the letter H\"");
        Thread.sleep(3000);
        System.out.println("\t\t\t\t" +"\"If you cannot then you must leave\n\"");
        Thread.sleep(3000);
        System.out.println("\t\t\t This time you do not respond you instead try to creep past the blind man");
        Thread.sleep(4000);
        System.out.println("\t\t\t but he quickly holds up his axe to you" +" \"I may be blind but my hearing is excellent\n\"");
        Thread.sleep(5000);
        forestMan1();
        
    }
    
    public void forestMan1() throws LineUnavailableException, InterruptedException
    {   
        Meadow m = new Meadow();
        Admin a = new Admin();
        System.out.println("\t\t\t It seems you have three options \n" 
        + "\t\t\t PRESS \n"
        + "\t\t\t 1. To Guess \n"
        + "\t\t\t 2. Try to creep past again  \n"
        + "\t\t\t 3. To Head back to the Meadow");
        numSelection = keyboard.nextInt();
        //switch case use for selection
        switch (numSelection){
            case 1: 
                forestMan2(); 
                break;
            case 2:
                System.out.println("\t\t\t" + "\" I think i'll just go\" you say");
                Thread.sleep(2000);
                System.out.println("\t\t\t You slowly begin creeping forward");
                Thread.sleep(3000);
                System.out.println("\t\t\t The blind man continues chopping wood, you are actually gonna get past him");
                Thread.sleep(3000);
                System.out.println("\t\t\t You make it past him then hear a loud wooshing sound from behind you");
                Thread.sleep(4000);
                System.out.println("\t\t\t You turn just in time to see the shimmer of the silver flying towards you");
                Thread.sleep(4000);
                System.out.println("\t\t\t The realization happens too late... you should have listened to him");
                a.gameOver();
                break;
            case 3:
                System.out.println("\t\t\t Both options seem too risky so you quikly turn tail and run.");
                System.out.println("\t\t\t It will only take you a few hours to get back to meadow.");
                Thread.sleep(3000);
                m.meadowStage1();
                
                break;
            default:
                System.out.println("\t\t\t Thats not a valid choice");
                forestMan1();
                break;
        }
    }
        
    public void forestMan2() throws InterruptedException, LineUnavailableException
    {
        Meadow m = new Meadow();
        Admin a = new Admin();
        Random rand = new Random();
        name = myNames[rand.nextInt(Max - Min) + 1];
        int count = 0;
        //while loop used to check user input to string array
        //user is given 6 guesses loop will continue until a correct answer or 6 guesses are used 
        while(count <= 5){
            count++;
            guessesLeft = 6 - count;
            System.out.println("\t\t\t\t" + "\" Tell me Your Guess\"");
            input = keyboard.next().toUpperCase(Locale.getDefault());
            if(input.equals(name))
            {
                System.out.println("\t\t\t\t" + "\" You have guessed wisely, you are free to pass.\"");
                a.victory();
                break;
            }
            System.out.println("\t\t\t\t" +"\" Wrong!\"");
            Thread.sleep(1000);
            System.out.println("\t\t\t\t" +"\" You guessed " + input + " You have " + guessesLeft + " guesses left\"");
        }
            System.out.println("\t\t\t\t" +"\" You are out of guesses you must leave my forest or face my magic axe\"");
            m.meadowStage1();
}



}
