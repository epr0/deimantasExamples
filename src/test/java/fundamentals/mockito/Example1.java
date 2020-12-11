package fundamentals.mockito;

import lt.sdacademy.fundamentalstesting.calculator.Calculator;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class Example1 {

    @Mock
    Calculator calculator = new Calculator();

    @Test
    public void verifyThatAdditionWasCalled() {
        // given
        when(calculator.add(anyInt(), anyInt()))
                .thenReturn(2);

        // when
        int result = calculator.add(105, 47);

        // then
        verify(calculator)
                .add(anyInt(), anyInt());
    }
}
