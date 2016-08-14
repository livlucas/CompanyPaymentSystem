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
    private static final Double WEEKLY_HOURS = 40.0;
    private static final Double REWARD_BONUS = 1.1;
    private static final Double OVERTIME_BONUS = 2.0;
    
    private Double rate;
    private Double hour;
    private Boolean isRewarded;
    private Boolean contractType;

    public Salary(Double hour, Double rate, Boolean isRewarded, Boolean contractType) {
        this.rate = rate;
        this.hour = hour;
        this.isRewarded = isRewarded;
        this.contractType = contractType;
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
    
    public Boolean getContractType() {
        return contractType;
    }

    public void setContractType(Boolean contractType) {
        this.contractType = contractType;
    }

    public Boolean getIsRewarded() {
        return isRewarded;
    }

    public void setIsRewarded(Boolean isRewarded) {
        if (this.isSalaried()) {
            this.isRewarded = isRewarded;
        } else {
            this.isRewarded = false;
        }
    }
        
    //new version    
    public Boolean isSalaried() {
        return !this.contractType;
    }
    
    public Double getOvertimeHours() {
        if (this.hour <= WEEKLY_HOURS) {
            return 0.0;
        }
        
        return this.hour - WEEKLY_HOURS;
    }
    
    public Double calculateWeeklyPayment() {
        double amount, overtime;

        if (this.isSalaried()) { //assalaried contract
            amount = WEEKLY_HOURS * this.rate;
            
            if (this.isRewarded) {
                amount *= REWARD_BONUS;
            }
        } else { //hourly contract
            overtime = this.getOvertimeHours() * this.rate * OVERTIME_BONUS;
            amount = (Math.min(this.hour, WEEKLY_HOURS) * this.rate) + overtime;            
        }

        return amount;
    }
    
    public String contractTypeToString() {
        return this.isSalaried() ? "Salaried" : "Hourly";
    }
}
