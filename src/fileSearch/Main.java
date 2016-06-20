package fileSearch;

public class Main {

	private static final String PATH = "C:\\workspace_eclipse_luna_aspectj\\TeaTime";

	public static void main(String[] args) {

		FileSearch file = new FileSearch();
		System.out.println("Files:");
		System.out.println("--------------------------------------------");
		for (String s : file.findAllFiles(PATH)){
			System.out.print(PATH + "\\");
			System.out.println(s);
		}
		
		FileSearch directory = new FileSearch();
		System.out.println("Directory:");
		System.out.println("--------------------------------------------");
		for (String s : directory.findAllDirectory(PATH)){
			System.out.print(PATH + "\\");
			System.out.println(s);
		}
		
		FileSearch fad = new FileSearch();
		System.out.println("Files and directories:");
		System.out.println("--------------------------------------------");
		for (String s : fad.findAllFilesAndDirectory(PATH)){
			System.out.print(PATH + "\\");
			System.out.println(s);
		}
	}
}
