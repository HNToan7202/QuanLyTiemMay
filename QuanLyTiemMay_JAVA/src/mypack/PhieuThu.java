package mypack;

public class PhieuThu {
	public String sophieu ;//pk
    public String ngay ;
    public int sotien ;
    public String ten ;
    public String sohopdong ;//fk
	public PhieuThu() {
		// TODO Auto-generated constructor stub
	}
	public PhieuThu(PhieuThu pt)
    {
        this.sophieu = pt.sophieu;
        this.ngay = pt.ngay;
        this.sotien = pt.sotien;
        this.ten = pt.ten;
        this.sohopdong = pt.sohopdong;
    }
    public PhieuThu(String sophieu, String ngay, int sotien, 
        String ten, String sohopdong)
    {
        this.sophieu = sophieu;
        this.ngay = ngay;
        this.sotien = sotien;
        this.ten = ten;
        this.sohopdong = sohopdong;
    }
}
