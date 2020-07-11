package vn.t3h.ls4;

public class NhanVien extends Person {
	
	private int time;
	
	


	public NhanVien() {
		super();
	}

	public NhanVien(String ten) {
		super(ten);

	}
	
	

	public NhanVien(String ten, int time) {
		super(ten);
		this.time = time;
	}

	public double getLuong() {
		return time;
	}

	public void setLuong(int luong) {
		this.time = luong;
	}
	@Override
	public double luong() {
		
		return super.luong() + time * 25000;
	}
}
	
 
 