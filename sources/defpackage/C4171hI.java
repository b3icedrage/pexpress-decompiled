package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hI, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4171hI implements InterfaceC5331mb0 {
    public final /* synthetic */ int a = 0;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;
    public final InterfaceC1531Mk1 f;

    public C4171hI(C6 c6, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.f = c6;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new C3961gI((Context) ((C6) this.f).get(), (ZT1) this.b.get(), (C5698oK) this.c.get(), (InterfaceC1446Li) this.d.get(), (I50) this.e.get());
            default:
                C5176lq1 registerAndLoginParamsUseCase = (C5176lq1) this.b.get();
                C4923kf appData = (C4923kf) this.c.get();
                ZT1 subIdProvider = (ZT1) this.d.get();
                C4612j90 eventsFlowsProvider = (C4612j90) this.e.get();
                InterfaceC7012ub2 userRepository = (InterfaceC7012ub2) this.f.get();
                Intrinsics.checkNotNullParameter(registerAndLoginParamsUseCase, "registerAndLoginParamsUseCase");
                Intrinsics.checkNotNullParameter(appData, "appData");
                Intrinsics.checkNotNullParameter(subIdProvider, "subIdProvider");
                Intrinsics.checkNotNullParameter(eventsFlowsProvider, "eventsFlowsProvider");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                return new C7278vq1(registerAndLoginParamsUseCase, appData, subIdProvider, eventsFlowsProvider, userRepository);
        }
    }

    public C4171hI(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, InterfaceC1531Mk1 interfaceC1531Mk5) {
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
        this.f = interfaceC1531Mk5;
    }
}
