package defpackage;

import android.transition.Transition;

/* JADX INFO: renamed from: Li0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1447Li0 implements Transition.TransitionListener {
    public final /* synthetic */ RunnableC4003gW a;

    public C1447Li0(RunnableC4003gW runnableC4003gW) {
        this.a = runnableC4003gW;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        this.a.run();
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
    }
}
