package androidx.emoji2.text;

import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.ProviderInfo;
import android.content.pm.ResolveInfo;
import android.content.pm.Signature;
import android.os.Build;
import android.util.Log;
import androidx.annotation.NonNull;
import defpackage.C2487Yg0;
import defpackage.NG1;
import defpackage.SG1;
import defpackage.U0;
import io.sentry.android.core.b0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* JADX INFO: loaded from: classes.dex */
public final class a {

    /* JADX INFO: renamed from: androidx.emoji2.text.a$a, reason: collision with other inner class name */
    public static class C0230a {
        @NonNull
        public Signature[] a(@NonNull PackageManager packageManager, @NonNull String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static class b extends C0230a {
    }

    public static class c extends b {
        @Override // androidx.emoji2.text.a.C0230a
        @NonNull
        public final Signature[] a(@NonNull PackageManager packageManager, @NonNull String str) {
            return packageManager.getPackageInfo(str, 64).signatures;
        }
    }

    public static f a(@NonNull Context context) {
        ProviderInfo providerInfo;
        C2487Yg0 c2487Yg0;
        ApplicationInfo applicationInfo;
        C0230a cVar = Build.VERSION.SDK_INT >= 28 ? new c() : new b();
        PackageManager packageManager = context.getPackageManager();
        U0.f(packageManager, "Package manager required to locate emoji font provider");
        Iterator<ResolveInfo> it = packageManager.queryIntentContentProviders(new Intent("androidx.content.action.LOAD_EMOJI_FONT"), 0).iterator();
        while (true) {
            if (!it.hasNext()) {
                providerInfo = null;
                break;
            }
            providerInfo = it.next().providerInfo;
            if (providerInfo != null && (applicationInfo = providerInfo.applicationInfo) != null && (applicationInfo.flags & 1) == 1) {
                break;
            }
        }
        if (providerInfo == null) {
            c2487Yg0 = null;
        } else {
            try {
                String str = providerInfo.authority;
                String str2 = providerInfo.packageName;
                Signature[] signatureArrA = cVar.a(packageManager, str2);
                ArrayList arrayList = new ArrayList();
                for (Signature signature : signatureArrA) {
                    arrayList.add(signature.toByteArray());
                }
                c2487Yg0 = new C2487Yg0(str, str2, "emojicompat-emoji-font", Collections.singletonList(arrayList));
            } catch (PackageManager.NameNotFoundException e) {
                b0.a("emoji2.text.DefaultEmojiConfig", NG1.ERROR, null, e);
                b0.b(SG1.FATAL, null, e);
                Log.wtf("emoji2.text.DefaultEmojiConfig", e);
                c2487Yg0 = null;
            }
        }
        if (c2487Yg0 == null) {
            return null;
        }
        return new f(new f.b(context, c2487Yg0));
    }
}
