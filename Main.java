package edu.wctc;


import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    private static Scanner keyboard = new Scanner(System.in);
    private static PaintCalculator paintCalculator = new PaintCalculator();

    private static void printMenu() {
        System.out.println("Options");
        System.out.println("A,Add a Room");
        System.out.println("B,View Room");
        System.out.println("C,Read room from file");
        System.out.println("D,Write room to file");
        System.out.println("E,Exit Program");
    }
    private static double PromptforDimension(String dimensionName){
        System.out.println("Please enter dimension of the room " + dimensionName);
       String string = keyboard.nextLine();
       return Double.parseDouble(string);

    }
    private static void CreateRoom(){
        double length = PromptforDimension("length");
        double width = PromptforDimension("width");
        double height = PromptforDimension("height");
        paintCalculator.addRoom(width,height,length);
    }
    private static void ReadFile() {
        try (FileInputStream fis = new FileInputStream("paintcalculator.obj");
             ObjectInputStream ois = new ObjectInputStream(fis)) {
      paintCalculator = (PaintCalculator)ois.readObject();
        }
catch (IOException|ClassNotFoundException e){
    System.out.println("File cannot be found");
    }
    }
    private static void WriteFile(){
        try(FileOutputStream os = new FileOutputStream("paintcalculator.obj");
            ObjectOutputStream Os = new ObjectOutputStream(os)){
            Os.writeObject(paintCalculator);
    }
        catch (IOException e){
            System.out.println("Could not find the file");
    }
    }
        public static void main (String[]args){
        String Option = "r";
while(!Option.equals("E")){
    printMenu();
   Option = keyboard.nextLine();
   if(Option .equals("A")){
       CreateRoom();
   }
if(Option .equals("B")){
    System.out.println(paintCalculator);
}
if(Option .equals ("C")){
    ReadFile();
    System.out.println(paintCalculator);
}
if (Option .equals("D") ){
    WriteFile();
}
        }
    }
}