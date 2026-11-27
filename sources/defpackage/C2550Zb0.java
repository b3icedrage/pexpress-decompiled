package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Zb0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2550Zb0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final OW b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final Object e;

    public C2550Zb0(InterfaceC1531Mk1 interfaceC1531Mk1, OW ow, InterfaceC1531Mk1 interfaceC1531Mk2, C4024gc0 c4024gc0) {
        this.c = interfaceC1531Mk1;
        this.b = ow;
        this.d = interfaceC1531Mk2;
        this.e = c4024gc0;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C2472Yb0((AbstractC5463nB1) this.c.get(), (InterfaceC3951gE1) this.b.get(), (ReporterApi) this.d.get(), (DT1) ((C4024gc0) this.e).get());
            default:
                InterfaceC1454Lk1 interfaceC1454Lk1B = C5208m0.b(this.b);
                InterfaceC3560eO0 screens = interfaceC1454Lk1B instanceof InterfaceC3560eO0 ? (InterfaceC3560eO0) interfaceC1454Lk1B : new Y20(interfaceC1454Lk1B);
                C4612j90 eventsFlowsProvider = (C4612j90) this.c.get();
                C3296d7 activityOnBackPressedProvider = (C3296d7) this.d.get();
                Z21 z21 = (Z21) this.e;
                z21.getClass();
                Intrinsics.checkNotNullParameter(screens, "screens");
                Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
                Intrinsics.checkNotNullParameter(activityOnBackPressedProvider, "activityOnBackPressedProvider");
                return new C4701jc(screens, z21.a, eventsFlowsProvider, activityOnBackPressedProvider);
        }
    }

    public C2550Zb0(Z21 z21, OW ow, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.e = z21;
        this.b = ow;
        this.c = interfaceC1531Mk1;
        this.d = interfaceC1531Mk2;
    }
}
