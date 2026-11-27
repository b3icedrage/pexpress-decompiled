package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: c5, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3078c5 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;

    public /* synthetic */ C3078c5(InterfaceC1531Mk1 interfaceC1531Mk1, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2869b5((C4923kf) this.b.get());
            default:
                C4612j90 eventsFlowsProvider = (C4612j90) this.b.get();
                Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
                return new TU1(eventsFlowsProvider);
        }
    }
}
