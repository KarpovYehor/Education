package com.telran.base.lesson12;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class TaskOneTest {

    @Test
    public void testGetMaxWhenArrayIsCorrect(){
        int[] array = {2,4,6};
        TaskOne taskOne = new TaskOne();
        int max = taskOne.getMax(array);
        assertEquals(6, max);
    }

    @Test
    public void testGetMaxWhenArrayIsNull(){
        int[] array = null;
        TaskOne taskOne = new TaskOne();
        assertEquals(-1, taskOne.getMax(array));
    }

    @Test
    public void testGetMaxWhenArrayIsEmpty(){
        int[] array = {};
        TaskOne taskOne = new TaskOne();
        assertEquals(-1, taskOne.getMax(array));
    }


}