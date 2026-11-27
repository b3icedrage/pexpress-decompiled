package defpackage;

import com.onesignal.core.activities.PermissionsActivity;
import io.sentry.ILogger;
import java.util.Locale;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: kO1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public enum EnumC4869kO1 implements BH0 {
    OK(0, 399),
    CANCELLED(499),
    INTERNAL_ERROR(PermissionsActivity.DELAY_TIME_CALLBACK_CALL),
    UNKNOWN(PermissionsActivity.DELAY_TIME_CALLBACK_CALL),
    UNKNOWN_ERROR(PermissionsActivity.DELAY_TIME_CALLBACK_CALL),
    INVALID_ARGUMENT(400),
    DEADLINE_EXCEEDED(504),
    NOT_FOUND(404),
    ALREADY_EXISTS(409),
    PERMISSION_DENIED(403),
    RESOURCE_EXHAUSTED(429),
    FAILED_PRECONDITION(400),
    ABORTED(409),
    OUT_OF_RANGE(400),
    UNIMPLEMENTED(501),
    UNAVAILABLE(503),
    DATA_LOSS(PermissionsActivity.DELAY_TIME_CALLBACK_CALL),
    UNAUTHENTICATED(401);

    private final int maxHttpStatusCode;
    private final int minHttpStatusCode;

    /* JADX INFO: renamed from: kO1$a */
    public static final class a implements KG0<EnumC4869kO1> {
        @Override // defpackage.KG0
        @NotNull
        public final EnumC4869kO1 a(@NotNull Q71 q71, @NotNull ILogger iLogger) {
            return EnumC4869kO1.valueOf(q71.B().toUpperCase(Locale.ROOT));
        }
    }

    EnumC4869kO1(int i) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i;
    }

    @Nullable
    public static EnumC4869kO1 fromApiNameSafely(@Nullable String str) {
        if (str == null) {
            return null;
        }
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException unused) {
            return null;
        }
    }

    @Nullable
    public static EnumC4869kO1 fromHttpStatusCode(int i) {
        for (EnumC4869kO1 enumC4869kO1 : values()) {
            if (enumC4869kO1.matches(i)) {
                return enumC4869kO1;
            }
        }
        return null;
    }

    private boolean matches(int i) {
        return i >= this.minHttpStatusCode && i <= this.maxHttpStatusCode;
    }

    @NotNull
    public String apiName() {
        return name().toLowerCase(Locale.ROOT);
    }

    @Override // defpackage.BH0
    public void serialize(@NotNull W71 w71, @NotNull ILogger iLogger) {
        ((C6319rH0) w71).j(apiName());
    }

    @NotNull
    public static EnumC4869kO1 fromHttpStatusCode(@Nullable Integer num, @NotNull EnumC4869kO1 enumC4869kO1) {
        EnumC4869kO1 enumC4869kO1FromHttpStatusCode = num != null ? fromHttpStatusCode(num.intValue()) : enumC4869kO1;
        return enumC4869kO1FromHttpStatusCode != null ? enumC4869kO1FromHttpStatusCode : enumC4869kO1;
    }

    EnumC4869kO1(int i, int i2) {
        this.minHttpStatusCode = i;
        this.maxHttpStatusCode = i2;
    }
}
