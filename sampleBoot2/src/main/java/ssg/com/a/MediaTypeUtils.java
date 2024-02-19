package ssg.com.a;

import org.springframework.http.MediaType;

import jakarta.servlet.ServletContext;

public class MediaTypeUtils {
	
	public static MediaType getMediaTypeForFileName(ServletContext sc, String filename) {
		
		String minType = sc.getMimeType(filename);
		
		try {
			MediaType mediaType = MediaType.parseMediaType(minType);
			return mediaType;
		}catch (Exception e) {
			return MediaType.APPLICATION_OCTET_STREAM;
		}
	}

}
