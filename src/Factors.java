
public class Factors {
	public static void main(String[] args) {
		for(int i = 0; i < args.length; i++) {
			int n = Integer.parseInt(args[i]);
			System.out.print("Integer: " + n + " Factors: ");
			for(int j = 1; j < (n/2)+1; j++) {
				if(n % j ==0) {
					System.out.print(j + " ");
				}
			}
			System.out.println(n);
		}
	}
}
