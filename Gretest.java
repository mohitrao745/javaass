public class Gretest{
	public static void main(String[] args){
		int a= 16;
		int b=34;
		int c=7;
		
		if(a>b && a>c){
			System.out.print(a+" is the greatest number");
		}
		else if(b>a && b>c){
			System.out.print(b+" is the greatest number");
		}
		else{
			System.out.print(c+" is the greatest number");
		}
	}
}