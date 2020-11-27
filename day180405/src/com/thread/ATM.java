package com.thread;

public class ATM implements Runnable {

	// 현재 잔액
	private long depositeMoney = 10000;

	@Override
	public void run() {
		// TODO Auto-generated method stub

		synchronized (this) { // 제어권으 this에게 주겠다.

			for (int i = 0; i < 10; i++) { // 이 포문

				if (getDepositeMoney() <= 0) {
					break;
				}
				withDraw(1000);

				if (getDepositeMoney() == 2000 || getDepositeMoney() == 4000 || getDepositeMoney() == 6000
						|| getDepositeMoney() == 8000) {

					try {
						this.wait(); // 제어권 중지
						// Thread.sleep(1000);
					} catch (InterruptedException ie) {
						// TODO: handle exception

						ie.printStackTrace();

					}
				}
				else {
					this.notify(); // 제어권 유지?
				}
			}
		}

	}

	public long getDepositeMoney() {
		return depositeMoney;
	}



	public void setDepositeMoney(long depositeMoney) {
		this.depositeMoney = depositeMoney;
	}
	
	public void withDraw(long howMuch) {
		
		if(getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			// setDepositeMoney(getDepositeMoney()-howMuch);
			
			// 누가 가져갔는지
			System.out.println(Thread.currentThread().getName() + ", ");
			
			// 잔액
			System.out.printf("잔액 : %d원\n", getDepositeMoney());
			
		} else {
			System.out.println(Thread.currentThread().getName() + ", ");
			System.out.println("잔액이 부족합니다.");
		}
	}
	
	// public void 
	
	
	

}
