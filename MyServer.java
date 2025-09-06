import java.io.*;
import java.net.*;
public class MyServer
{
public static void main(String arr[])
{
try
{
ServerSocket s = new ServerSocket(8080);
ServerSocket s1 = new ServerSocket(9999);
Socket so = s.accept();
Socket so1 = s1.accept();
DataInputStream d = new DataInputStream(so.getInputStream());
DataInputStream d1 = new DataInputStream(so1.getInputStream());
//String str = (String)d.readUTF();
//String str1 = (String)d1.readUTF();
System.out.println("message = " +(String)d.readUTF());
System.out.println("message = " +(String)d1.readUTF());
so.close();
so1.close();
}
catch(Exception ae)
{
System.out.println(ae);
}
}
}