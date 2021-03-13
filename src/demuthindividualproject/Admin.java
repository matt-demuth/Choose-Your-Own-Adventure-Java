
package demuthindividualproject;

import java.util.Scanner;
import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author mattd
 */
public class Admin {
    Images I = new Images();
    Meadow m = new Meadow();
    Forest f = new Forest();
    char pathSelection;
    char continueIndicator;
    char playAgainIndicator;
    Scanner keyboard = new Scanner(System.in);

    public void Intro() throws InterruptedException, LineUnavailableException
    {
        Sound.WIN.stop();
        System.out.println("\t\t                       _________________________________                       ");
        Thread.sleep(300);
        System.out.println("\t\t          *           |                                 |           *          ");
        Thread.sleep(300);
        System.out.println("\t\t         ***          | The Road To Grandmother's House |          ***         ");
        Thread.sleep(300);
        System.out.println("\t\t        *****         |_________________________________|         *****        ");
        Thread.sleep(300);
        //begin sound for first stage
        Sound.MAINSTAGE.play();
        System.out.println("\t\t       *******                                                   *******       ");
        Thread.sleep(300);
        System.out.println("\t\t      *********                                                 *********      ");
        Thread.sleep(300);
        System.out.println("\t\t     ***********                                               ***********     ");
        Thread.sleep(300);
        System.out.println("\t\t    *************      _________________________________      *************    ");
        Thread.sleep(300);
        System.out.println("\t\t   ***************    |                                 |    ***************   ");
        Thread.sleep(300);
        System.out.println("\t\t  *****************   | Would You Like To Play Y or N?  |   *****************  ");
        Thread.sleep(300);
        System.out.println("\t\t *******************  |_________________________________|  ******************* ");
        Thread.sleep(300);
        System.out.println("\t\t*********************                                     *********************");
        Thread.sleep(300);
        System.out.println("\t\t        |||||                                                     |||||        ");
        
        startGame();
    }
     
    
    public void startGame() throws InterruptedException, LineUnavailableException
    {
        //Check if user would like to play
        continueIndicator = keyboard.next().toUpperCase().charAt(0);
        if(continueIndicator == 'Y')
        {         
            Sound.SELECT.play();
            System.out.println("\t\t\t\t\t    Let The Journey Begin!");
            Thread.sleep(4000);
            System.out.println("\n\n\n\n");

            Setup();  
        }
        
        else 
        {
            
            Goodbye();
        }
    }
    
    public void Setup() throws LineUnavailableException, InterruptedException
    {
        
        System.out.println("\t\t\tIt's that time of the month again!\t\t\t");
        System.out.println("\t\t\tTime to bring Grandmother her monthly supply of Toilet Paper\t\t\t");
        Thread.sleep(4000);
        System.out.println("\t\t\tBut the road is closed for construction... typical\t\t\t");
        System.out.println("\t\t\tYou will have to take a different path\t\t\t");
        Thread.sleep(4000);
        System.out.println("\t\t\tTo the left is a beautiful meadow\t\t\t");
        System.out.println("\t\t\tTo the Right is a dark and dank Forest\t\t\t");
        Thread.sleep(3000);
        System.out.println("\n\n\n");

        Path();
        
    }
    
    public void Path() throws LineUnavailableException, InterruptedException{
        
        System.out.println("\t\t\t PRESS \n"
                + "\t\t\t L: To go through the Meadow\n"
                + "\t\t\t R: To enter the Forest \n");
        //Selection statement used to determine the game path
        pathSelection = keyboard.next().toUpperCase().charAt(0);        
        if (pathSelection == 'L')
        {
           System.out.println("\t\t\t Through the Meadow we go\t\t\t");
           m.meadowStage1();
        }
        else if (pathSelection == 'R')
        {
           System.out.println("\t\t\t In to the Forest we go\t\t\t");
           f.forestStage1();
        }
        else
        {
            System.out.println("\t\t\t Grandmother Needs her TP please pick a valid path\t\t\t");
            Path();
        }
        //Stop sound before moving to next method
        Sound.MAINSTAGE.stop();
    }
    
    public void Goodbye() throws InterruptedException
    {
        
        I.Bye();
        Sound.BYE.play();
        Thread.sleep(3000);
        //force app close
        System.exit(0);
    }

    public void gameOver() throws LineUnavailableException, InterruptedException
    {
        //Stops all sound
        Sound.MEADOWLOOP.stop();
        Sound.FORESTLOOP.stop();
        Sound.FORESTLOOP2.stop();
        Sound.TROLL.stop();
        Sound.LOSS.play();
        System.out.println("\n\n\n\n\n");
        Thread.sleep(1000);
        I.gameOverImage();
        Thread.sleep(3000);
        // Check if user would like to play again
        System.out.println("\t\t\t Would you like to play again?\n"
                        + "\t\t\t Enter\n"
                        + "\t\t\t Y: To Play Again\n"
                        + "\t\t\t N: To Quit");
        playAgainIndicator = keyboard.next().toUpperCase().charAt(0);
        if(playAgainIndicator == 'Y')
        {
            Sound.SELECT.play();
            System.out.println("\t\t\t You awaken back at the fork in the road");
            Path();
        }
        else if(playAgainIndicator == 'N')
        {
            Sound.SELECT.play();
            Goodbye();
        }
    }
    
    public void victory() throws InterruptedException, LineUnavailableException
    {
     //Method used for successfull completion of the game   
     //Stops all sound
        Sound.MEADOWLOOP.stop();
        Sound.TROLL.stop();
        Sound.FORESTLOOP.stop();
        Sound.FORESTLOOP2.stop();
        Sound.WIN.play();
        Thread.sleep(2000);
        I.house();
        System.out.println("\t\t\t After a long and difficult journey you have finally made it.");
        Thread.sleep(2000);
        System.out.println("\t\t\t Grandmother's house looks so peaceful compared to the craziness behind you.");
        Thread.sleep(2000);
        System.out.println("\t\t\t As you walk up the gravel path Grandmother amerges from inside and waves.");
        Thread.sleep(2000);
        System.out.println("\t\t\t Congratulations you've made it!");
        Thread.sleep(2000);
        System.out.println("\n");
        //Check if user would like to play again
        System.out.println("\t\t\t Would you like to play again?\n"
                + "\t\t\t Enter\n"
                + "\t\t\t Y: To Play Again\n"
                + "\t\t\t N: To Quit");
        playAgainIndicator = keyboard.next().toUpperCase().charAt(0);
        if(playAgainIndicator == 'Y')
        {
            
            Intro();
        }
        else if(playAgainIndicator == 'N')
        {
            Goodbye();
        }
    }
}
