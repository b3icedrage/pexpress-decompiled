package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: qV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6151qV implements InterfaceC2595Zq0 {

    @NotNull
    public final C2250Vp0 d;

    @NotNull
    public final C1629Nq0 e;

    @NotNull
    public final La2 g;

    @NotNull
    public final C3651eo0 h;

    @NotNull
    public final YH i;

    public C6151qV(@NotNull C2250Vp0 call, @NotNull C3241cr0 data) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(data, "data");
        this.d = call;
        this.e = data.b;
        this.g = data.a;
        this.h = data.c;
        this.i = data.f;
    }

    @Override // defpackage.InterfaceC2595Zq0
    @NotNull
    public final C1629Nq0 G() {
        return this.e;
    }

    @Override // defpackage.InterfaceC1393Kq0
    @NotNull
    public final InterfaceC2586Zn0 a() {
        return this.h;
    }

    @Override // defpackage.InterfaceC2595Zq0, defpackage.KN
    @NotNull
    /* JADX INFO: renamed from: f */
    public final CoroutineContext getE() {
        return this.d.getE();
    }

    @Override // defpackage.InterfaceC2595Zq0
    @NotNull
    public final La2 getUrl() {
        return this.g;
    }

    @Override // defpackage.InterfaceC2595Zq0
    @NotNull
    public final InterfaceC2576Zk q() {
        return this.i;
    }
}
