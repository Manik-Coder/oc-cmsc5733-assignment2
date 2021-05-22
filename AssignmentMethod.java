
/**
 * Write a description of CheckAddition here.
 * 
 * @author (Manik) 
 * @version (5/21/2021)
 */
import java.util.*;
public class CheckAddition {

public static boolean Checker(int [] ar,int target) {
		Arrays.sort(ar);
	    for (int i = 0, j = ar.length - 1; i < j;) {
	        int sum = ar[i] + ar[j];
	        if (sum < target)
	            i++;
	        else if (sum > target)
	            j--;
	        else
	            return true;
	    }
	    return false;
		
	}
   
