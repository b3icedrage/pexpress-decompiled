package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: sM, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6543sM implements MH1 {

    @NotNull
    public final OH1 a;

    @NotNull
    public final RI0<?> b;

    @NotNull
    public final String c;

    public C6543sM(@NotNull OH1 original, @NotNull RI0 kClass) {
        Intrinsics.checkNotNullParameter(original, "original");
        Intrinsics.checkNotNullParameter(kClass, "kClass");
        this.a = original;
        this.b = kClass;
        this.c = original.a + '<' + kClass.f() + '>';
    }

    @Override // defpackage.MH1
    @NotNull
    public final String a() {
        return this.c;
    }

    @Override // defpackage.MH1
    public final boolean c() {
        return false;
    }

    @Override // defpackage.MH1
    public final int d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.a.d(name);
    }

    @Override // defpackage.MH1
    public final int e() {
        return this.a.c;
    }

    public final boolean equals(@Nullable Object obj) {
        C6543sM c6543sM = obj instanceof C6543sM ? (C6543sM) obj : null;
        return c6543sM != null && this.a.equals(c6543sM.a) && Intrinsics.a(c6543sM.b, this.b);
    }

    @Override // defpackage.MH1
    @NotNull
    public final String f(int i) {
        return this.a.f[i];
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> g(int i) {
        return this.a.h[i];
    }

    @Override // defpackage.MH1
    @NotNull
    public final VH1 h() {
        return this.a.b;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    @Override // defpackage.MH1
    @NotNull
    public final MH1 i(int i) {
        return this.a.g[i];
    }

    @Override // defpackage.MH1
    public final boolean j(int i) {
        return this.a.i[i];
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> k() {
        return this.a.d;
    }

    @Override // defpackage.MH1
    public final boolean m() {
        return false;
    }

    @NotNull
    public final String toString() {
        return "ContextDescriptor(kClass: " + this.b + ", original: " + this.a + ')';
    }
}
