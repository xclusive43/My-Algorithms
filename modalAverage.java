//Todo: written by: Ajay Prajapati Software Engineer at Primary Healthtech //
import java.util.ArrayList;
import java.util.Collections;
public class newmodavg3 {
	 static int R = 10;   // R is the number of data point/ readings; res: result after applying the filters ;
	 static int res = 0;
	 static int max_count = 1;
	 static int curr_count = 1;
	 
	 public static int mod(ArrayList<Integer> raw) {
		 
		 Collections.sort(raw);//sortng in ASC//
		 
	  for(int i=0;i<raw.size()-1;i++) {
		  
		 System.out.print("\ndata:"+raw.get(i));
//		  int a =raw.get(i);
//		  int j = raw.get(i+1);
		  
			 if(raw.get(i).equals(raw.get(i+1))) {
				 
				System.out.print("if->"+i);
				 curr_count+=1;

				 if((i==(R-2))&& (curr_count>max_count)) {
					 res = raw.get(R-1);
				 }
			 }
			 else {
				// System.out.print("\nelse->"+i);
				 
				 if(curr_count>max_count) {
					 max_count = curr_count;
					 res = raw.get(i-1);
				 }
				 curr_count =1;
			 }
			 
		 }
		 if(res==0) {
			 System.out.print("\nres: "+res);
			 res = Math.round((raw.get(R/2)+raw.get((R/2)-1))/2);
			 
		 }
		 
		 System.out.print("\nres: "+res);
		 return res;
		 
	 }
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		 final ArrayList <Integer> data = new ArrayList<Integer>(15);
			
		  data.add(16530);
		  data.add(16524);
		  data.add(16521);
		  data.add(16521);
		  data.add(16546);
		  data.add(16546);
		  data.add(16522);
		  data.add(16522);
		  data.add(16543);
		  data.add(16543);
		  data.add(16549);
		 
		  
		 int re =  mod(data);
		 System.out.print("\nmodalaverage--> "+re);

	}

}
