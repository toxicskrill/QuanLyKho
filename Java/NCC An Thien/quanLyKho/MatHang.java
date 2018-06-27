package quanLyKho;
import java.util.Scanner;

public class MatHang {
	
	 private int id;
     private String ten;
     private int soLuong;
     private int dienTich;
     
     public MatHang() {
		// TODO Auto-generated constructor stub
	}
     
     public String toString() {
    	 return "MatHang("+" ID: "+id+" Ten: "+ten+" Dien Tich: "+dienTich+" So Luong: "+soLuong+')';
     }
     
    public void HienThi() {
   	     System.out.println("ID: " +id);
   	     System.out.println("Ten: " +ten);
   	     System.out.println("So Luong: " +soLuong);
    }
   
    public void Nhap() {
   	     Scanner Xuat = new Scanner(System.in);
   	     System.out.println("nhap ID: ");
   	     id=Integer.parseInt(Xuat.nextLine());
    }
     
	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getDienTich() {
		if(ten.equals("CPU")) {
			dienTich=2;
		}
		return dienTich;
	}

	public void setDienTich(int dienTich) {
		this.dienTich = dienTich;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public int getSoLuong() {
		return soLuong;
	}

}
