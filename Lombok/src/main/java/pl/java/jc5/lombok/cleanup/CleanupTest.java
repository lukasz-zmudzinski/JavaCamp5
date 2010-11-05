package pl.java.jc5.lombok.cleanup;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import lombok.Cleanup;

public class CleanupTest {

	public void testCleanUp() throws IOException {
		@Cleanup
		ByteArrayOutputStream baos = new ByteArrayOutputStream();
		baos.write(new byte[] { 'Y', 'e', 's' });
		System.out.println(baos.toString());
	}

}
