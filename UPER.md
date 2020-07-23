<h1>The Problem Solving Framework : 'UPER'</h1>

* U = "Understand"
* P = "Plan"
* E = "Execute"
* R = "Reflect" / "Refactor"

<h2>1. Understanding the Problem</h2>
* Calculate the total of given "Product" objects.
* Incorporate SOLID design
* Print item name : price
* Price += Tax @ .10% except books, food and exempt.
* All imports are taxed @ 0.05% 
* All tax is rounded to the nearest 0.05$
*print total w/ tax. each item has raw value next to it.  subtotal + tax, then total.
*
*
<h2>
    2. Planning the Solution
</h2>
* Test for each step using TDD
* Need a receipt printOut 'ReceiptCalculator'
* SubClass for handling tax/importTax(non-exemption)
* Tests for
-adding objects to a cart. 
-stream from cart list
-
* For now need all inputs to be classes, refactor to pull from a .json after mvp
*   
*
*
*
*
<h2>
    3. Executing the Plan
</h2>
* Made TaxCalculator w/o TDD. Should only calc tax on products.
* ReceiptCalculator should only add total price
* Tax rate should be in TaxCalc, (each product holding their own is a waste.)
* 
*
*
*
*
*
<h2>
    4. Reflection / Refactor
</h2>
* I initially wasnt using Junit for testing, making the tests a bit more difficult to execute. refactored tests to Junit.
* My data for these tests are just separate classes, with a little more time i would need to pull data from a .json (or other source) to populate this store's inventory. 
* 0720:0830 - My code works, but i dont have Single Responsibility for calculating prices and printing prices
* BUG! The final test the readme calls for 6.70 in taxes but I get 6.65 every time. need to round up. My rounding math is bad.
*
* Using good OOP practice i should be making
*
*