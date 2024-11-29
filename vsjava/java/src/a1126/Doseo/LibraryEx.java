package a1126.Doseo;

public class LibraryEx {
    public static void main(String[] args) {

        // EBook 객체 생성
        EBook eBook = new EBook("이것이 자바다", "신용권", "2015-1113", 5.6, "PDF");
        //printedBook 객체 생성
        PrintedBook printedBook = new PrintedBook("처음만난 리액트(안만나도 좋았을텐데..)", "이인재", "2016-0124", 464, 0.8);

        //도서 정보 출력
        System.out.println("EBook Information: ");
        eBook.displayInfo();
        System.out.println();
        System.out.println("Printed Book Information");
        printedBook.displayInfo();
    }
}
