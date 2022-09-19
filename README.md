# Payment-Wallet-Application
This project is about Building REST APIs for online payment wallet application which can be used by customers for  different services.    
 The unique features of this project is We have implemented user validation at every step that will based upon authenticated unique key, for every user. And we are are following proper architecture based design that's allow us to write neat and clean code.
 
 We have written the business logic in such a way that at any step we can easily access current customer with the help of key and we can implement the required logic as per need.

<br />


![IMG-20220606-WA0000_1654520149514](https://user-images.githubusercontent.com/97912572/172801668-c693084d-0702-4017-abd2-76af65042ae7.jpg)



### This is a collaborative project, completed by a team of 6 backend developers at Masai School.

# Collaborators

- [Chandan Mourya](https://www.github.com/Chandan-Mourya)
- [Shubham Mishra](https://github.com/Shubham-46)

- **Services Offered**
1. User can Login and Signup.
2. Adding money to wallet from bank.
3. Transfer money to different users.
4. User can get all transaction history, bill payments.
5. User can pay Bills

- **Backend**
1. Built authentication while login and logout using key.
2. Stored the data on MySQL and used it for Authentication.


<br />


# Tech Stack

<img align="left" src="https://1000logos.net/wp-content/uploads/2020/09/Java-Logo.png" alt="drawing" width="100"/>
<img align="left"  src="https://download.logo.wine/logo/Spring_Framework/Spring_Framework-Logo.wine.png" alt="drawing" width="100"/>
<img src="https://download.logo.wine/logo/MySQL/MySQL-Logo.wine.png" alt="drawing" width="100"/>


<img align = "left" src="https://www.dariawan.com/media/images/tech-spring-boot.width-1024.png" alt="drawing" width="100"/>
<img align="left"  src="https://upload.wikimedia.org/wikipedia/commons/2/22/Hibernate_logo_a.png" alt="drawing" width="100"/>
<img  align="left" src="https://miro.medium.com/max/818/1*zc-LgogGtr7fFHF9e1M8wA.png" alt="drawing" width="100"/>

<img src="https://maven.apache.org/images/maven-logo-white-on-black.purevec.svg" alt="drawing" width="100"/>


<img src="https://zooz.github.io/predator/images/restapi.png" alt="drawing" width="100"/>



<br />





# Modules

- Login and Signup Module
- Wallet Module
- Account Module
- Customer Module
- Bill Payment Module
- Transaction Module
- Beneficiary Module
- Bank Account Module


<br />

## User Features
- customer can validate their login.


<br />


## Customer Features
- Customer can login in the application and update their information using their username and password.
- Customer can add account to wallet.
- Customer can delete account from wallet.
- Customer can view account of wallet.
- Customer can view list of all account to wallet.


<br />

## Wallet Features
- User can create new wallet account.
- Track a user’s wallet balance.
- User can add money to  wallet account.
- Allow a user to transfer money to another user/account.
- Keep a history of last N transactions.

<br />


## Bank Accounts Features
- Can add,delete,update Bank Accounts in their wallet
- Can transfer money from Bank Accounts to wallet


<br />

## Bill Payment Features
- Customer can add bill payment.
- Customer can view bill payment.



<br />

## Transaction Features
- Customer can add new transaction.
- Customer can view all transaction.
- Customer can view transaction by date.
- Customer can view lis of all transaction.



<br />

# Installation & Run
 - Before running the API server, you should update the database config inside the application.properties file.
- Update the port number, username and password as per your local database configuration.

```
    server.port=8080

    spring.datasource.url=jdbc:mysql://localhost:3306/walletdb;
    spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
    spring.datasource.username=root
    spring.datasource.password=root
```


# ER Diagram :



![erd_final_walletapp](https://user-images.githubusercontent.com/90818364/185763697-0448e426-d5db-429f-84f6-e5774ebc9491.png)




