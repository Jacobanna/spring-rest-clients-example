package guru.springframework.api.domain;

import lombok.Data;

@Data
public class Card {
    private String type;
    private String number;
    private ExpirationDate expirationDate;
    private String iban;
    private String swift;
}
