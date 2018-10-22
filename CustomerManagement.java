package baitap;

import baitap.Customer;
import java.util.Enumeration;
import java.util.Scanner;
import java.util.Vector;

public class CustomerManagement {
    
    Vector list = new Vector();
    public CustomerManagement(){
        while(true) {
            System.out.println("Quan ly danh sach Khach hang");
            System.out.println("1. Nhap danh sach Khach hang");
            System.out.println("2. Xem danh sach Khach hang");
            int n;
            Scanner key = new Scanner(System.in);
            System.out.println("Moi ban chon chuc nang:");
            n = key.nextInt();
            switch(n) {
            case 1: NhapTT();
                break;
            case 2: InTT();
		break;
	}
    }
    
}
    public void NhapTT() {
		Scanner key = new Scanner(System.in);
		int n;
		System.out.println("Nhap so luong Khach hang =");
		n =Integer.parseInt(key.nextLine());
		for(int i=0;i<n;i++) {
			System.out.println("Nhap ID =");
			String ID=key.nextLine();
			System.out.println("Nhap ten khach hang : ");
			String Name=key.nextLine();
			System.out.println("Nhap tuoi : ");
			int tuoi=Integer.parseInt(key.nextLine());
			System.out.println("So dien thoai lien lac : ");
                        String SDT=key.nextLine();	
                        System.out.println("Nhap gioi tinh : ");
			String GT=key.nextLine();
			Customer c = new Customer(Name,ID,SDT,tuoi,GT);
			list.add(c);
		}	
		
	}
    public void InTT() {
		Enumeration eCustomer = list.elements();
		int i=1;
		while(eCustomer.hasMoreElements()) {
			Customer Customer = (Customer)eCustomer.nextElement();
			System.out.println("ID = "+Customer.getID()+" va Ten Khach hang la : "+Customer.getName());
		}
	}
	public static void main(String[] args) {
            
		new CustomerManagement();
	}

}
