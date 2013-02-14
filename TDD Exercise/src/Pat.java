
public class Pat {
	public static int pat (String subject, String pattern) 
	{ 
	// Post: if pattern is not a substring of subject, return -1 
		//	       else return (zero-based) index where the pattern (first) 
		//	       starts in subject 
		
		
		return subject.indexOf(pattern);
	} 

}
