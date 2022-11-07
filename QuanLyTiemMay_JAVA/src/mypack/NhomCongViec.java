package mypack;

import java.util.ArrayList;

public class NhomCongViec {
	public String MaNhomCongViec;
	public String TenCongViec;
	public String MoTa;
	public NhomCongViec(){}
	public NhomCongViec(NhomCongViec ncv) {
		this.MaNhomCongViec = ncv.MaNhomCongViec;
		this.TenCongViec = ncv.TenCongViec;
		this.MoTa = ncv.MoTa;
		// TODO Auto-generated constructor stub
	}
	public NhomCongViec(String manhomcongviec,String tencongviec, String mota, ArrayList<CongViec> dsnhom_cv)
	{
		this.MaNhomCongViec = manhomcongviec;
		this.TenCongViec = tencongviec;
		this.MoTa = mota;
		this.dsNhomCongViec = dsnhom_cv;
	}
	public ArrayList<CongViec> dsNhomCongViec;

}
