import java.util.*;
public class Countfreq
{
 public static void freq(int arr[],int n)
 {
  Map<Integer,Integer> m=new HashMap<>();
  for(int i=0;i<n;i++)
  {
   if(m.containsKey(arr[i]))
   {
    m.put(arr[i],m.get(arr[i])+1);
   }
   else
   {
   m.put(arr[i],1);
   }
  }
  System.out.println(m);
 }
 public static void main(String args[])
 {
  System.out.println("Below is the frequency of repeated elements ");
  int arr[]={2,3,4,5,4,6,4,7,4,5,6,6};
  int n=arr.length;
  freq(arr,n);
  }
}

Output______________________________________________________________________________________________
{2=1, 3=1, 4=4, 5=2, 6=3, 7=1}