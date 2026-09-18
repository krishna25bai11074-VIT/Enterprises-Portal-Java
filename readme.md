# Swades Enterprises Portal

Swades Enterprises Portal is a menu‑driven Java console application to view GST statistics, generate a GST invoice, celebrate their anniversary lucky Prize Winner from their customer list, and add basic sales records.

# Features

Dashboard with 5 main options:
  1. View GST information (prices, GST percentages, GST rates)
  2. Generate a GST invoice in a formatted text layout
  3. Anniversary special: randomly pick a customer name for Lucky Prize Winner
  4. Enter more sales information
  5. Exit the portal
Uses basic statistics (max, min, mean, sum, mode) on existing sales data.
Simple, fully terminal‑based UI using Java's Scanner and System.out.println().

# Project Structure

```text
Data.java        # Contains Data class with static Info list of transaction records
Main.java        # Main entry point for Swades Enterprises Portal
readme.md        # Project documentation
```

# Requirements

1) Java Development Kit (JDK) 8 or higher
2) Standard Java libraries (`java.util.*`)
3) `Data.java` which defines `Data.Info`, a list of `Record` objects containing customer transactions.

# How to Run

1) Download this project folder.
2) Open a terminal in the project directory.
3) Compile the Java files:
   `javac Data.java Main.java`
4) Run the Java application:
   `java Main`

# How to Use

After running the application, the portal header is displayed and you see the dashboard:

1. GST Information
   Choose:
      1 for Sale Price statistics
      2 for GST Percentage statistics
      3 for GST Rate statistics
    Then choose:
      Highest value
      Lowest value
      Average (for prices)
      Total (sum)
      Most frequent value (mode)

2. GST Invoice Generator 
    Enter:
      Enterprise name and address
      Shipping address
      Product description, quantity, rate, GST amount, GST percentage
      The program prints a nicely formatted invoice in the console.

3. Anniversary Special
     Randomly selects and prints a customer name from info for Lucky Prize Winner

4. Enter More Information
    Enter:
       Customer name
       Product sold
       Sale price
       GST percentage and GST rate
    The new record is appended to info during that run.

5. Exit
     Just stops the program.

# Author
      Krishna Maheshwari
      CSE(AI and ML) Student
      VIT Bhopal 
