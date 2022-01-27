import static org.junit.Assert.*;

import java.io.IOException;

import org.junit.*;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

public class MarkdownParseTest {
    @Test
    public void addition() {
        assertEquals(2, 1 + 1);
    }

    @Test
    public void testFileContents() throws IOException{
		Path fileName = Path.of("test-file.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://something.com", "some-page.html"), links);
    }

    @Test
    public void test2Contents() throws IOException{
		Path fileName = Path.of("test2.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of("https://duckduckgo.com", "https://kde.org"), links);
    }

    @Test
    public void test3Contents() throws IOException{
		Path fileName = Path.of("test3.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }

    @Test
    public void test4Contents() throws IOException{
		Path fileName = Path.of("test4.md");
	    String contents = Files.readString(fileName);
        ArrayList<String> links = MarkdownParse.getLinks(contents);
        assertEquals(List.of(), links);
    }
}