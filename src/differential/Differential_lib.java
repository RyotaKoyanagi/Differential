package differential;

public class Differential_lib implements Differential_if{

	private double a,h;
	
	public Differential_lib(double a, double h) {
		this.a = a;
		this.h = h;
	}

	@Override
	public double getRx() {
		// TODO Auto-generated method stub
		//理論値関数
		return 2*this.a;
	}

	@Override
	public double getDx() {
		// TODO Auto-generated method stub
		//計算値関数
		return (Math.pow(this.a+this.h,2)-Math.pow(this.a,2))/h;
	}

	@Override
	public double getRe() {
		// TODO Auto-generated method stub
		//相対誤差関数
		return (((getRx()-getDx())/getRx())*100>0 ? ((getRx()-getDx())/getRx())*100 : -((getRx()-getDx())/getRx())*100);
	}
	
}
