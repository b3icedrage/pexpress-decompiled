package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class HC1 implements InterfaceC2595Zq0 {
    public final /* synthetic */ InterfaceC2595Zq0 d;

    public HC1(@NotNull GC1 call, @NotNull InterfaceC2595Zq0 origin) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(origin, "origin");
        this.d = origin;
    }

    @Override // defpackage.InterfaceC2595Zq0
    @NotNull
    public final C1629Nq0 G() {
        return this.d.G();
    }

    @Override // defpackage.InterfaceC1393Kq0
    @NotNull
    public final InterfaceC2586Zn0 a() {
        return this.d.a();
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
        return this.d.getUrl();
    }

    @Override // defpackage.InterfaceC2595Zq0
    @NotNull
    public final InterfaceC2576Zk q() {
        return this.d.q();
    }
}
