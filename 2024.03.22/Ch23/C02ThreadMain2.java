package Ch23;

public class C02ThreadMain2 {

	public static void main(String[] args)throws Exception{
		
		
//		-- Runnable 사용
		
		//01 작업스레드 객체 생성
		C02Worker1 worker1=new C02Worker1();
		C02Worker2 worker2=new C02Worker2();
		
//		02 스레드별 공간 분리
		Thread th1=new Thread(worker1);
		Thread th2=new Thread(worker2);
		
		
//		03 스레드 실행
		th1.start();
		th2.start();
		
		//----------
		//--Thread사용
		//----------
		new Thread(){

			@Override
			public void run() {
				for(int i=0;i<5;i++) {
					System.out.println("test03...");
					try {
						Thread.sleep(300);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			}
			
		}.start();


		new Thread(()->{
		
				for(int i=0;i<5;i++) {
					System.out.println("test04...");
					try {
						Thread.sleep(700);
					} catch (InterruptedException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
			
		}).start();
		

	}

}
