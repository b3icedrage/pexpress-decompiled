package defpackage;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.MotionEvent;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: fR1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class ViewOnTouchListenerC3780fR1 implements View.OnTouchListener {

    @NotNull
    public final InterfaceC3570eR1 d;
    public long e;

    public ViewOnTouchListenerC3780fR1(@NotNull InterfaceC3570eR1 storyClickListener) {
        Intrinsics.checkNotNullParameter(storyClickListener, "storyClickListener");
        this.d = storyClickListener;
        this.e = -1L;
    }

    @Override // android.view.View.OnTouchListener
    @SuppressLint({"ClickableViewAccessibility"})
    public final boolean onTouch(@NotNull View v, @NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(v, "v");
        Intrinsics.checkNotNullParameter(event, "event");
        int action = event.getAction();
        InterfaceC3570eR1 interfaceC3570eR1 = this.d;
        if (action == 0) {
            interfaceC3570eR1.b();
            this.e = System.currentTimeMillis();
            return true;
        }
        if (action != 1) {
            return action != 2;
        }
        if (System.currentTimeMillis() - this.e <= 200) {
            if (event.getRawX() / v.getWidth() < 0.5d) {
                interfaceC3570eR1.a();
            } else {
                Context context = v.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                interfaceC3570eR1.f(context);
            }
        }
        interfaceC3570eR1.e();
        return true;
    }
}
