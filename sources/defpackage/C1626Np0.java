package defpackage;

import java.util.List;
import java.util.Map;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Np0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1626Np0 implements InterfaceC2595Zq0 {

    @NotNull
    public final C1629Nq0 d;

    @NotNull
    public final La2 e;

    @NotNull
    public final YH g;

    @NotNull
    public final C3651eo0 h;

    public C1626Np0(C3032br0 c3032br0) {
        this.d = c3032br0.b;
        this.e = c3032br0.a.b();
        this.g = c3032br0.f;
        Map<String, List<String>> values = c3032br0.c.a;
        Intrinsics.checkNotNullParameter(values, "values");
        this.h = new C3651eo0(values);
    }

    @Override // defpackage.InterfaceC2595Zq0
    @NotNull
    public final C1629Nq0 G() {
        return this.d;
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
        throw new IllegalStateException("Call is not initialized");
    }

    @Override // defpackage.InterfaceC2595Zq0
    @NotNull
    public final La2 getUrl() {
        return this.e;
    }

    @Override // defpackage.InterfaceC2595Zq0
    @NotNull
    public final InterfaceC2576Zk q() {
        return this.g;
    }
}
