/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fourthbank;

/**
 *
 * @author livia
 */
public class Employee extends Salary {
    private String name;
    private String email;
    private String phone;

    public Employee(String name, String email, String phone, Double hour, Double rate, Boolean isRewarded, Boolean contractType) {
        super(hour, rate, isRewarded, contractType);
        this.name = name;
        this.email = email;
        this.phone = phone;
    }
    
    public Employee(Double hour, Double rate, Boolean isRewarded, Boolean contractType) {
        super(hour, rate, isRewarded, contractType);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }
}
