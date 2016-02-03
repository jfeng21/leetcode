/*
 * Person.cpp
 *
 *  Created on: Jan 26, 2016
 *      Author: Jenny0412
 */

#include "Person.h"
#include <iostream>
#include <string>
using namespace std;

namespace edu {
namespace neu {
namespace csye6205 {

Person::Person(string name, int age, string gender):name(name), age(age), gender(gender) {
	// TODO Auto-generated constructor stub

}

Person::~Person() {
	// TODO Auto-generated destructor stub
}

string Person::getName(){
	return name;
}

void Person::setName(string n){
	name = n;
}

int Person::getAge(){
	return age;
}

void Person::setAge(int a){
	age = a;
}

string Person::getGender() {
	return gender;
}

void Person::setGender(string g){
	gender = g;
}
} /* namespace csye6205 */
} /* namespace neu */
} /* namespace edu */
