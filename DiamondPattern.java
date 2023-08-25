package homeworks;

public class DiamondPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for(int i=0;i<=6;i++) {
			for(int j=i;j<6;j++) {
				System.out.print(" ");
			}for(int k=1;k<=i*2+1;k++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=5;i>=0;i--) {
			for(int j=5;j>=i;j--) {
				System.out.print(" ");
			}for(int k=i*2+1;k>0;k--) {
				System.out.print("*");
			}System.out.println();
		}

	}

}
