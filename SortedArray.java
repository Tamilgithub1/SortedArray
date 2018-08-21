import java.util.*;
public class te {
public static void main(String[] args) {
	Scanner in=new Scanner(System.in);
	int arrSize=in.nextInt();
	int arr[]=new int[arrSize];
	for(int i=0;i<arr.length;i++) {
		arr[i]=in.nextInt();
	}
	Arrays.sort(arr);
	for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
	}
}
}
