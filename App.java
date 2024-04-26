import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Recipe {
    private String name;
    private List<String> ingredients;
    private String instructions;

    public Recipe(String name, List<String> ingredients, String instructions) {
        this.name = name;
        this.ingredients = ingredients;
        this.instructions = instructions;
    }

    public String getName() {
        return name;
    }

    public List<String> getIngredients() {
        return ingredients;
    }

    public String getInstructions() {
        return instructions;
    }

    @Override
    public String toString() {
        return name;
    }
}

class RecipeManager {
    private List<Recipe> recipes;

    public RecipeManager() {
        recipes = new ArrayList<>();
    }

    public void addRecipe(Recipe recipe) {
        recipes.add(recipe);
    }

    public List<Recipe> getAllRecipes() {
        return recipes;
    }
}

public class test2 {
    public static void main(String[] args) {
        // Sample recipes
        Recipe recipe1 = new Recipe("Pasta Carbonara", Arrays.asList("Pasta", "Eggs", "Bacon", "Parmesan Cheese"), "1. Cook pasta.\n2. Fry bacon.\n3. Mix eggs and cheese.\n4. Combine all ingredients.");
        Recipe recipe2 = new Recipe("Vegetable Stir-Fry", Arrays.asList("Broccoli", "Carrots", "Bell Peppers", "Soy Sauce"), "1. Stir-fry vegetables.\n2. Add soy sauce.\n3. Serve hot.");

        // Creating Recipe Manager
        RecipeManager recipeManager = new RecipeManager();
        recipeManager.addRecipe(recipe1);
        recipeManager.addRecipe(recipe2);

        // Displaying all recipes
        List<Recipe> allRecipes = recipeManager.getAllRecipes();
        System.out.println("All Recipes:");
        for (Recipe recipe : allRecipes) {
            System.out.println(recipe.getName());
        }
    }
}
