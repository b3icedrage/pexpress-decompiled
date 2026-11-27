package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import com.google.android.datatransport.runtime.backends.TransportBackendDiscovery;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.android.core.b0;
import java.lang.reflect.InvocationTargetException;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: renamed from: a01, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2627a01 implements InterfaceC0921Ep {
    public final a a;
    public final TP b;
    public final HashMap c;

    /* JADX INFO: renamed from: a01$a */
    public static class a {
        public final Context a;
        public Map<String, String> b = null;

        public a(Context context) {
            this.a = context;
        }

        /* JADX WARN: Code duplicated, block: B:16:0x003b  */
        /* JADX WARN: Code duplicated, block: B:17:0x0043  */
        /* JADX WARN: Code duplicated, block: B:20:0x0056  */
        public final InterfaceC7273vp a(String str) {
            Bundle bundle;
            Map<String, String> map;
            Object obj;
            if (this.b == null) {
                Context context = this.a;
                try {
                    PackageManager packageManager = context.getPackageManager();
                    if (packageManager == null) {
                        b0.e("BackendRegistry", "Context has no PackageManager.");
                    } else {
                        ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) TransportBackendDiscovery.class), UserVerificationMethods.USER_VERIFY_PATTERN);
                        if (serviceInfo == null) {
                            b0.e("BackendRegistry", "TransportBackendDiscovery has no service info.");
                        } else {
                            bundle = serviceInfo.metaData;
                        }
                        if (bundle == null) {
                            b0.e("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                            map = Collections.EMPTY_MAP;
                        } else {
                            HashMap map2 = new HashMap();
                            for (String str2 : bundle.keySet()) {
                                obj = bundle.get(str2);
                                if (!(obj instanceof String) && str2.startsWith("backend:")) {
                                    for (String str3 : ((String) obj).split(",", -1)) {
                                        String strTrim = str3.trim();
                                        if (!strTrim.isEmpty()) {
                                            map2.put(strTrim, str2.substring(8));
                                        }
                                    }
                                }
                            }
                            map = map2;
                        }
                        this.b = map;
                    }
                } catch (PackageManager.NameNotFoundException unused) {
                    b0.e("BackendRegistry", "Application info not found.");
                }
                bundle = null;
                if (bundle == null) {
                    b0.e("BackendRegistry", "Could not retrieve metadata, returning empty list of transport backends.");
                    map = Collections.EMPTY_MAP;
                } else {
                    HashMap map3 = new HashMap();
                    while (r7.hasNext()) {
                        obj = bundle.get(str2);
                        if (!(obj instanceof String)) {
                        }
                    }
                    map = map3;
                }
                this.b = map;
            }
            String str4 = this.b.get(str);
            if (str4 != null) {
                try {
                    return (InterfaceC7273vp) Class.forName(str4).asSubclass(InterfaceC7273vp.class).getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                } catch (ClassNotFoundException e) {
                    b0.f("BackendRegistry", "Class " + str4 + " is not found.", e);
                } catch (IllegalAccessException e2) {
                    b0.f("BackendRegistry", "Could not instantiate " + str4 + ".", e2);
                } catch (InstantiationException e3) {
                    b0.f("BackendRegistry", "Could not instantiate " + str4 + ".", e3);
                } catch (NoSuchMethodException e4) {
                    b0.f("BackendRegistry", "Could not instantiate ".concat(str4), e4);
                } catch (InvocationTargetException e5) {
                    b0.f("BackendRegistry", "Could not instantiate ".concat(str4), e5);
                }
            }
            return null;
        }
    }

    public C2627a01(Context context, TP tp) {
        a aVar = new a(context);
        this.c = new HashMap();
        this.a = aVar;
        this.b = tp;
    }

    @Override // defpackage.InterfaceC0921Ep
    public final synchronized U42 get(String str) {
        if (this.c.containsKey(str)) {
            return (U42) this.c.get(str);
        }
        InterfaceC7273vp interfaceC7273vpA = this.a.a(str);
        if (interfaceC7273vpA == null) {
            return null;
        }
        TP tp = this.b;
        U42 u42Create = interfaceC7273vpA.create(new C6640so(tp.a, tp.b, tp.c, str));
        this.c.put(str, u42Create);
        return u42Create;
    }
}
