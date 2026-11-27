package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class LQ0 implements MH1 {

    @NotNull
    public final MH1 a;

    public LQ0(MH1 mh1) {
        this.a = mh1;
    }

    @Override // defpackage.MH1
    public final boolean c() {
        return false;
    }

    @Override // defpackage.MH1
    public final int d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        Integer intOrNull = StringsKt.toIntOrNull(name);
        if (intOrNull != null) {
            return intOrNull.intValue();
        }
        throw new IllegalArgumentException(Z0.c(name, " is not a valid list index"));
    }

    @Override // defpackage.MH1
    public final int e() {
        return 1;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LQ0)) {
            return false;
        }
        LQ0 lq0 = (LQ0) obj;
        return Intrinsics.a(this.a, lq0.a) && Intrinsics.a(a(), lq0.a());
    }

    @Override // defpackage.MH1
    @NotNull
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> g(int i) {
        if (i >= 0) {
            return C5653o60.d;
        }
        StringBuilder sbC = C1332Jw.c(i, "Illegal index ", ", ");
        sbC.append(a());
        sbC.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbC.toString().toString());
    }

    @Override // defpackage.MH1
    @NotNull
    public final VH1 h() {
        return RS1.b.a;
    }

    public final int hashCode() {
        return a().hashCode() + (this.a.hashCode() * 31);
    }

    @Override // defpackage.MH1
    @NotNull
    public final MH1 i(int i) {
        if (i >= 0) {
            return this.a;
        }
        StringBuilder sbC = C1332Jw.c(i, "Illegal index ", ", ");
        sbC.append(a());
        sbC.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbC.toString().toString());
    }

    @Override // defpackage.MH1
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        StringBuilder sbC = C1332Jw.c(i, "Illegal index ", ", ");
        sbC.append(a());
        sbC.append(" expects only non-negative indices");
        throw new IllegalArgumentException(sbC.toString().toString());
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> k() {
        return C5653o60.d;
    }

    @Override // defpackage.MH1
    public final boolean m() {
        return false;
    }

    @NotNull
    public final String toString() {
        return a() + '(' + this.a + ')';
    }
}
