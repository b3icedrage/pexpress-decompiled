package defpackage;

import android.content.Context;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: ol0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5791ol0 implements InterfaceC5331mb0<C5581nl0> {
    public final InterfaceC1531Mk1<C4923kf> a;
    public final C6 b;
    public final InterfaceC1531Mk1<I50> c;
    public final InterfaceC1531Mk1<AbstractC0578Ae1> d;
    public final InterfaceC1531Mk1<InterfaceC7012ub2> e;

    public C5791ol0(C6 c6, InterfaceC1531Mk1 interfaceC1531Mk1, InterfaceC1531Mk1 interfaceC1531Mk2, InterfaceC1531Mk1 interfaceC1531Mk3, InterfaceC1531Mk1 interfaceC1531Mk4) {
        this.a = interfaceC1531Mk1;
        this.b = c6;
        this.c = interfaceC1531Mk2;
        this.d = interfaceC1531Mk3;
        this.e = interfaceC1531Mk4;
    }

    @Override // defpackage.InterfaceC1531Mk1
    public final Object get() {
        C4923kf appData = this.a.get();
        Context applicationContext = (Context) this.b.get();
        I50 emailUseCase = this.c.get();
        AbstractC0578Ae1 platformIdUseCase = this.d.get();
        InterfaceC7012ub2 userRepository = this.e.get();
        Intrinsics.checkNotNullParameter(appData, "appData");
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(emailUseCase, "emailUseCase");
        Intrinsics.checkNotNullParameter(platformIdUseCase, "platformIdUseCase");
        Intrinsics.checkNotNullParameter(userRepository, "userRepository");
        return new C5581nl0(applicationContext, emailUseCase, platformIdUseCase, userRepository, appData);
    }
}
