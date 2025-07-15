import org.w3c.dom.ls.LSOutput;

import java.nio.file.*;

public class MakeDirectories {
    public static void main(String[] args) throws Exception {
        String basePath = "src/Unit_7/Exercises";
        String prefix   = "Exercise_";

        Path root = Paths.get(basePath);
        for (int i = 1; i <= 10; i++)
            Files.createDirectories(root.resolve(prefix + i));
        System.out.println("Done");
    }
}
