package com.daehosting;

import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class TemperatureConversionsTest {

    @Test
    void getTemperatureConversionsSoap() {
    }

    @Test
    void getTemperatureConversionsSoap1() {
    }

    @Test
    void getTemperatureConversionsSoap12() {

        TemperatureConversionsSoapType services = new TemperatureConversions().getTemperatureConversionsSoap12();
        BigDecimal resut = services.celsiusToFahrenheit(BigDecimal.valueOf(0));
        assertEquals(BigDecimal.valueOf(32), resut);
    }

    @Test
    void getTemperatureConversionsSoap121() {
    }
}