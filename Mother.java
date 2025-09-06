class Father
{ 
  Father show()
  {
    System.out.println("Show from Father");
	return new Father();
  }
}
 class Mother extends Father
 {
   Mother show()
   {
     System.out.println("Show from Mother");
	 return new Mother();
   }
   public static void main(String... h)
   {
     Mother m=new Mother();
	 m.show();
   }
}