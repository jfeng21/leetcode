/*
 * Teacher.h
 *
 *  Created on: Feb 1, 2016
 *      Author: Jenny0412
 */

#ifndef TEACHER_H_
#define TEACHER_H_
#include "Person.h"
#include "StudentCourse.h"
#include <iostream>
#include <string>
namespace edu {
namespace neu {
namespace csye6205 {

class Teacher:public Person {
	 const int Employee_id =0001;
		string course;
		double salary;
		Course c;
public:

	Teacher(string name, int age, string gender,int id,  string course, double salary);
	virtual ~Teacher();

	virtual string getName();
	virtual void setName(string n);
	virtual int getAge();
	virtual void setAge(int a);
	virtual string getGender();
	virtual void setGender(string g);

	const int getEmployee_id();
	string getCourse();
	double getSalary();
	void setSalary(double s);
    void teachCourse(Course c);
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* TEACHER_H_ */
