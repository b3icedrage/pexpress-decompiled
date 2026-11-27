package defpackage;

import j$.time.Instant;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@XH1(with = WA0.class)
public final class VA0 implements Comparable<VA0> {

    @NotNull
    public static final a Companion = new a();

    @NotNull
    public static final VA0 e;

    @NotNull
    public static final VA0 g;

    @NotNull
    public final Instant d;

    public static final class a {
        @NotNull
        public final RJ0<VA0> serializer() {
            return WA0.a;
        }
    }

    static {
        Instant instantOfEpochSecond = Instant.ofEpochSecond(-3217862419201L, 999999999L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond, "ofEpochSecond(...)");
        new VA0(instantOfEpochSecond);
        Instant instantOfEpochSecond2 = Instant.ofEpochSecond(3093527980800L, 0L);
        Intrinsics.checkNotNullExpressionValue(instantOfEpochSecond2, "ofEpochSecond(...)");
        new VA0(instantOfEpochSecond2);
        Instant MIN = Instant.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        e = new VA0(MIN);
        Instant MAX = Instant.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        g = new VA0(MAX);
    }

    public VA0(@NotNull Instant value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.d = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(VA0 va0) {
        VA0 other = va0;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.d.compareTo(other.d);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof VA0) {
            return Intrinsics.a(this.d, ((VA0) obj).d);
        }
        return false;
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    @NotNull
    public final String toString() {
        String string = this.d.toString();
        Intrinsics.checkNotNullExpressionValue(string, "toString(...)");
        return string;
    }
}
