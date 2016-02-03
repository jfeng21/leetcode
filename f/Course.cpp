/*
 * Course.cpp
 *
 *  Created on: Feb 1, 2016
 *      Author: Jenny0412
 */


#include "Teacher.h"
#include "StudentCourse.h"
#include <iostream>
#include <string>
#include <vector>
using namespace std;

namespace edu {
namespace neu {
namespace csye6205 {

Course::Course() {
	// TODO Auto-generated constructor stub
	string courseName;
		vector <Student> students;
		Student s1("Jenna", 19, "female",11101, "EE", 98.00);
		students.push_back(s1);
		string instructor;
		//Teacher instructor("Dan", 38, "male", 10001, "Electrical", 100000.00);
}
Course::~Course() {
	// TODO Auto-generated destructor stub
}
string Course::getCourseName(){
	cout<<"Course name is : "<<courseName<<endl;
	return courseName;
}

void Course::setCourseName(string c){
	courseName = c;
}

string Course::getTeacher(){
	return instructor;
}
void Course::setTeacher(string t){
	instructor = t;
}
double Course::avgGrade(){
	double sum=0;

	for(Student s : students){
		 sum += s.getGrade();
	}
	double avg = sum/students.size();
	cout<<"Course average is : "<<avg<<endl;
	return avg;

}



} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
