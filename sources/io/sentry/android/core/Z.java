package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.SystemClock;
import defpackage.C2688aH1;
import defpackage.C3043bv;
import defpackage.InterfaceC1171Hu0;
import defpackage.NG1;
import defpackage.OB0;
import defpackage.QF1;
import defpackage.VI1;
import io.sentry.android.fragment.FragmentLifecycleIntegration;
import io.sentry.android.timber.SentryTimberIntegration;
import io.sentry.util.C4527a;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class Z {
    public static final long a = SystemClock.uptimeMillis();

    @NotNull
    public static final C4527a b = new C4527a();

    public static void a(@NotNull C2688aH1 c2688aH1, boolean z, boolean z2) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        for (OB0 ob0 : c2688aH1.getIntegrations()) {
            if (z && (ob0 instanceof FragmentLifecycleIntegration)) {
                arrayList2.add(ob0);
            }
            if (z2 && (ob0 instanceof SentryTimberIntegration)) {
                arrayList.add(ob0);
            }
            if (ob0 instanceof SystemEventsBreadcrumbsIntegration) {
                arrayList3.add(ob0);
            }
        }
        if (arrayList2.size() > 1) {
            for (int i = 0; i < arrayList2.size() - 1; i++) {
                c2688aH1.getIntegrations().remove((OB0) arrayList2.get(i));
            }
        }
        if (arrayList.size() > 1) {
            for (int i2 = 0; i2 < arrayList.size() - 1; i2++) {
                c2688aH1.getIntegrations().remove((OB0) arrayList.get(i2));
            }
        }
        if (arrayList3.size() > 1) {
            for (int i3 = 0; i3 < arrayList3.size() - 1; i3++) {
                c2688aH1.getIntegrations().remove((OB0) arrayList3.get(i3));
            }
        }
    }

    @SuppressLint({"NewApi"})
    public static void b(@NotNull QF1.a aVar, @NotNull Context context, @NotNull C4502m c4502m) {
        try {
            C4527a.C0404a c0404aA = b.a();
            try {
                QF1.g(new C3043bv(), new Y(aVar, context, c4502m));
                InterfaceC1171Hu0 interfaceC1171Hu0E = QF1.e();
                if (F.e()) {
                    if (interfaceC1171Hu0E.p().isEnableAutoSessionTracking()) {
                        AtomicBoolean atomicBoolean = new AtomicBoolean(false);
                        interfaceC1171Hu0E.y(new VI1(atomicBoolean));
                        if (!atomicBoolean.get()) {
                            interfaceC1171Hu0E.t();
                        }
                    }
                    interfaceC1171Hu0E.p().getReplayController().p();
                }
                c0404aA.close();
            } catch (Throwable th) {
                try {
                    c0404aA.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (IllegalAccessException e) {
            c4502m.d(NG1.FATAL, "Fatal error during SentryAndroid.init(...)", e);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e);
        } catch (InstantiationException e2) {
            c4502m.d(NG1.FATAL, "Fatal error during SentryAndroid.init(...)", e2);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e2);
        } catch (NoSuchMethodException e3) {
            c4502m.d(NG1.FATAL, "Fatal error during SentryAndroid.init(...)", e3);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e3);
        } catch (InvocationTargetException e4) {
            c4502m.d(NG1.FATAL, "Fatal error during SentryAndroid.init(...)", e4);
            throw new RuntimeException("Failed to initialize Sentry's SDK", e4);
        }
    }
}
