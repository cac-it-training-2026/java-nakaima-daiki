package basic.question06;

import java.io.IOException;

public class Question06_1 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装
		String[] massage = { "こんにちは", "Javaの学習中",
				"繰り返しの演習中", "頑張ります" };

		for (int i = 0; i < 4; i++) {

			System.out.println(massage[i]);

		}

		System.out.println("繰り返し処理が終了しました");

	}

}
