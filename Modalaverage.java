//program to implement modal average of an given arraylist
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;
public class modalavg {
	static  ArrayList<Integer> filtereddata = new ArrayList<Integer>(10);
	 public static void main(String[] args) {
		
		// TODO Auto-generated method stub
	 	filtereddata.add(16014);	filtereddata.add(16054);	filtereddata.add(16004);	
	 	filtereddata.add(16054);	filtereddata.add(16054);	filtereddata.add(16004);	
	 	filtereddata.add(16004);	filtereddata.add(16004);	filtereddata.add(16034);	
	 	filtereddata.add(16004);
 
        Collections.sort(filtereddata,Collections.reverseOrder());//dec
        
        for(int x=0;x<filtereddata.size();++x) {
        	System.out.print("["+filtereddata.get(x)+"]");
        }
        
        System.out.print("\n------------------------------------------------------------------------\n"); 
        int element=0;
        int count = 0;
        
        for(int i=0;i<filtereddata.size();++i) {
        	
        	int tempcount1=0;
    		int tempelement = filtereddata.get(i);
    		
        	for(int j=0;j<filtereddata.size();++j) {
        		if(filtereddata.get(j)==tempelement)tempcount1++;
        	  if(tempcount1>count) {
        		  element = tempelement;
        		  count = tempcount1; 
        	  }
        	  
        	  
        	}
         }
        System.out.print("Element: "+element+", Frequency: "+count);
	 }
}
