package io.sentry.android.core;

import android.app.Activity;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.C0841Do0;
import defpackage.C2234Vk;
import defpackage.EG1;
import defpackage.N80;
import defpackage.NG1;
import io.sentry.ILogger;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewHierarchyEventProcessor implements N80 {

    @NotNull
    public final SentryAndroidOptions d;

    @NotNull
    public final io.sentry.android.core.internal.util.i e;

    public ViewHierarchyEventProcessor(@NotNull SentryAndroidOptions sentryAndroidOptions) {
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.d = sentryAndroidOptions;
        this.e = new io.sentry.android.core.internal.util.i(3, 2000L);
        if (sentryAndroidOptions.isAttachViewHierarchy()) {
            io.sentry.util.j.a("ViewHierarchy");
        }
    }

    public static void a(@NotNull View view, @NotNull io.sentry.protocol.H h, @NotNull List<io.sentry.internal.viewhierarchy.a> list) {
        if (view instanceof ViewGroup) {
            Iterator<io.sentry.internal.viewhierarchy.a> it = list.iterator();
            while (it.hasNext()) {
                if (it.next().a()) {
                    return;
                }
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            if (childCount == 0) {
                return;
            }
            ArrayList arrayList = new ArrayList(childCount);
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt != null) {
                    io.sentry.protocol.H hB = b(childAt);
                    arrayList.add(hB);
                    a(childAt, hB, list);
                }
            }
            h.o = arrayList;
        }
    }

    @NotNull
    public static io.sentry.protocol.H b(@NotNull View view) {
        io.sentry.protocol.H h = new io.sentry.protocol.H();
        h.e = io.sentry.android.core.internal.util.f.a(view);
        try {
            h.g = io.sentry.android.core.internal.gestures.h.b(view);
        } catch (Throwable unused) {
        }
        h.k = Double.valueOf(view.getX());
        h.l = Double.valueOf(view.getY());
        h.i = Double.valueOf(view.getWidth());
        h.j = Double.valueOf(view.getHeight());
        h.n = Double.valueOf(view.getAlpha());
        int visibility = view.getVisibility();
        if (visibility == 0) {
            h.m = "visible";
        } else if (visibility == 4) {
            h.m = "invisible";
        } else if (visibility == 8) {
            h.m = "gone";
        }
        return h;
    }

    @Override // defpackage.N80
    @NotNull
    public final EG1 f(@NotNull EG1 eg1, @NotNull C0841Do0 c0841Do0) {
        if (eg1.f()) {
            SentryAndroidOptions sentryAndroidOptions = this.d;
            if (!sentryAndroidOptions.isAttachViewHierarchy()) {
                sentryAndroidOptions.getLogger().a(NG1.DEBUG, "attachViewHierarchy is disabled.", new Object[0]);
                return eg1;
            }
            if (!io.sentry.util.g.c(c0841Do0)) {
                boolean zA = this.e.a();
                sentryAndroidOptions.getBeforeViewHierarchyCaptureCallback();
                if (!zA) {
                    WeakReference<Activity> weakReference = G.b.a;
                    io.sentry.protocol.G g = null;
                    Activity activity = weakReference != null ? weakReference.get() : null;
                    final List<io.sentry.internal.viewhierarchy.a> viewHierarchyExporters = sentryAndroidOptions.getViewHierarchyExporters();
                    io.sentry.util.thread.a threadChecker = sentryAndroidOptions.getThreadChecker();
                    final ILogger logger = sentryAndroidOptions.getLogger();
                    if (activity == null) {
                        logger.a(NG1.INFO, "Missing activity for view hierarchy snapshot.", new Object[0]);
                    } else {
                        Window window = activity.getWindow();
                        if (window == null) {
                            logger.a(NG1.INFO, "Missing window for view hierarchy snapshot.", new Object[0]);
                        } else {
                            final View viewPeekDecorView = window.peekDecorView();
                            if (viewPeekDecorView == null) {
                                logger.a(NG1.INFO, "Missing decor view for view hierarchy snapshot.", new Object[0]);
                            } else {
                                try {
                                    if (threadChecker.c()) {
                                        ArrayList arrayList = new ArrayList(1);
                                        io.sentry.protocol.G g2 = new io.sentry.protocol.G("android_view_system", arrayList);
                                        io.sentry.protocol.H hB = b(viewPeekDecorView);
                                        arrayList.add(hB);
                                        a(viewPeekDecorView, hB, viewHierarchyExporters);
                                        g = g2;
                                    } else {
                                        final CountDownLatch countDownLatch = new CountDownLatch(1);
                                        final AtomicReference atomicReference = new AtomicReference(null);
                                        activity.runOnUiThread(new Runnable() { // from class: io.sentry.android.core.e0
                                            @Override // java.lang.Runnable
                                            public final void run() {
                                                AtomicReference atomicReference2 = atomicReference;
                                                View view = viewPeekDecorView;
                                                List list = viewHierarchyExporters;
                                                CountDownLatch countDownLatch2 = countDownLatch;
                                                try {
                                                    ArrayList arrayList2 = new ArrayList(1);
                                                    io.sentry.protocol.G g3 = new io.sentry.protocol.G("android_view_system", arrayList2);
                                                    io.sentry.protocol.H hB2 = ViewHierarchyEventProcessor.b(view);
                                                    arrayList2.add(hB2);
                                                    ViewHierarchyEventProcessor.a(view, hB2, list);
                                                    atomicReference2.set(g3);
                                                    countDownLatch2.countDown();
                                                } catch (Throwable th) {
                                                    logger.d(NG1.ERROR, "Failed to process view hierarchy.", th);
                                                }
                                            }
                                        });
                                        if (countDownLatch.await(1000L, TimeUnit.MILLISECONDS)) {
                                            g = (io.sentry.protocol.G) atomicReference.get();
                                        }
                                    }
                                } catch (Throwable th) {
                                    logger.d(NG1.ERROR, "Failed to process view hierarchy.", th);
                                }
                            }
                        }
                    }
                    if (g != null) {
                        c0841Do0.e = new C2234Vk(g);
                    }
                }
            }
        }
        return eg1;
    }

    @Override // defpackage.N80
    @NotNull
    public final io.sentry.protocol.B g(@NotNull io.sentry.protocol.B b, @NotNull C0841Do0 c0841Do0) {
        return b;
    }
}
