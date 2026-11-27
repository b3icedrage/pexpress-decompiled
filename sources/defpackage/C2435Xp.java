package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Xp, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C2435Xp implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C2435Xp(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2331Wp((C4923kf) this.b.get(), (EQ) this.c.get());
            case 1:
                return new C7039ui1((C4923kf) this.b.get(), (InterfaceC7012ub2) this.c.get());
            default:
                C4923kf appData = (C4923kf) this.b.get();
                C4612j90 eventsFlowsProvider = (C4612j90) this.c.get();
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
                return new QU1(appData, eventsFlowsProvider);
        }
    }
}
