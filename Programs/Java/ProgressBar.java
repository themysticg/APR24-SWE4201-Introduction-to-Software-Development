public class ProgressBar {
    public static void showProgressBar(int durationInSeconds) {
        int totalSteps = 20; // Number of steps in the progress bar
        int stepDuration = durationInSeconds * 1000 / totalSteps; // Time for each step

        System.out.print("Progress: [");
        for (int i = 0; i < totalSteps; i++) {
            try {
                Thread.sleep(stepDuration);
            } catch (InterruptedException e) {
                System.out.println("Progress interrupted.");
            }
            System.out.print("#");
        }
        System.out.println("] 100%");
    }
}
