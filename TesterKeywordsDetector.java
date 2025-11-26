import org.junit.Test;
import static org.junit.Assert.*;

public class TesterKeywordsDetector {
    @Test
    public void testKeywordsDetection() {
        KeywordsDetector detector = new KeywordsDetector();
        assertTrue(detector.isKeyword("public"));
        assertFalse(detector.isKeyword("notAKeyword"));
    }

    @Test
    public void testEmptyInput() {
        KeywordsDetector detector = new KeywordsDetector();
        assertFalse(detector.isKeyword(""));
    }
}