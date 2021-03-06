package differential;

/* 
Input Value of a > 1
Input Value of h > 0.00000001
f(x)=x^2のx=1.0における微分係数(理論値)は2.0
f(x)=x^2のx=1.0における微分係数(計算値)は1.999999987845058
f(x)=x^2のx=1.0における相対誤差は6.07747097092215E-7
 */

import java.util.Scanner;

public class Differential_main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scan = new Scanner(System.in);
		System.out.print("Input Value of a > ");
		double a = Double.parseDouble(scan.next());
		System.out.print("Input Value of h > ");
		double h = Double.parseDouble(scan.next());
		Differential_lib dlib = new Differential_lib(a,h);
		System.out.println("f(x)=x^2のx="+a+"における微分係数(理論値)は"+dlib.getRx());
		System.out.println("f(x)=x^2のx="+a+"における微分係数(計算値)は"+dlib.getDx());
		System.out.println("f(x)=x^2のx="+a+"における相対誤差は"+dlib.getRe());
	}

}
