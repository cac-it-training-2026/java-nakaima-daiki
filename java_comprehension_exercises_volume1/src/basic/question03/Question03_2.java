package basic.question03;

/**
 * 第6章 演算子
 */

public class Question03_2 {

	public static void main(String[] args) {

		// 料金
		int basePrice = 1200;

		//チケット購入数
		int tickets = 3;

		//最終価格
		int reducedPrice = basePrice - 200;

		int reduceTickets = tickets - 1;

		int totalPrice = reducedPrice * reduceTickets;

		double taxRate = 1.1;

		int totalWithTax = (int) (totalPrice * taxRate);

		System.out.println("購入可能枚数は" + reduceTickets + "です。");
		System.out.println("値下げ後の1枚あたりの料金は" + reducedPrice + "です。");
		System.out.println("合計金額（税抜）は" + totalPrice + "です。");
		System.out.println("合計金額（税込）は" + totalWithTax + "です。");

	}
}
