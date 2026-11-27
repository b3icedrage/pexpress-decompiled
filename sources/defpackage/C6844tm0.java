package defpackage;

import android.content.pm.PackageInfo;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Base64;
import com.google.android.gms.cloudmessaging.Rpc;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import io.sentry.android.core.b0;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ExecutionException;

/* JADX INFO: renamed from: tm0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6844tm0 {
    public final C1198Id0 a;
    public final ZZ0 b;
    public final Rpc c;
    public final InterfaceC1612Nk1<Ta2> d;
    public final InterfaceC1612Nk1<InterfaceC5169lo0> e;
    public final InterfaceC2400Xd0 f;

    public C6844tm0(C1198Id0 c1198Id0, ZZ0 zz0, InterfaceC1612Nk1<Ta2> interfaceC1612Nk1, InterfaceC1612Nk1<InterfaceC5169lo0> interfaceC1612Nk2, InterfaceC2400Xd0 interfaceC2400Xd0) {
        c1198Id0.a();
        Rpc rpc = new Rpc(c1198Id0.a);
        this.a = c1198Id0;
        this.b = zz0;
        this.c = rpc;
        this.d = interfaceC1612Nk1;
        this.e = interfaceC1612Nk2;
        this.f = interfaceC2400Xd0;
    }

    public final Task<String> a(Task<Bundle> task) {
        return task.continueWith(new ExecutorC4468ii1(), new C6634sm0(this, 0));
    }

    public final void b(String str, String str2, Bundle bundle) {
        int i;
        String str3;
        String strEncodeToString;
        int iB;
        PackageInfo packageInfoC;
        bundle.putString("scope", str2);
        bundle.putString("sender", str);
        bundle.putString("subtype", str);
        C1198Id0 c1198Id0 = this.a;
        c1198Id0.a();
        bundle.putString("gmp_app_id", c1198Id0.c.b);
        ZZ0 zz0 = this.b;
        synchronized (zz0) {
            try {
                if (zz0.d == 0 && (packageInfoC = zz0.c("com.google.android.gms")) != null) {
                    zz0.d = packageInfoC.versionCode;
                }
                i = zz0.d;
            } catch (Throwable th) {
                throw th;
            }
        }
        bundle.putString("gmsv", Integer.toString(i));
        bundle.putString("osv", Integer.toString(Build.VERSION.SDK_INT));
        bundle.putString("app_ver", this.b.a());
        ZZ0 zz1 = this.b;
        synchronized (zz1) {
            try {
                if (zz1.c == null) {
                    zz1.e();
                }
                str3 = zz1.c;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        bundle.putString("app_ver_name", str3);
        C1198Id0 c1198Id1 = this.a;
        c1198Id1.a();
        try {
            strEncodeToString = Base64.encodeToString(MessageDigest.getInstance("SHA-1").digest(c1198Id1.b.getBytes()), 11);
        } catch (NoSuchAlgorithmException unused) {
            strEncodeToString = "[HASH-ERROR]";
        }
        bundle.putString("firebase-app-name-hash", strEncodeToString);
        try {
            String strA = ((RA0) Tasks.await(this.f.getToken())).a();
            if (TextUtils.isEmpty(strA)) {
                b0.e("FirebaseMessaging", "FIS auth token is empty");
            } else {
                bundle.putString("Goog-Firebase-Installations-Auth", strA);
            }
        } catch (InterruptedException e) {
            e = e;
            b0.d("FirebaseMessaging", "Failed to get FIS auth token", e);
        } catch (ExecutionException e2) {
            e = e2;
            b0.d("FirebaseMessaging", "Failed to get FIS auth token", e);
        }
        bundle.putString("appid", (String) Tasks.await(this.f.getId()));
        bundle.putString("cliv", "fcm-23.1.2");
        InterfaceC5169lo0 interfaceC5169lo0 = this.e.get();
        Ta2 ta2 = this.d.get();
        if (interfaceC5169lo0 == null || ta2 == null || (iB = interfaceC5169lo0.b()) == 1) {
            return;
        }
        bundle.putString("Firebase-Client-Log-Type", Integer.toString(C1039Gc0.g(iB)));
        bundle.putString("Firebase-Client", ta2.a());
    }

    public final Task<Bundle> c(String str, String str2, Bundle bundle) {
        try {
            b(str, str2, bundle);
            return this.c.send(bundle);
        } catch (InterruptedException | ExecutionException e) {
            return Tasks.forException(e);
        }
    }
}
