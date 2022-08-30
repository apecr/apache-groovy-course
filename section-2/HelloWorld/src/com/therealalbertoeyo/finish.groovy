package com.therealalbertoeyo

@groovy.transform.ToString()
class User {
    Long id
    String firstName
    String lastName
    Date dob

    void printFullName(){
        println "FullName: $firstName $lastName"
    }
}

User user = new User(firstName: "Alberto", lastName: "Eyo")
user.printFullName()
println user

