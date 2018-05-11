package test;

import java.io.BufferedReader;
import java.io.FileReader;

public class MainClass {

	public static void main(String[] args) {

			Samsung obj1=new Samsung();
			obj1.setS("samsung 1");
			System.out.println(obj1.getS());
		 Iphone obj=new Iphone();
		obj.print(obj1);
		System.out.println(obj1.getS());
		
		
		try(BufferedReader br=new BufferedReader(new FileReader("E://abdo.txt"))){
			
			
			System.out.println(br.readLine());}
			
			catch (Exception e) {
          e.printStackTrace();	
          }
			
		}
	
		


}

