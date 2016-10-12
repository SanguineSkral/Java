class DecBin{
	public static void main (String a[]){
	
	int n;
	String bin; String hex;
	for (n = 0; n <= 255; n ++){
			System.out.print(n);
			bin = Integer.toBinaryString(n);
			hex = Integer.toHexString(n);
			System.out.println("    "+hex+"    "+bin);

		}
		
	}
}
/*
 * 			System.out.print(" ");
			System.out.print(bin);
			System.out.print(" ");
			System.out.print(hex);
			System.out.println();
*
*
*/
