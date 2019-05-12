package textloader;

import java.io.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TextLoaderTest{
	@Test
	public void test() throws IOException{
		TextLoader loader = new TextLoader("");
		assertNotNull(loader);
	}
}

