import java.util.Scanner;

public class threenum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr=new int[5];
        for(int i=0;i<3;i++)
        {
            int num=sc.nextInt();
            arr[i]=num;
        }
        for(int i=0;i<3;i++)
        {
            for(int j=i+1;j<3;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        for(int i=0;i<3;i++)
        {
            System.out.println(arr[i]);
        }
    }
}
