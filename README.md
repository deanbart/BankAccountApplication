# BankAccountApplication
Parses CSV files containing banking information - generating Account objects according to two different types (Savings & Checking accounts).
Program will use an interface to determine the base interest rate for banking accounts.

Account Methods:
-deposit(), withdraw(), transfer(), showInfo()

Savings Account Features: 
-Assigned a safety deposit box key (3 digit number) accessed via a 4 digit code

-Savings accounts will have 0.25 points less than the base interest rate 

Checking Account Features:
-Assigned a debit card (12 digit number) acessed via a 4 digit PIN

-Checking account use 15% of the base rate
