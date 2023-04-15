/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;
public class hocsinh {
    public String hoten;
    ArrayList<String> list =new ArrayList();
    public void nhap(int n){
        Scanner sc= new Scanner(System.in);
        for(int i=0;i<n;i++){
        hoten=sc.nextLine();
    }
        list.add(hoten);
    }
    public void xuat(int n){
        for(int i=0;i<n;i++){
            System.out.println(""+list);
        }
    }
    public void Sapxep(){
        Collections.sort(list);
    }

    
}
class main{
    public static void main(String[] args){
        
    }
}