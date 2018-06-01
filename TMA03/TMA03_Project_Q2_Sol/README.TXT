------------------------------------------------------------------------
This is the project README file. Here, you should describe your project.
Tell the reader (someone who does not know anything about this project)
all he/she needs to know. The comments should usually include at least:
------------------------------------------------------------------------

PROJECT TITLE: what's on - inspired by Amazon's Echo Dot
PURPOSE OF PROJECT: TMA03 Q2 17J
VERSION or DATE: 1.0
HOW TO START THIS PROJECT:
AUTHORS: M250 module team
USER INSTRUCTIONS: test code is as below.

WhatsOn alexa = new WhatsOn();
alexa.addActivity("wash car","010117","0900");
alexa.addActivity("go shopping","020117","1000");
alexa.addActivity("return sale items","010117","1000");
alexa.addActivity("back to work", "040117", "0900");
alexa.whatsOnToday();
alexa.updateDate("040117");
alexa.whatsOnToday();
alexa.removeActivity("back to work","040117","0900");
alexa.whatsOnToday();









Activity x = new Activity("back to work","040117","0900");
Activity z = new Activity("back to work","040117","0900");
Activity y = new Activity("return sale items","010117","1000");

x.equals(y);
x.equals(z);
y.hashCode();
