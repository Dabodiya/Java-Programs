import java.io.*;
import java.net.*;
class MyClient2
{
public static void main(String arr[])
{
try
{
Socket so = new Socket("localhost", 8080);

DataOutputStream d = new DataOutputStream(so.getOutputStream());

d.writeUTF("Hello ");
d.flush();
d.close();
so.close();

}
catch(Exception ae)
{
System.out.println(ae);
}
}
}