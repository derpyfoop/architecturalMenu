package com.mycompany.architecturalmenu;

import java.util.Scanner;

public class ArchitecturalMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int userChoice, modelChoice;
        double houseSizeSqFt, rate, total = 0.00;
        final double electricalDrawing = 2650.00, foundationPlan = 900.00, roofPlan = 1400.00;
        String drawingChoice;
        
        System.out.println("Architectural Drafts Inc");
        System.out.println("Service 1 - House Design");
        System.out.println("Service 2 - 3D Model");
        System.out.println("Service 3 - Construction Drawings");
        System.out.println("Choose your option using numbers 1,2,3:");
        
        userChoice = input.nextInt();
        
        switch(userChoice) {
            case 1:
                System.out.println("Architectural Drafts Inc");
                System.out.println("Enter house size in square feet:");
                
                houseSizeSqFt = input.nextDouble();
                
                if(houseSizeSqFt < 1000) {
                    rate = 1.00;
                } else if(houseSizeSqFt < 2500){
                    rate = 1.25;
                } else {
                    rate = 1.50;
                }
                
                total = rate * houseSizeSqFt;
                
                System.out.printf("Your total is $%.2f", total);
                break;
            case 2:
               System.out.println("Architectural Drafts Inc");
                System.out.println("Option 1 - Front View Image - $500.00");
                System.out.println("Option 2 - External View Video - $1400.00");
                System.out.println("Option 3 - Walk Through Video - 4300.00");
                System.out.println("Choose your model type from the list above using number 1,2,3:");
                
                modelChoice = input.nextInt();
                
                switch(modelChoice) {
                    case 1:
                        System.out.println("You have chosen option 1, Front View Image, costing $500.00");
                        break;
                    case 2:
                        System.out.println("You have chosen option 2, External View Image, costing $1400.00");
                        break;
                    case 3:
                        System.out.println("You have chosen option 3, Walk Through Video, costing $4300.00");
                        break;
                    default:
                        System.out.println("Invalid option, please try again using numbers 1,2,3.");
                }
                break;
            case 3:
                System.out.println("Architectural Drafts Inc");
                System.out.println("Option 1 - Electrical Drawing - $2650.00");
                System.out.println("Option 2 - Foundation Plan - $900.00");
                System.out.println("Option 3 - Roof Plan - $1400.00");
                System.out.println("Select your option(s) form the list above number separated by commas (e.g. 1,2,3):");
                
                drawingChoice = input.next();
                
                /*created an array to house the separate selections individually from the
                drawingChoice string using .split() to separate the choices
                at the commas*/
                String[] drawingArray = drawingChoice.split(",");
                
                //loop to go through each element in the array by using "i"
                for(int i = 0; i < drawingArray.length; i++) {
                    //created new string to assign each element of the drawingArray to as "i" loops through them.
                    String choice = drawingArray[i];
                    
                    switch(choice) {
                        case "1":
                            total += electricalDrawing;
                            break;
                        case "2":
                            total += foundationPlan;
                            break;
                        case "3":
                            total += roofPlan;
                            break;
                        default:
                            System.out.println("Invalid option, " + choice + ", please use numbers 1,2,3.");
                            break;
                    }
                }
                System.out.printf("Your total is $%.2f", total);
                break;
            default:
                System.out.println("Invalid option, please try again using numbers 1,2,3.");
                break;
        }
    input.close();
    }
}
