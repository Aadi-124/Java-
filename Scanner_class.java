import java.util.*;

// Program1:- 

// public class Scanner_class
// {
// 	public static void main(String[] args)
// 	{
// 		Scanner sc = new Scanner(System.in);
		
// 		System.out.print("Enter an Integer Number: ");
// 		int num = sc.nextInt();
// 		sc.skip("\n");    // This is need to skip the new line characte which is generated by 'Enter' key.
// 		System.out.print("Enter a String: ");
// 		String str = sc.nextLine();

// 		System.out.println("Enter double or float: ");
// 		float flt = sc.nextFloat();

// 		System.out.println("Integer = "+num);
// 		System.out.println("String = "+str);
// 		System.out.println("Float = "+flt);

// 		sc.close();
// 	}
// }





// Program2:- 
class Scanner_class
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		
		int len,bre,area,peri;

		System.out.println("Enter length of Box : ");
		len = scan.nextInt();

		System.out.println("Enter breadth of Box: ");
		bre = scan.nextInt();

		scan.close();

		area = len*bre;
		peri = 2*(len+bre);

		System.out.println("Area of Box: "+area);
		System.out.println("Perimeter of Box: "+peri);

	}
}











