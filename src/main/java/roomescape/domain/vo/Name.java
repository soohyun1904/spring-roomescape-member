package roomescape.domain.vo;

import roomescape.domain.exception.DomainReason;
import roomescape.domain.exception.InvalidValueException;

public record Name(String value) {
    public Name {
        if (value.isBlank()) {
            throw new InvalidValueException(DomainReason.VALUE_BLANK, "이름");
        }
        if (value.length() > 50) {
            throw new InvalidValueException(DomainReason.VALUE_TOO_LONG, "이름");
        }
    }
}

