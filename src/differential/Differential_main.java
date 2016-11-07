package differential;

/* 
Input Value of a > 1
Input Value of h > 0.00000001
f(x)=x^2‚Ìx=1.0‚É‚¨‚¯‚é”÷•ªŒW”(—˜_’l)‚Í2.0
f(x)=x^2‚Ìx=1.0‚É‚¨‚¯‚é”÷•ªŒW”(ŒvZ’l)‚Í1.999999987845058
f(x)=x^2‚Ìx=1.0‚É‚¨‚¯‚é‘Š‘ÎŒë·‚Í6.07747097092215E-7
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
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ªŒW”(—˜_’l)‚Í"+dlib.getRx());
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é”÷•ªŒW”(ŒvZ’l)‚Í"+dlib.getDx());
		System.out.println("f(x)=x^2‚Ìx="+a+"‚É‚¨‚¯‚é‘Š‘ÎŒë·‚Í"+dlib.getRe());
	}

}
