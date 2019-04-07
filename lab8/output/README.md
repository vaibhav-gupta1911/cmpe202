1.Composite Pattern and Chain of Responsibility
I used Composite pattern to form a heirarchy between Screen,CreditCard,CreditExp and CreditCVC and to treat all those objects uniformly when entrying the card details and display their content.

Entered Digit request is passed in Chain to reach the proper Object handler(CardNum,Exp or CVC objects)

2.Decorator pattern
I used this pattern to decorate the output of EXP and CreditCard Number output. By wrapping the ouput of the CreditCard Num and Credit Card Expiry by Concrete Decorator classes to add spaces in CreditCard Num and / in CreditCradExpiry

3. State Pattern
I used State pattern to know the location of Cursor when we entering and backspacing the digits. I have used State Pattern to know i nWhich Entry we are in displaying it on the Screen.