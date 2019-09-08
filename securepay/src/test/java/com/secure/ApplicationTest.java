package com.secure;


import static org.hamcrest.CoreMatchers.instanceOf;
import static org.junit.Assert.assertThat;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;



@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {AppConfig.class})
public class ApplicationTest {

    @Autowired
    @Qualifier("dataLoader")
    DataLoaderService dataLoader;

    @Test
    public void testDataLoaderNotNull() {
    	
        assertThat(dataLoader, instanceOf(DataLoaderService.class));


    }
}