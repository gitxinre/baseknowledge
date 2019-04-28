package threadpool;

public class ThreadTask implements Runnable {
    private int task;

    public ThreadTask(int task) {
        this.task = task;
    }

    public int getTask() {
        return task;
    }

    public void setTask(int task) {
        this.task = task;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+" --> for :"+i+" <===> the task is : "+task);
        }
    }
}
