package defpackage;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: t, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6676t extends P80 {

    @InterfaceC2691aI1(AppMeasurementSdk.ConditionalUserProperty.NAME)
    @NotNull
    public final String a;

    @InterfaceC2691aI1("message")
    @NotNull
    public final String b;

    public C6676t(@NotNull String name, @NotNull String message) {
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(message, "message");
        this.a = name;
        this.b = message;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6676t)) {
            return false;
        }
        C6676t c6676t = (C6676t) obj;
        return Intrinsics.a(this.a, c6676t.a) && Intrinsics.a(this.b, c6676t.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder("AbRequestErrorProperty(name=");
        sb.append(this.a);
        sb.append(", message=");
        return C5807oq.b(sb, this.b, ")");
    }
}
