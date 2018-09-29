import java.util.*;
public class commandLine {
	public static void main(String args[]){
		//float a = 3.23;
		float b = 3.23f;
		try {
			for (int i=0;i<args.length;i++){
				System.out.println(args[i]);
			}
			int i = Integer.parseInt(args[0]);
			int j = Integer.parseInt(args[1]);
			float f = Float.parseFloat(args[2]);
			double d = Double.parseDouble(args[3]);
			System.out.println(args[0]+" "+args[1]+" "+(i+j)+" "+f+ " "+d);
//			System.out.println(i+j);
			System.out.println(args[100]);
		}
		catch(Exception e){
			System.out.println("Pglaaa gya ho kaa....100 values enter kre ho kaa.....");
			e.printStackTrace();
		}
	}
}
