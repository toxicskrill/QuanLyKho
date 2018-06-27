package quanLyKho;

import java.util.ArrayList;
import java.util.Scanner;


public class KhoHang {
	
	private int id;
	private String ten;
	private int DienTich;
	private int SoKhu;
	private ArrayList<KhuVuc> ListKhu;
	private ArrayList<PhieuXuat> ListPX;
	 
	public void HienThi() {
		 System.out.println("ID: " +id);
		 System.out.println("Ten: " +ten);
		 System.out.println("Dien Tich: " +DienTich);
		 System.out.println("So Khu: " +SoKhu);
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return "kho(" + "id: "+ id +" ten: "+ten+" DienTich: "+DienTich+" SoKhu: "+ SoKhu +" ListKhu "+ListKhu+')';
	}
	
	public void Nhap() {
		Scanner nhap = new Scanner(System.in);
		System.out.println("nhap ID: ");
		id=Integer.parseInt(nhap.nextLine());
		System.out.println("nhap Ten: ");
		ten=nhap.nextLine();
		System.out.println("nhap Dien Tich: ");
		DienTich=Integer.parseInt(nhap.nextLine());
		System.out.println("nhap So Khu");
		SoKhu=Integer.parseInt(nhap.nextLine());

	}
	
	public KhoHang() {
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTen() {
		return ten;
	}

	public void setTen(String ten) {
		this.ten = ten;
	}

	public int getDienTich() {
		return DienTich;
	}

	public void setDienTich(int dienTich) {
		DienTich = dienTich;
	}

	public int getSoKhu() {
		return SoKhu;
	}

	public void setSoKhu(int soKhu) {
		SoKhu = soKhu;
	}
	public void setListKhu(ArrayList<KhuVuc> listKhu) {
		ListKhu = listKhu;
	}
	
	public ArrayList<KhuVuc> getListKhu() {
		return ListKhu;
	}

	public ArrayList<PhieuXuat> getListPX() {
		return ListPX;
	}

	public void setListPX(ArrayList<PhieuXuat> listPX) {
		ListPX = listPX;
	}
}
