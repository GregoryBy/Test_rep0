package org.example;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

System.out.printf("Second commit");
 Cat firstCat = new Cat("Барсик", 2, "рыжий");
        Cat secondCat = new Cat("Мурзик", 4, "чёрный");
System.out.println("Данные первого кота:" + firstCat.getAge()+ "," + firstCat.getColor() + "," + secondCat.getName());
        System.out.println("Данные второго кота:" + secondCat.getAge()+ "," + secondCat.getColor() + "," + firstCat.getName());
}}
