package mypack;

import java.util.ArrayList;

public class HopDong {
	public String sohopdong ;//pk
    public String motahd ;
    public ArrayList<PhieuThu> dsphieuthu ;//related plural
    public ArrayList<TrangPhuc> dstrangphuc ;
	public HopDong() {
		// TODO Auto-generated constructor stub
	}
	public HopDong(HopDong ct)
    {
        this.sohopdong = ct.sohopdong;
        this.motahd = ct.motahd;
        this.dsphieuthu = ct.dsphieuthu;
        this.dstrangphuc = ct.dstrangphuc;
    }
    public HopDong(String sohopdong, String motahd,
        ArrayList<PhieuThu> dsphieuthu, ArrayList<TrangPhuc> dstrangphuc)
    {
        this.sohopdong = sohopdong;
        this.motahd = motahd;
        this.dsphieuthu = dsphieuthu;
        this.dstrangphuc = dstrangphuc;
    }
    public int tongtien ;
}
