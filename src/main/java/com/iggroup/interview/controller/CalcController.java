package com.iggroup.interview.controller;

import com.iggroup.interview.calculator.CalculatorService;
import com.iggroup.interview.model.CalcModel;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class CalcController {

   private final CalculatorService calculatorService;

   @PostMapping("/add")
   public Integer add(@RequestBody CalcModel calcModel) {
      return calculatorService.addition(calcModel);
   }

   @PutMapping("/div")
   public Integer div(@RequestBody CalcModel calcModel) {
      return calculatorService.division(calcModel);
   }

   @GetMapping("/mul")
   public Integer mul(@RequestBody CalcModel calcModel) {
      return calculatorService.multiplication(calcModel);
   }

   @PostMapping("/sub")
   public Integer sub(@RequestBody CalcModel calcModel) {
      return calculatorService.subtraction(calcModel);
   }
}
