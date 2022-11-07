package mypack;

import java.util.ArrayList;

public class PhongBan {
	public String maphongban ;//pk
    public String tenphongban ;
    public String mota ;
    public ArrayList<NhanVien> dsNhanVien ;//related plural
    public String matruongphong ;//fk
    public NhanVien truongphong ;
	public PhongBan() {
		
	}
	public PhongBan(PhongBan pb)
    {
        this.maphongban = pb.maphongban;
        this.tenphongban = pb.tenphongban;
        this.mota = pb.mota;
        this.matruongphong = pb.matruongphong;
        this.dsNhanVien = pb.dsNhanVien;
    }
    public PhongBan(String maphongban, String tenphongban, String mota,
    		ArrayList<NhanVien> dsNhanVien, String matruongphong)
    {
        this.maphongban = maphongban;
        this.tenphongban = tenphongban;
        this.mota = mota;
        this.dsNhanVien = dsNhanVien;
        this.matruongphong = matruongphong;
    }
}
