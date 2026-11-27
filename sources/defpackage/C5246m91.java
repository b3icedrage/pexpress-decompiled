package defpackage;

import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: m91, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class C5246m91 extends C2784ak0 implements InterfaceC1060Gj0<C5456n91, InterfaceC3744fF1<?>, Object, Unit> {
    public static final C5246m91 m = new C5246m91(3, C5456n91.class, "register", "register(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);

    @Override // defpackage.InterfaceC1060Gj0
    public final Unit k(C5456n91 c5456n91, InterfaceC3744fF1<?> interfaceC3744fF1, Object obj) {
        C5456n91 c5456n92 = c5456n91;
        InterfaceC3744fF1<?> interfaceC3744fF2 = interfaceC3744fF1;
        long j = c5456n92.a;
        if (j <= 0) {
            interfaceC3744fF2.e(Unit.a);
        } else {
            RunnableC5033l91 runnableC5033l91 = new RunnableC5033l91(interfaceC3744fF2, c5456n92);
            Intrinsics.c(interfaceC3744fF2, "null cannot be cast to non-null type kotlinx.coroutines.selects.SelectImplementation<*>");
            CoroutineContext context = interfaceC3744fF2.getContext();
            interfaceC3744fF2.d(IW.d(context).G(j, runnableC5033l91, context));
        }
        return Unit.a;
    }
}
