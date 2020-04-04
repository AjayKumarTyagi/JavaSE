import java.util.*;

class CRC{
    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of bits in generating polynomial: ");
        int m = sc.nextInt();

        System.out.print("Enter the number of bits in message: ");
        int n = sc.nextInt();

        int[] message = new int[m + n];

        int[] polynomial = new int[m];

        System.out.print("Enter message bits: \n");
        int i;
        for(i = 0;i < n; i++)
            message[i] = sc.nextInt();

        System.out.print("Enter generating polynomial bits: \n");
        int j;
        for(j = 0; j < m; j++)
            polynomial[j]=sc.nextInt();

        for(i = 0; i < m-1; i++)
            message[n+i]=0;

        int[] result = new int[m+n];
        for(i = 0; i < m; i++)
            result[i] = message[i];

        int k, l;
        for(i = 0;i < n; i++)
        {
            k = 0;
            l = result[i];
            for(j = i; j < m+i; j++)
            {
                if(l==0)
                    result[j] = XOR(result[j], 0);
                else
                    result[j] = XOR(result[j], polynomial[k]);
                k++;
            }
            result[m+i] = message[m+i];
        }

        System.out.print("The bits going to be appended are: ");
        for(i = n; i < n+m-1; i++)
        {
            message[i]=result[i];
            System.out.print(message[i]);
        }
        System.out.print("\nThe encoded message is : ");
        for(i = 0; i < n+m-1; i++)
        {
            System.out.print(message[i]);
        }
    }
    public static int XOR(int x, int y)
    {
        if(x == y)
            return(0);
        else
            return(1);
    }
}