package strings;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MakeItAnagram {

	public static void main(String[] args) {

		int count = 0;

		Scanner in = new Scanner(System.in);

		String s = in.nextLine();
		String t = in.nextLine();

		Map<Character, Integer> map = new HashMap<>();
		Map<Character, Integer> tmap = new HashMap<>();

		for (int i = 97; i < 123; i++) {
			map.put((char) i, 0);
			tmap.put((char) i, 0);
		}

		char[] sarr = s.toCharArray();

		for (char si : sarr) {

			if (map.containsKey(si)) {
				int tmp = map.get(si);
				map.put(si, ++tmp);
			} else {
				map.put(si, 1);
			}

		}

		char[] tarr = t.toCharArray();

		for (char si : tarr) {

			if (tmap.containsKey(si)) {
				int tmp = tmap.get(si);
				tmap.put(si, ++tmp);
			} else {
				tmap.put(si, 1);
			}

		}

		for (int i = 97; i < 123; i++) {
			char ch = (char) i;
//			System.out.println(ch);
//			System.out.println(map.get(ch) + " " + tmap.get(ch));

			if (map.get(ch) != tmap.get(ch)) {
				count = count + Math.abs(map.get(ch) - tmap.get(ch));
			}
		}
		in.close();
		System.out.println(count);
	}

}
