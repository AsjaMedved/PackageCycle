package ru.netology.services;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
RestService service = new RestService();
        int income = 10_000;
        int expenses = 3_000;
        int threshold = 20_000;

        int monthRest = service.calculate(income, expenses, threshold);
        System.out.println("фрилансер отдыхает " + monthRest + " месяца в году");
        }
    }