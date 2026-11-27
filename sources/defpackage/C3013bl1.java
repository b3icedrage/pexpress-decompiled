package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: bl1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003B!\b\u0016\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\u0002\u0010\tR$\u0010\u0005\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000eR$\u0010\u0006\u001a\u00020\u00042\u0006\u0010\n\u001a\u00020\u00048F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u000f\u0010\f\"\u0004\b\u0010\u0010\u000eR$\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\u00078F@BX\u0086\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lbl1;", "LD01;", "<init>", "()V", "", "sku", "iso", "Ljava/math/BigDecimal;", "amount", "(Ljava/lang/String;Ljava/lang/String;Ljava/math/BigDecimal;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "getSku", "()Ljava/lang/String;", "setSku", "(Ljava/lang/String;)V", "getIso", "setIso", "getAmount", "()Ljava/math/BigDecimal;", "setAmount", "(Ljava/math/BigDecimal;)V", "com.onesignal.core"}, k = 1, mv = {1, 7, 1}, xi = 48)
public final class C3013bl1 extends D01 {
    public C3013bl1() {
        super(null, null, 3, null);
    }

    private final void setAmount(BigDecimal bigDecimal) {
        D01.setBigDecimalProperty$default(this, "amount", bigDecimal, null, false, 12, null);
    }

    private final void setIso(String str) {
        D01.setStringProperty$default(this, "iso", str, null, false, 12, null);
    }

    private final void setSku(String str) {
        D01.setStringProperty$default(this, "sku", str, null, false, 12, null);
    }

    @NotNull
    public final BigDecimal getAmount() {
        return D01.getBigDecimalProperty$default(this, "amount", null, 2, null);
    }

    @NotNull
    public final String getIso() {
        return D01.getStringProperty$default(this, "iso", null, 2, null);
    }

    @NotNull
    public final String getSku() {
        return D01.getStringProperty$default(this, "sku", null, 2, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3013bl1(@NotNull String sku, @NotNull String iso, @NotNull BigDecimal amount) {
        this();
        Intrinsics.checkNotNullParameter(sku, "sku");
        Intrinsics.checkNotNullParameter(iso, "iso");
        Intrinsics.checkNotNullParameter(amount, "amount");
        setSku(sku);
        setIso(iso);
        setAmount(amount);
    }
}
