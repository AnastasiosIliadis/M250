//part (b) example of creating an object of the class M250Account
M250Account x = new M250Account();

//part (b) example of sending a message to the object you created (in this case, called x)
x.getAccountNum();

//part (d) test code. Execute one line at a time. 
//Make sure you have an M250Account object called x first!
x.isValidAccountNum("X1234");
x.isValidAccountNum("1X2345");
x.isValidAccountNum("x12345");
x.isValidAccountNum("C1234-");
x.isValidAccountNum("B12345");
x.isValidAccountNum("123456");
x.isValidAccountNum("3456789");

//part (e) - write your own test code for this part and test your setAccountNum method
//using the same account numbers as those given above