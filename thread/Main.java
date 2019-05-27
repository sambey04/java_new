public class Main {  
  public static void main(String[] args) {  
	  
    final String resource1 = "sam0";  
    final String resource2 = "sam1";  
    final String resource3 = "sam2";  
    final String resource4 = "sam3";  
    final String resource5 = "sam4";  
    
    
    Thread t1 = new Thread() {  
      public void run() {  
          synchronized (resource1) {  
           System.out.println("Thread 1: locked resource 1");  
  
           try { Thread.sleep(100);} catch (Exception e) {}  
  
           synchronized (resource2) {  
            System.out.println("Thread 1: locked resource 2");  
           }  
         }  
      }  
    };  
  
    Thread t2 = new Thread() {  
      public void run() {  
        synchronized (resource2) {  
          System.out.println("Thread 2: locked resource 2");  
  
          try { Thread.sleep(100);} catch (Exception e) {}  
  
          synchronized (resource1) {  
            System.out.println("Thread 2: locked resource 1");  
          }  
        }  
      }  
    };  
  
      Thread t3 = new Thread() {  
      public void run() {  
        synchronized (resource3) {  
          System.out.println("Thread 3: locked resource 2,1");  
  
          try { Thread.sleep(100);} catch (Exception e) {}  
  
          synchronized (resource2) {  
            System.out.println("Thread 1,3: locked resource 2");  
          }  
        }  
      }  
    };  
  
 Thread t4 = new Thread() {  
      public void run() {  
        synchronized (resource4) {  
          System.out.println("Thread 4: locked resource 1,2,3");  
  
          try { Thread.sleep(100);} catch (Exception e) {}  
  
          synchronized (resource3) {  
            System.out.println("Thread 1,2,4: locked resource 3");  
          }  
        }  
      }  
    };  
  
    Thread t5 = new Thread() {  
      public void run() {  
        synchronized (resource5) {  
          System.out.println("Thread 5: locked resource 1,2,3,4");  
  
          try { Thread.sleep(100);} catch (Exception e) {}  
  
          synchronized (resource1) {  
            System.out.println("Thread 2,3,4: locked resource 1");  
          }  
        }  
      }  
    };  
  
 
    t1.start();  
    t2.start();  
    t3.start();  
    t4.start();  
    t5.start();  
  
  }  
} 
