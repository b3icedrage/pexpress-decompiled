package com.google.firebase.remoteconfig;

import android.content.Context;
import androidx.annotation.Keep;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.C0574Ad0;
import defpackage.C1198Id0;
import defpackage.C6651sr1;
import defpackage.C6861tr1;
import defpackage.C6973uP0;
import defpackage.C6996uX;
import defpackage.C7892yl1;
import defpackage.H1;
import defpackage.InterfaceC2400Xd0;
import defpackage.InterfaceC3246ct;
import defpackage.InterfaceC3958gH;
import defpackage.InterfaceC5746oa;
import defpackage.UG;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
@Keep
public class RemoteConfigRegistrar implements ComponentRegistrar {
    private static final String LIBRARY_NAME = "fire-rc";

    /* JADX INFO: Access modifiers changed from: private */
    public static C6651sr1 lambda$getComponents$0(C7892yl1 c7892yl1, InterfaceC3958gH interfaceC3958gH) {
        C0574Ad0 c0574Ad0;
        Context context = (Context) interfaceC3958gH.a(Context.class);
        Executor executor = (Executor) interfaceC3958gH.g(c7892yl1);
        C1198Id0 c1198Id0 = (C1198Id0) interfaceC3958gH.a(C1198Id0.class);
        InterfaceC2400Xd0 interfaceC2400Xd0 = (InterfaceC2400Xd0) interfaceC3958gH.a(InterfaceC2400Xd0.class);
        H1 h1 = (H1) interfaceC3958gH.a(H1.class);
        synchronized (h1) {
            try {
                if (!h1.a.containsKey("frc")) {
                    h1.a.put("frc", new C0574Ad0(h1.b));
                }
                c0574Ad0 = (C0574Ad0) h1.a.get("frc");
            } catch (Throwable th) {
                throw th;
            }
        }
        return new C6651sr1(context, executor, c1198Id0, interfaceC2400Xd0, c0574Ad0, interfaceC3958gH.c(InterfaceC5746oa.class));
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public List<UG<?>> getComponents() {
        C7892yl1 c7892yl1 = new C7892yl1(InterfaceC3246ct.class, Executor.class);
        UG.a aVarA = UG.a(C6651sr1.class);
        aVarA.a = LIBRARY_NAME;
        aVarA.a(C6996uX.b(Context.class));
        aVarA.a(new C6996uX((C7892yl1<?>) c7892yl1, 1, 0));
        aVarA.a(C6996uX.b(C1198Id0.class));
        aVarA.a(C6996uX.b(InterfaceC2400Xd0.class));
        aVarA.a(C6996uX.b(H1.class));
        aVarA.a(C6996uX.a(InterfaceC5746oa.class));
        aVarA.f = new C6861tr1(c7892yl1);
        aVarA.c(2);
        return Arrays.asList(aVarA.b(), C6973uP0.a(LIBRARY_NAME, "21.2.1"));
    }
}
