package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Pz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1811Pz<T> extends AbstractC2123Tz<T> {
    private volatile /* synthetic */ int consumed$volatile;

    @NotNull
    public final C2030Su h;

    static {
        AtomicIntegerFieldUpdater.newUpdater(C1811Pz.class, "consumed$volatile");
    }

    public /* synthetic */ C1811Pz(C2030Su c2030Su) {
        this(c2030Su, e.d, -3, EnumC1796Pu.d);
    }

    @Override // defpackage.AbstractC2123Tz, defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super T> interfaceC6606sf0, @NotNull JM<? super Unit> jm) {
        if (this.e == -3) {
            Object objA = C0736Cf0.a(interfaceC6606sf0, this.h, false, jm);
            return objA == MN.d ? objA : Unit.a;
        }
        Object objC = super.c(interfaceC6606sf0, jm);
        return objC == MN.d ? objC : Unit.a;
    }

    @Override // defpackage.AbstractC2123Tz
    @NotNull
    public final String g() {
        return "channel=" + this.h;
    }

    @Override // defpackage.AbstractC2123Tz
    @Nullable
    public final Object j(@NotNull InterfaceC1133Hh1<? super T> interfaceC1133Hh1, @NotNull JM<? super Unit> jm) {
        Object objA = C0736Cf0.a(new KF1(interfaceC1133Hh1), this.h, false, jm);
        return objA == MN.d ? objA : Unit.a;
    }

    @Override // defpackage.AbstractC2123Tz
    @NotNull
    public final AbstractC2123Tz<T> k(@NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        return new C1811Pz(this.h, coroutineContext, i, enumC1796Pu);
    }

    @Override // defpackage.AbstractC2123Tz
    @NotNull
    public final InterfaceC6396rf0<T> l() {
        return new C1811Pz(this.h);
    }

    @Override // defpackage.AbstractC2123Tz
    @NotNull
    public final InterfaceC0764Co1<T> m(@NotNull KN kn) {
        return this.e == -3 ? this.h : super.m(kn);
    }

    public C1811Pz(@NotNull C2030Su c2030Su, @NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        super(coroutineContext, i, enumC1796Pu);
        this.h = c2030Su;
        this.consumed$volatile = 0;
    }
}
