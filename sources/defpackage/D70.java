package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class D70 implements S01 {

    @NotNull
    public static final D70 d = new D70();

    @NotNull
    public static final C5638o21 e;

    @NotNull
    public static final C5653o60 g;

    @NotNull
    public static final KW1 h;

    static {
        A70[] a70Arr = A70.d;
        C5638o21 c5638o21M = C5638o21.m("<Error module>");
        Intrinsics.checkNotNullExpressionValue(c5638o21M, "special(...)");
        e = c5638o21M;
        g = C5653o60.d;
        h = XO0.b(C70.d);
    }

    @Override // defpackage.S01
    @NotNull
    public final InterfaceC5752ob1 A0(@NotNull C1758Ph0 fqName) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        throw new IllegalStateException("Should not be called!");
    }

    @Override // defpackage.S01
    public final boolean M(@NotNull S01 targetModule) {
        Intrinsics.checkNotNullParameter(targetModule, "targetModule");
        return false;
    }

    @Override // defpackage.InterfaceC4675jU
    @Nullable
    public final InterfaceC4675jU e() {
        return null;
    }

    @Override // defpackage.InterfaceC4675jU
    @Nullable
    public final <R, D> R e0(@NotNull InterfaceC5518nU<R, D> visitor, D d2) {
        Intrinsics.checkNotNullParameter(visitor, "visitor");
        return null;
    }

    @Override // defpackage.S01
    @Nullable
    public final <T> T g0(@NotNull Q01<T> capability) {
        Intrinsics.checkNotNullParameter(capability, "capability");
        return null;
    }

    @Override // defpackage.InterfaceC4675jU
    @NotNull
    public final C5638o21 getName() {
        return e;
    }

    @Override // defpackage.InterfaceC0726Cc
    @NotNull
    public final InterfaceC2396Xc k() {
        return InterfaceC2396Xc.a.a;
    }

    @Override // defpackage.S01
    @NotNull
    public final Collection<C1758Ph0> o(@NotNull C1758Ph0 fqName, @NotNull Function1<? super C5638o21, Boolean> nameFilter) {
        Intrinsics.checkNotNullParameter(fqName, "fqName");
        Intrinsics.checkNotNullParameter(nameFilter, "nameFilter");
        return C5653o60.d;
    }

    @Override // defpackage.S01
    @NotNull
    public final RK0 t() {
        return (RK0) h.getValue();
    }

    @Override // defpackage.S01
    @NotNull
    public final List<S01> y0() {
        return g;
    }

    @Override // defpackage.InterfaceC4675jU, defpackage.InterfaceC1335Jx
    @NotNull
    /* JADX INFO: renamed from: a */
    public final InterfaceC4675jU U0() {
        return this;
    }
}
