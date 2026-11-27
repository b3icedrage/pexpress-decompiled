package defpackage;

import android.app.LocaleManager;
import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.LocaleList;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppLocalesMetadataHolderService;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.lang.ref.WeakReference;
import java.util.Iterator;

/* JADX INFO: renamed from: ae, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2759ae {
    public static final C0585Ah.a d = new C0585Ah.a(new C0585Ah.b());
    public static int e = -100;
    public static OR0 g = null;
    public static OR0 h = null;
    public static Boolean i = null;
    public static boolean j = false;
    public static final C0903Ej<WeakReference<AbstractC2759ae>> k = new C0903Ej<>();
    public static final Object l = new Object();
    public static final Object m = new Object();

    /* JADX INFO: renamed from: ae$a */
    public static class a {
        public static LocaleList a(String str) {
            return LocaleList.forLanguageTags(str);
        }
    }

    /* JADX INFO: renamed from: ae$b */
    public static class b {
        public static LocaleList a(Object obj) {
            return ((LocaleManager) obj).getApplicationLocales();
        }

        public static void b(Object obj, LocaleList localeList) {
            ((LocaleManager) obj).setApplicationLocales(localeList);
        }
    }

    @NonNull
    public static OR0 g() {
        if (C3252cv.b()) {
            Object objJ = j();
            if (objJ != null) {
                return new OR0(new QR0(b.a(objJ)));
            }
        } else {
            OR0 or0 = g;
            if (or0 != null) {
                return or0;
            }
        }
        return OR0.b;
    }

    public static Object j() {
        Context contextH;
        Iterator<WeakReference<AbstractC2759ae>> it = k.iterator();
        while (true) {
            AbstractC6155qW0.a aVar = (AbstractC6155qW0.a) it;
            if (!aVar.hasNext()) {
                return null;
            }
            AbstractC2759ae abstractC2759ae = (AbstractC2759ae) ((WeakReference) aVar.next()).get();
            if (abstractC2759ae != null && (contextH = abstractC2759ae.h()) != null) {
                return contextH.getSystemService("locale");
            }
        }
    }

    public static boolean m(Context context) {
        if (i == null) {
            try {
                int i2 = AppLocalesMetadataHolderService.d;
                Bundle bundle = context.getPackageManager().getServiceInfo(new ComponentName(context, (Class<?>) AppLocalesMetadataHolderService.class), AppLocalesMetadataHolderService.a.a() | UserVerificationMethods.USER_VERIFY_PATTERN).metaData;
                if (bundle != null) {
                    i = Boolean.valueOf(bundle.getBoolean("autoStoreLocales"));
                }
            } catch (PackageManager.NameNotFoundException unused) {
                i = Boolean.FALSE;
            }
        }
        return i.booleanValue();
    }

    public static void q(@NonNull LayoutInflaterFactory2C3192ce layoutInflaterFactory2C3192ce) {
        synchronized (l) {
            try {
                Iterator<WeakReference<AbstractC2759ae>> it = k.iterator();
                while (true) {
                    AbstractC6155qW0.a aVar = (AbstractC6155qW0.a) it;
                    if (aVar.hasNext()) {
                        AbstractC2759ae abstractC2759ae = (AbstractC2759ae) ((WeakReference) aVar.next()).get();
                        if (abstractC2759ae == layoutInflaterFactory2C3192ce || abstractC2759ae == null) {
                            aVar.remove();
                        }
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public static void v(int i2) {
        if ((i2 == -1 || i2 == 0 || i2 == 1 || i2 == 2 || i2 == 3) && e != i2) {
            e = i2;
            synchronized (l) {
                try {
                    Iterator<WeakReference<AbstractC2759ae>> it = k.iterator();
                    while (true) {
                        AbstractC6155qW0.a aVar = (AbstractC6155qW0.a) it;
                        if (aVar.hasNext()) {
                            AbstractC2759ae abstractC2759ae = (AbstractC2759ae) ((WeakReference) aVar.next()).get();
                            if (abstractC2759ae != null) {
                                abstractC2759ae.e();
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public static void x(Context context) {
        if (m(context)) {
            if (C3252cv.b()) {
                if (j) {
                    return;
                }
                d.execute(new RunnableC2477Yd(context, 0));
                return;
            }
            synchronized (m) {
                try {
                    OR0 or0 = g;
                    if (or0 == null) {
                        if (h == null) {
                            h = OR0.a(C0585Ah.b(context));
                        }
                        if (h.a.a.isEmpty()) {
                        } else {
                            g = h;
                        }
                    } else if (!or0.equals(h)) {
                        OR0 or1 = g;
                        h = or1;
                        C0585Ah.a(context, or1.a.a.toLanguageTags());
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public abstract void c(View view, ViewGroup.LayoutParams layoutParams);

    public abstract boolean e();

    public abstract <T extends View> T f(int i2);

    public Context h() {
        return null;
    }

    public int i() {
        return -100;
    }

    public abstract void k();

    public abstract void l();

    public abstract void n();

    public abstract void o();

    public abstract void p();

    public abstract boolean r(int i2);

    public abstract void s(int i2);

    public abstract void t(View view);

    public abstract void u(View view, ViewGroup.LayoutParams layoutParams);

    public abstract void w(CharSequence charSequence);

    public void d() {
    }
}
