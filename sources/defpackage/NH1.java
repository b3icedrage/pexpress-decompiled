package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import java.util.Set;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class NH1 implements MH1, InterfaceC6877tx {

    @NotNull
    public final MH1 a;

    @NotNull
    public final String b;

    @NotNull
    public final Set<String> c;

    public NH1(@NotNull MH1 original) {
        Intrinsics.checkNotNullParameter(original, "original");
        this.a = original;
        this.b = original.a() + '?';
        this.c = LL.b(original);
    }

    @Override // defpackage.MH1
    @NotNull
    public final String a() {
        return this.b;
    }

    @Override // defpackage.InterfaceC6877tx
    @NotNull
    public final Set<String> b() {
        return this.c;
    }

    @Override // defpackage.MH1
    public final boolean c() {
        return true;
    }

    @Override // defpackage.MH1
    public final int d(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.a.d(name);
    }

    @Override // defpackage.MH1
    public final int e() {
        return this.a.e();
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof NH1) {
            return Intrinsics.a(this.a, ((NH1) obj).a);
        }
        return false;
    }

    @Override // defpackage.MH1
    @NotNull
    public final String f(int i) {
        return this.a.f(i);
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> g(int i) {
        return this.a.g(i);
    }

    @Override // defpackage.MH1
    @NotNull
    public final VH1 h() {
        return this.a.h();
    }

    public final int hashCode() {
        return this.a.hashCode() * 31;
    }

    @Override // defpackage.MH1
    @NotNull
    public final MH1 i(int i) {
        return this.a.i(i);
    }

    @Override // defpackage.MH1
    public final boolean j(int i) {
        return this.a.j(i);
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> k() {
        return this.a.k();
    }

    @Override // defpackage.MH1
    public final boolean m() {
        return this.a.m();
    }

    @NotNull
    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.a);
        sb.append('?');
        return sb.toString();
    }
}
