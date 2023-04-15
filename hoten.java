
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
public class hoten {
    public static ArrayList<String> ht =new ArrayList<String>();

    public static void main(String[] args){
        int i;
        Scanner sc= new Scanner(System.in);
        System.out.println("1-nhập danh sách");
        System.out.println("2-xuất danh sách");
        System.out.println("3-sắp xếp danh sách");
        System.out.println("4-xoa theo ten");
        i=sc.nextInt();
        switch(i){
            case 1:
                nhapds();
                break;
            case 2:    
                 xuatds();
                 break;
            case 3:
                sapxepds();
                break;
            case 4:
                xoaten();
                break;
                
        }
        
    }

    private static void nhapds() {
        while(true){
            Scanner scanner =new Scanner(System.in);
        
        String x = scanner.nextLine();
        ht.add(x);
        System.out.print("Nhập thêm (Y/N)?" );
        if(scanner.nextLine().equals("n")){
        break;
}
    }
    }
    private static void xuatds() {
        for (String x:ht);
        System.out.println(ht);
    }

    private static void sapxepds() {
        System.out.println("danh sach sau khi dc sap xep ");
        Collections.sort(ht);
        xuatds();
}
    private static int timten(String x){
        int loca =-1;
        for(int i=0;i<ht.size();i++){
            if(ht.get(i).equalsIgnoreCase(x))
                loca=i;
        }
            return loca;
    }        
    private static void xoaten(){
        String x;
        Scanner sc=new Scanner(System.in);
        System.out.println("nhap ten can xoa");
        x=sc.nextLine();
        ht.remove(timten(x));
    }   
    }


