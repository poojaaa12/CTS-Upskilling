public class VirtualThreadsExample {

    public static void main(String[] args)
            throws Exception {

        long startTime =
                System.currentTimeMillis();

        for(int threadIndex=1;threadIndex<=100000;threadIndex++) {

            Thread.startVirtualThread(
                    () -> {
                        System.out.println(
                                "Virtual Thread");
                    });
        }

        long endTime =
                System.currentTimeMillis();

        System.out.println(
                "Time: " +
                        (endTime-startTime));
    }
}
