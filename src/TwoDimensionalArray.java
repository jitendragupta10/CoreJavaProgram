import java.util.Scanner;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		int a[][] = new int [2][2];
		System.out.print("Enter array elements: ");
		Scanner s = new Scanner(System.in);
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++) {
				a[i][j] = s.nextInt();
			}
		}
		System.out.print("\nMatrix Elements:\n");
		for(int i=0;i<2;i++)
		{
			for(int j=0;j<2;j++) {
				System.out.println(a[i][j]);
	}
			System.out.println();
			

}
	}
}
