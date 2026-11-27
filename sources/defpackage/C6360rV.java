package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: rV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6360rV extends AbstractC5391mr0 {

    @NotNull
    public final C2250Vp0 d;

    @NotNull
    public final CoroutineContext e;

    @NotNull
    public final C0850Dr0 g;

    @NotNull
    public final C2097Tq0 h;

    @NotNull
    public final C4944kk0 i;

    @NotNull
    public final C4944kk0 j;

    @NotNull
    public final InterfaceC0942Ew k;

    @NotNull
    public final I81 l;

    public C6360rV(@NotNull C2250Vp0 call, @NotNull C5811or0 responseData) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(responseData, "responseData");
        this.d = call;
        this.e = responseData.f;
        this.g = responseData.a;
        this.h = responseData.d;
        this.i = responseData.b;
        this.j = responseData.g;
        Object obj = responseData.e;
        InterfaceC0942Ew interfaceC0942Ew = obj instanceof InterfaceC0942Ew ? (InterfaceC0942Ew) obj : null;
        if (interfaceC0942Ew == null) {
            InterfaceC0942Ew.a.getClass();
            interfaceC0942Ew = (InterfaceC0942Ew) InterfaceC0942Ew.a.b.getValue();
        }
        this.k = interfaceC0942Ew;
        this.l = responseData.c;
    }

    @Override // defpackage.InterfaceC1393Kq0
    @NotNull
    public final InterfaceC2586Zn0 a() {
        return this.l;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C2250Vp0 b() {
        return this.d;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final InterfaceC0942Ew c() {
        return this.k;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C4944kk0 d() {
        return this.i;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C4944kk0 e() {
        return this.j;
    }

    @Override // defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return this.e;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C0850Dr0 g() {
        return this.g;
    }

    @Override // defpackage.AbstractC5391mr0
    @NotNull
    public final C2097Tq0 h() {
        return this.h;
    }
}
