
public class Sort{
	public static int[] sortInt(int[] nums){
		int[] newNums = nums.clone();
		boolean stillSorting = true;
		int temp;
		while(stillSorting){
			stillSorting = false;
			for(int i = 0; i <  newNums.length-1; i++){
				if(newNums[i] > newNums[i+1]){
					temp = newNums[i] ;
					newNums[i] = newNums[i+1];
					newNums[i+1] = temp;
					stillSorting = true;
}
				


}
}
return newNums;
}
public static void main(String args[]){
int[] x = {9,8,7};
x = Sort.sortInt(x);
for(int a : x) System.out.println(a);
}
}
