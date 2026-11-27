package com.google.firebase;

import android.content.Context;
import android.os.Build;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.AbstractC6553sP0;
import defpackage.C0603An;
import defpackage.C0681Bn;
import defpackage.C1198Id0;
import defpackage.C4790k10;
import defpackage.C5244m9;
import defpackage.C5521nV;
import defpackage.C5941pV;
import defpackage.C6751tL0;
import defpackage.C6973uP0;
import defpackage.C6996uX;
import defpackage.C7892yl1;
import defpackage.D8;
import defpackage.InterfaceC1233Ip;
import defpackage.InterfaceC4749jo0;
import defpackage.InterfaceC4959ko0;
import defpackage.InterfaceC5169lo0;
import defpackage.Ta2;
import defpackage.UG;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes.dex */
public class FirebaseCommonRegistrar implements ComponentRegistrar {
    public static String a(String str) {
        return str.replace(' ', '_').replace('/', '_');
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    public final List<UG<?>> getComponents() {
        String string;
        ArrayList arrayList = new ArrayList();
        UG.a aVarA = UG.a(Ta2.class);
        aVarA.a(new C6996uX(2, 0, AbstractC6553sP0.class));
        aVarA.f = new C5244m9(2);
        arrayList.add(aVarA.b());
        C7892yl1 c7892yl1 = new C7892yl1(InterfaceC1233Ip.class, Executor.class);
        UG.a aVar = new UG.a(C5941pV.class, new Class[]{InterfaceC4959ko0.class, InterfaceC5169lo0.class});
        aVar.a(C6996uX.b(Context.class));
        aVar.a(C6996uX.b(C1198Id0.class));
        aVar.a(new C6996uX(2, 0, InterfaceC4749jo0.class));
        aVar.a(new C6996uX(1, 1, Ta2.class));
        aVar.a(new C6996uX((C7892yl1<?>) c7892yl1, 1, 0));
        aVar.f = new C5521nV(c7892yl1);
        arrayList.add(aVar.b());
        arrayList.add(C6973uP0.a("fire-android", String.valueOf(Build.VERSION.SDK_INT)));
        arrayList.add(C6973uP0.a("fire-core", "20.3.1"));
        arrayList.add(C6973uP0.a("device-name", a(Build.PRODUCT)));
        arrayList.add(C6973uP0.a("device-model", a(Build.DEVICE)));
        arrayList.add(C6973uP0.a("device-brand", a(Build.BRAND)));
        arrayList.add(C6973uP0.b("android-target-sdk", new C4790k10(1)));
        arrayList.add(C6973uP0.b("android-min-sdk", new C0603An()));
        arrayList.add(C6973uP0.b("android-platform", new C0681Bn()));
        arrayList.add(C6973uP0.b("android-installer", new D8(2)));
        try {
            string = C6751tL0.j.toString();
        } catch (NoClassDefFoundError unused) {
            string = null;
        }
        if (string != null) {
            arrayList.add(C6973uP0.a("kotlin", string));
        }
        return arrayList;
    }
}
