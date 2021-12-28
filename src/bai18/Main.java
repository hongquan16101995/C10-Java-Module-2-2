package bai18;

public class Main {
    public static void main(String[] args) {
        MyThread myThread = new MyThread();
        MyThread2 myThread2 = new MyThread2();
        Thread thread = new Thread(myThread2);

        myThread.start(); //khởi động luồng myThread
//        myThread.join(); //điều kiện chạy luồng Thread là luồng myThread phải chết
        thread.start(); //khởi động luồng Thread


        System.out.println(myThread.getPriority()); //lấy ra độ ưu tiên của luồng (mặc định là 5)
        System.out.println(thread.getPriority());
    }
}
