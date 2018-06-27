package quanLyKho;

import java.util.Scanner;

public class CPU extends MatHang{
	
    private int tocDoXuLy;
     
    public CPU() {
		super();
	}
    
    public void HienThi() {
    	 System.out.println("ID: " +super.getId());
  	     System.out.println("Ten: " +super.getTen());
  	     System.out.println("Dien Tich" +super.getDienTich());
  	     System.out.println("Toc Do Xu Ly: " +tocDoXuLy);
    }
    
    public void Nhap() {
         Scanner Xuat = new Scanner(System.in);
  	     System.out.println("Toc Do Xu Ly: ");
  	     tocDoXuLy=Integer.parseInt(Xuat.nextLine());
    }

	public int getTocDoXuLy() {
		return tocDoXuLy;
	}

	public void setTocDoXuLy(int tocDoXuLy) {
		this.tocDoXuLy = tocDoXuLy;
	}
}
