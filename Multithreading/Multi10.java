package Multithreading;

class Multi10 extends Thread{  
	 public void run(){  
	   System.out.println("running thread name is:"+Thread.currentThread().getName());  
	   System.out.println("running thread priority is:"+Thread.currentThread().getPriority());  
	  
	  }  
	 public static void main(String args[]){  
	  Multi10 m1=new Multi10();  
	  Multi10 m2=new Multi10();  
	  m1.setPriority(Thread.MIN_PRIORITY);  
	  m2.setPriority(Thread.MAX_PRIORITY);  
	  m1.start();  
	  m2.start();  
	   
	 }  
	}     