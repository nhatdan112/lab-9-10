/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
import java.util.Scanner;
import java.util.ArrayList;
public class list {
    
    public double x;
    ArrayList<Double> list= new ArrayList();
    Scanner sc=new Scanner(System.in);
    public void nhap(int n){
        while(true){
        Double x = sc.nextDouble();
        list.add(x);
        System.out.print("Nhập thêm (Y/N)?" );
        if(sc.nextLine().equals("N")){
        break;
}
} 
    }
    public void xuat(){
        for(int i=0;i<list.size();i++){
            System.out.println(list.get(i).toString());
        }
    }
}


