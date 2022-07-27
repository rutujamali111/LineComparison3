import java.util.Scanner;

public class LineComparison {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Enter starting co-ordinates of line");
		int x1=sc.nextInt();
		 int y1=sc.nextInt();
		System.out.println("Enter end co-ordinats of line");
		 int x2=sc.nextInt();
		 int y2=sc.nextInt();
		double length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		System.out.println("Length of line is: "+length);
	}

}

