# Screenshots from SecurityService :

## Post Method for user1 : http://localhost:9090/login


<img width="985" height="579" alt="image" src="https://github.com/user-attachments/assets/25b4d1e6-73a0-4805-a2ff-3477ac7bc1e6" />


## Post Method for user1 after pasting the refresh token : http://localhost:9090/refresh


<img width="984" height="580" alt="image" src="https://github.com/user-attachments/assets/8d178490-5329-436c-92e6-9098202c094a" />


# Screenshots from BanqueService :

# All methods work on the scope "ADMIN" 

## Testing on user1 who has the scope "USER" first to prove the denial of access : http://localhost:8081/v1/comptes


<img width="987" height="432" alt="image" src="https://github.com/user-attachments/assets/0248a2f7-a641-4a67-86ec-04d072e35134" />


## Testing the POST and GET methods on user3 who is an admin : http://localhost:8081/v1/comptes

### 1) retrieving the token

<img width="982" height="569" alt="image" src="https://github.com/user-attachments/assets/ab672758-eacc-4774-97bd-2db0721d02f3" />

### 2) executing the GET method after pasting the token

<img width="981" height="547" alt="image" src="https://github.com/user-attachments/assets/61efb68c-c16d-4308-888a-a35cd0e3db60" />

### 3) executing the POST method

<img width="983" height="518" alt="image" src="https://github.com/user-attachments/assets/8504993a-ac5b-410c-8950-8b2f65c6501c" />

