import java.nio.file.*;

public class MakeDirectories {
    public static void main(String[] args) throws Exception {

        for (int unit = 8; unit <= 16; unit++) {
            String basePath = "src/Unit_" + unit + "/";
            Path root = Paths.get(basePath);

            String[] baseFolderNames = {"Examples", "Exercises"};
            for (String name : baseFolderNames) {
                Files.createDirectories(root.resolve(name));
            }

            // Create Example folders
            Path examplesRoot = Paths.get(basePath + "Examples/");
            for (int ex = 1; ex <= 14; ex++) {
                Files.createDirectories(examplesRoot.resolve("Example_" + ex));
            }

            // Create Exercise folders
            Path exercisesRoot = Paths.get(basePath + "Exercises/");
            for (int ex = 1; ex <= 10; ex++) {
                Files.createDirectories(exercisesRoot.resolve("Exercise_" + ex));
            }
        }

        System.out.println("Done");
    }
}
