# Database Term Project
Audrey Banks

Rosemary Solorzano

Caroline Ahumada

Instructions for running the program:

First create a new schema in your database named "finaldatabase":

    * Open your command line and enter the command "mysql -u [username] -p[password]" where [username] and [password] is your mysql username
    * After reaching the MySQL command prompt, enter "create database finaldatabase;"
Create a new user in your MySQL server:

    * While still in the MySQL prompt, enter "create user 'springuser'@'%' identified by 'springbootsql';"
    * Enter "grant all on finaldatabase.* to 'springuser'@'%';"
Run the Python script to set up the given in the folder to set up the database and run the program:

    * Open a new command line in the project directory; make sure you're in the same directory as the jar and sql file.
    * Enter the command "python script.py"
    * Once the program has fully initialized, got to "http://localhost:8080" to access the webpage.
   
