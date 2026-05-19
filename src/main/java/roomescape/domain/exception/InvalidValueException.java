package roomescape.domain.exception;

public class InvalidValueException extends DomainException{
    public InvalidValueException(DomainReason reason, Object... args) {
        super(reason, args);
    }
}
