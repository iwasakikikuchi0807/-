package kadai1;
import java.util.Scanner;

public class kadai {
	int jikiX, jikiY, jikiW, jikiH;
    int tekiKazu;
    int[] tekiX = new int[100];
    int[] tekiY = new int[100];
    int[] tekiW = new int[100];
    int[] tekiH = new int[100];

    public static void main(String[] args ) throws Exception {
        new kadai();
    }

    public kadai()  throws Exception {
        consoleKaraYomikomi()
        hennsuuKakuninHyouji();
        check();
    }

    private void consoleKaraYomikomi() {
        try {
            Scanner sc = new Scanner(System.in); // コンソール入力の指定

            jikiX = sc.nextInt();
            jikiY = sc.nextInt();
            jikiW = sc.nextInt();
            jikiH = sc.nextInt();

            tekiKazu = sc.nextInt();
            for (int i = 0; i < tekiKazu; ++i) {
                tekiX[i] = sc.nextInt();
                tekiY[i] = sc.nextInt();
                tekiW[i] = sc.nextInt();
                tekiH[i] = sc.nextInt();
            }
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }

}
