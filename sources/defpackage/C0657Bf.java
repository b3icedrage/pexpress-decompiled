package defpackage;

import com.impl.feature.registration.screens.duoauth.DuoAuthFragmentImpl;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: Bf, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0657Bf implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;

    public /* synthetic */ C0657Bf(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                InterfaceC7007ua1 ourSideHttpService = (InterfaceC7007ua1) ((C7904yp) this.b).get();
                C6753tM contextHelper = (C6753tM) ((InterfaceC1454Lk1) this.c).get();
                InterfaceC4833kC1 safeRequestsApi = (InterfaceC4833kC1) ((C0609Ap) this.d).get();
                Intrinsics.checkNotNullParameter(ourSideHttpService, "ourSideHttpService");
                Intrinsics.checkNotNullParameter(contextHelper, "contextHelper");
                Intrinsics.checkNotNullParameter(safeRequestsApi, "safeRequestsApi");
                return new C0579Af(ourSideHttpService, contextHelper, safeRequestsApi);
            case 1:
                return new C3775fQ((C4923kf) this.b.get(), (InterfaceC7012ub2) this.c.get(), (L32) this.d.get());
            default:
                return new DuoAuthFragmentImpl((Sd2) ((OW) this.b).get(), (InterfaceC5435n40) this.c.get(), (C3296d7) this.d.get());
        }
    }
}
