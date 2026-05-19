package roomescape.domain.exception;

public abstract class DomainException extends RuntimeException {
    private final DomainReason reason;

    DomainException(DomainReason reason) {
        super(reason.getMessage());
        this.reason = reason;
    }

     DomainException(DomainReason reason, Object... args) {
        super(reason.format(args));
        this.reason = reason;
    }

    public DomainReason getReason() { return reason; }
}
