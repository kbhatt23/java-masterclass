package concurrency;

import utils.ThreadUtils;

public class StringBuilkderSharingInThreads {
public static void main(String[] args) {
	StringBuilder sb = new StringBuilder();
	Runnable r = () -> {
		for(int i =1 ; i <=1000 ; i++) {
			synchronized (StringBuilkderSharingInThreads.class) {
				sb.append('a');	
			}
			
		}
	};
	Thread t1  =new Thread(r);
	Thread t2  =new Thread(r);
	Thread t3  =new Thread(r);
	t1.start();t2.start();t3.start();
	ThreadUtils.join(t1);
	ThreadUtils.join(t2);
	ThreadUtils.join(t3);
	System.out.println(sb.toString().length());
}
}
