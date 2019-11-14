import java.util.*;
class SubArr
{
    public static void main(String[] args)
    {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=s.nextInt();
        }
        int k=s.nextInt();

        int z=((n-(k-1))*(n-(k-1)+1))/2;
        System.out.println(z);
    }
}