package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: Fg0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C0973Fg0 implements InterfaceC7394wP0, InterfaceC2236Vk1<InterfaceC7394wP0.a> {
    public final C1285Jg0 d;

    public C0973Fg0(@NotNull C1285Jg0 flowable, @NotNull AbstractC4836kD1 scheduler) {
        Intrinsics.checkNotNullParameter(flowable, "flowable");
        Intrinsics.checkNotNullParameter(scheduler, "scheduler");
        this.d = flowable;
    }

    @Override // defpackage.InterfaceC2236Vk1
    public final void b(InterfaceC6359rU1<? super InterfaceC7394wP0.a> interfaceC6359rU1) {
        this.d.b(interfaceC6359rU1);
    }
}
