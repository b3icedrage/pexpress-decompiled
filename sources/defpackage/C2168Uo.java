package defpackage;

import android.app.Activity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.Window;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Uo, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2168Uo extends Qi2 {

    @NotNull
    public final DS0 e;

    @NotNull
    public final C2090To g;

    @NotNull
    public final GestureDetector h;

    public C2168Uo() {
        throw null;
    }

    public C2168Uo(Window.Callback delegate, Activity activity, C4000gV track, List viewTargetLocators, DS0 logger) {
        C2090To motionEventObtainer = new C2090To();
        GestureDetectorOnGestureListenerC1934Ro gestureListener = new GestureDetectorOnGestureListenerC1934Ro(activity, track, logger, viewTargetLocators);
        GestureDetector gestureDetector = new GestureDetector(activity, gestureListener);
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(track, "track");
        Intrinsics.checkNotNullParameter(viewTargetLocators, "viewTargetLocators");
        Intrinsics.checkNotNullParameter(logger, "logger");
        Intrinsics.checkNotNullParameter(motionEventObtainer, "motionEventObtainer");
        Intrinsics.checkNotNullParameter(gestureListener, "gestureListener");
        Intrinsics.checkNotNullParameter(gestureDetector, "gestureDetector");
        super(delegate);
        this.e = logger;
        this.g = motionEventObtainer;
        this.h = gestureDetector;
    }

    @Override // android.view.Window.Callback
    public final boolean dispatchTouchEvent(@Nullable MotionEvent origin) {
        if (origin != null) {
            this.g.getClass();
            Intrinsics.checkNotNullParameter(origin, "origin");
            MotionEvent motionEventObtain = MotionEvent.obtain(origin);
            Intrinsics.checkNotNullExpressionValue(motionEventObtain, "obtain(origin)");
            try {
                try {
                    this.h.onTouchEvent(motionEventObtain);
                } catch (Exception e) {
                    this.e.error("Error handling touch event: " + e);
                    Unit unit = Unit.a;
                }
            } finally {
                motionEventObtain.recycle();
            }
        }
        return this.d.dispatchTouchEvent(origin);
    }
}
