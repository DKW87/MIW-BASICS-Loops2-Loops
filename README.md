# Programming –opdracht Loops 2 - Loops

## Beschrijving
In deze serie opdrachten ga je loops gebruiken, meestal de for-loop. Je gebruikt deze in verschillende methodes. Elke methode kun je testen door in de main() method de methode aan te roepen. Dit kan soms rechtstreeks, als de methode zelf iets print. Dit kan binnen een println() methode om het resultaat te tonen. Het kan ook door de returnwaarde van de methode eerst op te slaan in een variabele en dan die variabele in een println() methode te gebruiken.

Elke opdracht beschrijft wat je moet doen. Je ziet ook een voorbeeld van input en output. Input die de gebruiker invoert is schuin en onderstreept.

## Sterrenrij
Schrijf een methode die een gegeven aantal asterisken print. De methode heeft als signature public static void toonRijSterren (int mpAantal). Roep de methode aan in je main methode en run je project. Hieronder zie je het resultaat van de aanroep toonRijSterren (8).

```
********
```

## Sterrenvierkant
Schrijf een methode die een sterrenvierkant van asterisken print van gegeven grootte. De methode heeft als signature public static void toonSterrenVierkant (int mpAantal). Maak gebruik van de methode die een sterrenrij van asterisken print. Test je methode in de main:

```
********
********
********
********
********
********
********
********
```

## Karakter rij
Schrijf een methode die een rij van een aantal karakters print. Je moet aan de methode het karakter meegeven en het aantal. De signature van de methode is public static void toonCharRij(char mpKarakter, int mpAantal). Vraag in de main methode de gebruiker om een karakter en toon dit vijf keer achter elkaar. De Scanner class heeft geen methode nextChar(). Maar je kan wel een String inlezen en vervolgens het eerste karakter daarvan opvragen (zie boek § 4.4.6). Je kunt de gebruiker ook nog om het aantal vragen.

```
Welk karakter wil je dit keer gebruiken? &
Hoe vaak wil je het zien? 9
&&&&&&&&&
```

## Optellen tot aan 1000
Schrijf een loop die alle getallen vanaf 1 bij elkaar optelt (dus 1 + 2 + 3 + 4 + ......) en stopt als de som van deze getallen groter is dan 1000. Tel ook hoeveel getallen je dan bij elkaar opgeteld hebt.

## Optellen tot aan een bovengrens
Schrijf een methode die alle getallen vanaf 1 bij elkaar optelt tot aan een meegegeven bovengrens en dan het aantal getallen dat je hebt opgeteld teruggeeft. De signature van de methode is public static int telAantalTeSommerenGetallen(int mpGrens).

```
Tot hoeveel moeten we optellen? 2000
De eerste 62 getallen bij elkaar zijn net geen 2000.
```

## Richtlijnen bij coderen (zie ook MIW code conventions)
- Zorg dat je naam en het doel van het programma bovenin staan (ICC #1).
- Gebruik de juiste inspringing (indentation) bij de lay-out (ICC #2).
- Let op juist gebruik hoofdletters en kleine letters (ICC #3).
- Gebruik goede namen (ICC #4).
- Voeg waar nodig commentaar toe dat inzicht geeft in je code (ICC#7)