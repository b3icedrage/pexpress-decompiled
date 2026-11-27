package defpackage;

import defpackage.QY0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class TD1<T extends QY0> {

    @NotNull
    public static final a e;
    public static final /* synthetic */ IJ0<Object>[] f;

    @NotNull
    public final V a;

    @NotNull
    public final Function1<AbstractC6331rL0, T> b;

    @NotNull
    public final AbstractC6331rL0 c;

    @NotNull
    public final I51 d;

    public static final class a {
    }

    static {
        C2251Vp1 c2251Vp1 = C2017Sp1.a;
        f = new IJ0[]{c2251Vp1.g(new C1373Kj1(c2251Vp1.b(TD1.class), "scopeForOwnerModule", "getScopeForOwnerModule()Lorg/jetbrains/kotlin/resolve/scopes/MemberScope;"))};
        e = new a();
    }

    public TD1() {
        throw null;
    }

    public TD1(V v, C2720aS0 c2720aS0, Function1 function1, AbstractC6331rL0 abstractC6331rL0) {
        this.a = v;
        this.b = function1;
        this.c = abstractC6331rL0;
        C3478e00 c3478e00 = new C3478e00(this, 4);
        c2720aS0.getClass();
        this.d = new C2720aS0.h(c2720aS0, c3478e00);
    }

    @NotNull
    public final T a(@NotNull AbstractC6331rL0 kotlinTypeRefiner) {
        Intrinsics.checkNotNullParameter(kotlinTypeRefiner, "kotlinTypeRefiner");
        kotlinTypeRefiner.x(C4900kZ.j(this.a));
        return (T) Nm2.f(this.d, f[0]);
    }
}
