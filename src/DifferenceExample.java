
   import java.util.concurrent.*;

    public class DifferenceExample {
        public static void main(String[] args) throws ExecutionException, InterruptedException {
            ExecutorService executor = Executors.newSingleThreadExecutor();
            Runnable runnable = () -> {
                System.out.println("This is runnable instance");
            };
            executor.execute(runnable);
            Callable<Integer> callable = () -> {
                return 5;
            };

            Future<Integer> future = executor.submit(callable);
            int result = future.get();
            System.out.println("This is a callable class returning integer value= "+result);
        }

    }
