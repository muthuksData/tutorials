package com.baeldung.java8.optional;

import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import static org.junit.Assert.*;

import com.baeldung.optional.OrElseAndOrElseGet;

public class OrElseAndOrElseGetTest {

    private OrElseAndOrElseGet orElsevsOrElseGet = new OrElseAndOrElseGet();

    private static final Logger LOG = LoggerFactory.getLogger(OrElseAndOrElseGetTest.class);

    @Test
    public void givenNonEmptyOptional_whenOrElseUsed_thenGivenStringReturned() {
        LOG.info("In givenNonEmptyOptional_whenOrElseUsed_thenGivenStringReturned()");
        String name = orElsevsOrElseGet.getNameUsingOrElse("baeldung");
        assertEquals(name, "baeldung");
    }

    @Test
    public void givenEmptyOptional_whenOrElseUsed_thenRandomStringReturned() {
        LOG.info("In givenEmptyOptional_whenOrElseUsed_thenRandomStringReturned()");
        String name = orElsevsOrElseGet.getNameUsingOrElse(null);
        assertTrue(orElsevsOrElseGet.names.contains(name));
    }

    @Test
    public void givenNonEmptyOptional_whenOrElseGetUsed_thenGivenStringReturned() {
        LOG.info("In givenNonEmptyOptional_whenOrElseGetUsed_thenGivenStringReturned()");
        String name = orElsevsOrElseGet.getNameUsingOrElseGet("baeldung");
        assertEquals(name, "baeldung");
    }

    @Test
    public void givenEmptyOptional_whenOrElseGetUsed_thenRandomStringReturned() {
        LOG.info("In givenEmptyOptional_whenOrElseGetUsed_thenRandomStringReturned()");
        String name = orElsevsOrElseGet.getNameUsingOrElseGet(null);
        assertTrue(orElsevsOrElseGet.names.contains(name));
    }
}
