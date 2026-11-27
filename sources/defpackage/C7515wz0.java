package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: wz0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7515wz0 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ C7515wz0(InterfaceC1454Lk1 interfaceC1454Lk1, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.d = interfaceC1454Lk1;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C6674sz0((InterfaceC3371dV) ((C3320dE) this.d).get(), (C5412my0) this.b.get(), (C4612j90) this.c.get(), new Kc2());
            case 1:
                ReporterApi reporter = (ReporterApi) this.b.get();
                VK1 showAlertDialogUseCase = (VK1) ((XK1) this.d).get();
                C6964uM0 lastDialogShownHolder = (C6964uM0) this.c.get();
                Intrinsics.checkNotNullParameter(reporter, "reporter");
                Intrinsics.checkNotNullParameter(showAlertDialogUseCase, "showAlertDialogUseCase");
                Intrinsics.checkNotNullParameter(lastDialogShownHolder, "lastDialogShownHolder");
                return new C2348Wu1(reporter, showAlertDialogUseCase, lastDialogShownHolder);
            case 2:
                return new DF1((InterfaceC5889pD1) ((InterfaceC1454Lk1) this.d).get(), (InterfaceC5570ni1) ((InterfaceC1454Lk1) this.b).get(), (InterfaceC1153Ho0) ((InterfaceC1454Lk1) this.c).get());
            default:
                C6206qk impl = (C6206qk) this.b.get();
                C4923kf appData = (C4923kf) this.c.get();
                InterfaceC3706f42 telemetry = (InterfaceC3706f42) this.d.get();
                Intrinsics.checkNotNullParameter(impl, "impl");
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(telemetry, "telemetry");
                return new FX1(impl, "assets_updater", new C4927kg(appData, 7), telemetry);
        }
    }

    public C7515wz0(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, XK1 xk1) {
        this.a = 1;
        this.b = interfaceC1531Mk1;
        this.d = xk1;
        this.c = interfaceC1531Mk2;
    }

    public C7515wz0(C7279vr c7279vr, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3) {
        this.a = 3;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }
}
