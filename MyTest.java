//Write a recursive function to compute the 
//count of vowels and consonants in a string

class MyTest
{
    public static void findVaC()
{
   String name;
   System.out.print("Enter a String - ");
   name=new java.util.Scanner(System.in).nextLine();
   int countVowels=0, countConsonants=0, countDigits=0;
   if(name!=null)
   {
    for(int i=0;i<name.length();i++)
    {
     if(name.charAt(i)=='A' || name.charAt(i)=='E' || name.charAt(i)=='I' || name.charAt(i)=='O'|| name.charAt(i)=='U'|| name.charAt(i)=='a'|| name.charAt(i)=='e'||name.charAt(i)=='i' ||name.charAt(i)=='o'||name.charAt(i)=='u')
	 {
	    countVowels++;
	 }
	 else if(Character.isDigit(name.charAt(i)))
	 {
	    countDigits++;
	 }
	 else
	 {
	   countConsonants++;
	 }
    }
   System.out.println("Total Vowels in "+ name + " is - "+countVowels);
   System.out.println("Total Vowels in "+ name + " is - "+countConsonants);
   System.out.println("Total Digits in "+ name + " is - "+countDigits);
  }
}

public static void main(String... fgf)
{
    findVaC();
}
}




