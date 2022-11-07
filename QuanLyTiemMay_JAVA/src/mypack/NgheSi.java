package mypack;

import java.util.ArrayList;

public class NgheSi {
	public String maNgheSi ;
    public String tenNgheSi ;
    public boolean gioiTinh ;
    public String diaChi ;
    public int tuoi ;
    public int canNang ; // Kg
    public int chieuCao ; // Cm
    public ArrayList<TrangPhuc> trangPhuc ;
    public CongTyBieuDien congTy ;
    public NgheSi() {
		// TODO Auto-generated constructor stub
	}
	public NgheSi(NgheSi casi)
    {
        this.maNgheSi = casi.maNgheSi;
        this.tenNgheSi = casi.tenNgheSi;
        this.gioiTinh = casi.gioiTinh;
        this.diaChi = casi.diaChi;
        this.tuoi = casi.tuoi;
        this.canNang = casi.canNang;
        this.chieuCao = casi.chieuCao;
    }
    public NgheSi(String maCaSi, String tenCaSi, boolean gioiTinh,
        String diaChi, int tuoi, int canNang,
        int chieuCao, ArrayList<TrangPhuc> trangPhuc, CongTyBieuDien congTy)
    {
        this.maNgheSi = maCaSi;
        this.tenNgheSi = tenCaSi;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
        this.tuoi = tuoi;
        this.canNang = canNang;
        this.chieuCao = chieuCao;
        this.trangPhuc = trangPhuc;
        this.congTy = congTy;
    }
	public int chieuCao() {
		// TODO Auto-generated method stub
		return chieuCao;
	}
}
