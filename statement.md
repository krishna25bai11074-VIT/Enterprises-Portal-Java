# Swades Enterprises Portal Statement

# Problem statement

Swades Enterprises needs a simple, menu‑driven console application to manage basic GST‑related information and generate invoices for its customers. The current process for viewing GST statistics, creating invoices, and handling customer reward activities is manual and error‑prone, leading to inconsistent calculations and poor customer experience. A unified Java portal is required to centralize GST information, support invoice generation, and store additional sales records using a single interactive dashboard.


# Scope of the project

Provide a text‑based dashboard that allows users to navigate between GST information, invoice generation, anniversary offers, data entry, and exit options.
Read existing sales data (Info) to compute basic statistics such as highest, lowest, average, total, and most frequent values for sale price, GST percentage, and GST amount.
Generate a formatted GST invoice in the console using user inputs for enterprise details, shipping address, item information, and GST details.
Allow entry of additional transaction records into the in‑memory data structure for further analysis in the same session.
Randomly select a past customer as a prize winner from stored names to support a simple customer‑reward feature.


# Target users

Small and medium retail enterprises that need a lightweight GST utility without complex installation or database setup.
Shop owners or office staff who must quickly check GST‑related statistics and print or capture simple invoices at the point of sale.
Students and beginners in Java programming who want to understand how GST logic, statistics, and menu‑driven programs can be implemented in a single script.


# High‑level features

Dashboard navigation
   Main menu with options for GST information, GST invoice generator, anniversary special, add more information, and exit.  
   Loop‑based interaction that repeatedly asks the user whether to continue working with the portal.

GST information analytics
   Sub‑menus for:  
     Sale Price statistics (highest, lowest, average, total, most frequent).  
     GST Percentage statistics (highest, lowest, total, most frequent).  
     GST Rate/Amount statistics (highest, lowest, total, most frequent).  
    Use of standard Java data collections and helper methods to compute metrics from the Info data collection.

GST invoice generator
   Input prompts for enterprise details, address, shipping address, product description, quantity, rate, GST amount, and GST percentage.  
   Console‑formatted invoice layout displaying header, address, shipping details, invoice number, date, and a line item row with description, quantity, rate, GST rate, and GST percentage.

Anniversary special (random winner)
   Extraction of customer names from Info.  
   Random selection of one past customer as the prize winner using `java.util.Random`.

Enter more information
   Prompts to input a new customer name, product sold, sale price, GST percentage applied, and GST amount.  
   Creation of a new record and appending it to Info for use in subsequent statistics and random selection.

Exit and user acknowledgement
   Option to terminate the portal cleanly.  
   Farewell messages indicating the end of the session.
