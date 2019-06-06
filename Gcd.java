import java.util.*;
import java.util.*;
public class Gcd
{
public static void main(String[] args)
{
int a,b,i;
Scanner sc=new Scanner(System.in);
a=sc.nextInt();
b=sc.nextInt();
while(a!=b)
{
if(a>b)
a-=b;
else
b-=a;
}
}
}
}

