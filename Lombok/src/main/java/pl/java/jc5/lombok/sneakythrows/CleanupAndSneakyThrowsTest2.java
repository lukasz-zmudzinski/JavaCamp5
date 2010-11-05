package pl.java.jc5.lombok.sneakythrows;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import lombok.Cleanup;

public class CleanupAndSneakyThrowsTest2 {

	public void testCleanUp() {
		try {
			@Cleanup
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			baos.write(new byte[] { 'Y', 'e', 's' });
			System.out.println(baos.toString());
		} catch (IOException e) {
			// this should never happen !
		}

	}
}
