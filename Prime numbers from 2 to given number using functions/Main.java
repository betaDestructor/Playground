import java.util.Scanner;
class Main{
	public static void main (String[] args){
	    // Type your code here
      Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    for(int i = 2 ; i <= n ; i++)
    {
      if(isPrime(i))
    	System.out.println(i);
    }
	}
  public static boolean isPrime(int n)
  {
    if(n == 2)
    {
      return true;
    }
    for(int i = 2 ; i < (n/2 + 1) ; i++)
    {
      if(n % i == 0)
      {
        //System.out.println(n + " is not prime because " + n + "/" + i +"is not zero");
        return false;
      }
    }
    return true;
  }
}