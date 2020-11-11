 /* Written by AJAY PRAJAPATI, SOFTWARE DEVELOPER AT Primary Healthtech PVT LTD;
  * Basically it's for constant length like if we want only 5 digit integer 
  * value from sensor and the value is getting  
*/
package primary_healthtect;
import java.util.ArrayList;
public class datafilter {
 
static ArrayList <Integer> raw = new ArrayList<Integer>(10);
static ArrayList <Integer> data = new ArrayList<Integer>(10);
  

   
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int index=0;
		//////////////////////////////////////////////////////////////////////
		raw.add(16056);raw.add(16056);raw.add(16057);raw.add(1605);
		raw.add(1);raw.add(16052);
		raw.add(16052);raw.add(16054);
		raw.add(1605);raw.add(4);
		raw.add(1);raw.add(6054);
		raw.add(160);raw.add(54);
		raw.add(1605);raw.add(4);
		raw.add(165);raw.add(04);
		/////////input raw data//////////////////////////////////////////////
		for(int i=0;i<raw.size();i++) {
			System.out.print( "raw data : "+raw.get(i)+"\n");
		}
		/////////////////////////////////////////////////////////////////////
		for(int a=0; a<raw.size();a++) {
			if(raw.get(a).toString().length() <5) {
				if(index==a) {}
				else {
				String temp = raw.get(a).toString();
				String temp1 = raw.get(a+1).toString();
				temp = temp.concat(temp1);
				int da1 = Integer.parseInt(temp);
				data.add(da1);
				temp="";
				temp1="";
				   index = a+1;
				 }
				 
			}
			else {
			   
				int da= raw.get(a);
			    data.add(da);
			}
		}
		System.out.print( "/////////////////\n");
		for(int f=0;f<data.size();f++) {
			System.out.print("real data are : "+data.get(f)+"\n");
		}
		}

}
