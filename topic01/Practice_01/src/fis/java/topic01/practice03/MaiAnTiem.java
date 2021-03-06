package fis.java.topic01.practice03;

import java.util.Iterator;

public class MaiAnTiem {
	private int hp,d,s;
	private String t;
	public MaiAnTiem() {
		// TODO Auto-generated constructor stub
	}
	public MaiAnTiem(int hp, int d, int s, String t) {
		super();
		this.hp = hp;
		this.d = d;
		this.s = s;
		this.t = t;
	}
	public int getHp() {
		return hp;
	}
	public void setHp(int hp) {
		this.hp = hp;
	}
	public int getD() {
		return d;
	}
	public void setD(int d) {
		this.d = d;
	}
	public int getS() {
		return s;
	}
	public void setS(int s) {
		this.s = s;
	}
	public String getT() {
		return t;
	}
	public void setT(String t) {
		this.t = t;
	}
	
	public boolean kiemTraNguyenTo(int n) {
        if (n <= 1) {
            return false;
        }

        for (int i = 2; i <= n / 2; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }
	public boolean kiemTraFibonacci(int n){   
		int f1=0,f2 = 0,f3=0;
		for (int i = 0; i < n; i++) {
			if (i==0) {
				f1=1;
				f2=1;
			}else {
				f3=f2;
				f2=f1+f2;
				f1=f3;
			}
			if(n==f2) {
				return true;
			}else if(n<f2){
				break;
			}
		}
		return false;
	}
	public int tinhSoTamGiac(int n) {
		return (n*(n+1)/2);
	}
	public float tinhGs() {
		float g=0;
		int du=s%6;
		switch (du) {
		case 0: {
			g=s/2f;
			break;
		}
		case 1: {
			g=2*s;
			break;
		}
		case 2: {
			g=(float) (Math.pow(-(s%9), 3)/5);
			break;
		}
		case 3: {
			g=(float) (-Math.pow((s%30), 2)+3*s);
			break;
		}
		case 4: {
			g=-s;
			break;
		}
		default:
			g=-tinhSoTamGiac((s%5)+5);
			break;
		}
		return g;
	}
	public float tinhPt() {
		float mang[][]= {
				{0f,-0.05f,-0.1f,-0.15f,-0.2f,-0.25f},
				{0.05f,0f,-0.05f,-0.1f,-0.15f,-0.2f},
				{0.1f,0.05f,0f,-0.05f,-0.1f,-0.15f},
				{0.15f,0.1f,0.05f,0f,-0.05f,-0.1f},
				{0.2f,0.15f,0.1f,0.05f,0f,-0.05f},
				{0.25f,0.2f,0.15f,0.1f,0.05f,0f}
		};
		int x=0,y=0;
		switch (t) {
		case "Flood": {
			x=0;
			break;
		}
		case "Storm": {
			x=1;
			break;
		}
		case "Rain": {
			x=2;
			break;
		}
		case "Shower": {
			x=3;
			break;
		}
		case "Drizzle": {
			x=4;
			break;
		}
		default:
			x=5;
			break;
		}
		switch (s%6) {
		case 5: {
			y=0;
			break;
		}
		case 4: {
			y=1;
			break;
		}
		case 0: {
			y=2;
			break;
		}
		case 1: {
			y=3;
			break;
		}
		case 2: {
			y=4;
			break;
		}
		case 3: {
			y=5;
			break;
		}
		default:
			y=5;
			break;
		}
		return mang[x][y];
	}
	public float tinhF () {
		 return (40-(Math.abs(d-500)/20.0f)+tinhGs())*(1+tinhPt());
		
	}
	public int tinhP1() {
		if(kiemTraNguyenTo(hp)){
			return 1000;
		}
		return hp;
	}
	public int tinhP2() {
		if(kiemTraNguyenTo(hp)){
			return (hp+s)%1000;
		}
		return (hp+d)%100;
	}
	public float tinhP(int p1,int p2,float f) {
		float kq=0;
		kq=(p1+p2*f)/(1000+Math.abs(p2*f));
		if(kq<0) {
			return 0;
		} 
		if(kq>1){
			return 1;
		}
		return kq;
	}
	public float survival() {
		int p1=0,p2=0;
		float f=0;
		p1=tinhP1();
		p2=tinhP2();
		if(d<200) {
			boolean a=kiemTraFibonacci(d+s);
			if(!kiemTraFibonacci(d+s)) {
				f=0;
				return tinhP(p1, p2, f);
			}
			f=tinhF();
			return tinhP(p1, p2, f);
		}
		if(d>800) {
			f=(-d*s)/1000f;
			return tinhP(p1, p2, f);
		}
		if(d>=300) {
			f=tinhF();
			return tinhP(p1, p2, f);
		}	
		float ranCan=(d+p1+p2)/1000f;
		if(ranCan>0.8) {
			return 0;
		}
		if(ranCan>0.6) {
			hp=hp-50;
		}else if(ranCan>0.4) {
			hp=hp-30;
		}else if(ranCan >0.2) {
			hp=hp-20;
		}else {
			hp=hp;
		}
		p1=tinhP1();
		p2=tinhP2();
		f=tinhF();
		return tinhP(p1, p2, f);
	}
}
