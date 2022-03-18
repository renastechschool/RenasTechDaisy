# Feb 18
```
WebDriverManager.chromedriver().setup();
WebDriver driver=new ChromeDriver();
driver.get("https://www.google.com");
driver.manage().window().maximize();
WebElement gmailButton=driver.findElement(By.linkText("Gmail"));

System.out.println("gmail button text is:"+gmailButton.getText());
System.out.println("gmail button href attribute is:"+gmailButton.getAttribute("href"));
``````