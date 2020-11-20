package flat.sorting_behaviour;

import com.BohdanOOP.DecorType;
import com.BohdanOOP.Flat;
import org.junit.Test;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class TestFlatsSorting {

    @Test
    public void whenCreatingFlatsInSortedCollection_shouldSortFlats() {
        Set<Flat> sortedFlats = Stream.of(
                new Flat("FLatTwo", "200", DecorType.CANDLES, 2),
                new Flat("FLatThree", "300", DecorType.BALLS, 3),
                new Flat("FLatOne", "100", DecorType.ADORNMENT, 1))
                .collect(Collectors.toCollection(TreeSet::new));

        Iterator<Flat> flatIterator = sortedFlats.iterator();

        assertEquals(1, flatIterator.next().getRooms());
        assertEquals(2, flatIterator.next().getRooms());
        assertEquals(3, flatIterator.next().getRooms());
    }


}
