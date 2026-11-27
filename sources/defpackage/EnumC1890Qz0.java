package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.text.d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\r\b\u0086\u0001\u0018\u0000 \u000b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\fB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\r\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\r\u0010\u0007\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\u0006J\r\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\b\u0010\u0006J\r\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\t\u0010\u0006J\r\u0010\n\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u0006j\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"LQz0;", "", "<init>", "(Ljava/lang/String;I)V", "", "isAttributed", "()Z", "isDirect", "isIndirect", "isUnattributed", "isDisabled", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "DIRECT", "INDIRECT", "UNATTRIBUTED", "DISABLED", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum EnumC1890Qz0 {
    DIRECT,
    INDIRECT,
    UNATTRIBUTED,
    DISABLED;


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: Qz0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LQz0$a;", "", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "LQz0;", "fromString", "(Ljava/lang/String;)LQz0;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC1890Qz0 fromString(@Nullable String value) {
            EnumC1890Qz0 enumC1890Qz0;
            if (value != null) {
                EnumC1890Qz0[] enumC1890Qz0ArrValues = EnumC1890Qz0.values();
                int length = enumC1890Qz0ArrValues.length - 1;
                if (length < 0) {
                    enumC1890Qz0 = null;
                    break;
                }
                while (true) {
                    int i = length - 1;
                    enumC1890Qz0 = enumC1890Qz0ArrValues[length];
                    if (d.i(enumC1890Qz0.name(), value)) {
                        break;
                    }
                    if (i < 0) {
                        enumC1890Qz0 = null;
                        break;
                    }
                    length = i;
                }
                if (enumC1890Qz0 != null) {
                    return enumC1890Qz0;
                }
            }
            return EnumC1890Qz0.UNATTRIBUTED;
        }

        private Companion() {
        }
    }

    @NotNull
    public static final EnumC1890Qz0 fromString(@Nullable String str) {
        return INSTANCE.fromString(str);
    }

    public final boolean isAttributed() {
        return isDirect() || isIndirect();
    }

    public final boolean isDirect() {
        return this == DIRECT;
    }

    public final boolean isDisabled() {
        return this == DISABLED;
    }

    public final boolean isIndirect() {
        return this == INDIRECT;
    }

    public final boolean isUnattributed() {
        return this == UNATTRIBUTED;
    }
}
