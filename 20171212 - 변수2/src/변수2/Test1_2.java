package º¯¼ö2;

public class Test1_2 {

	public static void main(String[] args) {
		// Æ²¸° ÄÚµå ºÎºĞÀ» ¼³¸íÇÏ½Ã¿À.
		byte a = 10;
		byte b = 30;
		int c = a * b;
		//¿¬»êÀ» ÇÒ ¶§´Â ÀÚ·áÇüÀÌ intÇüÀÌ¿©¾ß ÇÑ´Ù.
		
		// Æ²¸° ÄÚµå ºÎºĞÀ» °íÃÄÁÖ¼¼¿ä.
		float a1 = 0.101f;
		float b1 = 0.899f;
		//floatÀÚ·áÇüÀº ¸®ÅÍ·² µÚ¿¡ f ¶Ç´Â F¸¦ ºÙ¿©¾ß ÇÑ´Ù.		
		System.out.println(a1);
		System.out.println(b1);
		
		/* ¿©·¯ºĞÀº ¼¼ºìÀÏ·¹ºì Æ÷½º±â ÇÁ·Î±×·¥ °³¹ßÀÚ°¡ µÇ¾ú½À´Ï´Ù.
		 * ¾Æ·¡ È­¸é°ú °°ÀÌ Ãâ·ÂµÉ ¼ö ÀÖ°Ô ÇØÁÖ¼¼¿ä. »óÇ°³»¿ëÀº º¯¼ö·Î ´ã¾Æ¼­ Ã³¸®ÇØ º¸¼¼¿ä.
		 */
		int no = 1;
		String prd = "³ó½É)ÃòÆÄ®½º200";
		int prc = 200;
		int qty = 1;
		int disc = 0;
		int ript = 200;
		String e = " | ";
		
		System.out.println(" NO|     »óÇ°¸í           |  ´Ü°¡   | ¼ö·® | ÇÒÀÎ | ¿µ¼ö¾× | ºñ°í |");
		System.out.println(" "+no+e+prd+e+" "+prc+e+qty+" "+e+" "+disc+e+ript+e+" "+e);
	}

}
