package defpackage;

import com.base.feature.robot.instruction.screens.InstructionFragment;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Uh, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2147Uh implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;

    public /* synthetic */ C2147Uh(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                InterfaceC7446wf appDataSourceApi = (InterfaceC7446wf) ((C0657Bf) this.b).get();
                InterfaceC4833kC1 safeRequestsApi = (InterfaceC4833kC1) ((C0609Ap) this.c).get();
                Intrinsics.checkNotNullParameter(appDataSourceApi, "appDataSourceApi");
                Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
                C2069Th c2069Th = new C2069Th(appDataSourceApi, safeRequestsApi);
                XO0.b(new B5(appDataSourceApi, 1));
                return c2069Th;
            case 1:
                return new C2534Yw((InterfaceC0715By0) this.b.get(), (C6348rR) ((M4) this.c).get());
            default:
                return new InstructionFragment((Sd2) ((OW) this.b).get(), (AbstractC5603ns) this.c.get());
        }
    }
}
