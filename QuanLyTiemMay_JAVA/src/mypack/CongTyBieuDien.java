package mypack;

import java.util.ArrayList;

public class CongTyBieuDien {
	public String maCongTy ;
    public String tenCongTy ;
    public String diaChi ;
    public ArrayList<NgheSi> dsCasi ;
	public CongTyBieuDien() {
		// TODO Auto-generated constructor stub
	}
	public CongTyBieuDien (CongTyBieuDien congty)
    {
        this.maCongTy = congty.maCongTy;
        this.tenCongTy = congty.tenCongTy;
        this.diaChi = congty.diaChi;
    }
    public CongTyBieuDien (String maCongTy, String tenCongTy, String diaChi, ArrayList<NgheSi> dsCasi)
    {
        this.maCongTy = maCongTy;
        this.tenCongTy = tenCongTy;
        this.diaChi = diaChi;
        this.dsCasi = dsCasi;
    }
}
