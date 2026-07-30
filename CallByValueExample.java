public class CallByValueExample
{
public static void main(String args[])
{
int num=10;
System.out.println("before calling method:"+num);
modifyValue(num);
System.out.println("after calling method:"+num);
}
public static void modifyValue(int value)
{
value=20;
System.out.println("inside method:"+value);
}
}
