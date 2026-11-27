package com.google.firebase.messaging;

import androidx.annotation.Keep;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.C1198Id0;
import defpackage.C2756ad0;
import defpackage.C6973uP0;
import defpackage.C6996uX;
import defpackage.InterfaceC2400Xd0;
import defpackage.InterfaceC2556Zd0;
import defpackage.InterfaceC3958gH;
import defpackage.InterfaceC5169lo0;
import defpackage.InterfaceC6569sU1;
import defpackage.Ta2;
import defpackage.UG;
import defpackage.W42;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
@KeepForSdk
public class FirebaseMessagingRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-fcm";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ FirebaseMessaging lambda$getComponents$0(InterfaceC3958gH interfaceC3958gH) {
        return new FirebaseMessaging((C1198Id0) interfaceC3958gH.a(C1198Id0.class), (InterfaceC2556Zd0) interfaceC3958gH.a(InterfaceC2556Zd0.class), interfaceC3958gH.c(Ta2.class), interfaceC3958gH.c(InterfaceC5169lo0.class), (InterfaceC2400Xd0) interfaceC3958gH.a(InterfaceC2400Xd0.class), (W42) interfaceC3958gH.a(W42.class), (InterfaceC6569sU1) interfaceC3958gH.a(InterfaceC6569sU1.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @Keep
    public List<UG<?>> getComponents() {
        UG.a aVarA = UG.a(FirebaseMessaging.class);
        aVarA.a = LIBRARY_NAME;
        aVarA.a(C6996uX.b(C1198Id0.class));
        aVarA.a(new C6996uX(0, 0, InterfaceC2556Zd0.class));
        aVarA.a(C6996uX.a(Ta2.class));
        aVarA.a(C6996uX.a(InterfaceC5169lo0.class));
        aVarA.a(new C6996uX(0, 0, W42.class));
        aVarA.a(C6996uX.b(InterfaceC2400Xd0.class));
        aVarA.a(C6996uX.b(InterfaceC6569sU1.class));
        aVarA.f = new C2756ad0();
        aVarA.c(1);
        return Arrays.asList(aVarA.b(), C6973uP0.a(LIBRARY_NAME, "23.1.2"));
    }
}
