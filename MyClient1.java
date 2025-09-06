import java.io.*;
import java.net.*;
class MyClient1
{
public static void main(String arr[])
{
try
{
//Socket so = new Socket("localhost", 8080);
Socket so1 = new Socket("localhost", 9999);
//DataOutputStream d = new DataOutputStream(so.getOutputStream());
DataOutputStream d1 = new DataOutputStream(so1.getOutputStream());
//d.writeUTF("Hello ");
//d.flush();
//d.close();
//so.close();
d1.writeUTF("Hii ");
d1.flush();
d1.close();
so1.close();
}
catch(Exception ae)
{
System.out.println(ae);
}
}
}