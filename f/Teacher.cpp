/*
 * Teacher.cpp
 *
 *  Created on: Feb 1, 2016
 *      Author: Jenny0412
 */
#include "Person.h"
#include "Teacher.h"
#include <iostream>
#include <string>

using namespace std;
namespace edu {
namespace neu {
namespace csye6205 {

Teacher::Teacher(string name, int age, string gender,int id,string course, double salary):Person(name, age, gender), Employee_id(id),course(course), salary(salary){
	// TODO Auto-generated constructor stub

}

Teacher::~Teacher() {
	// TODO Auto-generated destructor stub
}

string Teacher::getName(){
	cout<<"Teacher Name is "<<name<<endl;
	return name;

}
void Teacher::setName(string n){
	name =n;
}
int Teacher::getAge(){
	cout<<"Teacher age is "<<age<<endl;
	return age;

}
void Teacher::setAge(int a){
	age =a;
}
string Teacher::getGender(){
	cout<<"Teacher gender is "<<gender<<endl;
	return gender;

}
void Teacher::setGender(string g){
	gender = g;
}

string Teacher::getCourse(){
	cout<<"Teacher course is "<<course<<endl;
	return course;

}


const int Teacher::getEmployee_id(){
	cout<<"Employee id is "<<Employee_id<<endl;
	return Employee_id;

}

void Teacher::setSalary(double s){
	salary =s;
}
double Teacher::getSalary(){
	cout<<"Teacher salary is "<<salary<<endl;
	return salary;

}


void Teacher::teachCourse(Course c){
	cout<<"Teacher teach course: "<<course<<endl;
    course = c.getCourseName();

}



} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
