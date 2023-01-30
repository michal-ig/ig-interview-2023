package com.iggroup.interview.calculator;

import com.iggroup.interview.model.CalcModel;

public interface CalculatorService {

   int multiplication(CalcModel calcModel);

   int addition(CalcModel calcModel);

   int subtraction(CalcModel calcModel);

   int division(CalcModel calcModel);
}
