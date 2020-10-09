package com.codecool.wasterecycling;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
            System.out.print("Welcome to the Codecool's waste recycling programme!");
            System.out.print("Enter a color for your dustbin.");
            Scanner userInput = new Scanner(System.in);
            String dustbinName = userInput.next();
            Dustbin dustbin = new Dustbin(dustbinName);
            Garbage[] garbage = new Garbage[3];
            for (int i = 0; i < 3; i++) {
                    System.out.print("Great, now please enter a type of garbage to throw away from the options below!");
                    System.out.println(
                            "1. Plastic;\n" +
                                    "2. Paper;\n" +
                                    "3. House waste;\n");
                    int garbageOption = userInput.nextInt();
                    if (garbageOption == 1){
                            String plasticGarbageName;
                            boolean clean;
                            System.out.print("Please enter a name for your plastic garbage!");
                            plasticGarbageName = userInput.next();
                            System.out.print("Please specify if the" + " " + plasticGarbageName + " " + "is clean from the options below.");
                            System.out.println(
                                    "1. Clean;\n" +
                                            "2. Not clean;\n");
                            int plasticCleanOption = userInput.nextInt();
                            if(plasticCleanOption == 1){
                                    clean = true;
                            }else {
                                    clean = false;
                            }
                            PlasticGarbage plasticGarbage = new PlasticGarbage(plasticGarbageName, clean);
                            garbage[0] = plasticGarbage;
                    } else if (garbageOption == 2){
                            String paperGarbageName;
                            boolean squeezed;
                            System.out.print("Please enter a name for your paper garbage!");
                            paperGarbageName = userInput.next();
                            System.out.print("Please specify if the" + " " + paperGarbageName + " " + "is squeezed from the options below.");
                            System.out.println(
                                    "1. Squeezed;\n" +
                                            "2. Not squeezed;\n");
                            int squeezedCleanOption = userInput.nextInt();
                            if(squeezedCleanOption == 1){
                                    squeezed = true;
                            }else {
                                    squeezed = false;
                            }
                            PaperGarbage paperGarbage = new PaperGarbage(paperGarbageName, squeezed);
                            garbage[1] = paperGarbage;

                    } else {
                            String houseWasteName;
                            System.out.print("Please enter a name for your house waste!");
                            houseWasteName = userInput.next();
                            Garbage houseWaste = new Garbage(houseWasteName);
                            garbage[2] = houseWaste;
                    }
            }
            System.out.print("Great, now let's throw away the garbage, just press X.");
            String throwAway = userInput.next();
            if (throwAway == "x" || throwAway == "X"){
                    Dustbin.throwOutGarbage(garbage);
                    System.out.print("Nice job!");
            }
    }
}
