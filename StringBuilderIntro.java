public class StringBuilderIntro {
	public static void main(String[] args){
		StringBuilder str = new StringBuilder(100);
		StringBuilder str1 = new StringBuilder("My Name is ");
		StringBuilder str2 = new StringBuilder("My Name is ");
		System.out.println(str1.length()+" "+str2.capacity()+" "+ str.length() +" "+str.capacity()); 
		System.out.println(str1);
		System.out.println(str2);
		StringBuilder hello = new StringBuilder("Guneet");
		int i=0;
		while(i<40){
			hello.append(" ");
			System.out.println(hello.capacity());
			i++;
		}
		//System.out.println(str);
		str.append("Thanos gaya");
		System.out.println(str);
		str.insert(6," aa");
		System.out.println(str);
		str.delete(0,6);
		System.out.println(str);
		str.insert(0,"Main");
		System.out.println(str);
		str.reverse();
		System.out.println(str);



	}
}
