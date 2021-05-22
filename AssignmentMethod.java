
/**
 * Write a description of CheckAddition here.
 * 
 * @author (Manik) 
 * @version (5/21/2021)
 */
import java.util.*;
public class CheckAddition {

public static boolean Checker(int[] arr,int target)
{
for(int i=0;i<arr.length;i++)
{
    for(int j=i+1;j<arr.length;j++)
    {
        int x=arr[i];
        int y=arr[j];
        if((x+y)==target)
        return true;
    }
}
return false;
}
   
