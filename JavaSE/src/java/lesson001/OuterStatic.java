package java.lesson001;

public class OuterStatic {
	/* innerStaticについて */

	private static String message = "メッセージ";
	
	public static class innerStatic {
		void print() {
			// OuterStaticのフィールドにアクセス可能
			System.out.println("Inner@Message" + message);
		}
		
	}
}
