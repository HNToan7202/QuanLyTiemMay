
package mypack;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;
import java.util.stream.Collectors;


public class QuanLyTiemMay {
	public static List<NhanVien> dsNhanVien = new ArrayList<NhanVien>();
    public static List<PhongBan> dsPhongBan = new ArrayList<PhongBan>();
    public static List<PhieuThu> dsPhieuThu = new ArrayList<PhieuThu>();
    public static List<HopDong> dsHopDong = new ArrayList<HopDong>();
    public static List<Tho> dsTho = new ArrayList<Tho>();
    public static List<NhomTho> dsNhomTho = new ArrayList<NhomTho>();
    public static List<NhomCongViec> dsNhomCongViec = new ArrayList<NhomCongViec>();
    public static List<CongViec> dsCongViec = new ArrayList<CongViec>();
    public static List<CongTyBieuDien> dsCongTyBieuDien = new ArrayList<CongTyBieuDien>();
    public static List<TrangPhuc> dsTrangPhuc = new ArrayList<TrangPhuc>();
    public static List<LoaiTrangPhuc> dsLoaiTrangPhuc = new ArrayList<LoaiTrangPhuc>();
    public static List<NgheSi> dsNgheSi = new ArrayList<NgheSi>();
    static Scanner scanner = new Scanner(System.in);
    
    public static void taoPhongBan()
    {
        dsPhongBan.add(new PhongBan("PB01", "Lễ Tân",
            "Đón tiếp khách hàng", new ArrayList<NhanVien>(), ""));
        dsPhongBan.add(new PhongBan("PB02", "Văn phòng số 1",
            "Xử lý mảng marketing", new ArrayList<NhanVien>(), ""));
        dsPhongBan.add(new PhongBan("PB03", "Văn phòng số 2",
            "Xử lý dịch vụ khách hàng", new ArrayList<NhanVien>(), ""));
        dsPhongBan.add(new PhongBan("PB04", "Phòng giám đốc",
            "Quản lý công ty", new ArrayList<NhanVien>(), ""));
    }
    public static void taoNhanVien()
    {
    	dsNhanVien.add(new NhanVien("NV01", "Nguyễn Văn Đạt", "Gia Lai",
             "0187629275", dsPhongBan.get(1).maphongban, dsPhongBan.get(1)));
        dsNhanVien.add(new NhanVien("NV02", "Nguyễn Mạnh Đạt", "Quãng Ngãi",
            "0123756389", dsPhongBan.get(2).maphongban, dsPhongBan.get(2)));
        dsNhanVien.add(new NhanVien("NV03", "Trần Văn Thi", "Quy Nhơn",
            "0162439864", dsPhongBan.get(1).maphongban, dsPhongBan.get(1)));
        dsNhanVien.add(new NhanVien("NV04", "Nguyễn Thị Ý Nhi", "An Giang",
            "0345238769", dsPhongBan.get(2).maphongban, dsPhongBan.get(2)));
        dsNhanVien.add(new NhanVien("NV05", "Nguyễn Thị Như Hảo", "Gia Lai",
            "0142341289", dsPhongBan.get(0).maphongban, dsPhongBan.get(0)));
        dsNhanVien.add(new NhanVien("NV06", "Hoàng Thị Bảo Trân", "Gia Lai",
            "0386667666", dsPhongBan.get(0).maphongban, dsPhongBan.get(0)));
        dsNhanVien.add(new NhanVien("NV07", "Trần Văn Tân", "Quãng Ninh",
            "0387878787", dsPhongBan.get(1).maphongban, dsPhongBan.get(1)));
        dsNhanVien.add(new NhanVien("NV08", "Lê Văn Lưu", "Thừa Thiên Huế",
            "0123452398", dsPhongBan.get(3).maphongban, dsPhongBan.get(3)));
        //
        dsPhongBan.get(0).dsNhanVien.add(new NhanVien(dsNhanVien.get(5)));
        dsPhongBan.get(0).dsNhanVien.add(new NhanVien(dsNhanVien.get(4)));

        dsPhongBan.get(1).dsNhanVien.add(new NhanVien(dsNhanVien.get(0)));
        dsPhongBan.get(1).dsNhanVien.add(new NhanVien(dsNhanVien.get(2)));
        dsPhongBan.get(1).dsNhanVien.add(new NhanVien(dsNhanVien.get(6)));

        dsPhongBan.get(2).dsNhanVien.add(new NhanVien(dsNhanVien.get(1)));
        dsPhongBan.get(2).dsNhanVien.add(new NhanVien(dsNhanVien.get(3)));

        dsPhongBan.get(3).dsNhanVien.add(new NhanVien(dsNhanVien.get(7)));
        //
        dsPhongBan.get(0).matruongphong = dsNhanVien.get(5).manhanvien;
        dsPhongBan.get(0).truongphong = new NhanVien(dsNhanVien.get(5));

        dsPhongBan.get(1).matruongphong = dsNhanVien.get(0).manhanvien;
        dsPhongBan.get(1).truongphong = new NhanVien(dsNhanVien.get(0));

        dsPhongBan.get(2).matruongphong = dsNhanVien.get(1).manhanvien;
        dsPhongBan.get(2).truongphong = new NhanVien(dsNhanVien.get(1));

        dsPhongBan.get(3).matruongphong = dsNhanVien.get(7).manhanvien;
        dsPhongBan.get(3).truongphong = new NhanVien(dsNhanVien.get(7));
    }
    
    public static void taoHopDong()
    {
        dsHopDong.add(new HopDong("HD01", "Hợp đồng thuê áo dài",
            new ArrayList<PhieuThu>(), new ArrayList<TrangPhuc>()));
        dsHopDong.add(new HopDong("HD02", "Hợp đồng thuê trang phục cưới",
            new ArrayList<PhieuThu>(), new ArrayList<TrangPhuc>()));
        dsHopDong.add(new HopDong("HD03", "Hợp đồng thuê trang phục dự tiệc ngoài trời",
            new ArrayList<PhieuThu>(), new ArrayList<TrangPhuc>()));

        dsHopDong.add(new HopDong("HD04", "Hợp đồng thuê chỉnh sửa hoa văn",
            new ArrayList<PhieuThu>(), new ArrayList<TrangPhuc>()));
        dsHopDong.add(new HopDong("HD05", "Hợp đồng thuê may trang phục dạ hội",
            new ArrayList<PhieuThu>(), new ArrayList<TrangPhuc>()));
    }
    
    public static void taoPhieuThu()
    {
        //Co chinh sua ngay thang
        dsPhieuThu.add(new PhieuThu("PT01", "12/08/2020", 10000000,
        		"Khánh Phương", dsHopDong.get(0).sohopdong));

        dsPhieuThu.add(new PhieuThu("PT02", "16/09/2020", 13000000,
        		"Hồ Quang Hiếu", dsHopDong.get(1).sohopdong));

        dsPhieuThu.add(new PhieuThu("PT03", "02/11/2020", 10000000,
        		"Hồ Việt Trung", dsHopDong.get(2).sohopdong));

        dsPhieuThu.add(new PhieuThu("PT04", "02/12/2020", 15000000,
        		"Hồ Việt Trung", dsHopDong.get(2).sohopdong));

        dsPhieuThu.add(new PhieuThu("PT05", "20/12/2020", 15000000,
        		"Lâm Chấn Khang", dsHopDong.get(3).sohopdong));
        dsPhieuThu.add(new PhieuThu("PT06", "27/12/2020", 5000000,
                "Nam Cường", dsHopDong.get(3).sohopdong));

        dsPhieuThu.add(new PhieuThu("PT06", "30/12/2020", 15000000,
        		"Trấn Thành", dsHopDong.get(4).sohopdong));
        //
        dsHopDong.get(0).dsphieuthu.add(new PhieuThu(dsPhieuThu.get(0)));

        dsHopDong.get(1).dsphieuthu.add(new PhieuThu(dsPhieuThu.get(1)));

        dsHopDong.get(2).dsphieuthu.add(new PhieuThu(dsPhieuThu.get(2)));
        dsHopDong.get(2).dsphieuthu.add(new PhieuThu(dsPhieuThu.get(3)));

        dsHopDong.get(3).dsphieuthu.add(new PhieuThu(dsPhieuThu.get(4)));
        dsHopDong.get(3).dsphieuthu.add(new PhieuThu(dsPhieuThu.get(5)));
        
        dsHopDong.get(4).dsphieuthu.add(new PhieuThu(dsPhieuThu.get(6)));
        //
        dsHopDong.get(0).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(0)));
        dsHopDong.get(0).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(2)));
        dsHopDong.get(0).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(3)));
        dsHopDong.get(0).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(13)));

        dsHopDong.get(1).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(5)));
        dsHopDong.get(1).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(1)));
        dsHopDong.get(1).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(6)));
        dsHopDong.get(1).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(9)));
        dsHopDong.get(1).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(10)));

        dsHopDong.get(2).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(14)));
        dsHopDong.get(2).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(15)));
        dsHopDong.get(2).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(11)));
        //
        dsHopDong.get(3).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(7)));
        dsHopDong.get(3).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(4)));
        dsHopDong.get(3).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(12)));

        dsHopDong.get(4).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(8)));
        dsHopDong.get(4).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(3)));
        dsHopDong.get(4).dstrangphuc.add(new TrangPhuc(dsTrangPhuc.get(14)));
    }
    
    public static void taodsCongTyBieuDien()
    {
        dsCongTyBieuDien.add(new CongTyBieuDien("CT01", "Thiền Am Entertainment", "Long An", new ArrayList<NgheSi>()));
        dsCongTyBieuDien.add(new CongTyBieuDien("CT02", "Đại Nam Tiền Sử", "Bình Chánh", new ArrayList<NgheSi>()));
        dsCongTyBieuDien.add(new CongTyBieuDien("CT03", "Sơn Tùng Entertainment", "Cái Bè", new ArrayList<NgheSi>()));
        dsCongTyBieuDien.add(new CongTyBieuDien("CT04", "Thủy Tề Entertainment", "Linh Trung", new ArrayList<NgheSi>()));
    }
    
    public static void taoDSNgheSi()
    {
    	dsNgheSi.add(new NgheSi("NS01", "Phan Văn Đức Sâm", true, "Bình Định", 17, 60, 168, new ArrayList<TrangPhuc>(), dsCongTyBieuDien.get(1)));
        dsNgheSi.add(new NgheSi("NS02", "Nguyễn Hoàng Minh Quân", true, "Tây Ninh", 21, 61, 173, new ArrayList<TrangPhuc>(), dsCongTyBieuDien.get(2)));
        dsNgheSi.add(new NgheSi("NS03", "Trần Thị Kiệt Nhi", false, "Thừa Thiên Huế", 18, 45, 165, new ArrayList<TrangPhuc>(), dsCongTyBieuDien.get(1)));
        dsNgheSi.add(new NgheSi("NS04", "Bùi Hồng Minh Quốc", true, "Quảng Nam", 25, 55, 166, new ArrayList<TrangPhuc>(), dsCongTyBieuDien.get(3)));
        dsNgheSi.add(new NgheSi("NS05", "Võ Khang Nhi", false, "An Giang", 29, 49, 160, new ArrayList<TrangPhuc>(), dsCongTyBieuDien.get(0)));
        dsNgheSi.add(new NgheSi("NS06", "Nguyễn Khang Ngọc Bình", false, "Nghệ An", 35, 57, 171, new ArrayList<TrangPhuc>(), dsCongTyBieuDien.get(1)));
        dsNgheSi.add(new NgheSi("NS07", "Nguyễn Thành Công", true, "Hậu Giang", 22, 55, 169, new ArrayList<TrangPhuc>(), dsCongTyBieuDien.get(0)));
        dsNgheSi.add(new NgheSi("NS08", "Ngô Quang Ngọc Huy", true, "Ninh Thuận", 23, 60, 169, new ArrayList<TrangPhuc>(), dsCongTyBieuDien.get(2)));
        dsNgheSi.add(new NgheSi("NS09", "Trần Thị Bích Liên", false, "Đắc Nông", 18, 50, 152, new ArrayList<TrangPhuc>(), dsCongTyBieuDien.get(3)));
        dsNgheSi.add(new NgheSi("NS10", "Nguyễn Thị Na", false, "Quãng Nam", 21, 53, 162, new ArrayList<TrangPhuc>(), dsCongTyBieuDien.get(0)));
        dsNgheSi.add(new NgheSi("NS11", "Nguyễn Thị Thanh Phương", false, "Lâm Đồng", 22, 54, 163, new ArrayList<TrangPhuc>(), dsCongTyBieuDien.get(1)));
        
    }
    
    public static void taoDSLoaiTrangPhuc()
    {
        dsLoaiTrangPhuc.add(new LoaiTrangPhuc("LTP01", "Truyền thống", new ArrayList<TrangPhuc>()));
        dsLoaiTrangPhuc.add(new LoaiTrangPhuc("LTP02", "Hiện đại", new ArrayList<TrangPhuc>()));
    }
    
    public static void taoDSTrangPhuc()
    {
        dsTrangPhuc.add(new TrangPhuc("TP01", "Áo Dài Cách Tân", dsLoaiTrangPhuc.get(0).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(0), dsNgheSi.get(0)));
        dsTrangPhuc.add(new TrangPhuc("TP02", "Suit", dsLoaiTrangPhuc.get(1).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(1), dsNgheSi.get(1)));
        dsTrangPhuc.add(new TrangPhuc("TP03", "Áo Tứ Thân", dsLoaiTrangPhuc.get(0).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(0), dsNgheSi.get(2)));
        dsTrangPhuc.add(new TrangPhuc("TP04", "Áo Bà Ba", dsLoaiTrangPhuc.get(0).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(0), dsNgheSi.get(3)));
        dsTrangPhuc.add(new TrangPhuc("TP05", "Sườn Xám", dsLoaiTrangPhuc.get(0).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(0), dsNgheSi.get(4)));
        dsTrangPhuc.add(new TrangPhuc("TP06", "Vest", dsLoaiTrangPhuc.get(1).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(1), dsNgheSi.get(5)));
        dsTrangPhuc.add(new TrangPhuc("TP07", "Comple", dsLoaiTrangPhuc.get(1).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(1), dsNgheSi.get(6)));
        dsTrangPhuc.add(new TrangPhuc("TP08", "Áo Chàm", dsLoaiTrangPhuc.get(0).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(0), dsNgheSi.get(7)));
        dsTrangPhuc.add(new TrangPhuc("TP09", "Taipon", dsLoaiTrangPhuc.get(0).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(0), dsNgheSi.get(7)));
        //Kiet
        dsTrangPhuc.add(new TrangPhuc("TP10", "Áo cưới cách tân", dsLoaiTrangPhuc.get(1).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(1), null));
        dsTrangPhuc.add(new TrangPhuc("TP11", "Áo cưới truyền thống", dsLoaiTrangPhuc.get(0).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(0), null));
        dsTrangPhuc.add(new TrangPhuc("TP12", "Áo Pijama", dsLoaiTrangPhuc.get(1).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(1), null));
        dsTrangPhuc.add(new TrangPhuc("TP13", "Áo cưới cách tân", dsLoaiTrangPhuc.get(1).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(1), null));
        dsTrangPhuc.add(new TrangPhuc("TP14", "Áo dài truyền thống", dsLoaiTrangPhuc.get(0).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(0), null));
        dsTrangPhuc.add(new TrangPhuc("TP15", "Áo Varsity", dsLoaiTrangPhuc.get(1).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(1), null));
        dsTrangPhuc.add(new TrangPhuc("TP16", "Quần Gucci", dsLoaiTrangPhuc.get(1).maLoaiTrangPhuc, dsLoaiTrangPhuc.get(1), null));
        //
        dsLoaiTrangPhuc.get(0).dsTrangPhuc.add(dsTrangPhuc.get(0));
        dsLoaiTrangPhuc.get(0).dsTrangPhuc.add(dsTrangPhuc.get(2));
        dsLoaiTrangPhuc.get(0).dsTrangPhuc.add(dsTrangPhuc.get(3));
        dsLoaiTrangPhuc.get(0).dsTrangPhuc.add(dsTrangPhuc.get(7));
        dsLoaiTrangPhuc.get(0).dsTrangPhuc.add(dsTrangPhuc.get(8));
        dsLoaiTrangPhuc.get(0).dsTrangPhuc.add(dsTrangPhuc.get(4));
        dsLoaiTrangPhuc.get(1).dsTrangPhuc.add(dsTrangPhuc.get(1));
        dsLoaiTrangPhuc.get(1).dsTrangPhuc.add(dsTrangPhuc.get(5));
        dsLoaiTrangPhuc.get(1).dsTrangPhuc.add(dsTrangPhuc.get(6));
        //
        dsNgheSi.get(0).trangPhuc.add(dsTrangPhuc.get(0));
        dsNgheSi.get(1).trangPhuc.add(dsTrangPhuc.get(1));
        dsNgheSi.get(2).trangPhuc.add(dsTrangPhuc.get(2));
        dsNgheSi.get(3).trangPhuc.add(dsTrangPhuc.get(3));
        dsNgheSi.get(4).trangPhuc.add(dsTrangPhuc.get(4));
        dsNgheSi.get(5).trangPhuc.add(dsTrangPhuc.get(5));
        dsNgheSi.get(6).trangPhuc.add(dsTrangPhuc.get(6));
        dsNgheSi.get(4).trangPhuc.add(dsTrangPhuc.get(7));
        dsNgheSi.get(5).trangPhuc.add(dsTrangPhuc.get(8));
        dsNgheSi.get(4).trangPhuc.add(dsTrangPhuc.get(7));
        dsNgheSi.get(2).trangPhuc.add(dsTrangPhuc.get(6));
        dsNgheSi.get(7).trangPhuc.add(dsTrangPhuc.get(0));
    }
    public static void taoDSTho()
	{
    	dsTho.add(new Tho("T01", "Trần Văn Kiệt", "Thừa Thiên Huế", dsNhomTho.get(0),"0923100234", dsNhomTho.get(0).MaNhomTho, new ArrayList<CongViec>(),true));
        dsTho.add(new Tho("T02", "Nguyễn Hoàng Toàn", "Tây Ninh", 	dsNhomTho.get(1),"0937425321", dsNhomTho.get(1).MaNhomTho, new ArrayList<CongViec>(),true));
        dsTho.add(new Tho("T03", "Phan Văn Đức Anh", "Bình Định", 	dsNhomTho.get(0),"0912356788", dsNhomTho.get(0).MaNhomTho, new ArrayList<CongViec>(),true));
        dsTho.add(new Tho("T04", "Võ Hồng Khang", "An Giang", 		dsNhomTho.get(1),"0973344551", dsNhomTho.get(1).MaNhomTho, new ArrayList<CongViec>(),true));
        dsTho.add(new Tho("T05", "Nguyễn Thị Trúc Anh", "Đồng Tháp", dsNhomTho.get(0),"0923566411", dsNhomTho.get(0).MaNhomTho, new ArrayList<CongViec>(),false));
        dsTho.add(new Tho("T06", "Ngô Thị Thanh Thảo", "Gia Lai", 	dsNhomTho.get(1),"0912444875", dsNhomTho.get(1).MaNhomTho, new ArrayList<CongViec>(),false));
        dsTho.add(new Tho("T07", "Bùi Đăng Quốc Chí", "Quảng Ngãi", dsNhomTho.get(2),"0245712567", dsNhomTho.get(2).MaNhomTho, new ArrayList<CongViec>(),true));
        dsTho.add(new Tho("T08", "Nguyễn Thị Thành", "Tiền Giang", dsNhomTho.get(2),"0434688665", dsNhomTho.get(2).MaNhomTho, new ArrayList<CongViec>(),false));
        dsTho.add(new Tho("T09", "Nguyễn Tô Vân Anh", "Khánh Hòa", 	dsNhomTho.get(3),"0987664234", dsNhomTho.get(3).MaNhomTho, new ArrayList<CongViec>(),false));
        dsTho.add(new Tho("T10", "Nguyễn Thị Anh Thư", "An Giang", 	dsNhomTho.get(3),"0987756412", dsNhomTho.get(3).MaNhomTho, new ArrayList<CongViec>(),false));

        dsNhomTho.get(0).dsTho.add(dsTho.get(0));
        dsNhomTho.get(0).dsTho.add(dsTho.get(2));
        dsNhomTho.get(0).dsTho.add(dsTho.get(4));
        dsNhomTho.get(1).dsTho.add(dsTho.get(1));
        dsNhomTho.get(1).dsTho.add(dsTho.get(3));
        dsNhomTho.get(1).dsTho.add(dsTho.get(5));
        dsNhomTho.get(2).dsTho.add(dsTho.get(6));
        dsNhomTho.get(2).dsTho.add(dsTho.get(7));
        dsNhomTho.get(3).dsTho.add(dsTho.get(8));
        dsNhomTho.get(3).dsTho.add(dsTho.get(9));

        dsNhomTho.get(0).MaTruongNhom = dsTho.get(0).MaTho;
        dsNhomTho.get(0).TruongNhom = new Tho(dsTho.get(0));
        
        dsNhomTho.get(1).MaTruongNhom = dsTho.get(1).MaTho;
        dsNhomTho.get(1).TruongNhom = new Tho(dsTho.get(1));
        
        dsNhomTho.get(2).MaTruongNhom = dsTho.get(2).MaTho;
        dsNhomTho.get(2).TruongNhom = new Tho(dsTho.get(2));
        
        dsNhomTho.get(3).MaTruongNhom = dsTho.get(3).MaTho;
        dsNhomTho.get(3).TruongNhom = new Tho(dsTho.get(3));
	}
	public static void taoDSNhomTho()
	{
		dsNhomTho.add(new NhomTho("N01", "Nhóm 01", " ", " ", new ArrayList<Tho>()));
        dsNhomTho.add(new NhomTho("N02", "Nhóm 02", " ", " ", new ArrayList<Tho>()));
        dsNhomTho.add(new NhomTho("N03", "Nhóm 03", " ", " ", new ArrayList<Tho>()));
        dsNhomTho.add(new NhomTho("N04", "Nhóm 04", " ", " ", new ArrayList<Tho>()));
	}
	public static void taoDSNhomCongViec()
	{
		dsNhomCongViec.add(new NhomCongViec("M001", "Cắt vải","Cắt vải theo khung yêu cầu", new ArrayList<CongViec>()));
        dsNhomCongViec.add(new NhomCongViec("M002", "May","May quần áo theo hình dáng đã cho", new ArrayList<CongViec>()));
        dsNhomCongViec.add(new NhomCongViec("M003", "Cắt chỉ thừa","Loại bỏ đi phần chỉ thừa dư sau khi may", new ArrayList<CongViec>()));
        dsNhomCongViec.add(new NhomCongViec("M001", "Ủi","Ủi quần áo ngăn nắp để bỏ vào hộp" ,new ArrayList<CongViec>()));
        dsNhomCongViec.add(new NhomCongViec("M001", "Xếp","Xếp quần áo sau khi đã được ủi", new ArrayList<CongViec>()));
        dsNhomCongViec.add(new NhomCongViec("M001", "Đóng gói","Đóng gói quần áo để tiêu thụ", new ArrayList<CongViec>()));
	}
	public static void taoDSCongViec()
    {
        dsCongViec.add(new CongViec("C001", "Cat Quan", dsNhomCongViec.get(0).MaNhomCongViec,8, dsNhomCongViec.get(0), dsTho.get(0)));
        dsCongViec.add(new CongViec("C002", "Cat Ao", 	dsNhomCongViec.get(0).MaNhomCongViec, 6, dsNhomCongViec.get(0), dsTho.get(1)));
        dsCongViec.add(new CongViec("C003", "May Quan", dsNhomCongViec.get(1).MaNhomCongViec, 8, dsNhomCongViec.get(1), dsTho.get(2)));
        dsCongViec.add(new CongViec("C004", "May Ao", 	dsNhomCongViec.get(1).MaNhomCongViec, 5, dsNhomCongViec.get(1), dsTho.get(3)));
        dsCongViec.add(new CongViec("C005", "Ui Quan", 	dsNhomCongViec.get(2).MaNhomCongViec, 8, dsNhomCongViec.get(2), dsTho.get(4)));
        dsCongViec.add(new CongViec("C006", "Ui Ao", 	dsNhomCongViec.get(2).MaNhomCongViec, 6, dsNhomCongViec.get(2), dsTho.get(5)));
        dsCongViec.add(new CongViec("C007", "Xep Quan", dsNhomCongViec.get(3).MaNhomCongViec, 5, dsNhomCongViec.get(3), dsTho.get(6)));
        dsCongViec.add(new CongViec("C008", "Xep Ao", 	dsNhomCongViec.get(3).MaNhomCongViec, 8, dsNhomCongViec.get(3), dsTho.get(7)));
        dsCongViec.add(new CongViec("C009", "Dong Goi Quan", dsNhomCongViec.get(4).MaNhomCongViec, 6, dsNhomCongViec.get(4), dsTho.get(8)));
        dsCongViec.add(new CongViec("C010", "Doi Goi Ao",dsNhomCongViec.get(4).MaNhomCongViec, 5, dsNhomCongViec.get(4), dsTho.get(9)));
        //
        dsNhomCongViec.get(0).dsNhomCongViec.add(dsCongViec.get(0));
        dsNhomCongViec.get(0).dsNhomCongViec.add(dsCongViec.get(1));
        dsNhomCongViec.get(1).dsNhomCongViec.add(dsCongViec.get(2));
        dsNhomCongViec.get(1).dsNhomCongViec.add(dsCongViec.get(3));
        dsNhomCongViec.get(2).dsNhomCongViec.add(dsCongViec.get(4));
        dsNhomCongViec.get(2).dsNhomCongViec.add(dsCongViec.get(5));
        dsNhomCongViec.get(3).dsNhomCongViec.add(dsCongViec.get(6));        
        dsNhomCongViec.get(3).dsNhomCongViec.add(dsCongViec.get(7));
        dsNhomCongViec.get(4).dsNhomCongViec.add(dsCongViec.get(8));
        dsNhomCongViec.get(4).dsNhomCongViec.add(dsCongViec.get(9));
    }
	
	public static String BMI(float chieucao, float cannang) {		
		float c = chieucao/100, n = cannang;
    	float t = n/(c*c); // Công thức BMI
    	String phanLoai, nguyCoPhatBenh;
    	if (t < 18.5) {
    		phanLoai = "Gầy";
    		nguyCoPhatBenh = "Thấp";
    	}
    	else if (t <= 24.9) {
    		phanLoai = "Bình thường";
    		nguyCoPhatBenh = "Trung bình";
    	}
    	else if (t <= 29.9) {
    		phanLoai = "Hơi béo";
    		nguyCoPhatBenh = "Cao";
    	}
    	else if (t <= 34.9) {
    		phanLoai = "Béo phì cấp độ 1";
    		nguyCoPhatBenh = "Khá cao";
    	}
    	else if (t <= 39.9) {
    		phanLoai = "Béo phì cấp độ 2";
    		nguyCoPhatBenh = "Rất cao";
    	}
    	else {
    		phanLoai = "Béo phì cấp độ 3";
    		nguyCoPhatBenh = "Nguy hiểm";
    	}
    	return "Phân loại: " + phanLoai + " - " + "Nguy cơ phát bệnh: "+ nguyCoPhatBenh;
	}
	
	public static String Size(float a, float b, float c, int i, float chieuCao, String size[]) {
		if (chieuCao < a) {
			return size[i];
		}
		else if (chieuCao < b) {
			return size[i+1];
		}
		else if (chieuCao < c) {
			return size[i+1];
		}
		else {
			return size[i+2];
		}
	}
	
	public static String sizeTrangPhuc(float chieuCao, float canNang) {
		String size[] = {"S", "M", "L", "XL", "XXL"}, k;
		if (canNang < 53) {
			k = QuanLyTiemMay.Size(168, 174, 180, 0, chieuCao, size);
		}
		else if (canNang < 60) {
			k = QuanLyTiemMay.Size(168, 174, 180, 1, chieuCao, size);
		}
		else
			k =QuanLyTiemMay.Size(168, 174, 180, 2, chieuCao, size);
		return k;
	}
	
    public static boolean OlderThan(String s1, String s2)
    {
        // 30/07/2020
        // 19/12/2020
        String[] a = s1.split("/");
        String[] b = s2.split("/");

        int i = a.length - 1;
        while ( i >= 0)
        {
            if (Integer.parseInt(a[i]) > Integer.parseInt(b[i]))
            {
                return true;
            }
            else if (Integer.parseInt(a[i]) == Integer.parseInt(b[i]))
            {
                i--;
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static void Linq01() { // In danh sách tất cả các nghệ sĩ
    	List<NgheSi> KH = dsNgheSi
					.stream()
					.collect(Collectors.toList());
    	System.out.println("Danh sách tất cả các nghệ sĩ: ");
    	for(NgheSi ns : KH) {
    			System.out.println("Tên: " + ns.tenNgheSi + " - " + "Mã số: " + ns.maNgheSi + " - " + "Năm sinh: "+ (2022 - ns.tuoi) +
    					" - " + "Giới tính: "+(ns.gioiTinh ? "Nam" : "Nữ") + " - " + "Địa chỉ: " + ns.diaChi);
    	}
    }

    public static void Linq02() { // In tất cả các trang phục thuộc loại trang phục hiện đại
    	List<TrangPhuc> trangphuc = dsTrangPhuc
    			.stream()
    			.filter(t -> t.loaitrangphuc.tenLoaiTrangPhuc == "Hiện đại")
    			.collect(Collectors.toList());
    	System.out.println("Danh sách trang phục thuộc loại trang phục hiện đại: ");
    	for(TrangPhuc itrangphuc : trangphuc) {
			System.out.println("Mã trang phục: " + itrangphuc.maTrangPhuc + " - " + "Tên: " + itrangphuc.tenTrangPhuc);    
    	}  	 
    }
    
    public static void Linq03(int a) // In danh sách các nghệ sĩ sinh năm 2002
    {
    	List<NgheSi> nghesi = dsNgheSi
    			.stream()
    			.filter(t -> 2021 - t.tuoi == a)
    			.collect(Collectors.toList());
    	for(NgheSi inghesi : nghesi)
    	{
			System.out.println("Tên: " + inghesi.tenNgheSi + " - " + "Giới tính: " + (inghesi.gioiTinh ? "Nam" : "Nữ") + " - " 
					+ "Chiều cao: 1m" + (inghesi.chieuCao - 100) + " - " + "Cân nặng: " + inghesi.canNang + "Kg" + " - "
					+ "Nơi làm việc: " + inghesi.congTy.tenCongTy);
    	}  	 
    	System.out.println();
    }
    
    public static void Linq04() // Danh sách nghệ sĩ theo chiều cao
    {
    	List<NgheSi> data = dsNgheSi;
    	Collections.sort(data, new Comparator<NgheSi>() { // Sắp xếp
    		@Override
    		public int compare(NgheSi ns1, NgheSi ns2) {
    			return (int)(ns1.chieuCao() - ns2.chieuCao()); // Theo chiều cao tăng dần
    		 // return (int)(ns2.chieuCao() - ns1.chieuCao()); Muốn giảm dần thì hoán đổi vị trí ns1 và ns2
    		}
		});
    	for(NgheSi nghesi : data)
    	{
    		System.out.println(nghesi.tenNgheSi + " - " + "Chiều cao: 1m" + (nghesi.chieuCao - 100) + " - " + "Đang làm việc tại: " + nghesi.congTy.tenCongTy);
    	}
    }
    
    public static void Linq05(String maNgheSi) { // Kiểm tra chỉ số BMI và size trang phục của 1 nghệ sĩ qua mã số
    	System.out.println("Chỉ số BMI của nghệ sĩ mang mã số " + maNgheSi);
    	NgheSi iNgheSi = dsNgheSi
				.stream()
				.filter(t->t.maNgheSi == maNgheSi)
				.findFirst()
				.get();    	
		if(iNgheSi != null) {	
    		System.out.println("Tên: " + iNgheSi.tenNgheSi + " - " + "Giới tính: " + (iNgheSi.gioiTinh ? "Nam" : "Nữ") + " - "
    				+ "Chiều cao: 1m" + (iNgheSi.chieuCao - 100) + " - " + "Cân nặng: " + iNgheSi.canNang + "Kg");
    		System.out.println("Kết quả BMI: " + QuanLyTiemMay.BMI(iNgheSi.chieuCao, iNgheSi.canNang));
    		System.out.println("Size phù hợp: " + QuanLyTiemMay.sizeTrangPhuc(iNgheSi.chieuCao, iNgheSi.canNang));
		}
		else {
			System.out.println("Không tìm thấy thông tin nghệ sĩ !");
		}		
    }

    public static void Linq06()//6. ds công việc
    {  
    	System.out.println("Linq06");
    	List<String> dscongViec = dsCongViec
    			.stream()
    			.map(x->"Mã công việc "+ x.MaCongViec+",Mã Nhóm Công Việc: "+x.MaNhomCongViec+",Tên Công Việc: "+x.ThoiGianLamViec+",Mô Tả: "+x.MoTa)
    			.collect(Collectors.toList());
    	System.out.println("DS Công Việc");
    	dscongViec.forEach(x->System.out.println(x));
    }

    public static void Linq07(String matho)//7. Tìm thợ có mã thợ là matho
    {
    	System.out.println("Linq07");
    	List<Tho> dstho = dsTho
    			.stream()
    			.filter(t->t.MaTho == matho)
    			.collect(Collectors.toList());
    	System.out.println("Thông tin thợ có mã thợ " + matho + " là :");
    	System.out.println(dstho.get(0).HoTen+""+dstho.get(0).DiaChi+" "+dstho.get(0).SoDienThoai);
    }
  
    public static void Linq08()  //8.Thông tin thợ có giới tính nữ
    {
    	System.out.println("Linq08");
    	List<Tho> dstho = dsTho
    			.stream()
    			.filter(t->t.GioiTinh == false)
    			.collect(Collectors.toList());
    	System.out.println("Thông tin thợ là nữ trong xưởng là :");
    	for(Tho tho : dstho)
    	{
    		System.out.println("Họ tên: "+ tho.HoTen+" ,Địa chỉ: "+tho.DiaChi+" ,Số điện thoại: "+tho.SoDienThoai+" Mã thợ : "+tho.MaTho);
    	}
    }

    public static void Linq09()    //9. Danh sách công việc theo thời gian làm việc giảm dần
    {
    	System.out.println("Linq09");
    	List<CongViec> data = dsCongViec;
    	Collections.sort(data, new Comparator<CongViec>() {
    		@Override
    		public int compare(CongViec cv1, CongViec cv2) {
    			return (int)(cv1.getThoiGianLamViec() - cv2.getThoiGianLamViec());
    		}
		});
    	System.out.println("DS công việc theo thời gian giảm dần: ");
    	for(CongViec cv : data)
    	{
    		System.out.println("Mã công việc: "+cv.MaCongViec+" ,Mã nhóm công việc : "+cv.MaNhomCongViec+" ,Mô tả: "+cv.MoTa+" ,Thời gian làm việc: "+cv.ThoiGianLamViec);
    	}
    }
 
    public static void Linq10()   //10. In hoa tên thợ trong 
    {  
    	System.out.println("Linq10");
    	List<String> dstho = dsTho
    			.stream()
				.map(x -> x.HoTen.toUpperCase())
				.collect(Collectors.toList());
    	System.out.println("Tên thợ in hoa: ");
    	dstho.forEach((nx)->System.out.println(nx));
    }
    public static void Linq11() {
    	System.out.println("Linq11-----------------------");
    	List<PhongBan> dspb = dsPhongBan;
    	dspb.sort((i1, i2)-> i1.maphongban.compareTo(i2.maphongban));
    	dspb.forEach(x ->{
    		System.out.println("Mã phòng ban: " + x.maphongban + " - Tên phòng ban: " + x.tenphongban);
    		x.dsNhanVien.sort((i1, i2) -> i1.manhanvien.compareTo(i2.manhanvien));
    		x.dsNhanVien.forEach(nv ->{
    			System.out.println("Mã nhân viên: " + nv.manhanvien + " - Tên nhân viên: " + nv.tennhanvien);
    		});
    	});
    }
    public static void Linq12(String diachi) {
    	System.out.println("Linq12-----------------------");
    	Predicate<NhanVien> contain = i -> i.diachi == diachi;
    	List<NhanVien> dsnhanvien = dsNhanVien
    			.stream()
    			.filter(contain)
    			.collect(Collectors.toList());
    	dsnhanvien.forEach(x -> {
    		System.out.println("Mã nhân viên: " + x.manhanvien + " - Tên nhân viên: " + x.tennhanvien + " - Mã phòng ban: " + x.maphongban);
    	});
    }
    public static void tinhTienCuaHD()
    {
        dsHopDong.forEach(hd -> {
        	hd.tongtien = 0;
        	hd.dsphieuthu.forEach(pt -> {
        		hd.tongtien += pt.sotien;
        	});
        });
    }
    public static void Linq13() {
    	System.out.println("Linq13-----------------------");
    	tinhTienCuaHD();
    	System.out.println("Hợp đồng có giá trị lớn nhất: ");
    	HopDong hdmax = dsHopDong
    			.stream()
    			.max((i1 , i2) -> (int) (i1.tongtien - i2.tongtien))
    			.get();
    	System.out.println("Mã hợp đồng: " + hdmax.sohopdong + " - Mô tả: " + hdmax.motahd);
    	System.out.println("Số tiền: " + hdmax.tongtien);
    }
    public static void Linq14() {
    	System.out.println("Linq14-----------------------");
    	System.out.println("Hợp đồng thuê ít trang phục nhất");
    	HopDong hdmin = dsHopDong
    			.stream()
    			.min((i1, i2) -> (int)(i2.dstrangphuc.size() - i1.dstrangphuc.size()))
    			.get();
    	System.out.println("Mã hợp đồng: " + hdmin.sohopdong + " - Mô tả: " + hdmin.motahd);
    	System.out.println("Danh sách trang phục đã thuê: ");
    	hdmin.dstrangphuc.sort((i1, i2) -> i1.maTrangPhuc.compareTo(i2.maTrangPhuc));
    	hdmin.dstrangphuc.forEach(tp ->{
    		System.out.println("Mã trang phục: " + tp.maTrangPhuc + " - Tên trang phục: " + tp.tenTrangPhuc);
    		System.out.println("Mã loại trang phục: " + tp.maloaitrangphuc);
    	});
    }
    public static void Linq15(String name) {
    	System.out.println("Linq15-----------------------");
    	System.out.println("Những nhân viên mang họ Trần");
    	List<NhanVien> nvhotran = dsNhanVien
    			.stream()
    			.filter(x -> x.tennhanvien.contains(name))
    			.map(x -> x)
    			.collect(Collectors.toList());
    	nvhotran.forEach(nv -> {
    		System.out.println("Mã nhân viên: " + nv.manhanvien + " - Tên nhân viên: " + nv.tennhanvien);
    		System.out.println("Địa chỉ: " + nv.diachi + " - Số điện thoại: " + nv.sodienthoai);
    		System.out.println("Mã phòng ban: " + nv.maphongban);
    	});
    }
	public static void main(String[] args) {
		
		taoPhongBan();
        taoNhanVien();
        taoHopDong();
        taodsCongTyBieuDien();
        //DucAnh
        taoDSLoaiTrangPhuc();
        taoDSNgheSi();
        taoDSTrangPhuc();
        taoPhieuThu();
        //Toan
        taoDSNhomTho();
        taoDSNhomCongViec();
        taoDSTho();
        taoDSCongViec();
        
        int chon, nam;
        String maSo;
        do
        {
            System.out.println("============================ MENU ============================");            
            System.out.println(" 1. In thông tin tất cả các nghệ sĩ");
            System.out.println(" 2. In tất cả các trang phục thuộc loại trang phục hiện đại");
            System.out.println(" 3. In danh sách các nghệ sĩ theo năm sinh");
            System.out.println(" 4. In danh sách nghệ sĩ theo chiều cao tăng dần");
            System.out.println(" 5. Kiểm tra BMI và size trang phục phù hợp của nghệ sĩ mã NS01");
            System.out.println(" 6. In danh sách công việc");
            System.out.println(" 7. Tìm thợ có mã thợ là T02");
            System.out.println(" 8. Thông tin thợ có giới tính nữ");
            System.out.println(" 9. Danh sách công việc theo thời gian làm việc tăng dần");
            System.out.println("10. In hoa tên thợ");
            System.out.println("11. In thông tin các phòng ban");
            System.out.println("12. In thông tin các nhân viên có địa chỉ Thừa Thiên Huế");
            System.out.println("13. In thông tin hợp đồng có giá trị lớn nhất");
            System.out.println("14. In thông tin hợp đồng thuê ít trang phục nhất");
            System.out.println("15. In thông tin những nhân viên mang họ Trần");
            System.out.println(" 0. Kết thúc chương trình");  
            System.out.println("==============================================================");
            System.out.print("Hãy chọn tính năng: ");          
            chon = scanner.nextInt();
            switch (chon)
            {
                    case 0:
                        System.out.println("Chúc bạn một ngày tốt lành");
                        break;
                    case 1:
                        Linq01();
                        break;
                    case 2:
                        Linq02();
                        break;
                    case 3:
                    	System.out.print("Nhập năm sinh: ");
                    	nam = scanner.nextInt();
                        Linq03(nam);
                        break;
                    case 4:
                        Linq04();
                        break;
                    case 5:
                    	maSo = "NS01";
                        Linq05(maSo);
                        break;  
                    case 6:
                        Linq06();
                        break;
                    case 7:
                        Linq07("T02");
                        break;
                    case 8:
                        Linq08();
                        break;
                    case 9:
                        Linq09();
                        break;
                    case 10:
                        Linq10();
                        break;
                    case 11:
                        Linq11();
                        break;
                    case 12:
                        Linq12("Thừa Thiên Huế");
                        break;
                    case 13:
                        Linq13();
                        break;
                    case 14:                  	
                        Linq14();
                        break;                    
                    case 15:
                        Linq15("Trần");
                        break;
                    default:
                        System.out.println("Vui lòng nhập lại !");
                        break;
            }
        } while (chon != 0);        
        scanner.close();
	}
}
