package fileSearch;

import java.io.File;

public class FileFilter implements Filter{

	@Override
	public boolean filter(File file) {
		return file.isFile();
	}
}
