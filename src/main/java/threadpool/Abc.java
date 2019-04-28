package threadpool;

import java.util.concurrent.*;

public class Abc {
    public static void main(String[] args) {
        //ExecutorService threadPool = Executors.newFixedThreadPool(5);
        //long s = System.currentTimeMillis();
        ExecutorService threadPool = Executors.newCachedThreadPool();
        //ExecutorService threadPool = Executors.newSingleThreadExecutor();
        for (int i = 0; i < 5; i++) {
            threadPool.execute(new ThreadTask(i));
        }

        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(5);
        executorService.schedule(new Runnable() {
            public void run() {
                System.out.println("OK!");
            }
        },
                1,
                TimeUnit.SECONDS
        );

        ExecutorService threadPool1 = Executors.newFixedThreadPool(3);

        Future<String> submit = threadPool1.submit(new Callable<String>(
        ) {
            public String call() throws Exception {
                Thread.sleep(5000);
                return "yf";
            }
        });
        System.out.println("等待结果……");
        try {
            System.out.println("结果为："+submit.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        System.out.println("结束！");

    }
}
