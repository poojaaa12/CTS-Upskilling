import java.util.concurrent.*;

public class ExecutorCallableExample {

    public static void main(String[] args)
            throws Exception {

        ExecutorService executorService =
                Executors.newFixedThreadPool(3);

        Callable<Integer> firstTask =
                () -> 10;

        Callable<Integer> secondTask =
                () -> 20;

        Future<Integer> firstResult =
                executorService.submit(firstTask);

        Future<Integer> secondResult =
                executorService.submit(secondTask);

        System.out.println(
                firstResult.get());

        System.out.println(
                secondResult.get());

        executorService.shutdown();
    }
}
