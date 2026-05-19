package roomescape.domain.exception;

public class DomainRuleViolationException extends DomainException{

    public DomainRuleViolationException(DomainReason reason) {
        super(reason);
    }
}
