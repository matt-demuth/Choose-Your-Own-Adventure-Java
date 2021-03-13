
package demuthindividualproject;

import java.applet.Applet;
import java.applet.AudioClip;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;

/**
 *y
 * 
 * @author mattd
 */
public class Sound {
    //created audioclips to be used in methods
	public static final AudioClip VIOLIN = Applet.newAudioClip(Sound.class.getResource("Violin.wav"));
        public static final AudioClip MAINSTAGE = Applet.newAudioClip(Sound.class.getResource("MainStage.wav"));
        public static final AudioClip MEADOWLOOP = Applet.newAudioClip(Sound.class.getResource("MeadowLoop.wav"));
        public static final AudioClip FORESTLOOP = Applet.newAudioClip(Sound.class.getResource("ForestLoop.wav"));
        public static final AudioClip FORESTLOOP2 = Applet.newAudioClip(Sound.class.getResource("ForestLoop2.wav"));
        public static final AudioClip CACKLE = Applet.newAudioClip(Sound.class.getResource("Cackle.wav"));
        public static final AudioClip SELECT = Applet.newAudioClip(Sound.class.getResource("Select.wav"));
        public static final AudioClip WATER = Applet.newAudioClip(Sound.class.getResource("Water.wav"));
        public static final AudioClip LOSS = Applet.newAudioClip(Sound.class.getResource("Loss Sound.wav"));
        public static final AudioClip WIN = Applet.newAudioClip(Sound.class.getResource("Win.wav"));
        public static final AudioClip TROLL = Applet.newAudioClip(Sound.class.getResource("Troll.wav"));
        public static final AudioClip BYE = Applet.newAudioClip(Sound.class.getResource("Goodbye.wav"));
        

}


