package defpackage;

import java.util.List;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: On1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1699On1<T> implements FP1<T>, InterfaceC6460ry<T>, InterfaceC4475ik0<T> {
    public final /* synthetic */ InterfaceC3907g21 d;

    public C1699On1(@NotNull InterfaceC3907g21 interfaceC3907g21, @Nullable C2936bP1 c2936bP1) {
        this.d = interfaceC3907g21;
    }

    @Override // defpackage.InterfaceC5910pK1
    @NotNull
    public final List<T> b() {
        return this.d.b();
    }

    @Override // defpackage.InterfaceC6396rf0
    @Nullable
    public final Object c(@NotNull InterfaceC6606sf0<? super T> interfaceC6606sf0, @NotNull JM<?> jm) {
        return this.d.c(interfaceC6606sf0, jm);
    }

    @Override // defpackage.InterfaceC4475ik0
    @NotNull
    public final InterfaceC6396rf0<T> f(@NotNull CoroutineContext coroutineContext, int i, @NotNull EnumC1796Pu enumC1796Pu) {
        return (((i < 0 || i >= 2) && i != -2) || enumC1796Pu != EnumC1796Pu.e) ? C1589Ne.o(this, coroutineContext, i, enumC1796Pu) : this;
    }

    @Override // defpackage.FP1
    public final T getValue() {
        return this.d.getValue();
    }
}
