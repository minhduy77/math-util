/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.fptsoftware.minz.mathutil.core.test;

import com.fptsoftware.minz.mathutil.core.MathUtility;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

/**
 *
 * @author LENOVO
 */
public class MathUtilityDDTTest {
    
    public MathUtilityDDTTest() {
    }
    //chuẩn bị bộ data đưa vào hàm getFactorial()
    //chuẩn bị luôn bộ data kết quả trả về từ hàm
    //0! -> 1; 1! -> 1; 2! -> 2; 3! -> 6; 4! -> 24; 5! -> 120; 6! -> 720
    //{0, 1}, {1, 1}, {2, 2}, {3, 6}, {4, 24}, {5, 120},{6, 720},
    public static Object[][] initData() {
        return new Object[][]
        {
         {0, 1}, 
         {1, 1}, 
         {2, 2}, 
         {3, 6}, 
         {4, 24}, 
         {5, 120}, 
         {6, 720}
        };
    }
    @ParameterizedTest
    @MethodSource("initData")
    public void testFactorialGivenRightArgunentReturnsWell(int n, long expected){
        assertEquals(expected, MathUtility.getFactorial(n));
    }
}

