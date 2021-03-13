/*Written BY:  AJAY PRAJAPATI
 * Java program to Schedule task and Show Remaining Time in mins, and sec for 3min*/
package primary_healthtect;

import java.util.Timer;
import java.util.TimerTask;

public class timer {
	static int timercounter =0;
	static int min=2,sec=60;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.print("time Counter\n");
		Timer timer = new Timer();
		timer.schedule(new TimerTask() {
			 
			@Override
			public void run() {
				// TODO Auto-generated method stub
				
				
				if(timercounter!=180) {
					timercounter ++;
					
					display(1);
					
				}
				else {
					//System.out.print("time"+timercounter+"\n");
					timer.cancel();
				}
				
			}

			
			
		},0,100);
		
		 

	}
	
	public static void display(int time) {
		// TODO Auto-generated method stub
		//System.out.print("time"+time+"\n");
		sec = sec -time;
		if(sec==0) {
			if(min==0 & sec==0) {
				System.out.print(min+":"+sec+"\n");
				
			}
			else {
				min--;
				System.out.print(min+":"+sec+"\n");
				sec = 60;
			}
			
		} 
		
		System.out.print(min+":"+sec+"\n");
	
		
		
		
	}
	
}
/*OUTPUT:
time Counter
2:59
2:58
2:57
2:56
2:55
2:54
2:53
2:52
2:51
2:50
2:49
2:48
2:47
2:46
2:45
2:44
2:43
2:42
2:41
2:40
2:39
2:38
2:37
2:36
2:35
2:34
2:33
2:32
2:31
2:30
2:29
2:28
2:27
2:26
2:25
2:24
2:23
2:22
2:21
2:20
2:19
2:18
2:17
2:16
2:15
2:14
2:13
2:12
2:11
2:10
2:9
2:8
2:7
2:6
2:5
2:4
2:3
2:2
2:1
1:0
1:60
1:59
1:58
1:57
1:56
1:55
1:54
1:53
1:52
1:51
1:50
1:49
1:48
1:47
1:46
1:45
1:44
1:43
1:42
1:41
1:40
1:39
1:38
1:37
1:36
1:35
1:34
1:33
1:32
1:31
1:30
1:29
1:28
1:27
1:26
1:25
1:24
1:23
1:22
1:21
1:20
1:19
1:18
1:17
1:16
1:15
1:14
1:13
1:12
1:11
1:10
1:9
1:8
1:7
1:6
1:5
1:4
1:3
1:2
1:1
0:0
0:60
0:59
0:58
0:57
0:56
0:55
0:54
0:53
0:52
0:51
0:50
0:49
0:48
0:47
0:46
0:45
0:44
0:43
0:42
0:41
0:40
0:39
0:38
0:37
0:36
0:35
0:34
0:33
0:32
0:31
0:30
0:29
0:28
0:27
0:26
0:25
0:24
0:23
0:22
0:21
0:20
0:19
0:18
0:17
0:16
0:15
0:14
0:13
0:12
0:11
0:10
0:9
0:8
0:7
0:6
0:5
0:4
0:3
0:2
0:1
0:0
0:0*/
