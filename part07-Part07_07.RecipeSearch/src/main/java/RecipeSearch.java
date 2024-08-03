import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;

public class RecipeSearch {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("File to read: ");
        String fileName = scanner.nextLine();

        ArrayList<Recipe> recipes = readRecipesFromFile(fileName);

        while (true) {
            System.out.println("\nCommands:");
            System.out.println("list - lists the recipes");
            System.out.println("stop - stops the program");
            System.out.println("find name - searches recipes by name");
            System.out.println("find cooking time - searches recipes by cooking time");
            System.out.println("find ingredient - searches recipes by ingredient");

            System.out.print("Enter command: ");
            String command = scanner.nextLine();

            if (command.equals("stop")) {
                break;
            }

            if (command.equals("list")) {
                listRecipes(recipes);
            } else if (command.equals("find name")) {
                System.out.print("Searched word: ");
                String searchedName = scanner.nextLine();
                findRecipesByName(recipes, searchedName);
            } else if (command.equals("find cooking time")) {
                System.out.print("Max cooking time: ");
                int maxTime = Integer.parseInt(scanner.nextLine());
                findRecipesByCookingTime(recipes, maxTime);
            } else if (command.equals("find ingredient")) {
                System.out.print("Ingredient: ");
                String ingredient = scanner.nextLine();
                findRecipesByIngredient(recipes, ingredient);
            }
        }
    }

    public static ArrayList<Recipe> readRecipesFromFile(String fileName) {
        ArrayList<Recipe> recipes = new ArrayList<>();
        try (Scanner fileScanner = new Scanner(Paths.get(fileName))) {
            while (fileScanner.hasNextLine()) {
                String name = fileScanner.nextLine();
                int cookingTime = Integer.parseInt(fileScanner.nextLine());
                Recipe recipe = new Recipe(name, cookingTime);

                while (fileScanner.hasNextLine()) {
                    String line = fileScanner.nextLine();
                    if (line.isEmpty()) {
                        break;
                    }
                    recipe.addIngredient(line);
                }

                recipes.add(recipe);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return recipes;
    }

    public static void listRecipes(ArrayList<Recipe> recipes) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            System.out.println(recipe);
        }
    }

    public static void findRecipesByName(ArrayList<Recipe> recipes, String name) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getName().toLowerCase().contains(name.toLowerCase())) {
                System.out.println(recipe);
            }
        }
    }

    public static void findRecipesByCookingTime(ArrayList<Recipe> recipes, int maxTime) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getCookingTime() <= maxTime) {
                System.out.println(recipe);
            }
        }
    }

    public static void findRecipesByIngredient(ArrayList<Recipe> recipes, String ingredient) {
        System.out.println("Recipes:");
        for (Recipe recipe : recipes) {
            if (recipe.getIngredients().contains(ingredient)) {
                System.out.println(recipe);
            }
        }
    }
}
