package roomescape.common;

import org.springframework.http.HttpStatus;

public enum CommonErrorCode implements ErrorCode {
    INVALID_PARAMETER(HttpStatus.BAD_REQUEST, "잘못된 파라미터입니다. 입력값을 확인해주세요."),
    INVALID_REQUEST_BODY(HttpStatus.BAD_REQUEST, "일시적인 오류가 발생했습니다. 잠시 후 다시 시도해주세요."),
    INVALID_REQUEST_PARAMETER(HttpStatus.BAD_REQUEST, "요청 파라미터가 올바르지 않습니다. URL을 확인해주세요."),
    RESOURCE_NOT_FOUND(HttpStatus.NOT_FOUND, "리소스를 찾을 수 없습니다."),
    DUPLICATE_RESOURCE(HttpStatus.CONFLICT, "이미 존재하는 리소스입니다. 다른 값으로 시도해주세요."),
    DATA_INTEGRITY_VIOLATION(HttpStatus.CONFLICT, "데이터 무결성 제약을 위반했습니다. 관련된 리소스를 확인해 주세요."),
    INTERNAL_SERVER_ERROR(HttpStatus.INTERNAL_SERVER_ERROR, "일시적인 오류가 발생했습니다. 잠시 후 다시 시도해주세요.");

    private final HttpStatus httpStatus;
    private final String message;

    CommonErrorCode(HttpStatus httpStatus, String message) {
        this.httpStatus = httpStatus;
        this.message = message;
    }

    @Override
    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    @Override
    public String getMessage() {
        return message;
    }
}
