
import java.util.*;
public class Problem4 {

	public static void main(String[] args) {
		
		int arr[] = {1,2,8,9,12,46,76,82,15,20,30};
        HashMap <Integer,Integer> hs = new HashMap<>();
        for(int i=1 ; i<=9 ; i++)
        {
        	int count =0;
        	for(int j=0 ; j< arr.length ; j++)
        	{
        		if (arr[j] %i == 0) count++;
        	}
        	hs.put( i, count);
        }
        
        for(Integer ans:hs.keySet() ) {
        	System.out.println(ans + ":" + hs.get(ans));
        }
	}

}