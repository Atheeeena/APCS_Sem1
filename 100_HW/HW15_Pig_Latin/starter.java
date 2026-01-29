
import java.util.Scanner;


class starter {
	public static String shift(String a) {
		String[] arr = new String[a.length()];
		for (int x = 0; x < a.length(); x++) {
			arr[x] = a.substring(x, x + 1);
		}
		String k = arr[0];
		for(int x = 0; x < a.length(); x++) {
			if (x == (a.length() - 1)) {
				arr[x] = k;
			}
			else {
				arr[x] = arr[x + 1];
			}
		}
		String b = "";
		for (int x = 0; x < a.length(); x++) {
			b += arr[x];
		}
		return b;
	}
	public static String toPigLatin(String a) {
		int x = 0;
		int wordCount = 1;
		for (x = 0; x < a.length(); x++) {
			if ((a.substring(x, x+1)).equals(" ")) {
				wordCount++;
			}
		}
		String[] arr = new String[wordCount];
		for (x = 0; x < arr.length; x++) {
			arr[x] = "";
		}
		x = 0;
		int y = 0;
		String inPigLatin = "";
		while(x < a.length()) {
			if ((a.substring(x, x+1)).equals(" ")) {
				y++;
				x++;
			}
			else {
				arr[y] += a.substring(x, x+1);
				x++;
			}
		}
		for (x = 0; x < wordCount; x++) {
			String first = arr[x].substring(0, 1);
			String second = arr[x].substring(1, 2);
				switch (first) {
					case "a", "e", "i", "o", "u" -> {
						inPigLatin += arr[x] + "-way ";
					}
					default -> {
						switch (second) {
							case "a", "e", "i", "o", "u" -> {
								arr[x] = shift(arr[x]) + "ay ";
								inPigLatin += arr[x].substring(0, arr[x].length() - 4) + "-" + arr[x].substring(arr[x].length() - 4);
							}
							default -> {
								arr[x] = shift(arr[x]);
								arr[x] = shift(arr[x]);
								arr[x] += "ay ";
								inPigLatin += arr[x].substring(0, arr[x].length() - 5) + "-" + arr[x].substring(arr[x].length() - 5);
							}
						}
					}
				}
		}
		return inPigLatin;
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Input a sentence: ");
		String input = sc.nextLine();
		System.out.println(toPigLatin(input));
	}
}
