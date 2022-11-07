package mypack;

public class TrangPhuc {
	public String maTrangPhuc ;
    public String tenTrangPhuc ;
    public NgheSi caSi ;
    public LoaiTrangPhuc loaitrangphuc ;
    public String maloaitrangphuc ;//fk
	public TrangPhuc() {
		// TODO Auto-generated constructor stub
	}
	public TrangPhuc (TrangPhuc trangphuc)
    {
        this.maTrangPhuc = trangphuc.maTrangPhuc;
        this.tenTrangPhuc = trangphuc.tenTrangPhuc;
        this.maloaitrangphuc = trangphuc.maloaitrangphuc;
    }
    public TrangPhuc (String MaTrangPhuc, String TenTrangPhuc, String maloaitrangphuc, LoaiTrangPhuc loaitrangphuc, NgheSi caSi )
    {
        this.maTrangPhuc = MaTrangPhuc;
        this.tenTrangPhuc = TenTrangPhuc;
        this.caSi = caSi;
        this.loaitrangphuc = loaitrangphuc;
        this.maloaitrangphuc = maloaitrangphuc;
    }
}
