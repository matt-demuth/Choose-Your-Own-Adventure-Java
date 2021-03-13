
package demuthindividualproject;

import javax.sound.sampled.LineUnavailableException;

/**
 *
 * @author mattd
 */
public class Controller {

    Admin a = new Admin();

    public void missionControl() throws InterruptedException, LineUnavailableException
    {
        a.Intro();
    }
}
