package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wV, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7411wV implements InterfaceC7394wP0 {
    public final IP0 d;

    public C7411wV() {
        IP0 lifecycleRegistry = new IP0(0);
        Intrinsics.checkNotNullParameter(lifecycleRegistry, "lifecycleRegistry");
        this.d = lifecycleRegistry;
        lifecycleRegistry.d(InterfaceC7394wP0.a.b.a);
    }

    @Override // defpackage.InterfaceC2236Vk1
    public final void b(InterfaceC6359rU1<? super InterfaceC7394wP0.a> interfaceC6359rU1) {
        this.d.b(interfaceC6359rU1);
    }
}
