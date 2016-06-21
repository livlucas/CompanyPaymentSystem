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
public class Salary {
    private Double rate;
    private Double hour;
    private Double reward;
    private Boolean status;

    public Salary(Double hour, Double rate, Double reward, Boolean status) {
        this.rate = rate;
        this.hour = hour;
        this.reward = reward;
        this.status = status;
    }

    public Double getRate() {
        return rate;
    }

    public void setRate(Double rate) {
        this.rate = rate;
    }

    public Double getHour() {
        return hour;
    }

    public void setHour(Double hour) {
        this.hour = hour;
    }
    
    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Double getReward() {
        return reward;
    }

    public void setReward(Double reward) {
        this.reward = reward;
    }
    
    public String getStatusToString(){
        return this.status ? "Hourly" : "Salary";
    }
    public String getWeeklyPayAmount(Employee e){
    double amount, overtime, weeklyHours = 40; //weeklyHours should be a constant
 
    if (this.reward != 0) {
        amount = (e.getRate() * e.getHour()) * 0.10;
    } else if (!this.status) {
        if (getHour() <= weeklyHours) {
            amount = e.getRate() * e.getHour();
        } else {
            overtime = (e.getHour() - weeklyHours) * e.getRate() * 2;
            amount = (weeklyHours * e.getRate()) + overtime;
        }
    } else {
        amount = e.getRate() * weeklyHours;
    }
 
    return "$" + amount;
}
    
    public String getRewardToString(Employee e){
        return e.getReward() != 0 ? "Yes" : "No";
    }
}
