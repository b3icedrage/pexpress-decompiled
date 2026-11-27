package com.google.firebase.analytics.connector.internal;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.firebase.components.ComponentRegistrar;
import defpackage.C1198Id0;
import defpackage.C6166qa;
import defpackage.C6973uP0;
import defpackage.C6996uX;
import defpackage.Fm2;
import defpackage.InterfaceC3958gH;
import defpackage.InterfaceC5746oa;
import defpackage.InterfaceC6569sU1;
import defpackage.LL;
import defpackage.Mm2;
import defpackage.UG;
import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: classes.dex */
@Keep
@KeepForSdk
public class AnalyticsConnectorRegistrar implements ComponentRegistrar {
    public static InterfaceC5746oa lambda$getComponents$0(InterfaceC3958gH interfaceC3958gH) {
        C1198Id0 c1198Id0 = (C1198Id0) interfaceC3958gH.a(C1198Id0.class);
        Context context = (Context) interfaceC3958gH.a(Context.class);
        InterfaceC6569sU1 interfaceC6569sU1 = (InterfaceC6569sU1) interfaceC3958gH.a(InterfaceC6569sU1.class);
        Preconditions.checkNotNull(c1198Id0);
        Preconditions.checkNotNull(context);
        Preconditions.checkNotNull(interfaceC6569sU1);
        Preconditions.checkNotNull(context.getApplicationContext());
        if (C6166qa.c == null) {
            synchronized (C6166qa.class) {
                try {
                    if (C6166qa.c == null) {
                        Bundle bundle = new Bundle(1);
                        c1198Id0.a();
                        if ("[DEFAULT]".equals(c1198Id0.b)) {
                            interfaceC6569sU1.b(Fm2.d, Mm2.a);
                            bundle.putBoolean("dataCollectionDefaultEnabled", c1198Id0.h());
                        }
                        C6166qa.c = new C6166qa(zzef.zzg(context, null, null, null, bundle).zzd());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return C6166qa.c;
    }

    @Override // com.google.firebase.components.ComponentRegistrar
    @NonNull
    @Keep
    @SuppressLint({"MissingPermission"})
    @KeepForSdk
    public List<UG<?>> getComponents() {
        UG.a aVarA = UG.a(InterfaceC5746oa.class);
        aVarA.a(C6996uX.b(C1198Id0.class));
        aVarA.a(C6996uX.b(Context.class));
        aVarA.a(C6996uX.b(InterfaceC6569sU1.class));
        aVarA.f = LL.i;
        aVarA.c(2);
        return Arrays.asList(aVarA.b(), C6973uP0.a("fire-analytics", "21.2.0"));
    }
}
