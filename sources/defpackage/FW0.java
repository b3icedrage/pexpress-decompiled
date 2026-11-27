package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public abstract class FW0 implements MH1 {

    @NotNull
    public final String a;

    @NotNull
    public final MH1 b;

    @NotNull
    public final MH1 c;

    public FW0(String str, MH1 mh1, MH1 mh2) {
        this.a = str;
        this.b = mh1;
        this.c = mh2;
    }

    @Override // defpackage.MH1
    @NotNull
    public final String a() {
        return this.a;
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
        throw new IllegalArgumentException(Z0.c(name, " is not a valid map index"));
    }

    @Override // defpackage.MH1
    public final int e() {
        return 2;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FW0)) {
            return false;
        }
        FW0 fw0 = (FW0) obj;
        return Intrinsics.a(this.a, fw0.a) && Intrinsics.a(this.b, fw0.b) && Intrinsics.a(this.c, fw0.c);
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
        throw new IllegalArgumentException(C5807oq.b(C1332Jw.c(i, "Illegal index ", ", "), this.a, " expects only non-negative indices").toString());
    }

    @Override // defpackage.MH1
    @NotNull
    public final VH1 h() {
        return RS1.c.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    @Override // defpackage.MH1
    @NotNull
    public final MH1 i(int i) {
        if (i < 0) {
            throw new IllegalArgumentException(C5807oq.b(C1332Jw.c(i, "Illegal index ", ", "), this.a, " expects only non-negative indices").toString());
        }
        int i2 = i % 2;
        if (i2 == 0) {
            return this.b;
        }
        if (i2 == 1) {
            return this.c;
        }
        throw new IllegalStateException("Unreached");
    }

    @Override // defpackage.MH1
    public final boolean j(int i) {
        if (i >= 0) {
            return false;
        }
        throw new IllegalArgumentException(C5807oq.b(C1332Jw.c(i, "Illegal index ", ", "), this.a, " expects only non-negative indices").toString());
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
        return this.a + '(' + this.b + ", " + this.c + ')';
    }
}
