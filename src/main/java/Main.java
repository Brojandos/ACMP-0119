import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 * @author: Brojandos.
 * @creation_date: 27.02.2017.
 */
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        byte size = input.nextByte();
        ArrayList<Uaqyt> times = new ArrayList<>(size);
        for (byte i = 0; i < size; i++) {
            times.add(new Uaqyt(input.nextByte(), input.nextByte(), input.nextByte()));
        }

        times.sort(Comparator.comparing(Uaqyt::getSeconds));
        times.sort(Comparator.comparing(Uaqyt::getMinutes));
        times.sort(Comparator.comparing(Uaqyt::getHours));

        for (Uaqyt time : times) {
            System.out.printf("\n%d %d %d", time.getHours(), time.getMinutes(), time.getSeconds());
        }
    }

    private static class Uaqyt {
        private Byte hours;
        private Byte minutes;
        private Byte seconds;

        Uaqyt(Byte hours, Byte minutes, Byte seconds) {
            this.hours = hours;
            this.minutes = minutes;
            this.seconds = seconds;
        }

        Byte getHours() {
            return hours;
        }

        Byte getMinutes() {
            return minutes;
        }

        Byte getSeconds() {
            return seconds;
        }
    }
}