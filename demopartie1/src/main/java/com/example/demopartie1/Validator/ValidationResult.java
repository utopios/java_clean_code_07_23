package com.example.demopartie1.Validator;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@Builder
@NoArgsConstructor
public class ValidationResult {

    private boolean valid;
    private String errorMessage;


}
