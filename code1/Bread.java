import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Bread {

	public static void main(String[] args) {
		int wordlength;
		int max;
		int totalchars;
		
		BufferedReader br = null;

		try {

			String sCurrentLine;

			//br = new BufferedReader(new FileReader("C:\\testing.txt"));
			br = new BufferedReader(new FileReader("words.txt"));
			while ((sCurrentLine = br.readLine()) != null) {
				wordlength = sCurrentLine.length();
				System.out.print(wordlength+" ");
				//System.out.println(sCurrentLine);
			}

		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}

	}
}
