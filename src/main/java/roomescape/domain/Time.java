package roomescape.domain;

import roomescape.domain.exception.DomainException;
import roomescape.domain.exception.DomainReason;
import roomescape.domain.exception.DomainRuleViolationException;

import java.time.LocalTime;

public class Time {
    private final Long id;
    private final LocalTime startAt;

    public Time(Long id, LocalTime startAt) {
        this.id = id;
        this.startAt = startAt;
    }

    public static Time create(LocalTime startAt) {
        validate(startAt);
        return new Time(null, startAt);
    }

    private static void validate(LocalTime startAt) {
        if (startAt.isBefore(LocalTime.of(10, 0)) || startAt.isAfter(LocalTime.of(22, 0))) {
            throw new DomainRuleViolationException(DomainReason.TIME_OUT_OF_BUSINESS_HOURS);
        }
    }

    public Long getId() {
        return id;
    }

    public LocalTime getStartAt() {
        return startAt;
    }
}
