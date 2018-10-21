package baitap;

import java.util.Scanner;

public class Customer {
    String Name;
    String ID;
    String GT;
    String SDT;
    int tuoi;
    
    public String getGT() {
        return GT;
    }
    
    public void setGT(String GT) {
        this.GT = GT;
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getSDT() {
        return SDT;
    }

    public void setSDT(String SDT) {
        this.SDT = SDT;                
    }
    
    public int gettuoi() {
        return tuoi;
    }

    public void settuoi(int tuoi) {
        this.tuoi = tuoi;                
    }
    public Customer(String Name,String ID,String SDT,int tuoi,String GT){
        this.Name=Name;
        this.ID=ID;
        this.SDT=SDT;
        this.tuoi=tuoi; 
        this.GT=GT;
    }
}
