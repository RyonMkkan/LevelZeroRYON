
public class beverfever {
	public static void main(String[] args) {

		for (int i = 0; i < 3; i++) {

			for (int j = 0; j < 3; j++) {
				speak("baby");

			}
			if (i == 1) {
				speak("no");
			} else {
				speak("oh");
			}

		}
	}

	static void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words).waitFor();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
