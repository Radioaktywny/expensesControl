package witek.marcin.projects.recipe.ocr;

import net.sourceforge.tess4j.ITesseract;
import net.sourceforge.tess4j.Tesseract;
import net.sourceforge.tess4j.TesseractException;
import witek.marcin.projects.recipe.Recipe;
import witek.marcin.projects.recipe.RecipeBuilder;

import java.io.File;

public class PolishRecipeTextRecognition implements RecipeTextRecognition {

    private final ITesseract tess4j;

    public PolishRecipeTextRecognition() {
        tess4j = initTess4j();
    }

    private ITesseract initTess4j() {
        ITesseract tess4j;
        tess4j = new Tesseract();
        tess4j.setLanguage("pol");
        tess4j.setDatapath(getPathToThePolishDataPath());
        return tess4j;
    }

    private String getPathToThePolishDataPath() {
        ClassLoader classLoader = getClass().getClassLoader();
        File polishTrainedData = new File(classLoader.getResource("pol.traineddata").getFile());
        return polishTrainedData.getParent();
    }

    @Override
    public Recipe doOcr(File file) {
        try {
            return RecipeBuilder.buildFromText(tess4j.doOCR(file));
        } catch (TesseractException e) {
            System.out.println("Cannot do OCR on file caused by" + e.getMessage());
            return RecipeBuilder.emptyRecipe();
        }
    }
}
