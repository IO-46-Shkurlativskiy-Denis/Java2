import nl.jqno.equalsverifier.EqualsVerifier;
import org.junit.jupiter.api.Test;
import org.TaskManager.Person;

class PersonTest {
    @Test
    void equalsHashCodeCheck(){
        EqualsVerifier.forClass(Person.class).usingGetClass().verify();
    }
}
