package mypack;

public class CongViec {
	public String MaCongViec;
    public String MoTa;
    public String MaNhomCongViec ;
    public double ThoiGianLamViec ;
	public CongViec() {	}
	public CongViec(CongViec cv)
	{
		this.MaCongViec = cv.MaCongViec;
		this.MoTa = cv.MoTa;
		this.MaNhomCongViec = cv.MaNhomCongViec;
		this.ThoiGianLamViec = cv.ThoiGianLamViec;
	}
	public CongViec(String macongviec, String mota, String manhomcongviec, double thoigianlamviec, NhomCongViec nhom_congviec, Tho tho)
	{
		this.MaCongViec = macongviec;
		this.MoTa = mota;
		this.MaNhomCongViec = manhomcongviec;
		this.ThoiGianLamViec = thoigianlamviec;
		this.tho = tho;
	}
	public String getMaCongViec()
	{
		return MaCongViec;
	}
	public void setMaCongViec(String macongviec)
	{
		this.MaCongViec = macongviec;
	}
	public double getThoiGianLamViec()
	{
		return ThoiGianLamViec;
	}
	public void setMaTho(double thoigian)
	{
		this.ThoiGianLamViec = thoigian;
	}
	public Tho tho;
	public NhomCongViec nhom_congviec;
}
