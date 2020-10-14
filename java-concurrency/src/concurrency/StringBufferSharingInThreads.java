package concurrency;

import utils.ThreadUtils;

public class StringBufferSharingInThreads {
public static void main(String[] args) {
	StringBuffer sb = new StringBuffer();
	//StringBuilder sb = new StringBuilder();
	Runnable r = () -> {
		for(int i =1 ; i <=10000 ; i++) {
			//synchronized (StringBufferSharingInThreads.class) {
				sb.append('a');	
			//}
			
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
