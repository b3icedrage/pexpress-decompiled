package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class DQ implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 1;
    public final InterfaceC1531Mk1 b;
    public final Object c;
    public final InterfaceC1531Mk1 d;

    public DQ(C6975uQ c6975uQ, C0609Ap c0609Ap, InterfaceC1531Mk1 interfaceC1531Mk1) {
        this.c = c6975uQ;
        this.d = c0609Ap;
        this.b = interfaceC1531Mk1;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new CQ((InterfaceC6345rQ) ((C6975uQ) this.c).get(), (InterfaceC4833kC1) ((C0609Ap) this.d).get(), (C4923kf) this.b.get());
            case 1:
                C4923kf appData = (C4923kf) this.b.get();
                ZT1 subIdProvider = (ZT1) ((InterfaceC1531Mk1) this.c).get();
                InterfaceC1131Hh appRepositoryApi = (InterfaceC1131Hh) ((C2147Uh) this.d).get();
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
                Intrinsics.checkNotNullParameter(appRepositoryApi, "appRepositoryApi");
                return new C3966gJ1(appData, subIdProvider, appRepositoryApi);
            default:
                C3165cW0 impl = (C3165cW0) this.b.get();
                InterfaceC3706f42 telemetry = (InterfaceC3706f42) this.d.get();
                ((C7279vr) this.c).getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                Intrinsics.checkNotNullParameter(telemetry, "telemetry");
                return new FX1(impl, "make_deposit_updater", null, telemetry);
        }
    }

    public DQ(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, C2147Uh c2147Uh) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = c2147Uh;
    }

    public DQ(C7279vr c7279vr, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2) {
        this.c = c7279vr;
        this.b = interfaceC1531Mk1;
        this.d = interfaceC1531Mk2;
    }
}
