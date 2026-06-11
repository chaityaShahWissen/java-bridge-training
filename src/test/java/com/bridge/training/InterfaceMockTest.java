package com.bridge.training;

import org.junit.jupiter.api.Test;

import static org.mockito.Mockito.*;

class InterfaceMockTest {

    @Test
    void testVoidMethodInvocation() {

        I mockInterface = mock(I.class);

        mockInterface.abc();
        mockInterface.abc();
        mockInterface.abc();

        verify(mockInterface,
                times(3))
                .abc();
    }
}