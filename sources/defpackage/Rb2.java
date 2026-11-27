package defpackage;

import j$.time.ZoneOffset;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@XH1(with = C5124lc2.class)
public final class Rb2 {

    @NotNull
    public static final a Companion = new a();

    @NotNull
    public final ZoneOffset a;

    public static final class a {
        @NotNull
        public final RJ0<Rb2> serializer() {
            return C5124lc2.a;
        }
    }

    static {
        ZoneOffset UTC = ZoneOffset.UTC;
        Intrinsics.checkNotNullExpressionValue(UTC, "UTC");
        new Rb2(UTC);
    }

    public Rb2(@NotNull ZoneOffset zoneOffset) {
        Intrinsics.checkNotNullParameter(zoneOffset, "zoneOffset");
        this.a = zoneOffset;
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj instanceof Rb2) {
            return Intrinsics.a(this.a, ((Rb2) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        String string = this.a.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
