import java.util.*;
class Main{
	public static void main(String[] args){
	Scanner in = new Scanner(System.in);
    int base = in.nextInt();
    int exp = in.nextInt();
    int p = pow(base,exp);
    System.out.println(p);
}
  public static int pow(int b, int e)
  {
    int p = 1;
    for(int i = e ; i > 0 ; i--)
      p = p * b;
    return p;
  }
}