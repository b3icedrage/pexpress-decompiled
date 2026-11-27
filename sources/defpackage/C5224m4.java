package defpackage;

import com.impl.feature.robot.account.AccountSelectionFragmentImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: m4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5224m4 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final Object c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ C5224m4(Object obj, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.c = obj;
        this.b = interfaceC1531Mk1;
        this.d = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new AccountSelectionFragmentImpl((Sd2) ((OW) this.c).get(), (AbstractC5603ns) this.b.get(), (InterfaceC4119h3) ((InterfaceC1454Lk1) this.d).get());
            default:
                C5530nY impl = (C5530nY) this.b.get();
                InterfaceC3706f42 telemetry = (InterfaceC3706f42) this.d.get();
                ((C7279vr) this.c).getClass();
                Intrinsics.checkNotNullParameter(impl, "impl");
                Intrinsics.checkNotNullParameter(telemetry, "telemetry");
                return new FX1(impl, "deposit_values_updater", null, telemetry);
        }
    }
}
