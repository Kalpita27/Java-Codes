// Case 4 - Multiple inheritance
class Demo 
{
    int i;
    void fun()
    {}
}
class Hello
{
    int i;
    void fun()
    {}
}
class Marvellous extends Demo, Hello    // Error
{
}

/*  marvellous have 2 times int i and 2 times fun() method 
 but this is not a problem of 2 times same characteristics or behaviour 
 but when someone creates object of marvellous class and call the method .fun() then runtime
 environment goes into the ambiguity problem i.e confusion so multiple
 inheritance is not allowed in java 
 */ 