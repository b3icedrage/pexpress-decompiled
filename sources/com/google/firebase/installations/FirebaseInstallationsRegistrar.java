package com.google.firebase.installations;

import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.C1039Gc0;
import defpackage.C1198Id0;
import defpackage.C2296Wd0;
import defpackage.C4019gb;
import defpackage.C6973uP0;
import defpackage.C6996uX;
import defpackage.C7892yl1;
import defpackage.InterfaceC1233Ip;
import defpackage.InterfaceC2400Xd0;
import defpackage.InterfaceC3246ct;
import defpackage.InterfaceC3958gH;
import defpackage.InterfaceC4749jo0;
import defpackage.InterfaceC4959ko0;
import defpackage.LH1;
import defpackage.TG;
import defpackage.UG;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class FirebaseInstallationsRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-installations";

    /* JADX INFO: Access modifiers changed from: private */
    public static InterfaceC2400Xd0 lambda$getComponents$0(InterfaceC3958gH interfaceC3958gH) {
        return new C2296Wd0((C1198Id0) interfaceC3958gH.a(C1198Id0.class), interfaceC3958gH.c(InterfaceC4959ko0.class), (ExecutorService) interfaceC3958gH.g(new C7892yl1(InterfaceC1233Ip.class, ExecutorService.class)), new LH1((Executor) interfaceC3958gH.g(new C7892yl1(InterfaceC3246ct.class, Executor.class))));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<UG<?>> getComponents() {
        UG.a aVarA = UG.a(InterfaceC2400Xd0.class);
        aVarA.a = LIBRARY_NAME;
        aVarA.a(C6996uX.b(C1198Id0.class));
        aVarA.a(C6996uX.a(InterfaceC4959ko0.class));
        aVarA.a(new C6996uX((C7892yl1<?>) new C7892yl1(InterfaceC1233Ip.class, ExecutorService.class), 1, 0));
        aVarA.a(new C6996uX((C7892yl1<?>) new C7892yl1(InterfaceC3246ct.class, Executor.class), 1, 0));
        aVarA.f = new C1039Gc0(4);
        UG ugB = aVarA.b();
        C4019gb c4019gb = new C4019gb();
        UG.a aVarA2 = UG.a(InterfaceC4749jo0.class);
        aVarA2.e = 1;
        aVarA2.f = new TG(c4019gb);
        return Arrays.asList(ugB, aVarA2.b(), C6973uP0.a(LIBRARY_NAME, "17.1.3"));
    }
}
