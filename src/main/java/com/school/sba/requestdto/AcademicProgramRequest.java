package com.school.sba.requestdto;

import java.time.LocalDate;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class AcademicProgramRequest {

	@NotNull(message = "program type should not be null")
	@NotBlank(message = "program type should not be blank")
	private String programType;
	
	@NotNull(message = "program name should not be null")
	@NotBlank(message = "program name should not be blank")
	private String programName;
	
	@NotNull(message = "program begin time should not be null")
	private LocalDate programBeginsAt;
	
	@NotNull(message = "program end time should not be null")
	private LocalDate programEndsAt;
	
	private boolean autoGeneratedClassHour;
	
}