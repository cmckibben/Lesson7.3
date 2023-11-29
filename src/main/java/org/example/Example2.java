package org.example;

import java.util.ArrayList;

public class Example2 {
  public static void main(String[] args) {
    //Create an ArrayList
    ArrayList<String> shoppingList = new ArrayList<String>();


    //Add ingredients missing for Chile Verde
    shoppingList.add("1.5 lbs tomatillos");
    shoppingList.add("2 poblano peppers");
    shoppingList.add("1 bunch cilantro");
    shoppingList.add("8 garlic cloves");
    shoppingList.add("2 jalapenos");
    shoppingList.add("3 pounds pork tenderloin");
    shoppingList.add("2 yellow onions");
    shoppingList.add("2 1/2 cups chicken stock");

    //Add a checkbox to each element
    for(int i = 0; i < shoppingList.size(); i++)
      shoppingList.set(i, "[ ] " + shoppingList.get(i));

    System.out.println("Your Shopping List contains:");
    for(String grocery : shoppingList)
      System.out.println("\t" + grocery);
  }
}
