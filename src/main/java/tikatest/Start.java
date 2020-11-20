package tikatest;

import org.apache.tika.parser.txt.CharsetDetector;

public class Start {

    public static void main(String[] args) {
        CharsetDetector detector = new CharsetDetector();
        String ascii = "Only ascii Visible:a;Invisible:GUID\nX;XXddd\n";
        detector.setText(ascii.getBytes());
        System.out.println("detected charset: " + detector.detect().getName());
        String ascii2 = "Only ascii plain english text";
        detector.setText(ascii2.getBytes());
        System.out.println("detected charset: " + detector.detect().getName());
        String ascii3 = "this is ISO-8859-2 do not know why";
        detector.setText(ascii3.getBytes());
        System.out.println("detected charset: " + detector.detect().getName());
        String ascii4 = "this is UTF-8 but tell me why o why maybe sdlkfjlksdjlkfjlksdjflkjlskdjflkjsdjkflkdsjlkfjldsjlkfjldkjkfljdlkjsdfhjshdkjfhjksdhjfkksdfksjdfhkjsdhj";
        detector.setText(ascii4.getBytes());
        System.out.println("detected charset: " + detector.detect().getName());
    }

}
