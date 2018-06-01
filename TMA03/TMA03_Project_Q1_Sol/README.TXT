-------------------------------------------------------------
This is the project README file. 
Use this file for making notes on your work on this project.
-------------------------------------------------------------
// Test code for Q1(b)
Frog frog1 = new Frog();
Frog frog2 = new Frog();
Frog frog3 = new Frog();
frog1.right();
frog2.right();
frog3.right();
FrogDanceCoordinator fc = new FrogDanceCoordinator(frog1, frog2, frog3);
fc.selectDancingFrogs();

// Test code for Q1(d)(ii)
Frog frog1 = new Frog();
Frog frog2 = new Frog();
Frog frog3 = new Frog();
frog1.right();
frog2.right();
frog3.right();
FrogDanceCoordinator fc = new FrogDanceCoordinator(frog1, frog2, frog3);
fc.setUpDance();
fc.performDance(); 