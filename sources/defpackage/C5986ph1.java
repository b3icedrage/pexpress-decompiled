package defpackage;

import java.lang.annotation.Annotation;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: ph1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5986ph1 implements MH1 {

    @NotNull
    public final String a;

    @NotNull
    public final AbstractC5356mh1 b;

    public C5986ph1(@NotNull String serialName, @NotNull AbstractC5356mh1 kind) {
        Intrinsics.checkNotNullParameter(serialName, "serialName");
        Intrinsics.checkNotNullParameter(kind, "kind");
        this.a = serialName;
        this.b = kind;
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
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.MH1
    public final int e() {
        return 0;
    }

    public final boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5986ph1)) {
            return false;
        }
        C5986ph1 c5986ph1 = (C5986ph1) obj;
        if (Intrinsics.a(this.a, c5986ph1.a)) {
            if (Intrinsics.a(this.b, c5986ph1.b)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.MH1
    @NotNull
    public final String f(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.MH1
    @NotNull
    public final List<Annotation> g(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.MH1
    public final VH1 h() {
        return this.b;
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + this.a.hashCode();
    }

    @Override // defpackage.MH1
    @NotNull
    public final MH1 i(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
    }

    @Override // defpackage.MH1
    public final boolean j(int i) {
        throw new IllegalStateException("Primitive descriptor does not have elements");
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
        return C1039Gc0.e(new StringBuilder("PrimitiveDescriptor("), this.a, ')');
    }
}
