package edu.icet.crm.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RentalItem {

    private Integer id;
    private String rentalDate;
    private String returnDate;
    private String dueDate;
    private Integer totalCost;
    private Integer fine;

}
