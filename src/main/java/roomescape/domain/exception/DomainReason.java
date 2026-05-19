package roomescape.domain.exception;

public enum DomainReason {
    VALUE_BLANK("%s은(는) 공백일 수 없습니다"),
    VALUE_TOO_LONG("\"%s은(는) 너무 깁니다"),
    VALUE_INVALID_FORMAT("%s 형식이 올바르지 않습니다"),

    RESERVATION_PAST_DATE("이미 지난 시각으로는 예약할 수 없습니다."),
    RESERVATION_OVER_MAX_PERIOD("최대 14일 이내만 가능합니다."),

    TIME_OUT_OF_BUSINESS_HOURS("영업 시간은 10~22시입니다.");

    private final String message;

    DomainReason(String message) {
        this.message = message;
    }

    public String format(Object... args) {
        return String.format(message, args);
    }

    public String getMessage() {
        return message;
    }
}
