package defpackage;

import android.view.MotionEvent;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: kR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4876kR implements R81 {

    @NotNull
    public final C7734y11 a;
    public boolean b;

    public C4876kR(@NotNull C7734y11 lastActionTime) {
        Intrinsics.checkNotNullParameter(lastActionTime, "lastActionTime");
        this.a = lastActionTime;
    }

    @Override // defpackage.R81
    public final void a(@NotNull MotionEvent me) {
        Intrinsics.checkNotNullParameter(me, "me");
        i();
    }

    @Override // defpackage.R81
    public final void b(@NotNull MotionEvent me, @NotNull PA.a lastPerformedGesture) {
        Intrinsics.checkNotNullParameter(me, "me");
        Intrinsics.checkNotNullParameter(lastPerformedGesture, "lastPerformedGesture");
        this.b = false;
        i();
    }

    @Override // defpackage.R81
    public final void c(@NotNull MotionEvent me) {
        Intrinsics.checkNotNullParameter(me, "me");
        i();
    }

    @Override // defpackage.R81
    public final void d(@NotNull MotionEvent me) {
        Intrinsics.checkNotNullParameter(me, "me");
        i();
    }

    @Override // defpackage.R81
    public final void e(@NotNull MotionEvent me) {
        Intrinsics.checkNotNullParameter(me, "me");
    }

    @Override // defpackage.R81
    public final void f(@NotNull MotionEvent me) {
        Intrinsics.checkNotNullParameter(me, "me");
        i();
    }

    @Override // defpackage.R81
    public final void g(@NotNull MotionEvent me1, @NotNull MotionEvent me2) {
        Intrinsics.checkNotNullParameter(me1, "me1");
        Intrinsics.checkNotNullParameter(me2, "me2");
    }

    @Override // defpackage.R81
    public final void h(@NotNull MotionEvent me, @NotNull PA.a lastPerformedGesture) {
        Intrinsics.checkNotNullParameter(me, "me");
        Intrinsics.checkNotNullParameter(lastPerformedGesture, "lastPerformedGesture");
        this.b = true;
        i();
    }

    public final void i() {
        if (this.b) {
            this.a.invoke(Long.valueOf(System.currentTimeMillis()));
        }
    }
}
