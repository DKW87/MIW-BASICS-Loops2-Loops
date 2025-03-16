package controller;

import java.util.Scanner;

/* In deze opdracht worden verschillende methodes uitgewerkt met loops.
* Methode 1: toont een sterrenrij
* Methode 2: Toont een sterrenvierkant
* Methode 3: Toont een door de gebruiker te kiezen karakter en print het zovaak als de gebruiker het wil zien
* Methode 4: Optellen tot 1000. Vraagt aan de gebruiker tot hoeveel we moeten optellen en berekend dan hoeveel getallen daarvoor nodig zijn.
* Mvg,
* Danny Kwant */
public class LoopsMainController {

    // public methods
    public static void toonRijSterren(int mpAantal) {

        for (int i = 0; i < mpAantal; i++) {

            System.out.print(" * ");

        }

    }

    public static void toonSterrenVierkant(int mpAantal) {

        int mpAantalKeerAantal = mpAantal * mpAantal;

        for (int i = 0; i <= mpAantalKeerAantal; i++) {

            if (i < 1) {
                i++;
            }

            System.out.print(" * ");

            if (i % mpAantal == 0 && i != 0) {
                System.out.println();
            }

        }

    }

    public static void toonCharRij(char mpKarakter, int mpAantal) {

        for (int i = 0; i < mpAantal; i++) {
            System.out.print(mpKarakter + " ");
        }

    }

    public static void optellenTotAanBovengrens(int mpBovenGrens) {
        int mpTotaalSom = 0;
        int mpVerhogingsGetal = 0;
        int mpTeller = 0;


        do {


            if (mpTeller < 1) {
                mpTeller++;
                mpTotaalSom++;
                mpVerhogingsGetal++;

            }

            mpVerhogingsGetal++;
            mpTeller++;
            mpTotaalSom = mpTotaalSom + mpVerhogingsGetal;


            if (mpTotaalSom == mpBovenGrens) {
                mpTeller--;
                System.out.printf("De eerste %d getallen bij elkaar zijn precies %d.%n", mpTeller, mpBovenGrens);
            } else if (mpTotaalSom > mpBovenGrens) {
                mpTeller--;
                System.out.printf("De eerste %d getallen bij elkaar zijn net geen %d.%n", mpTeller, mpBovenGrens);
            }


        } while (mpTotaalSom < mpBovenGrens);



    }

    public static void main(String[] args) {

        // variabelen
        int aantal;

        // scanner init
        Scanner userInput = new Scanner(System.in);

        // Methode 1
        toonRijSterren(50);
        System.out.println();

        // Methode 2
        toonSterrenVierkant(10);
        System.out.println();

        // Methode 3
        System.out.print("Welk karakter wil je dit keer gebruiken? ");
        char karakter = userInput.next().charAt(0);
        System.out.print("Hoe vaak wil je het zien? ");
        aantal = userInput.nextInt();
        toonCharRij(karakter, aantal);
        System.out.println();

        // Methode 4
        System.out.print("Tot hoeveel moeten we optellen? ");
        aantal = userInput.nextInt();
        optellenTotAanBovengrens(aantal);

    }

}
