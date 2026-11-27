package defpackage;

import android.annotation.TargetApi;
import android.app.Application;
import android.content.BroadcastReceiver;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.pm.PackageManager;
import android.content.pm.ServiceInfo;
import android.os.Bundle;
import android.os.Trace;
import androidx.annotation.NonNull;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.internal.BackgroundDetector;
import com.google.android.gms.common.internal.Objects;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Base64Utils;
import com.google.android.gms.common.util.PlatformVersion;
import com.google.android.gms.common.util.ProcessUtils;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.google.firebase.FirebaseCommonRegistrar;
import com.google.firebase.components.ComponentDiscoveryService;
import com.google.firebase.components.ComponentRegistrar;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.provider.FirebaseInitProvider;
import io.sentry.android.core.b0;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;

/* JADX INFO: renamed from: Id0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1198Id0 {
    public static final Object j = new Object();
    public static final C8092zj k = new C8092zj();
    public final Context a;
    public final String b;
    public final C3193ce0 c;
    public final C7158vH d;
    public final C3980gO0<C6351rS> g;
    public final InterfaceC1612Nk1<C5941pV> h;
    public final AtomicBoolean e = new AtomicBoolean(false);
    public final AtomicBoolean f = new AtomicBoolean();
    public final CopyOnWriteArrayList i = new CopyOnWriteArrayList();

    /* JADX INFO: renamed from: Id0$a */
    @KeepForSdk
    public interface a {
        @KeepForSdk
        void onBackgroundStateChanged(boolean z);
    }

    /* JADX INFO: renamed from: Id0$b */
    @TargetApi(14)
    public static class b implements BackgroundDetector.BackgroundStateChangeListener {
        public static final AtomicReference<b> a = new AtomicReference<>();

        @Override // com.google.android.gms.common.api.internal.BackgroundDetector.BackgroundStateChangeListener
        public final void onBackgroundStateChanged(boolean z) {
            synchronized (C1198Id0.j) {
                try {
                    for (C1198Id0 c1198Id0 : new ArrayList(C1198Id0.k.values())) {
                        if (c1198Id0.e.get()) {
                            Iterator it = c1198Id0.i.iterator();
                            while (it.hasNext()) {
                                ((a) it.next()).onBackgroundStateChanged(z);
                            }
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    /* JADX INFO: renamed from: Id0$c */
    @TargetApi(ConnectionResult.API_DISABLED_FOR_CONNECTION)
    public static class c extends BroadcastReceiver {
        public static final AtomicReference<c> b = new AtomicReference<>();
        public final Context a;

        public c(Context context) {
            this.a = context;
        }

        @Override // android.content.BroadcastReceiver
        public final void onReceive(Context context, Intent intent) {
            synchronized (C1198Id0.j) {
                try {
                    Iterator it = ((AbstractC6155qW0.e) C1198Id0.k.values()).iterator();
                    while (it.hasNext()) {
                        ((C1198Id0) it.next()).e();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            this.a.unregisterReceiver(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.util.ArrayList] */
    /* JADX WARN: Type inference failed for: r0v9, types: [java.util.List] */
    public C1198Id0(C3193ce0 c3193ce0, final Context context, String str) {
        ?? arrayList;
        new CopyOnWriteArrayList();
        this.a = (Context) Preconditions.checkNotNull(context);
        this.b = Preconditions.checkNotEmpty(str);
        this.c = (C3193ce0) Preconditions.checkNotNull(c3193ce0);
        C1308Jo c1308Jo = FirebaseInitProvider.d;
        Trace.beginSection("Firebase");
        Trace.beginSection("ComponentDiscovery");
        ArrayList arrayList2 = new ArrayList();
        Bundle bundle = null;
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null) {
                b0.e("ComponentDiscovery", "Context has no PackageManager.");
            } else {
                ServiceInfo serviceInfo = packageManager.getServiceInfo(new ComponentName(context, (Class<?>) ComponentDiscoveryService.class), UserVerificationMethods.USER_VERIFY_PATTERN);
                if (serviceInfo == null) {
                    b0.e("ComponentDiscovery", ComponentDiscoveryService.class + " has no service info.");
                } else {
                    bundle = serviceInfo.metaData;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
            b0.e("ComponentDiscovery", "Application info not found.");
        }
        if (bundle == null) {
            b0.e("ComponentDiscovery", "Could not retrieve metadata, returning empty list of registrars.");
            arrayList = Collections.EMPTY_LIST;
        } else {
            arrayList = new ArrayList();
            for (String str2 : bundle.keySet()) {
                if ("com.google.firebase.components.ComponentRegistrar".equals(bundle.get(str2)) && str2.startsWith("com.google.firebase.components:")) {
                    arrayList.add(str2.substring(31));
                }
            }
        }
        for (final String str3 : arrayList) {
            arrayList2.add(new InterfaceC1612Nk1() { // from class: kH
                @Override // defpackage.InterfaceC1612Nk1
                public final Object get() {
                    String str4 = str3;
                    try {
                        Class<?> cls = Class.forName(str4);
                        if (ComponentRegistrar.class.isAssignableFrom(cls)) {
                            return (ComponentRegistrar) cls.getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
                        }
                        throw new C7354wC0("Class " + str4 + " is not an instance of com.google.firebase.components.ComponentRegistrar");
                    } catch (ClassNotFoundException unused2) {
                        b0.e("ComponentDiscovery", "Class " + str4 + " is not an found.");
                        return null;
                    } catch (IllegalAccessException e) {
                        throw new C7354wC0(C1039Gc0.d("Could not instantiate ", str4, "."), e);
                    } catch (InstantiationException e2) {
                        throw new C7354wC0(C1039Gc0.d("Could not instantiate ", str4, "."), e2);
                    } catch (NoSuchMethodException e3) {
                        throw new C7354wC0(C5491nL.c("Could not instantiate ", str4), e3);
                    } catch (InvocationTargetException e4) {
                        throw new C7354wC0(C5491nL.c("Could not instantiate ", str4), e4);
                    }
                }
            });
        }
        Trace.endSection();
        Trace.beginSection("Runtime");
        EnumC5663o82 enumC5663o82 = EnumC5663o82.d;
        ArrayList arrayList3 = new ArrayList();
        ArrayList arrayList4 = new ArrayList();
        arrayList3.addAll(arrayList2);
        final FirebaseCommonRegistrar firebaseCommonRegistrar = new FirebaseCommonRegistrar();
        arrayList3.add(new InterfaceC1612Nk1() { // from class: uH
            @Override // defpackage.InterfaceC1612Nk1
            public final Object get() {
                return firebaseCommonRegistrar;
            }
        });
        final ExecutorsRegistrar executorsRegistrar = new ExecutorsRegistrar();
        arrayList3.add(new InterfaceC1612Nk1() { // from class: uH
            @Override // defpackage.InterfaceC1612Nk1
            public final Object get() {
                return executorsRegistrar;
            }
        });
        arrayList4.add(UG.b(context, Context.class, new Class[0]));
        arrayList4.add(UG.b(this, C1198Id0.class, new Class[0]));
        arrayList4.add(UG.b(c3193ce0, C3193ce0.class, new Class[0]));
        C5689oH c5689oH = new C5689oH();
        if (C6173qb2.a(context) && FirebaseInitProvider.e.get()) {
            arrayList4.add(UG.b(c1308Jo, AP1.class, new Class[0]));
        }
        C7158vH c7158vH = new C7158vH(arrayList3, arrayList4, c5689oH);
        this.d = c7158vH;
        Trace.endSection();
        this.g = new C3980gO0<>(new InterfaceC1612Nk1() { // from class: Gd0
            @Override // defpackage.InterfaceC1612Nk1
            public final Object get() {
                C1198Id0 c1198Id0 = this.a;
                return new C6351rS(context, c1198Id0.d(), (InterfaceC2318Wk1) c1198Id0.d.a(InterfaceC2318Wk1.class));
            }
        });
        this.h = c7158vH.c(C5941pV.class);
        a aVar = new a() { // from class: Hd0
            @Override // defpackage.C1198Id0.a
            public final void onBackgroundStateChanged(boolean z) {
                C1198Id0 c1198Id0 = this.a;
                if (z) {
                    c1198Id0.getClass();
                } else {
                    c1198Id0.h.get().c();
                }
            }
        };
        a();
        if (this.e.get() && BackgroundDetector.getInstance().isInBackground()) {
            aVar.onBackgroundStateChanged(true);
        }
        this.i.add(aVar);
        Trace.endSection();
    }

    @NonNull
    public static C1198Id0 c() {
        C1198Id0 c1198Id0;
        synchronized (j) {
            try {
                c1198Id0 = (C1198Id0) k.getOrDefault("[DEFAULT]", null);
                if (c1198Id0 == null) {
                    throw new IllegalStateException("Default FirebaseApp is not initialized in this process " + ProcessUtils.getMyProcessName() + ". Make sure to call FirebaseApp.initializeApp(Context) first.");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1198Id0;
    }

    @NonNull
    public static C1198Id0 f(@NonNull C3193ce0 c3193ce0, @NonNull Context context, @NonNull String str) {
        C1198Id0 c1198Id0;
        AtomicReference<b> atomicReference = b.a;
        if (PlatformVersion.isAtLeastIceCreamSandwich() && (context.getApplicationContext() instanceof Application)) {
            Application application = (Application) context.getApplicationContext();
            AtomicReference<b> atomicReference2 = b.a;
            if (atomicReference2.get() == null) {
                b bVar = new b();
                do {
                    if (atomicReference2.compareAndSet(null, bVar)) {
                        BackgroundDetector.initialize(application);
                        BackgroundDetector.getInstance().addListener(bVar);
                        break;
                    }
                } while (atomicReference2.get() == null);
            }
        }
        String strTrim = str.trim();
        if (context.getApplicationContext() != null) {
            context = context.getApplicationContext();
        }
        synchronized (j) {
            C8092zj c8092zj = k;
            Preconditions.checkState(!c8092zj.containsKey(strTrim), "FirebaseApp name " + strTrim + " already exists!");
            Preconditions.checkNotNull(context, "Application context cannot be null.");
            c1198Id0 = new C1198Id0(c3193ce0, context, strTrim);
            c8092zj.put(strTrim, c1198Id0);
        }
        c1198Id0.e();
        return c1198Id0;
    }

    public static void g(@NonNull Context context) {
        synchronized (j) {
            try {
                if (k.containsKey("[DEFAULT]")) {
                    c();
                    return;
                }
                C3193ce0 c3193ce0A = C3193ce0.a(context);
                if (c3193ce0A == null) {
                    b0.e("FirebaseApp", "Default FirebaseApp failed to initialize because no default options were found. This usually means that com.google.gms:google-services was not applied to your gradle project.");
                } else {
                    f(c3193ce0A, context, "[DEFAULT]");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void a() {
        Preconditions.checkState(!this.f.get(), "FirebaseApp was deleted");
    }

    @KeepForSdk
    public final <T> T b(Class<T> cls) {
        a();
        return (T) this.d.a(cls);
    }

    @KeepForSdk
    public final String d() {
        StringBuilder sb = new StringBuilder();
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.b.getBytes(Charset.defaultCharset())));
        sb.append("+");
        a();
        sb.append(Base64Utils.encodeUrlSafeNoPadding(this.c.b.getBytes(Charset.defaultCharset())));
        return sb.toString();
    }

    public final void e() {
        HashMap map;
        if (!C6173qb2.a(this.a)) {
            a();
            Context context = this.a;
            AtomicReference<c> atomicReference = c.b;
            if (atomicReference.get() == null) {
                c cVar = new c(context);
                while (!atomicReference.compareAndSet(null, cVar)) {
                    if (atomicReference.get() != null) {
                        return;
                    }
                }
                context.registerReceiver(cVar, new IntentFilter("android.intent.action.USER_UNLOCKED"));
                return;
            }
            return;
        }
        a();
        C7158vH c7158vH = this.d;
        a();
        boolean zEquals = "[DEFAULT]".equals(this.b);
        AtomicReference<Boolean> atomicReference2 = c7158vH.e;
        Boolean boolValueOf = Boolean.valueOf(zEquals);
        while (!atomicReference2.compareAndSet(null, boolValueOf)) {
            if (atomicReference2.get() != null) {
                this.h.get().c();
            }
        }
        synchronized (c7158vH) {
            map = new HashMap(c7158vH.a);
        }
        c7158vH.h(map, zEquals);
        this.h.get().c();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C1198Id0)) {
            return false;
        }
        C1198Id0 c1198Id0 = (C1198Id0) obj;
        c1198Id0.a();
        return this.b.equals(c1198Id0.b);
    }

    @KeepForSdk
    public final boolean h() {
        boolean z;
        a();
        C6351rS c6351rS = this.g.get();
        synchronized (c6351rS) {
            z = c6351rS.b;
        }
        return z;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        return Objects.toStringHelper(this).add(AppMeasurementSdk.ConditionalUserProperty.NAME, this.b).add("options", this.c).toString();
    }
}
