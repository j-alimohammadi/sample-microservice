package microservices.book.multiplication.controller;

import lombok.extern.slf4j.Slf4j;
import microservices.book.multiplication.domain.Multiplication;
import microservices.book.multiplication.service.MultiplicationService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Javad Alimohammadi<bs.alimohammadi@gmail.com>
 */

@RestController
@RequestMapping("/multiplications")
@Slf4j
public class MultiplicationController {

    private final MultiplicationService multiplicationService;
    private final int serverPort;

    public MultiplicationController(MultiplicationService multiplicationService,
                                    @Value("${server.port}") int serverPort) {
        this.multiplicationService = multiplicationService;
        this.serverPort = serverPort;
    }


    @GetMapping("/random")
    public Multiplication getRandomMultiplication() {
        log.info("Generating a random multiplication from server @ {}", serverPort);
        return multiplicationService.createRandomMultiplication();
    }


}
