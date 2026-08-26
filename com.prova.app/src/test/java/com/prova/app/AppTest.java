package com.prova.app;

import static org.junit.Assert.*;

import org.junit.Test;


public class AppTest 
{
    @Test
    public void TestApp() {
    	App app = new App();
    	assertEquals("Hello world", app.sayHello());
    }
    
}
