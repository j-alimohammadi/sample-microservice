package microservices.book.multiplication.service;

import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.domain.MultiplicationResultAttempt;

import java.util.List;

/**
 * @author Javad Alimohammadi<bs.alimohammadi@gmail.com>
 */

public interface MultiplicationService {
    /**
     * Generates a random {@link Multiplication} object.
     * *
     *
     * @return a multiplication of randomly generated numbers
     */
    Multiplication createRandomMultiplication();

    /**
     * @return true if the attempt matches the result of the
     * multiplication, false otherwise.
     */
    boolean checkAttempt(final MultiplicationResultAttempt resultAttempt);

    List<MultiplicationResultAttempt> getStatsForUser(String userAlias);


    /**
     * Gets an attempt by its id
     *
     * @param resultId the identifier of the attempt
     * @return the {@link MultiplicationResultAttempt} object matching the id, otherwise null.
     */
    MultiplicationResultAttempt getResultById(final Long resultId);
}
