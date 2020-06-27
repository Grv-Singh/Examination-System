# Examination-System
[![Donate](https://img.shields.io/badge/Donate-PayPal-green.svg)](https://www.paypal.me/grv97)<br>
[![time tracker](https://wakatime.com/badge/github/Grv-Singh/Examination-System.svg)](https://wakatime.com/badge/github/Grv-Singh/Examination-System)<br>
[![Say Thanks!](https://img.shields.io/badge/Say%20Thanks-!-1EAEDB.svg)](https://saythanks.io/to/acad.grv97@gmail.com)<br>
I was motivated to do something useful and creative out of my learning from curriculum. For my class 12th (final year in High School), I made an Examintaion System using Netbeans, knowledge of Java and much help from from my friend Shubham. It has a conventional Login, Registration, Dashboard to see a Students' upcoming Exams (and How many days are left for it). I agree the samll parts of UI are meaningfully small, but they add a literal use in UX. Apart from this, one can request a Leave or Ask Doubt to a Teacher. There will be more to this project in coming years. The major use lies in the actual Exam i.e Test taking of it. There are MCQ's, Integer based, Paragraph based Q&A, one can flag for later reference, and use easy navigation. A small feature I like to highlight is a Handy Bot which is Not AI based, but uses simple math and comparision using the values against clock and user input, It helped in keeping the user's Head's Up while making way to the final Answer. Finally one can Update, Delete, Modify and Append all the Student's portfolio, Daily Announcement. I hope this small effort of mine adds up to some purpose.

Hi!
The Project needs a few tables, The CREATE Command for the same is written below, It would be better to copy exact same code in Mysql Command Line Client:
SCHEDULE:
CREATE TABLE schedule(`TestID` int(5) NOT NULL,`Date` date NOT NULL,`Type` varchar(40) DEFAULT NULL,`Subject` varchar(20) NOT NULL,`Maximum_Marks` int(5) NOT NULL,`Note` varchar(100) DEFAULT NULL,`No_Of_Q` int(3) NOT NULL);
ALTER TABLE schedule ENGINE=InnoDB;

Test_1:
CREATE TABLE `test_1` ( `Q_No` int(3) DEFAULT NULL, `Type` varchar(30) DEFAULT NULL, `Question` varchar(1000) DEFAULT NULL, `Sol_MCQ` varchar(10) DEFAULT NULL, `Sol_Int` int(10) DEFAULT NULL, `Opt_A` varchar(200) DEFAULT NULL, `Opt_B` varchar(200) DEFAULT NULL, `Opt_C` varchar(200) DEFAULT NULL, `Opt_D` varchar(200) DEFAULT NULL);
ALTER TABLE test_1 ENGINE=InnoDB;

Test_2:
CREATE TABLE `test_2` ( `Q_No` int(3) DEFAULT NULL, `Type` varchar(30) DEFAULT NULL, `Question` varchar(1000) DEFAULT NULL, `Sol_MCQ` varchar(10) DEFAULT NULL, `Sol_Int` int(10) DEFAULT NULL, `Opt_A` varchar(200) DEFAULT NULL, `Opt_B` varchar(200) DEFAULT NULL, `Opt_C` varchar(200) DEFAULT NULL, `Opt_D` varchar(200) DEFAULT NULL);
ALTER TABLE test_2 ENGINE=InnoDB;

Students_Details:
CREATE TABLE `students_details` ( `Name` varchar(30) DEFAULT NULL, `Username` varchar(30) NOT NULL, `Class` int(2) DEFAULT NULL, `Section` int(1) DEFAULT NULL, `Exam_Roll` int(5) NOT NULL DEFAULT '0');
ALTER TABLE students_details ENGINE=InnoDB;

Replica_Test_1:
CREATE TABLE `replica_test_1` ( `Q_No` int(3) DEFAULT NULL, `Type` varchar(30) DEFAULT NULL, `Question` varchar(1000) DEFAULT NULL, `Sol_MCQ` varchar(10) DEFAULT NULL, `Sol_Int` int(10) DEFAULT NULL, `Opt_A` varchar(200) DEFAULT NULL, `Opt_B` varchar(200) DEFAULT NULL, `Opt_C` varchar(200) DEFAULT NULL, `Opt_D` varchar(200) DEFAULT NULL);
ALTER TABLE replica_test_1 ENGINE=InnoDB;

I'm attaching some Snapshots of Syntax for the Data to be entered... Enter it the SAME WAY after changing the names/classes/roll no. etc. coz It's uniquely identified.
