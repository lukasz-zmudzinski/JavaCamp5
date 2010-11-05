package pl.java.jc5.lombok.sneakythrows;

import java.io.ByteArrayOutputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import lombok.Cleanup;
import lombok.SneakyThrows;

public class CleanupAndSneakyThrowsTest {

	@SneakyThrows
	public void testCleanUp() {
		@Cleanup
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(new byte[] { 'Y', 'e', 's' });
		System.out.println(baos.toString());
	}
}
