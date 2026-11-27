package defpackage;

import j$.time.LocalDate;
import j$.time.chrono.ChronoLocalDate;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: vR0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
@XH1(with = AR0.class)
public final class C7189vR0 implements Comparable<C7189vR0> {

    @NotNull
    public static final a Companion = new a();

    @NotNull
    public final LocalDate d;

    /* JADX INFO: renamed from: vR0$a */
    public static final class a {
        @NotNull
        public final RJ0<C7189vR0> serializer() {
            return AR0.a;
        }
    }

    /* JADX INFO: renamed from: vR0$b */
    public static final class b {

        @NotNull
        public static final KT<C7189vR0> a = (KT) C7820yR0.b.getValue();
    }

    static {
        LocalDate MIN = LocalDate.MIN;
        Intrinsics.checkNotNullExpressionValue(MIN, "MIN");
        new C7189vR0(MIN);
        LocalDate MAX = LocalDate.MAX;
        Intrinsics.checkNotNullExpressionValue(MAX, "MAX");
        new C7189vR0(MAX);
    }

    public C7189vR0(@NotNull LocalDate value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.d = value;
    }

    @Override // java.lang.Comparable
    public final int compareTo(C7189vR0 c7189vR0) {
        C7189vR0 other = c7189vR0;
        Intrinsics.checkNotNullParameter(other, "other");
        return this.d.compareTo((ChronoLocalDate) other.d);
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7189vR0) {
            return Intrinsics.a(this.d, ((C7189vR0) obj).d);
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
