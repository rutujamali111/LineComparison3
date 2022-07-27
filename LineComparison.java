import java.util.Scanner;

public class LineComparison {
	Scanner sc=new Scanner(System.in);
	double LengthOfLine()
	{
		System.out.println("Enter starting co-ordinates of line");
		int x1=sc.nextInt();
		 int y1=sc.nextInt();
		System.out.println("Enter end co-ordinats of line");
		 int x2=sc.nextInt();
		 int y2=sc.nextInt();
		double length=Math.sqrt(Math.pow((x2-x1),2)+Math.pow((y2-y1),2));
		return length;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LineComparison line=new LineComparison();
		double length_of_line_1=line.LengthOfLine();
		double length_of_line_2=line.LengthOfLine();
		if(length_of_line_1==length_of_line_2)
			System.out.println("Two lines are equal...");
		else 
			System.out.println("not euals");
		
	}

}


