package tikatest;

import static org.junit.Assert.*;

import org.apache.tika.parser.txt.CharsetDetector;

public class Test {

    @org.junit.Test
    public void test1() {
        CharsetDetector detector = new CharsetDetector();

        String ascii = "Only ascii Visible:a;Invisible:GUID\nX;XXddd\n";
        detector.setText(ascii.getBytes());
        assertEquals("UTF-8 or ASCII", detector.detect().getName());
    }

    @org.junit.Test
    public void test2() {
        CharsetDetector detector = new CharsetDetector();

        String ascii2 = "Only ascii plain english text";
        detector.setText(ascii2.getBytes());
        assertEquals("UTF-8 or ASCII", detector.detect().getName());
    }
    @org.junit.Test
    public void test3() {
        CharsetDetector detector = new CharsetDetector();
        String ascii3 = "this is ISO-8859-2 do not know why";
        detector.setText(ascii3.getBytes());
        assertEquals("UTF-8 or ASCII", detector.detect().getName());
    }
    @org.junit.Test
    public void test4() {
        CharsetDetector detector = new CharsetDetector();

        String ascii4 = "this is UTF-8 but tell me why o why maybe sdlkfjlksdjlkfjlksdjflkjlskdjflkjsdjkflkdsjlkfjldsjlkfjldkjkfljdlkjsdfhjshdkjfhjksdhjfkksdfksjdfhkjsdhj";
        detector.setText(ascii4.getBytes());
        assertEquals("UTF-8 or ASCII", detector.detect().getName());
    }
}
