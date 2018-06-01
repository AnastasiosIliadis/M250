//(a)(ii) checking if programmer id's are being incremented
Programmer p = new Programmer();
Programmer q = new Programmer();
Programmer r = new Programmer();
System.out.println(p.getID());
System.out.println(q.getID());
System.out.println(r.getID());

//(b)(iv) testing the toString() method - these objects
//have default values set for their instance variables
System.out.println(p);
System.out.println(q);
System.out.println(r);


//(c) Test reading the employee data file, 
//displaying the payroll (using toString of Programmer)
//and writing the payroll to the file payrollResults.txt
Payroll pr = new Payroll();
pr.readEmployeeData();
System.out.println("Results.... \n\n");
pr.showPayroll();
pr.writePayroll();