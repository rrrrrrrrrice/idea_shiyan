package xian_cheng_chi;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPool {
    public static void main(String[] args) {
        Runableimp run=new Runableimp();
        //创建实现类对象
        ExecutorService service = Executors.newFixedThreadPool(2);
        //创建线程池对象ExecutorService
        service.submit(run);
        service.submit(run);
        service.submit(run);
        //submit获取线程 参数是Runable的实现类
        //执行完后自动回收
        service.shutdown();

    }
}
