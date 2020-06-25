package utilPackageExample;

import java.io.FileReader;
import java.io.IOException;
import java.io.StreamTokenizer;

public class StreamTokenizerClass {
	public static void main(String[] args) throws IOException {

		FileReader fb = new FileReader("1234.txt");
		StreamTokenizer st = new StreamTokenizer(fb);
		int t = st.nextToken();
		System.out.println("line no=" + st.lineno());
		while ((t = st.nextToken()) != StreamTokenizer.TT_EOF) {
			switch (t) {
			case StreamTokenizer.TT_EOL:
				System.out.println("@");
				System.out.println("line no=" + st.lineno());
				break;

			case StreamTokenizer.TT_WORD:
				System.out.println("word=" + st.sval);
				break;

			}

		}

	}
}
