package com.google.firebase.datatransport;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.C2612Zw;
import defpackage.C3081c52;
import defpackage.C5244m9;
import defpackage.C6973uP0;
import defpackage.C6996uX;
import defpackage.InterfaceC3958gH;
import defpackage.UG;
import defpackage.W42;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class TransportRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-transport";

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ W42 lambda$getComponents$0(InterfaceC3958gH interfaceC3958gH) {
        C3081c52.b((Context) interfaceC3958gH.a(Context.class));
        return C3081c52.a().c(C2612Zw.e);
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<UG<?>> getComponents() {
        UG.a aVarA = UG.a(W42.class);
        aVarA.a = LIBRARY_NAME;
        aVarA.a(C6996uX.b(Context.class));
        aVarA.f = new C5244m9(6);
        return Arrays.asList(aVarA.b(), C6973uP0.a(LIBRARY_NAME, "18.1.7"));
    }
}
