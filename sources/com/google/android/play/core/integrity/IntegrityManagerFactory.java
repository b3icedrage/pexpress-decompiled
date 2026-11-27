package com.google.android.play.core.integrity;

import android.content.Context;
import androidx.annotation.NonNull;
import defpackage.C3227cm2;
import defpackage.C5642o31;
import defpackage.Cm2;

/* JADX INFO: loaded from: classes.dex */
public class IntegrityManagerFactory {
    @NonNull
    public static IntegrityManager create(Context context) {
        C5642o31 c5642o31;
        synchronized (Cm2.class) {
            try {
                if (Cm2.d == null) {
                    Context applicationContext = context.getApplicationContext();
                    if (applicationContext != null) {
                        context = applicationContext;
                    }
                    Cm2.d = new C5642o31(context);
                }
                c5642o31 = Cm2.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        return (IntegrityManager) ((C3227cm2) c5642o31.d).a();
    }
}
