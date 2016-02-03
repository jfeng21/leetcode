/*
 * Person.h
 *
 *  Created on: Jan 26, 2016
 *      Author: Jenny0412
 */

#ifndef PERSON_H_
#define PERSON_H_
#include <iostream>
#include <string>

using namespace std;
namespace edu {
namespace neu {
namespace csye6205 {

class Person {

public:
	string name;
	int age;
	string gender;
public:
	Person(string name, int age, string gender);
	virtual ~Person();

	virtual string getName() ;
		virtual void setName(string n);

		virtual int getAge();
		virtual void setAge(int a);

		virtual string getGender() ;
		virtual void setGender(string g);
};

} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */

#endif /* PERSON_H_ */
