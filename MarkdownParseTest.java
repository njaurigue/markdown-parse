import static org.junit.Assert.*;
import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.List;

public class MarkdownParseTest {

    @Test
    public void testFileOne() throws IOException {
        assertEquals(List.of("https://something.com", "some-page.html"),
                MarkdownParse.getLinks(Files.readString(Path.of("./test-file.md"))));
    }

    @Test
    public void testFileThree() throws IOException {
        assertEquals(List.of(), MarkdownParse.getLinks(Files.readString(Path.of("./test3.md"))));
    }

    //Lab Report 4 - Week 8 Tests:
    @Test
    public void testSnippet1() throws IOException {
        assertEquals(List.of("`google.com", "google.com", "ucsd.edu"),
                MarkdownParse.getLinks(Files.readString(Path.of("./snippet1.md"))));
    }

    @Test
    public void testSnippet2() throws IOException {
        assertEquals(List.of("a.com", "a.com(())", "example.com"),
                MarkdownParse.getLinks(Files.readString(Path.of("./snippet2.md"))));
    }

    @Test
    public void testSnippet3() throws IOException {
        assertEquals(List.of("https://www.twitter.com", "https://ucsd-cse15l-w22.github.io/)", "https://cse.ucsd.edu/"),
                MarkdownParse.getLinks(Files.readString(Path.of("./snippet3.md)"))));
    }
}