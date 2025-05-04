package javaviradonojiraya.javacore.ZZKjunit.domain;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DeveloperTest {
     Employee employeeDeveloper;

    @Test
    public void instanceOf_Executes_ChildClassMethod_WhenObjectIsOfChildType(){
        Employee employeeDeveloper = new Developer("1", "Java");
        //Forma antiga:
        if (employeeDeveloper instanceof Developer){
            Developer developer = (Developer) employeeDeveloper;
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
        //forma com Pattern Matching for instanceof:
        if (employeeDeveloper instanceof Developer developer){
            Assertions.assertEquals("Java", developer.getMainLanguage());
        }
    }


}