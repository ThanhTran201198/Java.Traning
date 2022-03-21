package fis.java.topic_02.collections02;

public class Main {
	public static void main(String[] args) {
		DataForTest d=new DataForTest();
//		System.out.println(d.ntphuoc.coTheDangKyHoc(d.ltrA2));
		d.p1.addMonHoc(d.ltrA1);
		d.p1.addMonHoc(d.ctdl1);
		d.p2.addMonHoc(d.ctdl1);
		System.out.println(d.p1.laHopLe());
		System.out.println(d.p2.laHopLe());
		d.d1.getDsSinhVien(d.ctdl1).stream().forEach(t->System.out.print(t.getTen()+"\n"));
//		d.d1.getDsMonHoc(3).stream().forEach(t->System.out.print(t.getTen()+"\n"));
	}
}
