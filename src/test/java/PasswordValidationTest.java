import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PasswordValidationTest {

    @Test
    void whenMinimumLength8ThenReturnTrue() {
        //Given
        String pw = "abcdefgh";
        //WHEN
        boolean longEnough = PasswordValidation.checkLength(pw);
        //THEN
        assertEquals(true, longEnough);

    }

    @Test
    void whenLengthShorter8ThenReturnTrue() {
        //Given
        String pw = "ijklm34";
        //WHEN
        boolean longEnough = PasswordValidation.checkLength(pw);
        //THEN
        assertEquals(false, longEnough);

    }

    @Test
    void whenCharacterArrayContainsANumberReturnTrue() {
        //GIVEN
        String pw = "ab3defgh";
        //WHEN
        boolean numbers = PasswordValidation.containsNumbers(pw);
        //THEN
        assertEquals(true, numbers);
    }

    @Test
    void whenCharacterArrayContainsNoNumberReturnFalse() {
        //GIVEN
        String pw = "abcdefgh";
        //WHEN
        boolean result = PasswordValidation.containsNumbers(pw);
        //THEN
        assertEquals(false, result);
    }

    @Test //LOWER CASE
    void whenPWcontainsLowerCase_then_returnTrue() {
        //GIVEN
        String pw = "ab3deFgh";
        //WHEN
        boolean result = PasswordValidation.containsLower(pw);
        //THEN
        assertEquals(true, result);
    }

    @Test //LOWER CASE
    void whenPWcontainsNOLowerCase_then_returnFalse() {
        //GIVEN
        String pw = "AB3FG";
        //WHEN
        boolean result = PasswordValidation.containsLower(pw);
        //THEN
        assertEquals(false, result);
    }


    @Test //LOWER CASE
    void whenPWcontainsUpperCase_then_returnTrue() {
        //GIVEN
        String pw = "ab3deFgh";
        //WHEN
        boolean result = PasswordValidation.containsUpper(pw);
        //THEN
        assertEquals(true, result);
    }


    @Test //UPPER CASE
    void whenPWcontainsNOUpperCase_then_returnFalse() {
        //GIVEN
        String pw = "asdc55fsd";
        //WHEN
        boolean result = PasswordValidation.containsUpper(pw);
        //THEN
        assertEquals(false, result);
    }

}

