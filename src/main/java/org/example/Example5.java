package org.example;

import java.util.ArrayList;

public class Example5 {
  public static void main(String[] args) {
    //Create an ArrayList
    ArrayList<String> shoppingList = new ArrayList<String>();


    //Add ingredients missing for Chile Verde
    shoppingList.add("[x] 1.5 lbs tomatillos");
    shoppingList.add("[ ] 2 poblano peppers");
    shoppingList.add("[x] 1 bunch cilantro");
    shoppingList.add("[ ] 8 garlic cloves");
    shoppingList.add("[x] 2 jalapenos");
    shoppingList.add("[ ] 3 pounds pork tenderloin");
    shoppingList.add("[x] 2 yellow onions");
    shoppingList.add("[ ] 2 1/2 cups chicken stock");

    shoppingList.removeIf(e -> e.startsWith("[x]"));

    System.out.println("Your Shopping List contains:");
    for(String grocery : shoppingList)
      System.out.println("\t" + grocery);
  }
}
