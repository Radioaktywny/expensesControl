package witek.marcin.projects;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;

import java.io.File;

public class TessractExample {

    public static void main(String[] args) {
        File imageFile = new File("C:\\prywatne\\expensesControl\\recipesRecognition\\src\\main\\resources\\ocr-test.jpg");
        ITesseract instance = new Tesseract();

        try {
            String string = instance.doOCR(imageFile);
            System.out.println(string);
        } catch (TesseractException e) {
            e.printStackTrace();
        }

    }
    
}
