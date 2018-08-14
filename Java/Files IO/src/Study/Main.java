package Study;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.NoSuchFileException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {

    public static void main(String[] args) throws IOException {
        Path path = Paths.get("my-file.txt");
        try {
            System.out.println(Files.lines(path));
        } catch (NoSuchFileException e)
        {
            System.out.println("Unable to read file: my-file.txt");
        }

    }
}
