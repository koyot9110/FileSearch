package fileSearch;

import java.io.File;
import java.util.ArrayList;


public class FileSearch {

	public String[] findAllFiles(String path) {
		File folder = new File(path);
		ArrayList<String> arrayList = new ArrayList<String>();
		findFilter(new FileFilter(), folder, arrayList);
		return arrayList.toArray(new String[]{});
	}
	
	public String[] findAllDirectory(String path) {
		File folder = new File(path);
		ArrayList<String> arrayList = new ArrayList<String>();
		findFilter(new DirectoryFilter(), folder, arrayList);
		return arrayList.toArray(new String[]{});
	}
	
	public String[] findAllFilesAndDirectory(String path) {
		File folder = new File(path);
		ArrayList<String> arrayList = new ArrayList<String>();
		findFilter(new FileAndDirectoryFilter(), folder, arrayList);
		return arrayList.toArray(new String[]{});
	}
	
	private void findFilter(Filter filter, File folder, ArrayList<String> arrayList) {
		for (File file : folder.listFiles()) {
			if (filter.filter(file)) {
				arrayList.add(file.getAbsolutePath());
			} 
			if (file.isDirectory()) {
				findFilter(filter, file.getAbsoluteFile(), arrayList);	
			}
		}
	}
}
