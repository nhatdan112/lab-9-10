/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nhatm
 */
import java.util.Scanner;
public class Sanpham {
    public String tensp;
    public double dongia;
    public double giamgia;
    
public void nhap(){
    Scanner sc= new Scanner(System.in);
    System.out.println("hay nhap ten san pham");
    tensp=sc.nextLine();
    System.out.println("hay nhap don gia");
    dongia=sc.nextDouble();
    System.out.println("hay nhap muc gia giam");
    giamgia=sc.nextDouble();
}
public void xuat(){
    System.out.println("ten san pham la: "+tensp);
    System.out.println("don gia san pham la "+dongia);
    System.out.println("muc giam gia la "+giamgia);
}
public double getThuenhapkhau(){
    double nhapkhau=(dongia*10)/100;
    System.out.println("thue nhap khau la"+nhapkhau);
    return nhapkhau;
}

    public Sanpham(String tensp, double dongia, double giamgia) {
        this.tensp = tensp;
        this.dongia = dongia;
        this.giamgia = giamgia;
    }
    public Sanpham() {
    }
    public Sanpham(String tensp, double dongia) {
        this.tensp = tensp;
        this.dongia = dongia;
    }
}
class main{
public static void main(String[] args){
   Sanpham sp=new Sanpham();
   sp.nhap();
   sp.getThuenhapkhau();
   sp.xuat();
}
}

