**Describe how the design pattern you've implemented in your Solution:

-Implemented Strategy Design Pattern.
-Reason: As we have same burger order data here, the only difference in the way it is represented on the Bill receipt and Packing Reeceipt.
To presenr similar data in different pattern (or in different ways), we need same data but DIFFERENT STRATEGEIS, hence this pattern.
- How Implemented:
 Steps: 
1. Created a interface IReceiptStrategy, having PrintReceipt() : CounterOrder method.
2. Created 2 strategy classes BillReceipt and PackingReceipt, both implementing IReceiptStrategy interface.
3. Created a StrategyContext class whose behavior varies as per its strategy object.Basically strategy object changes the executing algorithm of the StrategyContext object.

4. PrintReceipt is the calling Main() and is the execution node for the project.
5. CounterOrder class is for taking order at counter in  specific Customer order sequence.

**Write demo run output:

Printing Order Bil Receipt

           FIVE GUYS
         BURGER & FRIES
         STORE #CA 1294
        SAN JOSE, CA 95111

Order Number :  45

1  LBB                   $5.59
{{{{Bacon}}}}
Lettuce
Tomato
->G Onion
->Jala Grilled


Sub. Total:              $5.59
Tax:                     $0.5031
Total:                   $6.0931

--------------------

Printing Order Packing Receipt

Pattie 1

Order Number :  45

       FIVE GUYS

1  LBB
Lettuce
Tomato
->G Onion
->Jala Grilled
{{{{Bacon}}}}


Register:1        Tran Seq: 54784


--------------------
