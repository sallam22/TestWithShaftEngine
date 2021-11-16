@echo off
set path=C:\Users\IST\.m2\repository\allure\allure-2.14.0\bin;C:\Program Files\Java\jdk-16.0.1\bin;%path%
allure serve allure-results
pause
exit