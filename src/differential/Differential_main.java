package differential;

/* 
Input Value of a > 1
Input Value of h > 0.00000001
f(x)=x^2��x=1.0�ɂ���������W��(���_�l)��2.0
f(x)=x^2��x=1.0�ɂ���������W��(�v�Z�l)��1.999999987845058
f(x)=x^2��x=1.0�ɂ����鑊�Ό덷��6.07747097092215E-7
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
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W��(���_�l)��"+dlib.getRx());
		System.out.println("f(x)=x^2��x="+a+"�ɂ���������W��(�v�Z�l)��"+dlib.getDx());
		System.out.println("f(x)=x^2��x="+a+"�ɂ����鑊�Ό덷��"+dlib.getRe());
	}

}
