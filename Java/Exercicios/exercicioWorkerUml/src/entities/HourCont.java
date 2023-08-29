package entities;

import java.util.Date;

public class HourCont {
    public Date date;
    public double valuePerHour;
    public Integer hours;
    public Integer contractNumber;

    public HourCont(){

    }

    public HourCont(Date date, double valuePerHour, Integer hours, int contractNumber) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
        this.contractNumber = contractNumber;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValuePerHour() {
        return valuePerHour;
    }

    public void setValuePerHour(double valuePerHour) {
        this.valuePerHour = valuePerHour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getContractNumber() {
        return contractNumber;
    }


    public double totalValue(){
        return valuePerHour*hours;
    }
}
