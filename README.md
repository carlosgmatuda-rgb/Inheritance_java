[README.md](https://github.com/user-attachments/files/32686707/README.md)
# Tax Calculator

A simple Java console program that reads data for N taxpayers — either individuals or companies — calculates the tax owed by each one, and displays the total amount of tax collected.

## How it works

For each taxpayer, the program asks whether they are an **individual (i)** or a **company (c)**, then collects the required data:

- **Individual:** name, annual income, health expenditures
- **Company:** name, annual income, number of employees

### Tax rules

**Individual**
- Income below `20000.00` → **15%** tax
- Income of `20000.00` or more → **25%** tax
- 50% of health expenditures is deducted from the tax owed

**Company**
- **16%** tax by default
- **14%** tax if the company has more than 10 employees

## Example

```
Enter the number of tax payers: 3
Tax payer #1 data:
Individual or company (i/c)? i
Name: Alex
Anual income: 50000.00
Health expenditures: 2000.00
Tax payer #2 data:
Individual or company (i/c)? c
Name: SoftTech
Anual income: 400000.00
Number of employees: 25
Tax payer #3 data:
Individual or company (i/c)? i
Name: Bob
Anual income: 120000.00
Health expenditures: 1000.00

TAXES PAID:
Alex: $ 11500.00
SoftTech: $ 56000.00
Bob: $ 29500.00

TOTAL TAXES: $ 97000.00
```

## How to run

```bash
javac Main.java
java Main
```

## Technologies

- Java
