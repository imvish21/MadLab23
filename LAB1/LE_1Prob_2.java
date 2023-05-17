public class Main{
	public static void main(String[] args) {
		int n=1;
		int i;
		while(n<=4){
		    i=4-n;
		    while(i>0){
		        System.out.print(" ");
		        i--;
		    }
		    i=1;
		    while(i<=n){
		        System.out.print("* ");
		        i++;
		    }
		    System.out.println();
		    n++;
		}
		System.out.println();
		n=1;
		while(n<=4){
		    i=2;
		    while(i<=n){
		        System.out.print(" ");
		        i++;
		    }
		    i=5-n;
		    while(i>0){
		        System.out.print("* ");
		        i--;
		    }
		    System.out.println();
		    n++;
		}
	}
}