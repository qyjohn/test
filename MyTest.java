import java.util.Random;
import java.util.HashSet;

public class MyTest
{
	public static void main(String[] args)	{
		int round = 0;

		HashSet<String> hs = new HashSet<String> (); 
		while (true) {
			Random r = new Random();
			int total = r.nextInt(1000);
			String[] s = new String[total];
			for (int i=0; i<total; i++) {
				s[i] = "Value: " + i + " : " + round;
				hs.add(s[i]);
				round++;
			}
			try {
				Thread.sleep(100);
				if (round%10==0)	hs = new HashSet<String> ();
			} catch (Exception e) {}
		}
	}
}
