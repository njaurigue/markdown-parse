import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFileOne() throws IOException {
        assertEquals(List.of("https://something.com", "some-page.html"),
                MarkdownParse.getLinks(Files.readString(Path.of("./test-file.md"))));
    }

    @Test
    public void testFileThree() throws IOException {
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("./test2.md"))));
    }
}