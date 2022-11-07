package mypack;

import java.util.ArrayList;

public class Tho {
	public String MaTho;
	public String HoTen;
	public String DiaChi;
	public String SoDienThoai;
	public String MaNhomTho;
	public boolean GioiTinh;
	public Tho() {}

	public Tho(Tho th) {
		this.MaTho = th.MaTho;
		this.HoTen = th.HoTen;
		this.DiaChi = th.DiaChi;
		this.SoDienThoai = th.SoDienThoai;
		this.MaNhomTho = th.MaNhomTho;
		this.GioiTinh = th.GioiTinh;
		// TODO Auto-generated constructor stub
	}
	public Tho(String matho, String hoten, String diachi, NhomTho nt,
            String sodienthoai, String manhomtho, ArrayList<CongViec> dscongviec, boolean gioitinh) {
		this.MaTho = matho;
		this.HoTen = hoten;
		this.DiaChi = diachi;
		this.SoDienThoai = sodienthoai;
		this.MaNhomTho = manhomtho;
		this.NhomTho = nt;
		this.dsCongViec = dscongviec;
		this.GioiTinh = gioitinh;
	}
	public String getMaTho()
	{
		return MaTho;
	}
	public void setMaTho(String maTho)
	{
		this.MaTho = maTho;
	}
	public String getMaNhomTho()
	{
		return MaNhomTho;
	}
	public void setMaNhomTho(String maNhomTho)
	{
		this.MaNhomTho = maNhomTho;
	}
	public String getHoTen()
	{
		return HoTen;
	}
	public void setHoTen(String hoTen)
	{
		this.HoTen = hoTen;
	}
	public String getDiaChi()
	{
		return DiaChi;
	}
	public void setDiaChi(String diaChi)
	{
		this.DiaChi = diaChi;
	}
	public String getSoDienThoai()
	{
		return SoDienThoai;
	}
	public void setSoDienThoai(String soDienThoai)
	{
		this.SoDienThoai = soDienThoai;
	}
	public NhomTho getNhomTho()
	{
		return NhomTho;
	}
	public void setNhomTho(NhomTho nhomTho)
	{
		this.NhomTho = nhomTho;
	}
	public NhomTho NhomTho;
	public ArrayList<CongViec> dsCongViec;
}
