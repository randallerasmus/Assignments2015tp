/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.mavenprojecttp3.TestPackages;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 211064084
 */
public class FloatingPointTest {
    
    public FloatingPointTest() {
    }
    
    @Test
    public void equalitytest(){
         float actual = value1();
         float expected = 1.1f;
    assertEquals("NOT EQUAL", actual, expected, 2);
    }
    float value1 (){
    return 6.1f;
    }
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
