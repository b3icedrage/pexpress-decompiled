package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: loaded from: classes.dex */
public final class N10 implements InterfaceC5331mb0 {
    public final /* synthetic */ int a;
    public final InterfaceC1531Mk1 b;
    public final InterfaceC1531Mk1 c;
    public final InterfaceC1531Mk1 d;
    public final InterfaceC1531Mk1 e;

    public /* synthetic */ N10(InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4, int i) {
        this.a = i;
        this.b = interfaceC1531Mk1;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        switch (this.a) {
            case 0:
                return new M10((NQ) this.b.get(), (AbstractC4743jm1) this.c.get(), (BR0) ((C4817k8) this.d).get(), (C6348rR) ((M4) this.e).get());
            default:
                C5176lq1 registerAndLoginParamsUseCase = (C5176lq1) this.b.get();
                InterfaceC1767Pk0 getCodeIfNeededFromDuoAuthUseCase = (InterfaceC1767Pk0) this.c.get();
                InterfaceC7012ub2 userRepository = (InterfaceC7012ub2) this.d.get();
                C4923kf appDataRepository = (C4923kf) this.e.get();
                Intrinsics.checkNotNullParameter(registerAndLoginParamsUseCase, "registerAndLoginParamsUseCase");
                Intrinsics.checkNotNullParameter(getCodeIfNeededFromDuoAuthUseCase, "getCodeIfNeededFromDuoAuthUseCase");
                Intrinsics.checkNotNullParameter(userRepository, "userRepository");
                Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
                return new VS0(registerAndLoginParamsUseCase, getCodeIfNeededFromDuoAuthUseCase, userRepository, appDataRepository);
        }
    }
}
