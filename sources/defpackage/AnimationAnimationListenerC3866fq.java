package defpackage;

import android.view.animation.Animation;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: fq, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class AnimationAnimationListenerC3866fq implements Animation.AnimationListener {
    public final /* synthetic */ ViewOnTouchListenerC3656eq a;

    public AnimationAnimationListenerC3866fq(ViewOnTouchListenerC3656eq viewOnTouchListenerC3656eq) {
        this.a = viewOnTouchListenerC3656eq;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        ViewOnTouchListenerC3656eq viewOnTouchListenerC3656eq = this.a;
        viewOnTouchListenerC3656eq.setVisibility(8);
        viewOnTouchListenerC3656eq.z.postDelayed(new RunnableC2818aq(viewOnTouchListenerC3656eq, 0), 200L);
        viewOnTouchListenerC3656eq.getDismissType();
        InterfaceC4286hq interfaceC4286hq = viewOnTouchListenerC3656eq.w;
        if (interfaceC4286hq != null) {
            Intrinsics.checkNotNull(interfaceC4286hq);
            interfaceC4286hq.onDismiss();
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }
}
