package interface_._00_Playing;

import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import java.io.IOException;

public interface IMusic {
        void Cal() throws UnsupportedAudioFileException, LineUnavailableException, IOException;

}
