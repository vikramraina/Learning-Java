//	Multithreading is a process of executing multiple threads simultaneously.
//		Thread is basically a lightweight subprocess, a smallest unit of processing. 
//		Multiprocessing and multithreading, both are used to achieve multitasking. 
//		But we use multithreading than mulitprocessing because threads share a common memory area. 
//		They don't allocate separate memory area so save memory, and context-switching between 
//		the threads takes less time than processes.Multithreading is mostly used in games, 
//		animation etc.A thread is a lightweight subprocess, a smallest unit of processing. 
//		It is a separate path of execution. It shares the memory area of process
//		We cannot start the same thread twice
//
//	The thread state are as: 
//	New: The thread is in new state if you create an instance of Thread class 
//		but before the invocation of start() method. 
//	Runnable: The thread is in runnable state after invocation of start() method, but the thread 
//		scheduler has not selected it to be the running thread.
//	Running:The thread is in running state if the thread scheduler has selected it.
//	Not Running (Blocked):This is the state when the thread is still alive, 
//		but is currently not eligible to run.
//	Terminated; A thread is in terminated or dead state when its run() method exits.
//
//	Thread Scheduler:
//		The thread scheduler is a part of JVM that decides which thread to run
//		Only one thread at a time can be run in a single process
//		The thread scheduler mainly preemptive and time slicing scheduling to schedule the threads.
// 	Thread Pool:
//		Thread pool represents a group of worker threads that are waiting for the job. Here, threads are executed whenever they get the job.
//		In case of thread pool, a group of fixed size threads are created. A thread from the thread pool 
//		is pulled out and assigned a job by the service provider. After completion of the job, 
//		thread is contained in the thread pool again.
//	Garbage Collection:
//		In Java garbage means unreference objects
// 		Garbage collection is reclaiming the unused memory automatically
//		There are many ways:
//		By nulling the reference
//		By assigning a reference to another
//		By annonymous object etc.

package Multithreading;

// You can also use implements runnable

public class ThreadDemo extends Thread {
	
	public void finalize() {
		System.out.println("Objects are garbage collected ===>");
	}
	
	public void run() {
		System.out.println(Thread.currentThread().getName() + " Priority:" + Thread.currentThread().getPriority() + " has started running ...");

		for (int i=1; i<5; i++ ) {
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(i);
		} 
	}
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ThreadDemo t1 = new ThreadDemo();
		ThreadDemo t2 = new ThreadDemo();
		ThreadDemo t3 = new ThreadDemo();
		
		// Comments joins to check the set names 
		t1.setName("Vikram");
		t2.setName("Deeps");
		t3.setName("Raina");
		
		// Setting the priority for threads
		//t1.setPriority(Thread.MIN_PRIORITY);
		//t2.setPriority(Thread.MAX_PRIORITY);
		
		//	There are two types of threads user thread and daemon thread. The daemon thread is 
		//		a service provider thread. It provides services to the user thread. Its life depends 
		//		on the user threads i.e. when all the user threads dies, JVM terminates this 
		//		thread automatically. The thread must not be started to make it daemon thread.
		//t1.setDaemon(true);
		
		// start() method ::Starting a thread is used to create a new thread, 
		//	It performs following tasks
		//	1: A new thread exists with new call stack
		//	2: The thread moves from new to runnable state
		//	3. When a thread gets a chance to execute, its target method will run()
		t1.start();
		
		//t1.join();
		// Sleep method is used to sleep a thread for specified time mentioned in milli seconds
		t2.start();
		//t2.join();
		// If we call t1.run and t2.run directly without calling start then there is no context switching
		//	because here t1 and t2 will be treated as normal objects not thread objects.
		//	t1.run() & t2.run()
		
		t3.start();
		t3.join();
		// Stopping Threads
		t1.stop();
		t2.stop();
		t1.stop();
		
		// For garbage collection
		//t1=null;
		//t2=null;
		//t3=null;
		
		//System.gc();
	}
}
