package com.google.firebase.crashlytics;

import com.google.firebase.components.ComponentRegistrar;
import defpackage.C1198Id0;
import defpackage.C1668Od0;
import defpackage.C5503nP;
import defpackage.C6973uP0;
import defpackage.C6996uX;
import defpackage.InterfaceC2400Xd0;
import defpackage.InterfaceC4660jP;
import defpackage.InterfaceC5746oa;
import defpackage.UG;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
public class CrashlyticsRegistrar implements ComponentRegistrar {
    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<UG<?>> getComponents() {
        UG.a aVarA = UG.a(C1668Od0.class);
        aVarA.a = "fire-cls";
        aVarA.a(C6996uX.b(C1198Id0.class));
        aVarA.a(C6996uX.b(InterfaceC2400Xd0.class));
        aVarA.a(new C6996uX(0, 2, InterfaceC4660jP.class));
        aVarA.a(new C6996uX(0, 2, InterfaceC5746oa.class));
        aVarA.f = new C5503nP(this);
        aVarA.c(2);
        return Arrays.asList(aVarA.b(), C6973uP0.a("fire-cls", "18.3.5"));
    }
}
