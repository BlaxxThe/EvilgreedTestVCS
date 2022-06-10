# **Evilgreed.com website test**


### Packages used

- TestNG `org.testng:testng`
- Selenium `org.seleniumhq.selenium:selenium-java`
- WebDriverManager `io.github.bonigarcia:webdrivermanager`


### Site used for testing

[Evilgreed](https://evilgreed.net/)

### Test number 1. Evilgreed login test

- Open login page [Link](https://evilgreed.net/)
- Enter Email
- Enter Password
- Click Login button

### Test number 2. "Search" test

- Open product search page [Link](https://evilgreed.net/search?type=product&q=)
- Enter product name
- Click on search button
- Click on item filter

### Test number 3. Category "New" test

- Open "New" category [Link](https://evilgreed.net/collections/new-music)
- Click on "Music" category filter
- Click on "12" Vinyl" filter
- Choose a product

### Test number 4. "Add To Cart" Test

- Open [Link](https://evilgreed.net/collections/music/12%22-VINYL)
- Choose record
- Click add to cart button
- Click on shopping cart button
- Remove item from shopping cart

### Test number 5. "Contact" test

- Open main page [Link](https://evilgreed.net/)
- Click on Contact button
- Enter Name
- Enter Email
- Enter message
- Click on send button