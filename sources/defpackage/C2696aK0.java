package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KTypeProjection;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: aK0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2696aK0 implements SJ0 {

    @NotNull
    public final SJ0 a;

    public C2696aK0(@NotNull SJ0 origin) {
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.a = origin;
    }

    @Override // defpackage.SJ0
    public final boolean a() {
        return this.a.a();
    }

    public final boolean equals(@Nullable Object obj) {
        if (obj == null) {
            return false;
        }
        C2696aK0 c2696aK0 = obj instanceof C2696aK0 ? (C2696aK0) obj : null;
        SJ0 sj0 = c2696aK0 != null ? c2696aK0.a : null;
        SJ0 sj1 = this.a;
        if (!Intrinsics.a(sj1, sj0)) {
            return false;
        }
        InterfaceC4853kJ0 interfaceC4853kJ0G = sj1.g();
        if (!(interfaceC4853kJ0G instanceof RI0)) {
            return false;
        }
        SJ0 sj2 = obj instanceof SJ0 ? (SJ0) obj : null;
        InterfaceC4853kJ0 interfaceC4853kJ0G2 = sj2 != null ? sj2.g() : null;
        if (interfaceC4853kJ0G2 == null || !(interfaceC4853kJ0G2 instanceof RI0)) {
            return false;
        }
        return C7279vr.g((RI0) interfaceC4853kJ0G).equals(C7279vr.g((RI0) interfaceC4853kJ0G2));
    }

    @Override // defpackage.SJ0
    @NotNull
    public final List<KTypeProjection> f() {
        return this.a.f();
    }

    @Override // defpackage.SJ0
    @Nullable
    public final InterfaceC4853kJ0 g() {
        return this.a.g();
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public final String toString() {
        return "KTypeWrapper: " + this.a;
    }
}
