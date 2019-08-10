import java.util.Scanner;
class Main{
    public static void main(String args[]){
      Scanner in = new Scanner(System.in);
      int size = in.nextInt();
      int arr[] = new int[size];
      int flag = 0;
      for(int i = 0 ; i < size ; i++)
      {
        arr[i] = in.nextInt();
      }
      int search_elem_1 = in.nextInt();
      int search_elem_2 = in.nextInt();
      for(int i = 0 ; i < size ; i++)
      {
        if(search_elem_1 == arr[i])
        {
          System.out.println(i);
          flag = 1;
          break;
        }
      }
      if(flag == 0)
      {
        System.out.println("-1");
      }
      flag = 0;
      for(int i = 0 ; i < size ; i++)
      {
        if(search_elem_2 == arr[i])
        {
          System.out.println(i);
          flag = 1;
          break;
        }
      }
      if(flag == 0)
      {
        System.out.println("-1");
      }
    }
}