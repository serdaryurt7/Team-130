package day29_immutableClasses;

import java.time.LocalDate;

public class C06_LocalDate {

    public static void main(String[] args) {

        LocalDate tarih = LocalDate.now();

        LocalDate dogumTarihi = LocalDate.of(1994, 01, 24);

        System.out.println(tarih); // 2024-05-23

        // plus... () ile tarihte ileri gidebiliriz
        System.out.println(tarih.plusWeeks(23)); // 2024-10-31

        System.out.println(tarih.plusWeeks(3).plusYears(2).plusDays(5)); // 2026-06-18

        // minus... () ile tarihte geri gidebiliriz

        System.out.println(tarih.minusYears(5).minusMonths(3).minusDays(8)); // 2019-02-15

        // tarihin istediğimiz bir bölümünü, istediğimiz değer ile değiştirebiliriz
        // with...()

        System.out.println(tarih.withYear(2021)); // 2021-05-23

        System.out.println(tarih.withDayOfYear(134)); // 2024-05-13

        System.out.println(tarih.getDayOfYear()); // 144

        System.out.println(tarih.getDayOfWeek()); // THURSDAY

        System.out.println(tarih.getEra()); // CE

        System.out.println(tarih.lengthOfYear()); // 366

        System.out.println(tarih.isLeapYear()); // true

        LocalDate leapYearKontrol = LocalDate.of(2040, 1, 1);

        System.out.println(leapYearKontrol.isLeapYear()); // true

        System.out.println(tarih.isBefore(leapYearKontrol)); // true

        System.out.println(tarih.isAfter(leapYearKontrol)); // false

        System.out.println(tarih.isEqual(leapYearKontrol)); // false

        System.out.println(tarih.compareTo(dogumTarihi)); // 30
        System.out.println(tarih.compareTo(leapYearKontrol)); // -16

        System.out.println(dogumTarihi.until(tarih)); // P30Y3M29D

        LocalDate beklenenTarih = LocalDate.of(2025, 5, 12);

        System.out.println(tarih.until(beklenenTarih)); // P11M19D


    }

}
