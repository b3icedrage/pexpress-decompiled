package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.TextUtils;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public final class AR {

    @NonNull
    public final Intent a;

    public static class a {
        public static String a() {
            LocaleList adjustedDefault = LocaleList.getAdjustedDefault();
            if (adjustedDefault.size() > 0) {
                return adjustedDefault.get(0).toLanguageTag();
            }
            return null;
        }
    }

    public AR(@NonNull Intent intent) {
        this.a = intent;
    }

    public static final class b {
        public final Intent a;
        public final C3476e b;
        public final boolean c;

        public b() {
            this.a = new Intent("android.intent.action.VIEW");
            this.b = new C3476e();
            this.c = true;
        }

        @NonNull
        public final AR a() {
            Intent intent = this.a;
            if (!intent.hasExtra("android.support.customtabs.extra.SESSION")) {
                Bundle bundle = new Bundle();
                bundle.putBinder("android.support.customtabs.extra.SESSION", null);
                intent.putExtras(bundle);
            }
            intent.putExtra("android.support.customtabs.extra.EXTRA_ENABLE_INSTANT_APPS", this.c);
            this.b.getClass();
            intent.putExtras(new Bundle());
            intent.putExtra("androidx.browser.customtabs.extra.SHARE_STATE", 0);
            String strA = a.a();
            if (!TextUtils.isEmpty(strA)) {
                Bundle bundleExtra = intent.hasExtra("com.android.browser.headers") ? intent.getBundleExtra("com.android.browser.headers") : new Bundle();
                if (!bundleExtra.containsKey("Accept-Language")) {
                    bundleExtra.putString("Accept-Language", strA);
                    intent.putExtra("com.android.browser.headers", bundleExtra);
                }
            }
            return new AR(intent);
        }

        public b(DR dr) {
            Intent intent = new Intent("android.intent.action.VIEW");
            this.a = intent;
            this.b = new C3476e();
            this.c = true;
            intent.setPackage(dr.c.getPackageName());
            BinderC7819yR binderC7819yR = dr.b;
            Bundle bundle = new Bundle();
            bundle.putBinder("android.support.customtabs.extra.SESSION", binderC7819yR);
            intent.putExtras(bundle);
        }
    }
}
