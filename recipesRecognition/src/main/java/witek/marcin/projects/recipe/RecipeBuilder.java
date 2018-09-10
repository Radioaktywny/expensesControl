package witek.marcin.projects.recipe;

public class RecipeBuilder {

    public static Recipe buildFromText(String text) {
        Recipe recipe = new Recipe();
        recipe.setPrize(text);
        return recipe;
    }
    
    public static Recipe emptyRecipe(){
        return new Recipe();
    }


}
