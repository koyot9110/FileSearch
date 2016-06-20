package fileSearch;

import java.io.File;

public class DirectoryFilter implements Filter{

	@Override
	public boolean filter(File file) {
		return file.isDirectory();
	}
}
