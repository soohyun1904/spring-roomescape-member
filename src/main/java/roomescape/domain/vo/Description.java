package roomescape.domain.vo;


import roomescape.domain.exception.DomainReason;
import roomescape.domain.exception.InvalidValueException;

public record Description(String value) {
    public Description {
        if (value.isBlank()) {
            throw new InvalidValueException(DomainReason.VALUE_BLANK, "설명");
        }
        if (value.length() > 500) {
            throw new InvalidValueException(DomainReason.VALUE_TOO_LONG, "설명");
        }
    }
}
