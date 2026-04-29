import java.io.File;
import java.util.Arrays;

public class ldps {
    public static void main(String[] args) {
        File dir = new File(args.length > 0 ? args[0] : ".");

        File[] files = dir.listFiles();
        if (files == null) {
            System.out.println("Cannot access directory");
            return;
        }

        Arrays.sort(files, (a, b) -> a.getName().compareToIgnoreCase(b.getName()));

        for (File file : files) {
            if (file.getName().startsWith(".")) continue;

            if (file.isDirectory()) {
                System.out.printf("[DIR]      %s%n", file.getName());
            } else {
                System.out.printf("%-10d %s%n", file.length(), file.getName());
            }
        }
    }
}