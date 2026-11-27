package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Wz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC2361Wz<S, T> extends AbstractC2123Tz<T> {

    @NotNull
    public final InterfaceC6396rf0<S> h;

    public AbstractC2361Wz(int i, @NotNull EnumC1796Pu enumC1796Pu, @NotNull InterfaceC6396rf0 interfaceC6396rf0, @NotNull CoroutineContext coroutineContext) {
        super(coroutineContext, i, enumC1796Pu);
        this.h = interfaceC6396rf0;
    }

    @Override // defpackage.AbstractC2123Tz, defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super T> interfaceC6606sf0, @NotNull JM<? super Unit> jm) {
        if (this.e == -3) {
            CoroutineContext context = jm.getContext();
            Boolean bool = Boolean.FALSE;
            BN bn = BN.d;
            CoroutineContext coroutineContext = this.d;
            CoroutineContext coroutineContextT = !((Boolean) coroutineContext.R0(bool, bn)).booleanValue() ? context.t(coroutineContext) : AN.a(context, coroutineContext, false);
            if (Intrinsics.a(coroutineContextT, context)) {
                Object objN = n(interfaceC6606sf0, jm);
                return objN == MN.d ? objN : Unit.a;
            }
            d.a aVar = d.f;
            if (Intrinsics.a(coroutineContextT.p(aVar), context.p(aVar))) {
                CoroutineContext context2 = jm.getContext();
                if (!(interfaceC6606sf0 instanceof KF1 ? true : interfaceC6606sf0 instanceof D51)) {
                    interfaceC6606sf0 = new C7763y82(interfaceC6606sf0, context2);
                }
                Object objG = C6772tS0.g(coroutineContextT, interfaceC6606sf0, CY1.b(coroutineContextT), new C2279Vz(this, null), jm);
                return objG == MN.d ? objG : Unit.a;
            }
        }
        Object objC = super.c(interfaceC6606sf0, jm);
        return objC == MN.d ? objC : Unit.a;
    }

    @Override // defpackage.AbstractC2123Tz
    @Nullable
    public final Object j(@NotNull InterfaceC1133Hh1<? super T> interfaceC1133Hh1, @NotNull JM<? super Unit> jm) {
        Object objN = n(new KF1(interfaceC1133Hh1), jm);
        return objN == MN.d ? objN : Unit.a;
    }

    @Nullable
    public abstract Object n(@NotNull InterfaceC6606sf0<? super T> interfaceC6606sf0, @NotNull JM<? super Unit> jm);

    @Override // defpackage.AbstractC2123Tz
    @NotNull
    public final String toString() {
        return this.h + " -> " + super.toString();
    }
}
