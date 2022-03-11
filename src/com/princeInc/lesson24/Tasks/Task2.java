package com.princeInc.lesson24.Tasks;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 * СОздать объект LocalDate, представляющий собой сегодняшнюю дату. Преобразовать дату в строку
 * вида "85.05.2017". Вывести эту строку на консоль.
 */
public class Task2 {
  public static void main(String[] args) {
    LocalDateTime now = LocalDateTime.now();

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd.MM.yyyy HH:mm:ss");
    String format = now.format(formatter);
    System.out.println(format);
  }
}
