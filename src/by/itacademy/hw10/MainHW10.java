package by.itacademy.hw10;

public class MainHW10 {

	public static void main(String[] args) {

		String strTask1 = "London is the capital of Great Britain";
		StringBuilder sbTask5 = new StringBuilder("London is the capital of Great Britain");
		replaceStr(strTask1);
		addHello(sbTask5);
	}

	public static void replaceStr(String strTask1) {
		String[] masStr = strTask1.split(" ");
		int k = 2;
		char y = 'O';
		for (String word : masStr) {
			if (word.length() > 2) {
				char x = word.charAt(k);
				String result = word.replace(x, y);
				System.out.println(result);
			} else {
				System.out.println(word);
			}
		}
	}

	public static void addHello(StringBuilder sbTask5) {

		int i = 0;
		int position = 0;
		String subSb = "Hello! ";
		while ((position = sbTask5.indexOf("on ", i)) != -1) {
			position += 3;
			sbTask5.insert(position, subSb);
			i = position;

		}
		System.out.println(sbTask5);

	}

}
