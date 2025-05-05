package org.example;

import java.util.Scanner;

/**
 * RideManagerApp — CLI-меню
 * Это главный класс с main(), который:
 * 1 - позволяет пользователю добавлять гостей
 * 2 - запускать поездку (и перемещать гостей из очереди в историю)
 * 3 - просматривать последнюю поездку
 * 4 - удалять последнего участника поездки
 * 5 - завершать программу
 */
public class RideManagerApp
{
    private static void printMenu() {
        System.out.println("\n📋 MENU:");
        System.out.println("1. Add New Guest");
        System.out.println("2. Process Next Ride (FIFO)");
        System.out.println("3. View Last Ride (LIFO)");
        System.out.println("4. Delete last guest from history (LIFO)");
        System.out.println("5. Exit");
    }
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println("🎫 Welcome to the ROLLERCOASTER Ticketing System");
        System.out.println("Demonstrating FIFO (Queue) and LIFO (Stack)");

        while (!exit){
            printMenu();
            System.out.print("Select an option: ");
            String input = scanner.nextLine();

            switch (input){
                case "1":
                    addGuest(scanner);
                    break;
                case "2":
                    startRide();
                    break;
                case "3":
                    showRideHistory();
                    break;
                case "4":
                    deleteLastGuest();
                    break;
                case "5":
                    exit = true;
                    System.out.println("👋 Exiting system. Bye!");
                    break;
                default:
                    System.out.println("❗ Invalid option, please try again.");
            }
        }

        scanner.close();
    }

    public addGuest(){

    }

    public startRide(){

    }

    public RideHistory(){

    }

    public deleteLastGuest(){

    }

}
