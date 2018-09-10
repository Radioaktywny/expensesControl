package witek.marcin.projects.recipe.ocr;

import witek.marcin.projects.recipe.Recipe;

import java.io.File;

public interface RecipeTextRecognition {
    
    Recipe doOcr(File file);
    
}
