package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Xz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2465Xz<T> extends AbstractC2361Wz<T, T> {
    @Override // defpackage.AbstractC2123Tz
    @NotNull
    public final AbstractC2123Tz<T> k(@NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        return new C2465Xz(i, enumC1796Pu, this.h, coroutineContext);
    }

    @Override // defpackage.AbstractC2123Tz
    @NotNull
    public final InterfaceC6396rf0<T> l() {
        return (InterfaceC6396rf0<T>) this.h;
    }

    /* JADX WARN: Type inference incomplete: some casts might be missing */
    @Override // defpackage.AbstractC2361Wz
    @Nullable
    public final Object n(@NotNull InterfaceC6606sf0<? super T> interfaceC6606sf0, @NotNull JM<? super Unit> jm) {
        Object objC = this.h.c((InterfaceC6606sf0<? super S>) interfaceC6606sf0, jm);
        return objC == MN.d ? objC : Unit.a;
    }
}
