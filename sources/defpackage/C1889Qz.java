package defpackage;

import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Qz, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public class C1889Qz<E> extends AbstractC2625a0<Unit> implements InterfaceC1733Oz<E> {

    @NotNull
    public final C2030Su h;

    public C1889Qz(@NotNull CoroutineContext coroutineContext, @NotNull C2030Su c2030Su, boolean z, boolean z2) {
        super(coroutineContext, z, z2);
        this.h = c2030Su;
    }

    @Override // defpackage.C3956gG0
    public final void E(@NotNull CancellationException cancellationException) {
        this.h.k(cancellationException, true);
        B(cancellationException);
    }

    @Override // defpackage.InterfaceC7364wF1
    public boolean a(@Nullable Throwable th) {
        return this.h.k(th, false);
    }

    @Override // defpackage.InterfaceC0764Co1
    @NotNull
    public final KE1 d() {
        return this.h.d();
    }

    @Override // defpackage.InterfaceC0764Co1
    @NotNull
    public final Object e() {
        return this.h.e();
    }

    @Override // defpackage.InterfaceC0764Co1
    @Nullable
    public final Object h(@NotNull JM<? super E> jm) {
        return this.h.h(jm);
    }

    @Override // defpackage.InterfaceC7364wF1
    public final void i(@NotNull C0899Eh1 c0899Eh1) {
        this.h.i(c0899Eh1);
    }

    @Override // defpackage.InterfaceC0764Co1
    @NotNull
    public final InterfaceC2621Zz<E> iterator() {
        C2030Su c2030Su = this.h;
        c2030Su.getClass();
        return new C2030Su.a();
    }

    @Override // defpackage.InterfaceC7364wF1
    @Nullable
    public Object j(@NotNull JM jm, Object obj) {
        return this.h.j(jm, obj);
    }

    @Override // defpackage.C3956gG0, defpackage.XF0, defpackage.InterfaceC0764Co1
    public final void l(@Nullable CancellationException cancellationException) {
        if (isCancelled()) {
            return;
        }
        if (cancellationException == null) {
            cancellationException = new YF0(H(), null, this);
        }
        E(cancellationException);
    }

    @Override // defpackage.InterfaceC7364wF1
    @NotNull
    public Object n(E e) {
        return this.h.n(e);
    }

    @Override // defpackage.InterfaceC7364wF1
    public final boolean o() {
        return this.h.o();
    }

    @Override // defpackage.InterfaceC0764Co1
    @Nullable
    public final Object r(@NotNull C4372iF.a aVar) {
        C2030Su c2030Su = this.h;
        c2030Su.getClass();
        Object objF = C2030Su.F(c2030Su, aVar);
        MN mn = MN.d;
        return objF;
    }
}
