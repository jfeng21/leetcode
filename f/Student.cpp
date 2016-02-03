/*
 * Student.cpp
 *
 *  Created on: Jan 26, 2016
 *      Author: Jenny0412
 */
#include "Person.h"

#include "StudentCourse.h"
#include <iostream>
#include <string>
#include <vector>
using namespace std;
namespace edu {
namespace neu {
namespace csye6205 {

Student::Student(string name, int age, string gender, int id, string major, double grade) :Person(name, age, gender),Student_id(id),major(major),grade(grade)
{
	vector<Course> courses;

	// TODO Auto-generated constructor stub
}


Student::~Student() {
	// TODO Auto-generated destructor stub
}

string Student::getName(){
	cout<<"Student Name is "<<name<<endl;
	return name;

}
void Student::setName(string n){
	name =n;
}
int Student::getAge(){
	cout<<"Student age is "<<age<<endl;
	return age;

}
void Student::setAge(int a){
	age =a;
}
string Student::getGender(){
	cout<<"Student gender is "<<gender<<endl;
	return gender;

}
void Student::setGender(string g){
	gender = g;
}

Course Student::getCourse(){
	cout<<"Student course is "<<course.getCourseName()<<endl;
	return course;

}


const int Student::getStudent_id(){
	cout<<"Student id is "<<Student_id<<endl;
	return Student_id;

}
string Student::getMajor(){
	cout<<"Student major is "<<major<<endl;
	return major;

}
void Student::setMajor(string m){
	major = m;
}
double Student::getGrade(){
	cout<<"Student grade is "<<grade<<endl;
	return grade;

}
void Student::setGrade(double g){
	grade =g;
}

void Student::enroll(Course c){
	courses.push_back(c);
	for(Course c : courses){
    string course = c.getCourseName();
    cout<<"Student registered course: "<<course<<endl;
	}
}

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
