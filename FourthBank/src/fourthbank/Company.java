/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourthbank;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author livia
 */
public class Company {
    private String name;
    private String website;
    private List<Employee> employees;

    public Company(String name, String website) {
        this.name = name;
        this.website = website;
        this.employees = new ArrayList<Employee>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public List<Employee> getEmployees() {
        return employees;
    }

    public void setEmployees(List<Employee> employees) {
        this.employees = employees;
    }
    
    public void addEmpolyee(Employee employee){
        this.employees.add(employee);
    }
    
    public void giveRewardEmployees() {
        for(int i = 0; i < this.employees.size(); i++) {
            this.employees.get(i).setIsRewarded(true);
        }
    }
    
    public void employeeList(){
        Employee employee;
        
        System.out.println("\nName\t\tStatus\t\tHours\tRate\tWeekly Payment");
        System.out.println("------------------------------------------------------------------------------");
        
        for(int i = 0; i < this.employees.size(); i++) {
            employee = this.employees.get(i);
        
            System.out.println(
                    i + ". " + employee.getName() + "\t\t" + 
                    employee.contractTypeToString() + "\t\t" + 
                    employee.getHour() + "\t" + 
                    employee.getRate() + "\t" + 
                    "$" + String.format("%1$,.2f", employee.calculateWeeklyPayment()) + 
                        (employee.getIsRewarded() ? "*" : "") + "\t\t"
            );
        }
        
        System.out.println("------------------------------------------------------------------------------\n");
    }
}
