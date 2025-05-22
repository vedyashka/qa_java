import com.example.Cat;
import com.example.Feline;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

import java.util.List;

class CatTest {

    @Test
    void catSaysMeow() {
        Feline feline = mock(Feline.class);
        Cat cat = new Cat(feline);
        assertEquals("Мяу", cat.getSound());
    }

    @Test
    void catGetsFoodFromFeline() throws Exception {
        Feline feline = mock(Feline.class);
        when(feline.eatMeat()).thenReturn(List.of("Птица", "Мясо"));
        Cat cat = new Cat(feline);
        assertEquals(List.of("Птица", "Мясо"), cat.getFood());
    }
}