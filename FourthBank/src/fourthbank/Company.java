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
    private List<Employee> employees = new ArrayList<Employee>();

    public Company(String name, String website) {
        this.name = name;
        this.website = website;
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
    
    public void employeeList(){
        System.out.println("\nName\t\t\tStatus\t\tHours\tRate\tWeekly Payment\tReward");
        System.out.println("------------------------------------------------------------------------------");
        
        for(int i = 0; i < this.employees.size(); i++)
            System.out.println(i + ". " + this.employees.get(i).getName() + "\t\t" + 
                    this.employees.get(i).getStatusToString() + "\t\t" + 
                    this.employees.get(i).getHour() + "\t" + 
                    this.employees.get(i).getRate() + "\t" + 
                    this.employees.get(i).getWeeklyPayAmount(this.employees.get(i)) + "\t\t" +
                    this.employees.get(i).getRewardToString(this.employees.get(i)));
        
        System.out.println("------------------------------------------------------------------------------\n");
    }
}
