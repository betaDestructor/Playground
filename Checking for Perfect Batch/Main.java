import java.util.Scanner;
class Main
{
  public static void main(String args[])
  {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int sum_new = 0,count = 0,j;
    int arr[] = new int[n];
    for(int i = 0 ; i < n ; i++)
    {
      arr[i] = in.nextInt();
    }
    int sum_old = arr[0] + arr[1] + arr[2];
    for(int i = 0 ; i < n ; i = i + 3)
    {
      for(j = i ; j < i + 3 ; j++)
      {
      	sum_new = sum_new + arr[j];
      }
      if(sum_old != sum_new)
      {
          System.out.println("Not a Perfect Batch");
          return;
      }
      sum_new = 0;
    }
    System.out.println("Perfect Batch");
  }
}