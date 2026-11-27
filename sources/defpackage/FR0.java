package defpackage;

import j$.time.LocalTime;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@XH1(with = MR0.class)
public final class FR0 implements Comparable<FR0> {

    @NotNull
    public static final a Companion = new a();

    @NotNull
    public final LocalTime d;

    public static final class a {
        @NotNull
        public final RJ0<FR0> serializer() {
            return MR0.a;
        }
    }

    static {
        LocalTime MIN = LocalTime.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        new FR0(MIN);
        LocalTime MAX = LocalTime.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        new FR0(MAX);
    }

    public FR0(@NotNull LocalTime value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.d = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(FR0 fr0) {
        FR0 other = fr0;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.d.compareTo(other.d);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FR0) {
            return Intrinsics.a(this.d, ((FR0) obj).d);
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
