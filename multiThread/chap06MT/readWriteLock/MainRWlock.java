package multiThread.chap06MT.readWriteLock;

public class MainRWlock {

    public static void main(String[] args) {
        var data = new ReadWriteData(10);
        new ReadThread(data).start();
        new ReadThread(data).start();
        new ReadThread(data).start();
        new ReadThread(data).start();
        new ReadThread(data).start();
        new ReadThread(data).start();
        new WriteThread(data, "ABCDEFGHIJKLMNOPQRSTUVWXYZ").start();
        new WriteThread(data, "abcdefghijklmnopqrstuvwxyz").start();
    }//main()

}//class

/*
Thread-2 reads {*, *, *, *, *, *, *, *, *, *}
Thread-4 reads {*, *, *, *, *, *, *, *, *, *}
Thread-3 reads {*, *, *, *, *, *, *, *, *, *}
Thread-5 reads {*, *, *, *, *, *, *, *, *, *}
Thread-0 reads {*, *, *, *, *, *, *, *, *, *}
Thread-1 reads {*, *, *, *, *, *, *, *, *, *}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-0 reads {a, a, a, a, a, a, a, a, a, a}
Thread-3 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {a, a, a, a, a, a, a, a, a, a}
Thread-2 reads {a, a, a, a, a, a, a, a, a, a}
Thread-5 reads {a, a, a, a, a, a, a, a, a, a}
Thread-1 reads {a, a, a, a, a, a, a, a, a, a}
Thread-4 reads {B, B, B, B, B, B, B, B, B, B}
Thread-3 reads {B, B, B, B, B, B, B, B, B, B}
Thread-5 reads {B, B, B, B, B, B, B, B, B, B}
Thread-1 reads {B, B, B, B, B, B, B, B, B, B}
Thread-2 reads {B, B, B, B, B, B, B, B, B, B}
Thread-0 reads {B, B, B, B, B, B, B, B, B, B}
Thread-4 reads {B, B, B, B, B, B, B, B, B, B}
Thread-1 reads {B, B, B, B, B, B, B, B, B, B}
Thread-5 reads {B, B, B, B, B, B, B, B, B, B}
Thread-3 reads {B, B, B, B, B, B, B, B, B, B}
Thread-2 reads {B, B, B, B, B, B, B, B, B, B}
Thread-0 reads {B, B, B, B, B, B, B, B, B, B}
Thread-1 reads {B, B, B, B, B, B, B, B, B, B}
Thread-4 reads {B, B, B, B, B, B, B, B, B, B}
Thread-3 reads {B, B, B, B, B, B, B, B, B, B}
Thread-5 reads {B, B, B, B, B, B, B, B, B, B}
Thread-0 reads {B, B, B, B, B, B, B, B, B, B}
Thread-2 reads {B, B, B, B, B, B, B, B, B, B}
Thread-4 reads {B, B, B, B, B, B, B, B, B, B}
Thread-3 reads {B, B, B, B, B, B, B, B, B, B}
Thread-1 reads {B, B, B, B, B, B, B, B, B, B}
Thread-5 reads {B, B, B, B, B, B, B, B, B, B}
Thread-0 reads {B, B, B, B, B, B, B, B, B, B}
Thread-2 reads {B, B, B, B, B, B, B, B, B, B}
Thread-3 reads {B, B, B, B, B, B, B, B, B, B}
Thread-1 reads {B, B, B, B, B, B, B, B, B, B}
Thread-5 reads {B, B, B, B, B, B, B, B, B, B}
Thread-0 reads {B, B, B, B, B, B, B, B, B, B}
Thread-4 reads {B, B, B, B, B, B, B, B, B, B}
Thread-2 reads {B, B, B, B, B, B, B, B, B, B}
Thread-1 reads {B, B, B, B, B, B, B, B, B, B}
Thread-3 reads {B, B, B, B, B, B, B, B, B, B}
Thread-5 reads {B, B, B, B, B, B, B, B, B, B}
Thread-0 reads {B, B, B, B, B, B, B, B, B, B}
Thread-2 reads {B, B, B, B, B, B, B, B, B, B}
Thread-4 reads {B, B, B, B, B, B, B, B, B, B}
Thread-1 reads {B, B, B, B, B, B, B, B, B, B}
Thread-3 reads {B, B, B, B, B, B, B, B, B, B}
Thread-5 reads {B, B, B, B, B, B, B, B, B, B}
Thread-4 reads {B, B, B, B, B, B, B, B, B, B}
Thread-2 reads {B, B, B, B, B, B, B, B, B, B}
Thread-0 reads {B, B, B, B, B, B, B, B, B, B}
Thread-3 reads {B, B, B, B, B, B, B, B, B, B}
Thread-1 reads {B, B, B, B, B, B, B, B, B, B}
Thread-5 reads {B, B, B, B, B, B, B, B, B, B}
Thread-0 reads {B, B, B, B, B, B, B, B, B, B}
Thread-4 reads {B, B, B, B, B, B, B, B, B, B}
Thread-2 reads {B, B, B, B, B, B, B, B, B, B}
Thread-4 reads {b, b, b, b, b, b, b, b, b, b}
Thread-2 reads {b, b, b, b, b, b, b, b, b, b}
Thread-0 reads {b, b, b, b, b, b, b, b, b, b}
Thread-3 reads {b, b, b, b, b, b, b, b, b, b}
Thread-5 reads {b, b, b, b, b, b, b, b, b, b}
Thread-1 reads {b, b, b, b, b, b, b, b, b, b}
  :
Thread-1 reads {D, D, D, D, D, D, D, D, D, D}
Thread-1 reads {d, d, d, d, d, d, d, d, d, d}
Thread-5 reads {d, d, d, d, d, d, d, d, d, d}
Thread-4 reads {d, d, d, d, d, d, d, d, d, d}
Thread-2 reads {d, d, d, d, d, d, d, d, d, d}
Thread-3 reads {d, d, d, d, d, d, d, d, d, d}
Thread-0 reads {d, d, d, d, d, d, d, d, d, d}
Thread-5 reads {E, E, E, E, E, E, E, E, E, E}
Thread-1 reads {E, E, E, E, E, E, E, E, E, E}
Thread-3 reads {E, E, E, E, E, E, E, E, E, E}
Thread-4 reads {E, E, E, E, E, E, E, E, E, E}
Thread-0 reads {E, E, E, E, E, E, E, E, E, E}
Thread-2 reads {E, E, E, E, E, E, E, E, E, E}
Thread-5 reads {E, E, E, E, E, E, E, E, E, E}
Thread-3 reads {E, E, E, E, E, E, E, E, E, E}
Thread-1 reads {E, E, E, E, E, E, E, E, E, E}
Thread-4 reads {E, E, E, E, E, E, E, E, E, E}
Thread-0 reads {E, E, E, E, E, E, E, E, E, E}
Thread-2 reads {E, E, E, E, E, E, E, E, E, E}
Thread-5 reads {E, E, E, E, E, E, E, E, E, E}
Thread-1 reads {E, E, E, E, E, E, E, E, E, E}
Thread-3 reads {E, E, E, E, E, E, E, E, E, E}
Thread-2 reads {E, E, E, E, E, E, E, E, E, E}
Thread-4 reads {E, E, E, E, E, E, E, E, E, E}
Thread-0 reads {E, E, E, E, E, E, E, E, E, E}
Thread-1 reads {E, E, E, E, E, E, E, E, E, E}
Thread-5 reads {E, E, E, E, E, E, E, E, E, E}
Thread-3 reads {E, E, E, E, E, E, E, E, E, E}
Thread-4 reads {E, E, E, E, E, E, E, E, E, E}
Thread-0 reads {E, E, E, E, E, E, E, E, E, E}
Thread-2 reads {E, E, E, E, E, E, E, E, E, E}
Thread-1 reads {E, E, E, E, E, E, E, E, E, E}
Thread-5 reads {E, E, E, E, E, E, E, E, E, E}
Thread-3 reads {E, E, E, E, E, E, E, E, E, E}
Thread-4 reads {E, E, E, E, E, E, E, E, E, E}
Thread-2 reads {E, E, E, E, E, E, E, E, E, E}
Thread-0 reads {E, E, E, E, E, E, E, E, E, E}

*/