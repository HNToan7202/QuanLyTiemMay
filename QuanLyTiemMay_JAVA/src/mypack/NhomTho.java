package mypack;

import java.util.ArrayList;

public class NhomTho {
	public String MaNhomTho;
	public String TenNhom;
	public String MoTa;
	public String MaTruongNhom;
	public NhomTho() {}
	public NhomTho(NhomTho nt) {
		this.MaNhomTho = nt.MaNhomTho;
		this.TenNhom = nt.TenNhom;
		this.MoTa = nt.MoTa;
		this.MaTruongNhom = nt.MaTruongNhom;
	}
	public NhomTho(String MaNhomTho,String TenNhom, String MoTa, String MaTruongNhom, ArrayList<Tho> dsTho)
	{
		this.MaNhomTho = MaNhomTho;
		this.TenNhom = TenNhom;
		this.MoTa = MoTa;
		this.MaTruongNhom = MaTruongNhom;
		this.dsTho = dsTho;
	}
	public ArrayList<Tho> dsTho;
	public Tho TruongNhom;

}
