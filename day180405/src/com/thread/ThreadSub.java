package com.thread;

public class ThreadSub extends Thread {
	
	private String name;
	private String lastname;
	
	public ThreadSub(String a, String b, int x) {
		
		name = a;
		lastname = b;
		setPriority(x); // 스레드 우선 순위
		setDaemon(true); // 데몬 스레드 설정
		
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		
		// System.out.println(Thread.currentThread());
		
		System.out.println(Thread.activeCount());
		
		// 활성화 되어 있는 스레드 개수
		int xx = Thread.activeCount();
		
		Thread[] th = new Thread[xx];
		
		Thread.enumerate(th);
		
		for(int i = 0; i < th.length; i++) {
			
			System.out.println(th[i].getName() + " : " + th[i].getPriority() + " : " + th[i].isDaemon() + " : "
					+ th[i].isAlive());
			// isD... 데몬인지 아니지, is.A.. 활성화 인지 아닌지
			
			// 스레이 이름, 우선순위, 데몬스레드인지?, 아직 죽지 않은 스레드 인지?
			
		}
		
		while(true) {
			
			System.out.print("이름 : " + name);
			
			try {
				sleep(100);
			} catch (InterruptedException ie) {
				// TODO: handle exception
				
				ie.printStackTrace();
			}
			
			System.out.println("\t이름2 : " + lastname);
			
		}
						
	}

}
