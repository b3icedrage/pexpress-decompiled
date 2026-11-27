package io.sentry.android.replay.gestures;

import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.internal.StabilityInferred;
import defpackage.C1589Ne;
import defpackage.C2688aH1;
import defpackage.C2904bF;
import defpackage.ML0;
import defpackage.NG1;
import io.sentry.android.replay.ReplayIntegration;
import io.sentry.android.replay.capture.A;
import io.sentry.android.replay.f;
import io.sentry.android.replay.p;
import io.sentry.android.replay.q;
import io.sentry.android.replay.util.d;
import io.sentry.android.replay.z;
import io.sentry.util.C4527a;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@StabilityInferred(parameters = 0)
public final class a implements f {

    @NotNull
    public final C2688aH1 d;

    @NotNull
    public final ReplayIntegration e;

    @NotNull
    public final ArrayList<WeakReference<View>> g;

    @NotNull
    public final C4527a h;

    /* JADX INFO: renamed from: io.sentry.android.replay.gestures.a$a, reason: collision with other inner class name */
    @StabilityInferred(parameters = 0)
    public static final class C0388a extends d {

        @NotNull
        public final C2688aH1 e;

        @Nullable
        public final ReplayIntegration g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0388a(@NotNull C2688aH1 options, @Nullable ReplayIntegration replayIntegration, @Nullable Window.Callback callback) {
            super(callback);
            Intrinsics.checkNotNullParameter(options, "options");
            this.e = options;
            this.g = replayIntegration;
        }

        @Override // io.sentry.android.replay.util.d, android.view.Window.Callback
        public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
            A a;
            if (motionEvent != null) {
                MotionEvent event = MotionEvent.obtainNoHistory(motionEvent);
                Intrinsics.checkNotNullExpressionValue(event, "obtainNoHistory(...)");
                try {
                    ReplayIntegration replayIntegration = this.g;
                    Intrinsics.checkNotNullParameter(event, "event");
                    if (replayIntegration.o.get()) {
                        p pVar = replayIntegration.u;
                        if ((pVar.a == q.STARTED || pVar.a == q.RESUMED) && (a = replayIntegration.q) != null) {
                            a.d(event);
                        }
                    }
                } catch (Throwable th) {
                    try {
                        this.e.getLogger().d(NG1.ERROR, "Error dispatching touch event", th);
                    } finally {
                        event.recycle();
                    }
                }
            }
            return super.dispatchTouchEvent(motionEvent);
        }
    }

    public static final class b extends ML0 implements Function1<WeakReference<View>, Boolean> {
        public final /* synthetic */ View d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view) {
            super(1);
            this.d = view;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Boolean invoke(WeakReference<View> weakReference) {
            WeakReference<View> it = weakReference;
            Intrinsics.checkNotNullParameter(it, "it");
            return Boolean.valueOf(Intrinsics.a(it.get(), this.d));
        }
    }

    public a(@NotNull C2688aH1 options, @NotNull ReplayIntegration touchRecorderCallback) {
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(touchRecorderCallback, "touchRecorderCallback");
        this.d = options;
        this.e = touchRecorderCallback;
        this.g = new ArrayList<>();
        this.h = new C4527a();
    }

    public final void a() {
        C4527a.C0404a c0404aA = this.h.a();
        ArrayList<WeakReference<View>> arrayList = this.g;
        try {
            Iterator<WeakReference<View>> it = arrayList.iterator();
            while (it.hasNext()) {
                View view = it.next().get();
                if (view != null) {
                    Intrinsics.checkNotNull(view);
                    b(view);
                }
            }
            arrayList.clear();
            Unit unit = Unit.a;
            c0404aA.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }

    public final void b(View view) throws IllegalAccessException {
        Window windowA = z.a(view);
        if (windowA == null) {
            this.d.getLogger().a(NG1.DEBUG, "Window was null in stopGestureTracking", new Object[0]);
            return;
        }
        Window.Callback callback = windowA.getCallback();
        if (callback instanceof C0388a) {
            windowA.setCallback(((C0388a) callback).d);
        }
    }

    @Override // io.sentry.android.replay.f
    public final void c(@NotNull View root, boolean z) {
        Intrinsics.checkNotNullParameter(root, "root");
        C4527a.C0404a c0404aA = this.h.a();
        ArrayList<WeakReference<View>> arrayList = this.g;
        try {
            if (z) {
                arrayList.add(new WeakReference<>(root));
                Window windowA = z.a(root);
                C2688aH1 c2688aH1 = this.d;
                if (windowA == null) {
                    c2688aH1.getLogger().a(NG1.DEBUG, "Window is invalid, not tracking gestures", new Object[0]);
                } else {
                    Window.Callback callback = windowA.getCallback();
                    if (!(callback instanceof C0388a)) {
                        windowA.setCallback(new C0388a(c2688aH1, this.e, callback));
                    }
                }
                Unit unit = Unit.a;
            } else {
                b(root);
                C2904bF.r(arrayList, new b(root));
            }
            c0404aA.close();
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                C1589Ne.l(c0404aA, th);
                throw th2;
            }
        }
    }
}
