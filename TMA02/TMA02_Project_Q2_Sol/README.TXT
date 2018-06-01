Writer anWriter;
anWriter = new Writer("Lewis Carroll", 1832, "British");

Book b = new Book("Alice's Adventures in Wonderland", anWriter ,1865, "100 million", "978-0-394-58571-0");																

Execute the line:
b.toString();

Execute the line:
b.WritersAge();

anWriter.setYearOfBirth(1820);

//And again, execute:
b.toString();

//Execute the line:
b.WritersAge();
