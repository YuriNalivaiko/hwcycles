package ru.netology.javaqamvn.services;

public class VacationService {
    public int calculateVacationMonths(int income, int expenses, int threshold) {
        int money = 0;
        int vacationMonths = 0;

        for (int month = 0; month < 12; month++) {
            if (money >= threshold) {
                // Отдыхаем
                money -= expenses;
                money = (int) (money / 3.0);
                vacationMonths++;
            } else {
                // Работаем
                money += income;
                money -= expenses;
            }
        }

        return vacationMonths;
    }
}