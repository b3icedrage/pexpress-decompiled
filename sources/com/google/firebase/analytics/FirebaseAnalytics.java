package com.google.firebase.analytics;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzef;
import com.google.android.gms.measurement.internal.zzhy;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import defpackage.C1198Id0;
import defpackage.C2296Wd0;
import defpackage.Em2;
import defpackage.InterfaceC2400Xd0;
import defpackage.Lm2;
import defpackage.Sm2;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes.dex */
public final class FirebaseAnalytics {
    public static volatile FirebaseAnalytics c;
    public final zzef a;
    public Em2 b;

    public FirebaseAnalytics(zzef zzefVar) {
        Preconditions.checkNotNull(zzefVar);
        this.a = zzefVar;
    }

    @NonNull
    @Keep
    public static FirebaseAnalytics getInstance(@NonNull Context context) {
        if (c == null) {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (c == null) {
                        c = new FirebaseAnalytics(zzef.zzg(context, null, null, null, null));
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return c;
    }

    @Keep
    public static zzhy getScionFrontendApiImplementation(Context context, Bundle bundle) {
        zzef zzefVarZzg = zzef.zzg(context, null, null, null, bundle);
        if (zzefVarZzg == null) {
            return null;
        }
        return new Sm2(zzefVarZzg);
    }

    @NonNull
    public final Task<String> a() {
        Em2 em2;
        try {
            synchronized (FirebaseAnalytics.class) {
                try {
                    if (this.b == null) {
                        this.b = new Em2(0, 1, 30L, TimeUnit.SECONDS, new ArrayBlockingQueue(100));
                    }
                    em2 = this.b;
                } catch (Throwable th) {
                    throw th;
                }
            }
            return Tasks.call(em2, new Lm2(this));
        } catch (RuntimeException e) {
            this.a.zzB(5, "Failed to schedule task for getAppInstanceId", null, null, null);
            return Tasks.forException(e);
        }
    }

    @NonNull
    @Keep
    public String getFirebaseInstanceId() {
        try {
            Object obj = C2296Wd0.m;
            C1198Id0 c1198Id0C = C1198Id0.c();
            Preconditions.checkArgument(true, "Null is not a valid value of FirebaseApp.");
            return (String) Tasks.await(((C2296Wd0) c1198Id0C.b(InterfaceC2400Xd0.class)).getId(), 30000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException e) {
            throw new IllegalStateException(e);
        } catch (ExecutionException e2) {
            throw new IllegalStateException(e2.getCause());
        } catch (TimeoutException unused) {
            throw new IllegalThreadStateException("Firebase Installations getId Task has timed out.");
        }
    }

    @Keep
    @Deprecated
    public void setCurrentScreen(@NonNull Activity activity, String str, String str2) {
        this.a.zzH(activity, str, str2);
    }
}
