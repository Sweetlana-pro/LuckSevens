/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sg.mavenproject1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @Sweetlana Protsenko
 * svitprotsenko@gmail.com
 */
public class LuckySevens {
    public void rollDice() {
    
        //Declare variables 
        Scanner sc = new Scanner(System.in);

        Random randomizer = new Random();
        int dice1 = randomizer.nextInt(6) + 1;
        int dice2 = randomizer.nextInt(6) + 1;
        int sum = dice1 + dice2;
        int totalMoney;
        System.out.println("How many dollars do you have to bet?");
        int money = sc.nextInt();
        int counter = 0;
        int maxMoneyRoll = 0;
        do {
            //Rolling dice
            dice1 = randomizer.nextInt(6) + 1;
            dice2 = randomizer.nextInt(6) + 1;
            sum = dice1 + dice2;
            System.out.println("Dice 1: " + dice1);
            System.out.println("Dice 2: " + dice2);
            System.out.println("Total: " + sum);

            //Money income/deduction
            if (sum == 7) {
                totalMoney = money + 4;
                System.out.println("Lucky seven! You've got $4! Your total is $" + totalMoney + " for now");

            } else {
                totalMoney = money - 1;
                System.out.println("Sorry, you loose $1 this time. Your total is $" + totalMoney + " for now");

            }
            money = totalMoney;
            maxMoneyRoll = counter;

            counter++;//track rolls

        } while (totalMoney > 0);
        System.out.println("You are broke after " + counter + " rolls.");
        //System.out.println("You should have quit after " + maxMoneyRoll + " rolls when you had " + totalMoney);

    }
    
}
