package mypack;

public class NhanVien {
	public String manhanvien; //pk
    public String tennhanvien; 
    public String diachi ;
    public String sodienthoai;
    public String maphongban;//fk
    public PhongBan pban;
	public NhanVien() {
		
	}
	public NhanVien(NhanVien nv) {
		this.manhanvien = nv.manhanvien;
        this.tennhanvien = nv.tennhanvien;
        this.diachi = nv.diachi;
        this.sodienthoai = nv.sodienthoai;
	}
	public NhanVien(String manhanvien, String tennhanvien, String diachi, String sodienthoai, String maphongban, PhongBan pban)
    {
        this.manhanvien = manhanvien;
        this.tennhanvien = tennhanvien;
        this.diachi = diachi;
        this.sodienthoai = sodienthoai;
        this.maphongban = maphongban;
        this.pban = pban;
    }
}
