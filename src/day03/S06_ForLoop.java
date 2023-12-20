package day03;

public class S06_ForLoop {
    // 0 ile 100 dahil olmak üzere 5 ile bölünebilen sayilari yazdirin
    // 0 ile 100 dahil olmak üzere 5 ile bölünebilen sayilari 100'dan geriye doğru yazdırın

    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            if (i % 5 == 0){
                System.out.print(i + ", ");
            }
        }
        System.out.println("");
        for (int i = 100; i >= 0; i--) {
            if (i % 5 == 0){
                System.out.print(i + ", ");
            }
        }
    }

}
