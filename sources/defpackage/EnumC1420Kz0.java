package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Kz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\n\b\u0086\u0001\u0018\u0000 \r2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u000eB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\n\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\fj\u0002\b\u000fj\u0002\b\u0010¨\u0006\u0011"}, d2 = {"LKz0;", "", "", "nameValue", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "otherName", "", "equalsName", "(Ljava/lang/String;)Z", "toString", "()Ljava/lang/String;", "Ljava/lang/String;", "Companion", R51.PUSH_ADDITIONAL_DATA_KEY, "IAM", "NOTIFICATION", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public enum EnumC1420Kz0 {
    IAM("iam"),
    NOTIFICATION("notification");


    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final String nameValue;

    /* JADX INFO: renamed from: Kz0$a, reason: from kotlin metadata */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\u0007\u001a\u00020\u00062\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"LKz0$a;", "", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "LKz0;", "fromString", "(Ljava/lang/String;)LKz0;", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC1420Kz0 fromString(@Nullable String value) {
            EnumC1420Kz0 enumC1420Kz0;
            if (value != null) {
                EnumC1420Kz0[] enumC1420Kz0ArrValues = EnumC1420Kz0.values();
                int length = enumC1420Kz0ArrValues.length - 1;
                if (length < 0) {
                    enumC1420Kz0 = null;
                    break;
                }
                while (true) {
                    int i = length - 1;
                    enumC1420Kz0 = enumC1420Kz0ArrValues[length];
                    if (enumC1420Kz0.equalsName(value)) {
                        break;
                    }
                    if (i < 0) {
                        enumC1420Kz0 = null;
                        break;
                    }
                    length = i;
                }
                if (enumC1420Kz0 != null) {
                    return enumC1420Kz0;
                }
            }
            return EnumC1420Kz0.NOTIFICATION;
        }

        private Companion() {
        }
    }

    EnumC1420Kz0(String str) {
        this.nameValue = str;
    }

    @NotNull
    public static final EnumC1420Kz0 fromString(@Nullable String str) {
        return INSTANCE.fromString(str);
    }

    public final boolean equalsName(@NotNull String otherName) {
        Intrinsics.checkNotNullParameter(otherName, "otherName");
        return Intrinsics.a(this.nameValue, otherName);
    }

    @Override // java.lang.Enum
    @NotNull
    public String toString() {
        return this.nameValue;
    }
}
