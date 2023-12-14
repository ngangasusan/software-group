package com.example.addition;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addition")
public class AdditionController {

    @PostMapping("/add")
    public AdditionResponse addNumbers(@RequestBody AdditionRequest request) {
        // Perform addition
        int result = request.getNum1() + request.getNum2();

        // Create and return the response
        AdditionResponse response = new AdditionResponse();
        response.setResult(result);
        return response;
    }
}
