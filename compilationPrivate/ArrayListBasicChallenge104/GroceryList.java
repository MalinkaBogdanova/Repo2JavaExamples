package ArrayListBasicChallenge104;

import java.util.ArrayList;

public class GroceryList {
    private ArrayList<String> groceryList = new ArrayList<>();

    public ArrayList<String> getGroceryList() {
        return groceryList;
    }

    public void setGroceryList(ArrayList<String> groceryList) {
        this.groceryList = groceryList;
    }

    public void getInputArrayList(String item) {
        groceryList.add(item);
    }

    public void printArrayList() {
        for (int i = 0; i < groceryList.size(); i++) {
            System.out.println("On position i=" + i + " " + groceryList.get(i));
        }
    }
}
