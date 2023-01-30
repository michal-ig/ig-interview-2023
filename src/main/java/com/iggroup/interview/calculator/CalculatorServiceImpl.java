package com.iggroup.interview.calculator;

import com.iggroup.interview.model.CalcModel;
import lombok.NoArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@NoArgsConstructor
public class CalculatorServiceImpl implements CalculatorService {

   @Override
   public int multiplication(CalcModel calcModel) {
      return calcModel.getFirst() * calcModel.getSecond();
   }

   @Override
   public int addition(CalcModel calcModel) {
      return calcModel.getFirst() + calcModel.getSecond();
   }

   @Override
   public int subtraction(CalcModel calcModel) {
      return calcModel.getFirst() - calcModel.getSecond();
   }

   @Override
   public int division(CalcModel calcModel) {
      return calcModel.getFirst() / calcModel.getSecond();
   }
}
