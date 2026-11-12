package Arrays_exp;

import java.util.Arrays;
import java.util.Scanner;

public class demo_7_array {

	public static void main(String[] args) {
		System.out.println("main method started");
		String[] names=new String[5];
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements");
        
        for(int i=0;i<names.length;i++) {
        	names[i]=sc.next();
        	
        }
        
        for(int i=0;i<names.length;i++) {
        	if(names[i].toLowerCase().startsWith("s")&& names[i].endsWith("p"));{
        		System.out.println(names[i]);
        	}
        }
       // System.out.println(Arrays.toString(names));
	}

}
