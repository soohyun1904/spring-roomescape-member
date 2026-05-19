package roomescape.domain.vo;

import roomescape.domain.exception.DomainReason;
import roomescape.domain.exception.InvalidValueException;

import java.util.regex.Pattern;

public record ThumbnailUrl(String value) {
    private static final Pattern URL_PATTERN = Pattern.compile("^https?://.+");

    public ThumbnailUrl {
        if (value.isBlank()) {
            throw new InvalidValueException(DomainReason.VALUE_BLANK, "url");
        }

        if (!URL_PATTERN.matcher(value).matches()) {
            throw new InvalidValueException(DomainReason.VALUE_INVALID_FORMAT, "url");
        }

        if (value.length() > 500) {
            throw new InvalidValueException(DomainReason.VALUE_TOO_LONG, "url");
        }
    }
}