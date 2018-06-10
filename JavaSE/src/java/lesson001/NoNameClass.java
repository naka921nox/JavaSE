package java.lesson001;

import java.io.PrintStream;

public class NoNameClass {
	/* 無名クラスについて */

	public void printMessage(int type, String content) {
		// 無名クラス
		new Object() {
			PrintStream getOutput() {
				return type == 0 ? System.out : System.err;
			}
		// 呼んじゃう。
		}.getOutput().print(content);
	}
	
}
