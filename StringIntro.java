import java.util.*;
public class StringIntro{
	public static void main(String args[]){
		String a = "Hello "; // It is a ref and initialized with string literal
		String b =  new String("World");//It is a ref and initialized with new and constructor to contain a string literal
		String c = "Hello ";
		String d =  new String("World");
		String e = "H1";
		e = e + "Guneet";
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
		System.out.println(a+" "+b+" "+c+" "+d+" "+e);
                System.out.println(a==c);
                System.out.println(a==e);
                System.out.println(c==d);
	}


} 
