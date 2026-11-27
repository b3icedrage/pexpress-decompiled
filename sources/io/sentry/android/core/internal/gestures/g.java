package io.sentry.android.core.internal.gestures;

import android.app.Activity;
import android.os.Handler;
import android.os.Looper;
import android.view.MotionEvent;
import android.view.View;
import android.view.Window;
import androidx.core.view.GestureDetectorCompat;
import defpackage.C2688aH1;
import defpackage.NG1;
import java.util.Collections;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class g extends i {

    @NotNull
    public final Window.Callback e;

    @NotNull
    public final e g;

    @NotNull
    public final GestureDetectorCompat h;

    @Nullable
    public final C2688aH1 i;

    @NotNull
    public final f j;

    public g(@NotNull Window.Callback callback, @NotNull Activity activity, @NotNull e eVar, @Nullable C2688aH1 c2688aH1) {
        GestureDetectorCompat gestureDetectorCompat = new GestureDetectorCompat(activity, eVar, new Handler(Looper.getMainLooper()));
        f fVar = new f();
        super(callback);
        this.e = callback;
        this.g = eVar;
        this.i = c2688aH1;
        this.h = gestureDetectorCompat;
        this.j = fVar;
    }

    public final void a(@NotNull MotionEvent motionEvent) {
        String str;
        this.h.a.onTouchEvent(motionEvent);
        if (motionEvent.getActionMasked() == 1) {
            e eVar = this.g;
            View viewB = eVar.b("onUp");
            e.c cVar = eVar.k;
            io.sentry.internal.gestures.b bVar = cVar.b;
            if (viewB == null || bVar == null) {
                return;
            }
            e.b bVar2 = cVar.a;
            e.b bVar3 = e.b.Unknown;
            if (bVar2 == bVar3) {
                eVar.g.getLogger().a(NG1.DEBUG, "Unable to define scroll type. No breadcrumb captured.", new Object[0]);
                return;
            }
            float x = motionEvent.getX() - cVar.c;
            float y = motionEvent.getY() - cVar.d;
            if (Math.abs(x) > Math.abs(y)) {
                str = x > 0.0f ? "right" : "left";
            } else {
                str = y > 0.0f ? "down" : "up";
            }
            eVar.a(bVar, cVar.a, Collections.singletonMap("direction", str), motionEvent);
            eVar.c(bVar, cVar.a);
            cVar.b = null;
            cVar.a = bVar3;
            cVar.c = 0.0f;
            cVar.d = 0.0f;
        }
    }

    @Override // io.sentry.android.core.internal.gestures.i, android.view.Window.Callback
    public final boolean dispatchTouchEvent(@Nullable MotionEvent motionEvent) {
        if (motionEvent != null) {
            this.j.getClass();
            MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
            try {
                a(motionEventObtain);
            } catch (Throwable th) {
                C2688aH1 c2688aH1 = this.i;
                if (c2688aH1 != null) {
                    try {
                        c2688aH1.getLogger().d(NG1.ERROR, "Error dispatching touch event", th);
                    } finally {
                        motionEventObtain.recycle();
                    }
                }
            }
        }
        return this.d.dispatchTouchEvent(motionEvent);
    }
}
