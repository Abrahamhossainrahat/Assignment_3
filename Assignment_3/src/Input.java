import java.util.Scanner;

public class Input {
    private int year;
    Scanner scanner = new Scanner(System.in);

    public void setYear(int year) {
        this.year = scanner.nextInt();
    }
    public int getYear() {
        return scanner.nextInt();
    }
}
