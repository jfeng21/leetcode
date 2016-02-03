//============================================================================
// Name        : A2_Person.cpp
// Author      : 
// Version     :
// Copyright   : Your copyright notice
// Description : Hello World in C++, Ansi-style
//============================================================================

#include <iostream>
#include "Person.h"
#include "StudentCourse.h"
#include "Teacher.h"
#include <vector>
using namespace std;
using namespace edu::neu::csye6205;


int main() {
   //Person
	Person p("Dan", 18, "male");
	Person *p_ptr;
	p_ptr = &p;
	cout<<"Person: "<<"name is:"<<p.getName()<<", age is "<<p.getAge()<<", gender is "<<p.getGender()<<endl;

	//Student
   Student s("Tom", 20, "male",10001, "EE", 90.0);
   s.setName("Aya");
   Student *s_ptr;
   s_ptr = &s;
   s_ptr->getName();
   cout<<"Student Name: "<<s.getName()<<endl;
   s_ptr->getAge();
   s_ptr->getCourse();
   s_ptr->getGrade();
   Course course;
   course.setCourseName("Financial Management");
   course.setTeacher("Jack");
   s.enroll(course);

   //Teacher
   Teacher t("Dan", 30, "male",11101,"chemistry", 1000000.00);
   Teacher *t_ptr =&t;
   t_ptr->getName();
   t_ptr->getAge();
   t_ptr->getCourse();
   t.getSalary();
   cout<<"Teacher Name: "<<t_ptr->getName()<<endl;

   //Course
   Course c;
   Course *c_ptr = &c;
   c.setCourseName("WebTool");
   c.setTeacher("April");
   c.getCourseName();
   c.avgGrade();


}
