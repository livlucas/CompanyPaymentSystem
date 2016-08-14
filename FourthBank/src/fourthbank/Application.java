/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourthbank;

import java.util.Scanner;

/**
 *
 * @author livia
 */
public class Application {
    private Company company = new Company("Fourth Bank", "www.fourthbank.io");
    
    public void startApplication(){
        Scanner keyboard = new Scanner(System.in);
        int option = 0;
        
        System.out.println("Welcome to " + this.company.getName() + "\n");
     
        while(option != 5){
            printMenu();
            option = keyboard.nextInt();
            
            switch(option){
                case 1:
                    addEmployee();
                    break;
                
                case 2:
                    this.company.employeeList();
                    break;
                    
                case 3:
                    this.company.giveRewardEmployees();
                    System.out.println("Salaried employees rewarded.");
                    break;
                    
                case 5:
                    System.out.println("Are you sure you want to exit?");
                    System.out.println("(0-No/5-Yes): ");
                    option = keyboard.nextInt();
                    break;
                    
                default:
                    System.out.println("Invalid Option.");
            }
        }
    }
    
    private void printMenu(){
        System.out.println("==== " + this.company.getName() + " System ====");
        System.out.println(" 1. Add Employee");
        System.out.println(" 2. List Employees");
        System.out.println(" 3. Reward Employee");
        System.out.println("  . --------------");
        System.out.println(" 5. Exit");
        System.out.print  (" Option: ");
    }
    
    private void addEmployee(){
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("=== Add Employee ===");
                    
        System.out.print("Name: ");
        String name = keyboard.nextLine();

        System.out.print("Status (0-Salary/1-Hourly): ");
        Boolean status = keyboard.nextInt() == 1;

        System.out.print("Rate: ");
        Double rate = keyboard.nextDouble();

        System.out.print("Hour: ");
        Double hour = keyboard.nextDouble();
        
        
        
        this.company.addEmpolyee(new Employee(name, "email@example.com", "(415) 342 7670", hour, rate, false, status));
    }
}
