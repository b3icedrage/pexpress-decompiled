package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: k52, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0000\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003R$\u0010\n\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00048F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR$\u0010\u0005\u001a\u00020\u000b2\u0006\u0010\u0005\u001a\u00020\u000b8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lk52;", "LD01;", "<init>", "()V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getKey", "()Ljava/lang/String;", "setKey", "(Ljava/lang/String;)V", "key", "", "getValue", "()Ljava/lang/Object;", "setValue", "(Ljava/lang/Object;)V", "com.onesignal.inAppMessages"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C4808k52 extends D01 {

    /* JADX INFO: renamed from: k52$a */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class a extends ML0 implements Function0<String> {
        public static final a INSTANCE = new a();

        public a() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final String invoke() {
            return "";
        }
    }

    /* JADX INFO: renamed from: k52$b */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0000\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 7, 1}, xi = 48)
    public static final class b extends ML0 implements Function0<Object> {
        public static final b INSTANCE = new b();

        public b() {
            super(0);
        }

        @Override // kotlin.jvm.functions.Function0
        @NotNull
        public final Object invoke() {
            return "";
        }
    }

    public C4808k52() {
        super(null, null, 3, null);
    }

    @NotNull
    public final String getKey() {
        return getStringProperty("key", a.INSTANCE);
    }

    @NotNull
    public final Object getValue() {
        return getAnyProperty(AppMeasurementSdk.ConditionalUserProperty.VALUE, b.INSTANCE);
    }

    public final void setKey(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D01.setStringProperty$default(this, "key", value, null, false, 12, null);
    }

    public final void setValue(@NotNull Object value) {
        Intrinsics.checkNotNullParameter(value, "value");
        D01.setAnyProperty$default(this, AppMeasurementSdk.ConditionalUserProperty.VALUE, value, null, true, 4, null);
    }
}
