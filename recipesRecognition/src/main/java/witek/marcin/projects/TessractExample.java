package witek.marcin.projects;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import net.sourceforge.tess4j.util.LoadLibs;

import java.io.File;

public class TessractExample {
    
    private void testEng(){
        String pathToJpg = "C:\\prywatne\\expensesControl\\recipesRecognition\\src\\main\\resources\\ocr-test.jpg";
        File imageFile = new File(pathToJpg);
        ITesseract instance = new Tesseract();
        String tessDataFolder = LoadLibs.extractTessResources("tessdata").getAbsolutePath();
        instance.setDatapath(tessDataFolder);
        try {
            String string = instance.doOCR(imageFile);
            System.out.println(string);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }
    
    private void testPolish(){
        String pathToJpg = "C:\\prywatne\\expensesControl\\recipesRecognition\\src\\main\\resources\\ocr-test-pl.jpg";
        File imageFile = new File(pathToJpg);
        ITesseract instance = new Tesseract();
        String tessDataFolder = LoadLibs.extractTessResources("tessdata").getAbsolutePath();
        instance.setLanguage("pol");
        instance.setDatapath(imageFile.getParent());
        try {
            String string = instance.doOCR(imageFile);
            System.out.println(string);
        } catch (TesseractException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        TessractExample tessractExample = new TessractExample();
        tessractExample.testEng();
        tessractExample.testPolish();

    }

}
