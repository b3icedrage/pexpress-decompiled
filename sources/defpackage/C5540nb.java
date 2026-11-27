package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.Window;
import androidx.fragment.app.g;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: nb, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5540nb implements Application.ActivityLifecycleCallbacks, InterfaceC5978pf1 {
    public PackageInfo d;
    public C4693ja e;
    public MI g;

    @NotNull
    public final AtomicBoolean h = new AtomicBoolean(false);

    @NotNull
    public final AtomicInteger i = new AtomicInteger(1);

    @NotNull
    public final AtomicBoolean j = new AtomicBoolean(false);

    @Override // defpackage.InterfaceC5978pf1
    public final void a(@NotNull C3595ea amplitude) {
        PackageInfo packageInfo;
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        Intrinsics.checkNotNullParameter(amplitude, "amplitude");
        e(amplitude);
        this.e = (C4693ja) amplitude;
        MI mi = amplitude.a;
        Intrinsics.c(mi, "null cannot be cast to non-null type com.amplitude.android.Configuration");
        this.g = mi;
        Context context = mi.a;
        Intrinsics.c(context, "null cannot be cast to non-null type android.app.Application");
        Application application = (Application) context;
        PackageManager packageManager = application.getPackageManager();
        Intrinsics.checkNotNullExpressionValue(packageManager, "application.packageManager");
        try {
            packageInfo = packageManager.getPackageInfo(application.getPackageName(), 0);
            Intrinsics.checkNotNullExpressionValue(packageInfo, "{\n            packageMan…packageName, 0)\n        }");
        } catch (PackageManager.NameNotFoundException unused) {
            amplitude.l.error("Cannot find package with application.packageName: " + application.getPackageName());
            packageInfo = new PackageInfo();
        }
        this.d = packageInfo;
        application.registerActivityLifecycleCallbacks(this);
    }

    @Override // defpackage.InterfaceC5978pf1
    public final void e(@NotNull C3595ea c3595ea) {
        Intrinsics.checkNotNullParameter(c3595ea, "<set-?>");
    }

    @Override // defpackage.InterfaceC5978pf1
    @NotNull
    public final InterfaceC5978pf1.a getType() {
        return InterfaceC5978pf1.a.h;
    }

    /* JADX WARN: Code duplicated, block: B:45:0x012b  */
    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@NotNull Activity activity, @Nullable Bundle bundle) {
        JM jm;
        Intrinsics.checkNotNullParameter(activity, "activity");
        if (!this.h.getAndSet(true)) {
            MI mi = this.g;
            if (mi == null) {
                Intrinsics.l("androidConfiguration");
                throw null;
            }
            if (mi.t.contains(EnumC2012So.e)) {
                this.i.set(0);
                this.j.set(true);
                C4693ja amplitude = this.e;
                if (amplitude == null) {
                    Intrinsics.l("androidAmplitude");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(amplitude, "amplitude");
                PackageInfo packageInfo = this.d;
                if (packageInfo == null) {
                    Intrinsics.l("packageInfo");
                    throw null;
                }
                Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
                String str = packageInfo.versionName;
                String string = (Build.VERSION.SDK_INT >= 28 ? Long.valueOf(packageInfo.getLongVersionCode()) : Integer.valueOf(packageInfo.versionCode)).toString();
                LQ1 lq1G = amplitude.g();
                String strF = lq1G.f(LQ1.a.APP_VERSION);
                String strF2 = lq1G.f(LQ1.a.APP_BUILD);
                if (strF2 == null) {
                    amplitude.l("[Amplitude] Application Installed", PW0.e(new Pair("[Amplitude] Version", str), new Pair("[Amplitude] Build", string)), null);
                } else {
                    if (!Intrinsics.a(string, strF2)) {
                        Map mapE = PW0.e(new Pair("[Amplitude] Previous Version", strF), new Pair("[Amplitude] Previous Build", strF2), new Pair("[Amplitude] Version", str), new Pair("[Amplitude] Build", string));
                        jm = null;
                        amplitude.l("[Amplitude] Application Updated", mapE, null);
                    }
                    C5189lv.k(amplitude.c, amplitude.f, new C4210hV(lq1G, str, string, jm), 2);
                }
                jm = null;
                C5189lv.k(amplitude.c, amplitude.f, new C4210hV(lq1G, str, string, jm), 2);
            }
        }
        MI mi2 = this.g;
        if (mi2 == null) {
            Intrinsics.l("androidConfiguration");
            throw null;
        }
        if (mi2.t.contains(EnumC2012So.g)) {
            C4693ja amplitude2 = this.e;
            if (amplitude2 == null) {
                Intrinsics.l("androidAmplitude");
                throw null;
            }
            Intrinsics.checkNotNullParameter(amplitude2, "amplitude");
            Intrinsics.checkNotNullParameter(activity, "activity");
            Intent intent = activity.getIntent();
            if (intent != null) {
                Uri referrer = activity.getReferrer();
                String string2 = referrer != null ? referrer.toString() : null;
                Uri data = intent.getData();
                if (data != null) {
                    String string3 = data.toString();
                    Intrinsics.checkNotNullExpressionValue(string3, "uri.toString()");
                    amplitude2.l("[Amplitude] Deep Link Opened", PW0.e(new Pair("[Amplitude] Link URL", string3), new Pair("[Amplitude] Link Referrer", string2)), null);
                }
            }
        }
        MI mi3 = this.g;
        if (mi3 == null) {
            Intrinsics.l("androidConfiguration");
            throw null;
        }
        if (mi3.t.contains(EnumC2012So.h)) {
            C4693ja amplitude3 = this.e;
            if (amplitude3 == null) {
                Intrinsics.l("androidAmplitude");
                throw null;
            }
            Intrinsics.checkNotNullParameter(amplitude3, "amplitude");
            Intrinsics.checkNotNullParameter(activity, "activity");
            DS0 logger = amplitude3.l;
            if (ED.k("androidx.fragment.app.FragmentActivity", logger)) {
                WeakHashMap<g, List<C1856Qo>> weakHashMap = C2490Yh0.a;
                C3790fV track = new C3790fV(2, amplitude3, C4693ja.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8);
                Intrinsics.checkNotNullParameter(activity, "<this>");
                Intrinsics.checkNotNullParameter(track, "track");
                Intrinsics.checkNotNullParameter(logger, "logger");
                g gVar = activity instanceof g ? (g) activity : null;
                if (gVar == null) {
                    logger.a("Activity is not a FragmentActivity");
                    return;
                }
                C1856Qo c1856Qo = new C1856Qo(track, logger);
                gVar.getSupportFragmentManager().R(c1856Qo, false);
                WeakHashMap<g, List<C1856Qo>> weakHashMap2 = C2490Yh0.a;
                List<C1856Qo> arrayList = weakHashMap2.get(gVar);
                if (arrayList == null) {
                    arrayList = new ArrayList<>();
                    weakHashMap2.put(gVar, arrayList);
                }
                arrayList.add(c1856Qo);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        MI mi = this.g;
        if (mi == null) {
            Intrinsics.l("androidConfiguration");
            throw null;
        }
        if (mi.t.contains(EnumC2012So.h)) {
            C4693ja amplitude = this.e;
            if (amplitude == null) {
                Intrinsics.l("androidAmplitude");
                throw null;
            }
            Intrinsics.checkNotNullParameter(amplitude, "amplitude");
            Intrinsics.checkNotNullParameter(activity, "activity");
            DS0 logger = amplitude.l;
            if (ED.k("androidx.fragment.app.FragmentActivity", logger)) {
                WeakHashMap<g, List<C1856Qo>> weakHashMap = C2490Yh0.a;
                Intrinsics.checkNotNullParameter(activity, "<this>");
                Intrinsics.checkNotNullParameter(logger, "logger");
                g gVar = activity instanceof g ? (g) activity : null;
                if (gVar == null) {
                    logger.a("Activity is not a FragmentActivity");
                    return;
                }
                List<C1856Qo> listRemove = C2490Yh0.a.remove(gVar);
                if (listRemove != null) {
                    Iterator<C1856Qo> it = listRemove.iterator();
                    while (it.hasNext()) {
                        gVar.getSupportFragmentManager().d0(it.next());
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4693ja c4693ja = this.e;
        if (c4693ja == null) {
            Intrinsics.l("androidAmplitude");
            throw null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0612Aq c0612Aq = new C0612Aq();
        Intrinsics.checkNotNullParameter("dummy_exit_foreground", "<set-?>");
        c0612Aq.N = "dummy_exit_foreground";
        c0612Aq.c = Long.valueOf(jCurrentTimeMillis);
        c4693ja.h.d(c0612Aq);
        C5189lv.k(c4693ja.c, c4693ja.d, new C3805fa(c4693ja, null), 2);
        MI mi = this.g;
        if (mi == null) {
            Intrinsics.l("androidConfiguration");
            throw null;
        }
        if (mi.t.contains(EnumC2012So.i)) {
            C4693ja amplitude = this.e;
            if (amplitude == null) {
                Intrinsics.l("androidAmplitude");
                throw null;
            }
            Intrinsics.checkNotNullParameter(amplitude, "amplitude");
            Intrinsics.checkNotNullParameter(activity, "activity");
            Window window = activity.getWindow();
            if (window == null) {
                amplitude.l.error("Failed to stop user interaction event tracking: Activity window is null");
                return;
            }
            Window.Callback callback = window.getCallback();
            C2168Uo c2168Uo = callback instanceof C2168Uo ? (C2168Uo) callback : null;
            if (c2168Uo != null) {
                Window.Callback callback2 = c2168Uo.d;
                window.setCallback(callback2 instanceof P41 ? null : callback2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        C4693ja c4693ja = this.e;
        Unit unit = null;
        if (c4693ja == null) {
            Intrinsics.l("androidAmplitude");
            throw null;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        C0612Aq c0612Aq = new C0612Aq();
        Intrinsics.checkNotNullParameter("dummy_enter_foreground", "<set-?>");
        c0612Aq.N = "dummy_enter_foreground";
        c0612Aq.c = Long.valueOf(jCurrentTimeMillis);
        c4693ja.h.d(c0612Aq);
        MI mi = this.g;
        if (mi == null) {
            Intrinsics.l("androidConfiguration");
            throw null;
        }
        if (mi.t.contains(EnumC2012So.e) && this.i.incrementAndGet() == 1) {
            boolean z = !this.j.getAndSet(false);
            C4693ja amplitude = this.e;
            if (amplitude == null) {
                Intrinsics.l("androidAmplitude");
                throw null;
            }
            Intrinsics.checkNotNullParameter(amplitude, "amplitude");
            PackageInfo packageInfo = this.d;
            if (packageInfo == null) {
                Intrinsics.l("packageInfo");
                throw null;
            }
            Intrinsics.checkNotNullParameter(packageInfo, "packageInfo");
            amplitude.l("[Amplitude] Application Opened", PW0.e(new Pair("[Amplitude] From Background", Boolean.valueOf(z)), new Pair("[Amplitude] Version", packageInfo.versionName), new Pair("[Amplitude] Build", (Build.VERSION.SDK_INT >= 28 ? Long.valueOf(packageInfo.getLongVersionCode()) : Integer.valueOf(packageInfo.versionCode)).toString())), null);
        }
        MI mi2 = this.g;
        if (mi2 == null) {
            Intrinsics.l("androidConfiguration");
            throw null;
        }
        if (mi2.t.contains(EnumC2012So.i)) {
            C4693ja amplitude2 = this.e;
            if (amplitude2 == null) {
                Intrinsics.l("androidAmplitude");
                throw null;
            }
            Intrinsics.checkNotNullParameter(amplitude2, "amplitude");
            Intrinsics.checkNotNullParameter(activity, "activity");
            Window window = activity.getWindow();
            DS0 ds0 = amplitude2.l;
            if (window != null) {
                Window.Callback callback = window.getCallback();
                if (callback == null) {
                    callback = new P41();
                } else {
                    Intrinsics.checkNotNullExpressionValue(callback, "window.callback ?: NoCaptureWindowCallback()");
                }
                window.setCallback(new C2168Uo(callback, activity, new C4000gV(2, amplitude2, C4693ja.class, "track", "track(Ljava/lang/String;Ljava/util/Map;Lcom/amplitude/core/events/EventOptions;)Lcom/amplitude/core/Amplitude;", 8), (List) ((Function1) C7865ye2.a.getValue()).invoke(ds0), amplitude2.l));
                unit = Unit.a;
            }
            if (unit == null) {
                ds0.error("Failed to track user interaction event: Activity window is null");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@NotNull Activity activity, @NotNull Bundle bundle) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(bundle, "bundle");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@NotNull Activity activity) {
        String string;
        CharSequence charSequenceLoadLabel;
        Intrinsics.checkNotNullParameter(activity, "activity");
        MI mi = this.g;
        if (mi == null) {
            Intrinsics.l("androidConfiguration");
            throw null;
        }
        if (mi.t.contains(EnumC2012So.h)) {
            C4693ja amplitude = this.e;
            if (amplitude == null) {
                Intrinsics.l("androidAmplitude");
                throw null;
            }
            DS0 ds0 = amplitude.l;
            Intrinsics.checkNotNullParameter(amplitude, "amplitude");
            Intrinsics.checkNotNullParameter(activity, "activity");
            try {
                Intrinsics.checkNotNullParameter(activity, "<this>");
                PackageManager packageManager = activity.getPackageManager();
                ActivityInfo activityInfo = packageManager != null ? packageManager.getActivityInfo(activity.getComponentName(), UserVerificationMethods.USER_VERIFY_PATTERN) : null;
                if (activityInfo == null || (charSequenceLoadLabel = activityInfo.loadLabel(packageManager)) == null || (string = charSequenceLoadLabel.toString()) == null) {
                    string = activityInfo != null ? activityInfo.name : null;
                }
                amplitude.l("[Amplitude] Screen Viewed", OW0.b(new Pair("[Amplitude] Screen Name", string)), null);
            } catch (PackageManager.NameNotFoundException e) {
                ds0.error("Failed to get activity info: " + e);
            } catch (Exception e2) {
                ds0.error("Failed to track screen viewed event: " + e2);
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        MI mi = this.g;
        if (mi == null) {
            Intrinsics.l("androidConfiguration");
            throw null;
        }
        if (mi.t.contains(EnumC2012So.e) && this.i.decrementAndGet() == 0) {
            C4693ja amplitude = this.e;
            if (amplitude == null) {
                Intrinsics.l("androidAmplitude");
                throw null;
            }
            Intrinsics.checkNotNullParameter(amplitude, "amplitude");
            amplitude.l("[Amplitude] Application Backgrounded", null, null);
        }
    }
}
