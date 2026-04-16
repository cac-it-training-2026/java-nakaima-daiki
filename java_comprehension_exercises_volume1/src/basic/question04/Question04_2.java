package basic.question04;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 第7章 配列
 */

public class Question04_2 {

	public static void main(String[] args) throws IOException {

		// TODO:ここに実装

		int[] ageGroup = new int[6];

		ageGroup[0] = 23;

		ageGroup[1] = 33;

		ageGroup[2] = 26;

		ageGroup[3] = 21;

		ageGroup[4] = 25;

		ageGroup[5] = 22;

		System.out.println("４番目の人の年齢を入力してください");

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		String numstString = reader.readLine();

		int temporaryAge = Integer.parseInt(numstString);

		ageGroup[4] = temporaryAge;

		System.out.println("4番目の人の年齢は" + ageGroup[4] + "歳です。");

		System.out.println("人数は" + ageGroup.length + "");

	}

}
