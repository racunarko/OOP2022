package hr.fer.oop.pred10_InputOutput.io;

import java.io.IOException;
import java.nio.file.DirectoryStream.Filter;
import java.nio.file.Path;
import java.util.Set;

public class FilterByExtension implements Filter<Path> {
    private final Set<String> extensions;

    public FilterByExtension(String... extensions) {
        this.extensions = Set.of(extensions);
    }

    @Override
    public boolean accept(Path entry) throws IOException {
        String filename = entry.getFileName().toString();
        int ind = filename.lastIndexOf('.');
        if (ind != -1) {
                String ext = filename.substring(ind + 1);
                return extensions.contains(ext);
        }
        else return false;
    }
}
