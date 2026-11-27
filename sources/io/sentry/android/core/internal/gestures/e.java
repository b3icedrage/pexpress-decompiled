package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import defpackage.C0663Bh;
import defpackage.C0702Bu;
import defpackage.C0841Do0;
import defpackage.C1039Gc0;
import defpackage.C4804k42;
import defpackage.C5437n42;
import defpackage.C7680xl;
import defpackage.EnumC4869kO1;
import defpackage.InterfaceC1015Fu0;
import defpackage.InterfaceC4302hv0;
import defpackage.KD1;
import defpackage.MD1;
import defpackage.NG1;
import defpackage.SD1;
import io.sentry.ILogger;
import io.sentry.android.core.SentryAndroidOptions;
import io.sentry.protocol.E;
import io.sentry.util.p;
import java.lang.ref.WeakReference;
import java.util.Collections;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class e implements GestureDetector.OnGestureListener {

    @NotNull
    public final WeakReference<Activity> d;

    @NotNull
    public final SD1 e;

    @NotNull
    public final SentryAndroidOptions g;

    @Nullable
    public io.sentry.internal.gestures.b h = null;

    @Nullable
    public InterfaceC4302hv0 i = null;

    @NotNull
    public b j;
    public final c k;

    public static /* synthetic */ class a {
        public static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[b.values().length];
            a = iArr;
            try {
                iArr[b.Click.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[b.Scroll.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[b.Swipe.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[b.Unknown.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
        }
    }

    public enum b {
        Click,
        Scroll,
        Swipe,
        Unknown
    }

    public static final class c {

        @NotNull
        public b a;

        @Nullable
        public io.sentry.internal.gestures.b b;
        public float c;
        public float d;
    }

    public e(@NotNull Activity activity, @NotNull SD1 sd1, @NotNull SentryAndroidOptions sentryAndroidOptions) {
        b bVar = b.Unknown;
        this.j = bVar;
        c cVar = new c();
        cVar.a = bVar;
        cVar.c = 0.0f;
        cVar.d = 0.0f;
        this.k = cVar;
        this.d = new WeakReference<>(activity);
        this.e = sd1;
        this.g = sentryAndroidOptions;
    }

    public final void a(@NotNull io.sentry.internal.gestures.b bVar, @NotNull b bVar2, @NotNull Map<String, Object> map, @NotNull MotionEvent motionEvent) {
        String str;
        if (this.g.isEnableUserInteractionBreadcrumbs()) {
            int i = a.a[bVar2.ordinal()];
            if (i == 1) {
                str = "click";
            } else if (i != 2) {
                str = i != 3 ? "unknown" : "swipe";
            } else {
                str = "scroll";
            }
            C0841Do0 c0841Do0 = new C0841Do0();
            c0841Do0.d(motionEvent, "android:motionEvent");
            c0841Do0.d(bVar.a.get(), "android:view");
            C0702Bu c0702Bu = new C0702Bu();
            c0702Bu.i = "user";
            c0702Bu.k = "ui.".concat(str);
            String str2 = bVar.c;
            if (str2 != null) {
                c0702Bu.f(str2, "view.id");
            }
            String str3 = bVar.b;
            if (str3 != null) {
                c0702Bu.f(str3, "view.class");
            }
            for (Map.Entry<String, Object> entry : map.entrySet()) {
                c0702Bu.j.put(entry.getKey(), entry.getValue());
            }
            c0702Bu.m = NG1.INFO;
            this.e.l(c0702Bu, c0841Do0);
        }
    }

    @Nullable
    public final View b(@NotNull String str) {
        Activity activity = this.d.get();
        SentryAndroidOptions sentryAndroidOptions = this.g;
        if (activity == null) {
            sentryAndroidOptions.getLogger().a(NG1.DEBUG, C1039Gc0.d("Activity is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        Window window = activity.getWindow();
        if (window == null) {
            sentryAndroidOptions.getLogger().a(NG1.DEBUG, C1039Gc0.d("Window is null in ", str, ". No breadcrumb captured."), new Object[0]);
            return null;
        }
        View viewPeekDecorView = window.peekDecorView();
        if (viewPeekDecorView != null) {
            return viewPeekDecorView;
        }
        sentryAndroidOptions.getLogger().a(NG1.DEBUG, C1039Gc0.d("DecorView is null in ", str, ". No breadcrumb captured."), new Object[0]);
        return null;
    }

    public final void c(@NotNull io.sentry.internal.gestures.b bVar, @NotNull b bVar2) {
        String str;
        boolean z = bVar2 == b.Click || !(bVar2 == this.j && bVar.equals(this.h));
        SentryAndroidOptions sentryAndroidOptions = this.g;
        boolean zIsTracingEnabled = sentryAndroidOptions.isTracingEnabled();
        SD1 sd1 = this.e;
        if (!zIsTracingEnabled || !sentryAndroidOptions.isEnableUserInteractionTracing()) {
            if (z) {
                if (sentryAndroidOptions.isEnableAutoTraceIdGeneration()) {
                    sd1.A(null, new C0663Bh());
                }
                this.h = bVar;
                this.j = bVar2;
                return;
            }
            return;
        }
        Activity activity = this.d.get();
        if (activity == null) {
            sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Activity is null, no transaction captured.", new Object[0]);
            return;
        }
        String str2 = bVar.c;
        if (str2 == null) {
            p.b(null, "UiElement.tag can't be null");
            str2 = null;
        }
        InterfaceC4302hv0 interfaceC4302hv0 = this.i;
        if (interfaceC4302hv0 != null) {
            if (!z && !interfaceC4302hv0.e()) {
                sentryAndroidOptions.getLogger().a(NG1.DEBUG, C1039Gc0.d("The view with id: ", str2, " already has an ongoing transaction assigned. Rescheduling finish"), new Object[0]);
                if (sentryAndroidOptions.getIdleTimeout() != null) {
                    this.i.u();
                    return;
                }
                return;
            }
            d(EnumC4869kO1.OK);
        }
        String str3 = activity.getClass().getSimpleName() + "." + str2;
        int i = a.a[bVar2.ordinal()];
        if (i == 1) {
            str = "click";
        } else if (i != 2) {
            str = i != 3 ? "unknown" : "swipe";
        } else {
            str = "scroll";
        }
        String strConcat = "ui.action.".concat(str);
        C5437n42 c5437n42 = new C5437n42();
        c5437n42.f = true;
        long deadlineTimeout = sentryAndroidOptions.getDeadlineTimeout();
        c5437n42.h = deadlineTimeout <= 0 ? null : Long.valueOf(deadlineTimeout);
        c5437n42.g = sentryAndroidOptions.getIdleTimeout();
        c5437n42.c = true;
        c5437n42.d = "auto.ui.gesture_listener." + bVar.d;
        final InterfaceC4302hv0 interfaceC4302hv0B = sd1.B(new C4804k42(str3, E.COMPONENT, strConcat, null), c5437n42);
        sd1.A(null, new MD1() { // from class: io.sentry.android.core.internal.gestures.c
            @Override // defpackage.MD1
            public final void e(final InterfaceC1015Fu0 interfaceC1015Fu0) {
                final e eVar = this.d;
                eVar.getClass();
                final InterfaceC4302hv0 interfaceC4302hv1 = interfaceC4302hv0B;
                interfaceC1015Fu0.G(new KD1.c() { // from class: io.sentry.android.core.internal.gestures.d
                    @Override // KD1.c
                    public final void a(InterfaceC4302hv0 interfaceC4302hv2) {
                        e eVar2 = eVar;
                        InterfaceC4302hv0 interfaceC4302hv3 = interfaceC4302hv1;
                        if (interfaceC4302hv2 != null) {
                            eVar2.g.getLogger().a(NG1.DEBUG, "Transaction '%s' won't be bound to the Scope since there's one already in there.", interfaceC4302hv3.getName());
                        } else {
                            eVar2.getClass();
                            interfaceC1015Fu0.B(interfaceC4302hv3);
                        }
                    }
                });
            }
        });
        this.i = interfaceC4302hv0B;
        this.h = bVar;
        this.j = bVar2;
    }

    public final void d(@NotNull EnumC4869kO1 enumC4869kO1) {
        InterfaceC4302hv0 interfaceC4302hv0 = this.i;
        if (interfaceC4302hv0 != null) {
            if (interfaceC4302hv0.getStatus() == null) {
                this.i.A(enumC4869kO1);
            } else {
                this.i.l();
            }
        }
        this.e.A(null, new C7680xl(this));
        this.i = null;
        if (this.h != null) {
            this.h = null;
        }
        this.j = b.Unknown;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onDown(@Nullable MotionEvent motionEvent) {
        if (motionEvent == null) {
            return false;
        }
        c cVar = this.k;
        cVar.b = null;
        cVar.a = b.Unknown;
        cVar.c = 0.0f;
        cVar.d = 0.0f;
        cVar.c = motionEvent.getX();
        cVar.d = motionEvent.getY();
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onFling(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f, float f2) {
        this.k.a = b.Swipe;
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onLongPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(@Nullable MotionEvent motionEvent, @Nullable MotionEvent motionEvent2, float f, float f2) {
        View viewB = b("onScroll");
        if (viewB != null && motionEvent != null) {
            c cVar = this.k;
            if (cVar.a == b.Unknown) {
                float x = motionEvent.getX();
                float y = motionEvent.getY();
                io.sentry.internal.gestures.b.a aVar = io.sentry.internal.gestures.b.a.SCROLLABLE;
                SentryAndroidOptions sentryAndroidOptions = this.g;
                io.sentry.internal.gestures.b bVarA = h.a(sentryAndroidOptions, viewB, x, y, aVar);
                if (bVarA == null) {
                    sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Unable to find scroll target. No breadcrumb captured.", new Object[0]);
                    cVar.a = b.Scroll;
                    return false;
                }
                ILogger logger = sentryAndroidOptions.getLogger();
                NG1 ng1 = NG1.DEBUG;
                StringBuilder sb = new StringBuilder("Scroll target found: ");
                String str = bVarA.c;
                if (str == null) {
                    p.b(null, "UiElement.tag can't be null");
                    str = null;
                }
                sb.append(str);
                logger.a(ng1, sb.toString(), new Object[0]);
                cVar.b = bVarA;
                cVar.a = b.Scroll;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final void onShowPress(MotionEvent motionEvent) {
    }

    @Override // android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(@Nullable MotionEvent motionEvent) {
        View viewB = b("onSingleTapUp");
        if (viewB != null && motionEvent != null) {
            float x = motionEvent.getX();
            float y = motionEvent.getY();
            io.sentry.internal.gestures.b.a aVar = io.sentry.internal.gestures.b.a.CLICKABLE;
            SentryAndroidOptions sentryAndroidOptions = this.g;
            io.sentry.internal.gestures.b bVarA = h.a(sentryAndroidOptions, viewB, x, y, aVar);
            if (bVarA == null) {
                sentryAndroidOptions.getLogger().a(NG1.DEBUG, "Unable to find click target. No breadcrumb captured.", new Object[0]);
                return false;
            }
            b bVar = b.Click;
            a(bVarA, bVar, Collections.EMPTY_MAP, motionEvent);
            c(bVarA, bVar);
        }
        return false;
    }
}
