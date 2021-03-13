
package demuthindividualproject;

import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

/**
 *
 * @author mattd
 */
public class SoundClipTest extends JFrame{
       
        public SoundClipTest() {
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setTitle("Test Sound Clip");
      this.setSize(300, 200);
      this.setVisible(true);       
      // You could also get the sound file with a URL
      File soundFile = new File("C:\\Users\\mattd\\Desktop\\Logic and Problem");
      try ( // Open an audio input stream.            
            AudioInputStream audioIn = AudioSystem.getAudioInputStream(soundFile);            
            // Get a sound clip resource.
            Clip clip = AudioSystem.getClip()) {
         // Open audio clip and load samples from the audio input stream.
         clip.open(audioIn);
         clip.start();
      } catch (UnsupportedAudioFileException e) {
         e.printStackTrace();
      } catch (IOException e) {
         e.printStackTrace();
      } catch (LineUnavailableException e) {
         e.printStackTrace();
      }
   }

}
