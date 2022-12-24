package src.model;

import java.time.LocalDate;

public class DebitCard {
    private Long cardNumber;
    private int pin;
    private LocalDate validation;
    private int code;

    private Client client;

    public DebitCard(){

    }

    public DebitCard(Long cardNumber, int pin, LocalDate validation, int code, Client client) {
        this.cardNumber = cardNumber;
        this.pin = pin;
        this.validation = validation;
        this.code = code;
        this.client = client;
    }

    public Long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(Long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public int getPin() {
        return pin;
    }

    public void setPin(int pin) {
        this.pin = pin;
    }

    public LocalDate getValidation() {
        return validation;
    }

    public void setValidation(LocalDate validation) {
        this.validation = validation;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client) {
        this.client = client;
    }
}
