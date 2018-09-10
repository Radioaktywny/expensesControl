package witek.marcin.projects;

import witek.marcin.projects.recipe.Recipe;
import witek.marcin.projects.recipe.ocr.PolishRecipeTextRecognition;
import witek.marcin.projects.recipe.ocr.RecipeTextRecognition;

import java.io.File;
import java.net.URISyntaxException;

public class TessractExample {


    public static void main(String[] args) throws URISyntaxException {
        RecipeTextRecognition recipeTextRecognition = new PolishRecipeTextRecognition();
        final Recipe recipe = recipeTextRecognition.doOcr(new File(ClassLoader.getSystemResource("ocr-test-pl.jpg").toURI()));
        System.out.println(recipe);
    }

}
