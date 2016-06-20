package fileSearch;

import java.io.File;

public class FileAndDirectoryFilter implements Filter{

	@Override
	public boolean filter(File file) {
		return true;
	}
}
