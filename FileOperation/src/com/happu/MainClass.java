package com.happu;

class A
{
    void method(int i)
    {
        //method(int)
    }
}
 
class B extends A
{
    @Override
    void method(int i)
    {
        //method(Integer)
    }
}