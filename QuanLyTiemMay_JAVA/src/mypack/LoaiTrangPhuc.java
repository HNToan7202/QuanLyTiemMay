package mypack;

import java.util.ArrayList;

public class LoaiTrangPhuc {
	public String maLoaiTrangPhuc ;
    public String tenLoaiTrangPhuc ;
    public ArrayList<TrangPhuc> dsTrangPhuc ;
	public LoaiTrangPhuc() {
		// TODO Auto-generated constructor stub
	}
	public LoaiTrangPhuc(LoaiTrangPhuc loai)
    {
        this.maLoaiTrangPhuc = loai.maLoaiTrangPhuc;
        this.tenLoaiTrangPhuc = loai.tenLoaiTrangPhuc;
    }
    public LoaiTrangPhuc(String maLoai, String tenLoaiTrangPhuc, ArrayList<TrangPhuc> dsTrangPhuc)
    {
        this.maLoaiTrangPhuc = maLoai;
        this.tenLoaiTrangPhuc = tenLoaiTrangPhuc;
        this.dsTrangPhuc = dsTrangPhuc;
    }
}
