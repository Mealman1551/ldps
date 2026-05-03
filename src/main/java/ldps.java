/* LDPS - List Directory Print System */
/* version 0.3.0 */

import java.io.File;
import java.util.Arrays;

public class ldps {

    static boolean showHidden = false;
    static boolean longFormat = false;
    static boolean humanReadable = false;
    static boolean useColor = true;

    static final String RESET = "\u001B[0m";
    static final String BLUE = "\u001B[34m";
    static final String GREEN = "\u001B[32m";
    static final String GRAY = "\u001B[37m";

    public static void main(String[] args) {

        System.out.println("LDPS started");
        System.out.println("Working dir: " + System.getProperty("user.dir"));
        System.out.flush();


        File dir = new File(System.getProperty("user.dir"));

        for (String arg : args) {
            switch (arg) {
                case "-a":
                    showHidden = true;
                    break;
                case "-l":
                    longFormat = true;
                    break;
                case "-h":
                    humanReadable = true;
                    break;
                case "--no-color":
                    useColor = false;
                    break;
                default:
                    dir = new File(arg);
            }
        }

        if (!dir.exists() || !dir.isDirectory()) {
            System.out.println("Invalid directory");
            return;
        }

        File[] files = dir.listFiles();

        if (files == null) {
            System.out.println("Cannot access directory");
            return;
        }

        Arrays.sort(files, (a, b) -> {
            if (a.isDirectory() && !b.isDirectory()) return -1;
            if (!a.isDirectory() && b.isDirectory()) return 1;
            return a.getName().compareToIgnoreCase(b.getName());
        });

        for (File file : files) {

            if (!showHidden && file.getName().startsWith(".")) continue;

            String name = file.getName();

            String color = getColor(file);

            if (!useColor) color = "";
            String reset = useColor ? RESET : "";

            if (longFormat) {
                String size = file.isDirectory() ? "-" : formatSize(file.length());
                System.out.printf("%-10s %s%s%s%n", size, color, name, reset);
            } else {
                System.out.println(color + name + reset);
            }
        }
    }

    static String getColor(File file) {
        if (file.isDirectory()) return BLUE;

        String name = file.getName().toLowerCase();

        if (name.endsWith(".sh") || name.endsWith(".exe") || name.endsWith(".bin")) {
            return GREEN;
        }

        return GRAY;
    }

    static String formatSize(long bytes) {
        if (!humanReadable) return String.valueOf(bytes);

        if (bytes < 1024) return bytes + " B";
        if (bytes < 1024 * 1024) return (bytes / 1024) + " KB";
        if (bytes < 1024 * 1024 * 1024) return (bytes / (1024 * 1024)) + " MB";
        return (bytes / (1024 * 1024 * 1024)) + " GB";
        
    }

}