
package demuthindividualproject;

import java.util.Locale;
import java.util.Scanner;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author mattd
 */
public class Meadow {
    Images I = new Images();

    boolean coin;
    char letterSelection;
    int numSelection;
    String riddleSelection;
    Scanner keyboard = new Scanner(System.in);
    

    public void meadowStage1() throws LineUnavailableException, InterruptedException
    {
        //Stop all sound before begining appropriate class sound
        Sound.SELECT.play();
        Sound.FORESTLOOP.stop();
        Sound.FORESTLOOP2.stop();
        Sound.MAINSTAGE.stop();
        Sound.MEADOWLOOP.loop();
        I.meadowImage();
        System.out.println("\t\t\t You skip through the Meadow the sun shines bright above\t\t\t");
        System.out.println("\t\t\t After several minutes of walking you start to see something on the path ahead");
        Thread.sleep(2000);
        System.out.println("\t\t\t An elderly man sits atop a large rock next to the road");
        Thread.sleep(4000);
        I.meadowMan();
        Thread.sleep(3000);
        System.out.println("\t\t\t The man waves as you get closer and you approach cautiously");
        System.out.println("\t\t\t\t" +"\"You appear to be on an important journey, Grandmother needs her TP i see\"");
        Thread.sleep(3000);
        System.out.println("\t\t\t You don't respond you simply stare at the scragly man bewildered");
        Thread.sleep(4000);
        System.out.println("\t\t\t\t" +"\"The road ahead is dangerous answer my riddle and i will help you along\"");
        System.out.println("\t\t\t Begrudgingly you agree");
        Thread.sleep(3000);
        meadowRiddle();
       
    }
    
    
    public void meadowRiddle() throws InterruptedException, LineUnavailableException
    {
         Admin a = new Admin(); 
         System.out.println("\t\t\t\t" + "\"Though my heart is made of stone my flesh is red as blood. What am i?\"");
         Thread.sleep(3000);
         System.out.println("\n"
                + "\t\t\t Enter \n"
                + "\t\t\t Your Guess: To Solve \n"
                + "\t\t\t Intimidate: To Scare him away \n");
         riddleSelection = keyboard.next().trim().toUpperCase(Locale.getDefault());   
         //if else selection for user to solve riddle
         if (riddleSelection.equals("CHERRY"))
         {
             System.out.println("\t\t\t The old man delights as you answer");
             Thread.sleep(2000);
             System.out.println("\t\t\t\t" + "\"You are as wise as you are dutiful.\" he says handing you a small gold coin");
             Thread.sleep(3000);
             System.out.println("\t\t\t\t" + "\"Keep this coin you will know when to use it\"");
             Thread.sleep(3000);
             System.out.println("\n\n");
             coin = true;
             meadowStage2();
         } 
         else if(riddleSelection.equals("INTIMIDATE"))
         {
             coin = false;
             System.out.println("\t\t\t\t" + "\"Very well no need to be rude you can go.\"");
             meadowStage2();
         }

         else
         {
             System.out.println("\t\t\t\t" + "\" Thats not correct you may guess again\"");
             Thread.sleep(3000);
             meadowRiddle();
         }
         

        }
        
    public void meadowStage2() throws InterruptedException, LineUnavailableException
    {
        System.out.println("\n\n");
        System.out.println("\t\t\t Leaving the old man behind you continue your journey");
        Thread.sleep(2000);
        System.out.println("\t\t\t You are only a few minutes down the road when you see something in the distance");
        Thread.sleep(2000);
        System.out.println("\t\t\t As you approach you can see that it is a busted up wagon with someone laying next to it");
        Thread.sleep(2000);
        I.meadowWagonImage();
        Thread.sleep(5000);
        System.out.println("\t\t\t Do you help them? They could be badly hurt.");
        System.out.println("\t\t\t Grandma warned you about strangers on the road...\n");
        Thread.sleep(5000);   
        meadowWagon();

    }
    
    public void meadowWagon() throws LineUnavailableException, InterruptedException
    {
        Admin a = new Admin();
        System.out.println("\t\t\t Enter \n"
                + "\t\t\t H: To Help the Man\n"
                + "\t\t\t L: To Leave the Man \n");
        letterSelection = keyboard.next().toUpperCase().charAt(0);
        //Switch case used for selection
        switch (letterSelection) {
            case 'H': 
                System.out.println("\t\t\t As you approach the injured person something does not feel right");
                Thread.sleep(3000);
                System.out.println("\t\t\t You look up and you are suddenly surrounded by rufians");
                Thread.sleep(3000);
                System.out.println("\t\t\t Something strikes you from behind and all fades to black");
                Thread.sleep(3000);
                a.gameOver();
                break;
            case 'L':
                meadowStage3();
                break;
            default:
                System.out.println("\t\t\t Thats not a valid choice");
                meadowWagon();
                break;
        }
    }
    
    public void meadowStage3() throws LineUnavailableException, InterruptedException
    {
        System.out.println("\t\t\t You quickly jog past the wagon Grandma warned you about strangers and you listened");
        Thread.sleep(5000);
        System.out.println("\t\t\t You walk for what feels like hours who knew this way was so long");
        Thread.sleep(4000);
        System.out.println("\t\t\t Walking....");
        Thread.sleep(2000);
        System.out.println("\t\t\t Walking....");
        Thread.sleep(2000);
        System.out.println("\t\t\t Walking....");
        Thread.sleep(2000);
        System.out.println("\t\t\t Finally you begin to hear something");
        Thread.sleep(2000);
        System.out.println("\t\t\t As you move closer the sound becomes unmistakable.");
        System.out.println("\t\t\t It's a River! The River just before Grandmother's house! Almost There!");
        Thread.sleep(6000);
        System.out.println("\t\t\t You clear the last hill and behold the beautiful river \n" +
                "\t\t\t flowing through the valley. and there on the other side is Grandmother's house");
        Thread.sleep(5000);
        System.out.println("\t\t\t You run for the bridge but as you take your first step on the stone path something appears");
        Thread.sleep(6000);
        I.meadowTroll();
        //meadow sound stopped so troll sound can play 
        Sound.MEADOWLOOP.stop();
        Sound.TROLL.play();
        Thread.sleep(5000);
        System.out.println("\t\t\t A hideous creature springs up from beneath the bridge and blocks the other side");
        Thread.sleep(3000);
        System.out.println("\t\t\t You now clearly see it is a dreaded bridge troll, Grandma never mentioned him");
        Thread.sleep(3000);
        System.out.println("\t\t\t\t" + " \"This is my bridge pay the toll or turn back.\" he says with a gravely voice");
        Thread.sleep(3000);
        System.out.println("\t\t\t You've heard the story of these trolls they are strong as an ox and mean as a crocodille.\n");
        Thread.sleep(3000);
        meadowTroll();
        
    }
    
    public void meadowTroll() throws LineUnavailableException, InterruptedException
    {
        Forest f = new Forest();
        Admin a = new Admin();
        System.out.println("\t\t\t He requires a toll \n" 
                + "\t\t\t Enter \n"
                + "\t\t\t 1. To offer him something shiny \n"
                + "\t\t\t 2. To swim across instead \n"
                + "\t\t\t 3. To turn back and go through the forest");
        numSelection = keyboard.nextInt();
        //Switch case used for decision making
        switch (numSelection) {
            case 1: 
        //nested if else selction to check if coin variable is true
                if (coin == true)
                {
                    System.out.println("\t\t\t You feel around in your pockets for something to offer the Troll");
                    System.out.println("\t\t\t Your hand catches something round and smooth");
                    Thread.sleep(5000);
                    System.out.println("\t\t\t The Coin! Of course the coin the old man gave you!");
                    Thread.sleep(2000);
                    System.out.println("\t\t\t You flip the coin to the troll he pulls it close examining it then steps aside");
                    Thread.sleep(3000);
                    System.out.println("\t\t\t\t" + " \"You may go.\" he says");
                    a.victory();
                }
                else if(coin == false)
                {
                    System.out.println("\t\t\t You feel around in your pockets for something to offer the Troll");
                    System.out.println("\t\t\t You search but find nothing you begin to panic.");
                    Thread.sleep(5000);
                    System.out.println("\t\t\t In your panic you desperately throw a roll of toilet paper at the troll");
                    Thread.sleep(2000);
                    System.out.println("\t\t\t\t He scoffs" + " \"Your single Ply offering is not enough\"");
                    Thread.sleep(3000);
                    System.out.println("\t\t\t You had better choose something else!");
                    Thread.sleep(2000);
                    meadowTroll();
                }
                break;
            case 2:
                System.out.println("\t\t\t Thinking quickly you hop over the wall and into the rushing water");
                Thread.sleep(3000);
                Sound.WATER.play();
                System.out.println("\t\t\t\t" + " \"Good luck!!\" he shouts as you plumet into the cold water");
                Thread.sleep(3000);
                System.out.println("\t\t\t The current is much stronger than you anticipated");
                Thread.sleep(3000);
                System.out.println("\t\t\t You struggle to stay afloat as the current drags you down");
                Thread.sleep(3000);
                System.out.println("\t\t\t Finally it is too much and you are sucked under!");
                Thread.sleep(3000);
                System.out.println("\t\t\t You kick and pull but you cannot escape the current's grasp");
                Thread.sleep(3000);
                a.gameOver();
                break;
            case 3:
                System.out.println("\t\t\t Both options seem to risky so you quikly turn tail and run.");
                Thread.sleep(3000);
                System.out.println("\t\t\t It will only take you a few hours to get back to the forest.");
                f.forestStage1();
                break;
            default:
                System.out.println("\t\t\t Thats not a valid choice");
                meadowTroll();
                break;
        }
        
        
        
    }
}
