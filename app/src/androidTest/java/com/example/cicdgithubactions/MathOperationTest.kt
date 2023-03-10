package com.example.cicdgithubactions

import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test


internal class MathOperationTest{
    private lateinit var mathOperation: MathOperation
    @Before
    fun setup(){
        mathOperation= MathOperation()
    }

    @Test
    fun add_two_numbers_5_6_return_11(){
        val result=mathOperation.add(5,6)
        assertThat(result).isEqualTo(11)
    }


    @Test
    fun sub_two_numbers_5_6_return_11(){
        val result=mathOperation.sub(5,6)
        assertThat(result).isEqualTo(-1)
    }

    @Test
    fun dev_two_numbers_36_6_return_11(){
        val result=mathOperation.dev(36,6)
        assertThat(result).isEqualTo(6)
    }
//
//    @Test
//    fun `dev two numbers 5,0 return 11`(){
//        val result=mathOperation.dev(6,0)
//        assertThat(result).isEqualTo(5)
//    }
}