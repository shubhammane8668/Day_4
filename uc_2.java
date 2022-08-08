
public class uc_2 {

	public static void main(String[] args) {
		/*
		 * constants
		 */
	int IS_FULL_TIME=1;
	int EMP_RATE_PER_HOUR=20;
	
	/*
	 * variables
	 */
	int emphrs = 0;
	int empwage =0;
	 
    /*
     * computation
	 */
		double empcheck =Math.floor(Math.random()*10)%2;
		if (empcheck == IS_FULL_TIME)
			
		    emphrs =8;
		else
			
		    emphrs= 0;
		    empwage = emphrs * EMP_RATE_PER_HOUR;
		System.out.println("EmpWage :" + empwage );	
	}

}
