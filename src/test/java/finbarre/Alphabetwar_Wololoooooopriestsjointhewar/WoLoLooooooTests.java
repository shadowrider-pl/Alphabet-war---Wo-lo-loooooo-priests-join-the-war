package finbarre.Alphabetwar_Wololoooooopriestsjointhewar;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

public class WoLoLooooooTests {

    @Test
    public void SampleTests() {
        assertEquals("Right side wins!",   AlphabetWars.woLoLoooooo("z"));
        assertEquals("Left side wins!",    AlphabetWars.woLoLoooooo("tz"));
        assertEquals("Let's fight again!", AlphabetWars.woLoLoooooo("jbdt"));
        assertEquals("Right side wins!",   AlphabetWars.woLoLoooooo("jz"));
        assertEquals("Left side wins!",    AlphabetWars.woLoLoooooo("zt"));
        assertEquals("Right side wins!",   AlphabetWars.woLoLoooooo("sj"));
        assertEquals("Left side wins!",    AlphabetWars.woLoLoooooo("azt"));
        assertEquals("Right side wins!",   AlphabetWars.woLoLoooooo("tzj"));
        assertEquals("Left side wins!",    AlphabetWars.woLoLoooooo("wololooooo"));    
        assertEquals("Let's fight again!", AlphabetWars.woLoLoooooo("zdqmwpbs"));
        assertEquals("Left side wins!",    AlphabetWars.woLoLoooooo("ztztztzs"));
        

        assertEquals("Left side wins!",    AlphabetWars.woLoLoooooo("jdqtdqab"));
        assertEquals("Left side wins!",    AlphabetWars.woLoLoooooo("jtmw"));
        assertEquals("Left side wins!",    AlphabetWars.woLoLoooooo("dstbj"));
        assertEquals("Right side wins!",   AlphabetWars.woLoLoooooo("qpdjmttb"));
//        assertEquals("Left side wins!",    AlphabetWars.woLoLoooooo("jj"));
//        assertEquals("Left side wins!",    AlphabetWars.woLoLoooooo("jttmjmt"));
//        assertEquals("Left side wins!",    AlphabetWars.woLoLoooooo("sdbwptjbb"));
//        assertEquals("Left side wins!",    AlphabetWars.woLoLoooooo("wsettaz"));
//        assertEquals("Left side wins!",    AlphabetWars.woLoLoooooo("jwfdbtdtq"));
    }
}

