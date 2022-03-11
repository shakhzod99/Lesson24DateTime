package com.princeInc.lesson24.Tasks;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

/**
 * Создать объект localDateTime, представляющий собой дату 25.06.2020 19:47.
 * Используйте этот объект, создать другой объект localDateTime, представляющий
 * собой дату через 3 месяца после сегодняшней.
 * Вывести на консоль содержащиеся в нем объекты LocalDate and LocalTime
 */
public class Task1 {
  public static void main(String[] args) {
    LocalDateTime localDateTime = LocalDateTime.of(2020, 6, 25, 19, 47);
    LocalDateTime newLocalDateTime = localDateTime.plus(3L, ChronoUnit.MONTHS);
    System.out.println(newLocalDateTime.toLocalDate());
    System.out.println(newLocalDateTime.toLocalTime());

  }
}
