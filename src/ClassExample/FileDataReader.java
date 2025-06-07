package ClassExample;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileDataReader {

    private final Path filePath;

    public FileDataReader(String filePath) {
        this.filePath = Paths.get(filePath);
    }

    public String readFileAsString() throws IOException {
        return Files.readString(filePath);
    }

    public List<String> readFileAsLines() throws IOException {
        return Files.readAllLines(filePath);
    }

    public boolean fileExists() {
        return Files.exists(filePath);
    }

    public long getFileSize() throws IOException {
        return Files.size(filePath);
    }
}
