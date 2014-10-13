import java.util.regex.*;

public class RegularEpression {

	public static void main(String[] args) {
		String line = "Hello my name is 007 Vikram Raina";
		
		// Testing different patterns
		//String pattern = "(.*)(\\d+)(.*)";
		String pattern = "(\\d+)";
		
		Pattern p = Pattern.compile(pattern);
		Matcher m = p.matcher(line);
		
		if (m.find()) {
			for (int i =0; i< m.groupCount(); i++)
				System.out.println("Found Value::" + m.group(i));
		}else
			System.out.println("No Match Found");
	}
}