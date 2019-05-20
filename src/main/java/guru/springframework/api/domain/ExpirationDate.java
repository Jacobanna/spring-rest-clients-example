package guru.springframework.api.domain;

import lombok.Data;

import java.time.LocalDate;

@Data
public class ExpirationDate {
    private LocalDate date;
    private int timezoneType;
    private String timezone;
}
