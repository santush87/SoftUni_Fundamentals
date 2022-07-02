<h3>1.	Ages</h3>
<p>Write a program that determines whether based on the given age a person is: baby, child, teenager, adult, elder. The bounders are:</p>
<p>•	0-2 – baby; </p>
<p>•	3-13 – child; </p>
<p>•	14-19 – teenager;</p>
<p>•	20-65 – adult;</p>
<p>•	>=66 – elder; </p>
<p>•	All the values are inclusive.</p>
<p>Examples</p>

![Screenshot_1](https://user-images.githubusercontent.com/73018624/176996475-5db7ef6a-2ab2-4cc2-8d9c-a106d200344f.jpg)


<h3>2.	Division</h3>
<p>You will be given an integer and you have to print on the console whether that number is divisible by the following numbers: 2, 3, 6, 7, 10. You should always take the bigger division. If the number is divisible by both 2 and 3 it is also divisible by 6 and you should print only the division by 6. If a number is divisible by 2 it is sometimes also divisible by 10 and you should print the division by 10. If the number is not divisible by any of the given numbers print "Not divisible". Otherwise, print "The number is divisible by {number}".</p>

<p>Examples</p>

![Screenshot_2](https://user-images.githubusercontent.com/73018624/176996490-e6eaac6c-e9ec-4106-afcf-3b0693563737.jpg)

<h3>3.	Vacation</h3>
<p>You are given a group of people, type of the group, on which day of the week they are going to stay. Based on that information calculate how much they have to pay and print that price on the console. Use the table below. In each cell is the price for a single person. The output should look like that: "Total price: {price}". The price should be formatted to the second decimal point.</p>
<p>Examples</p>

![Screenshot_3](https://user-images.githubusercontent.com/73018624/176996510-84c8792e-6688-494d-af66-a5d12f078c55.jpg)

<p>There are also discounts based on some conditions:</p>
<p>•	Students – if the group is bigger than or equal to 30 people you should reduce the total price by 15%</p>
<p>•	Business – if the group is bigger than or equal to 100 people 10 of them can stay for free.</p>
<p>•	Regular – if the group is bigger than or equal to 10 and less than or equal to 20 reduce the total price by 5% </p>
<p>You should reduce the prices in that EXACT order.</p>
<p>Examples</p>

![Screenshot_4](https://user-images.githubusercontent.com/73018624/176996541-a891a806-fa4c-414c-bac6-373deecfbf2a.jpg)

<h3>4.	Print and Sum</h3>
<p>Write a program to display numbers from given start to given end and their sum. All the numbers will be integers. On the first line, you will receive the start number, on the second the end number.</p>

<p>Examples</p>

![Screenshot_5](https://user-images.githubusercontent.com/73018624/176996837-97e5661f-128a-4b72-861a-466850daedd8.jpg)

<h3>5.	Login</h3>
<p>You will be given a string representing a username. The password will be that username reversed. Until you receive the correct password print on the console "Incorrect password. Try again.". When you receive the correct password print "User {username} logged in." However on the fourth try if the password is still not correct print "User {username} blocked!" and end the program.</p>

<p>Examples</p>

![Screenshot_6](https://user-images.githubusercontent.com/73018624/176997230-9a7a0f42-dd47-441a-8be0-dc322fae4cec.jpg)

<h3>6.	Strong Number</h3>

<p>Write a program to check if a given number is a strong number or not. A number is strong if the sum of the Factorial of each digit is equal to the number. For example 145 is a strong number, because 1! + 4! + 5! = 145. Print "yes" if the number is strong and "no" if the number is not strong.</p>

<p>Examples</p>

![Screenshot_7](https://user-images.githubusercontent.com/73018624/176997274-6134300b-d096-475a-9a1f-be44658cd69d.jpg)

<h3>7.	Vending Machine</h3>
<p>Your task is to calculate the total price of a purchase from a vending machine. Until you receive "Start" you will be given different coins that are being inserted into the machine. You have to sum them to have the total money inserted. There is a problem though. Your vending machine only works with 0.1, 0.2, 0.5, 1, and 2 coins. If someone tries to insert some other coins you have to display "Cannot accept {money}", where the value is formatted to the second digit after the decimal point and not add it to the total money. On the next few lines until you receive "End" you will be given products to purchase. Your machine has however only "Nuts", "Water", "Crisps", "Soda", "Coke". The prices are: 2.0, 0.7, 1.5, 0.8, 1.0 respectively. If the person tries to purchase a not existing product print “Invalid product”. Be careful that the person may try to purchase a product for which he doesn't have money. In that case, print "Sorry, not enough money". If the person purchases a product successfully print "Purchased {product name}". After the “End” command print the money that is left formatted to the second decimal point in the format "Change: {money left}".</p>

<p>Examples</p>

![Screenshot_8](https://user-images.githubusercontent.com/73018624/176997329-686bc00b-7922-415b-862f-eb1455179531.jpg)

<h3>8.	Triangle of Numbers</h3>
<p>Write a program, which receives a number – n, and prints a triangle from 1 to n as in the examples.</p>
<p>Constraints</p>
<p>   •	n will be in the interval [1...20].</p>

<p>Examples</p>

![Screenshot_9](https://user-images.githubusercontent.com/73018624/176997410-ea785fec-1d3c-4a8a-9458-2bf833f1bc26.jpg)


<h3>9.	Orders</h3>
<p>We are placing N orders at a time. You need to calculate the price on the following formula:</p>
<p>((daysInMonth * capsulesCount) * pricePerCapsule)</p>
<h4>Input / Constraints</h4>
<p>•	On the first line you will receive integer N – the count of orders the shop will receive.</p>
<p>•	For each order you will receive the following information:</p>
<p>   o	  Price per capsule - floating-point number in range [0.00…1000.00]</p>
<p>   o 	Days – integer in range [1…31]</p>
<p>   o 	Capsules count - integer in range [0…2000]</p>
<p>The input will be in the described format, there is no need to check it explicitly.</p>
<h4>Output</h4>
<p>The output should consist of N + 1 lines. For each order you must print a single line in the following format:</p>
<p>•	"The price for the coffee is: ${price}"</p>
<p>On the last line you need to print the total price in the following format:</p>
<p>•	 "Total: ${totalPrice}"</p>
<p>The price must be formatted to 2 decimal places. </p>

<p>Examples</p>

![Screenshot_10](https://user-images.githubusercontent.com/73018624/176997512-014d0efe-8d30-4cb7-bbbc-cc593b2438f2.jpg)
