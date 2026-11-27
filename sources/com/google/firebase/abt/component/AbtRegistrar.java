package com.google.firebase.abt.component;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.C6973uP0;
import defpackage.C6996uX;
import defpackage.H1;
import defpackage.InterfaceC3958gH;
import defpackage.InterfaceC5746oa;
import defpackage.K1;
import defpackage.UG;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class AbtRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-abt";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ H1 lambda$getComponents$0(InterfaceC3958gH interfaceC3958gH) {
        return new H1((Context) interfaceC3958gH.a(Context.class), interfaceC3958gH.c(InterfaceC5746oa.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<UG<?>> getComponents() {
        UG.a aVarA = UG.a(H1.class);
        aVarA.a = LIBRARY_NAME;
        aVarA.a(C6996uX.b(Context.class));
        aVarA.a(C6996uX.a(InterfaceC5746oa.class));
        aVarA.f = new K1();
        return Arrays.asList(aVarA.b(), C6973uP0.a(LIBRARY_NAME, "21.1.0"));
    }
}
