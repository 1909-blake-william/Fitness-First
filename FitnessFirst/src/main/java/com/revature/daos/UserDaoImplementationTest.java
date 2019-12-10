package com.revature.daos;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.*;

import org.junit.Test;
import java.util.List;

public class UserDaoImplementationTest{


    @Test
    public void test() {
        List<String> mockList = mock(List.class);
        mockList.add("First");
        when(mockList.get(0)).thenReturn("Mockito");
        when(mockList.get(1)).thenReturn("JCG");
        assertEquals("Mockito", mockList.get(0));
        assertEquals("JCG", mockList.get(1));
      }
}
