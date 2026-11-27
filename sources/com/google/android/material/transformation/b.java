package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.graphics.drawable.Drawable;
import defpackage.InterfaceC7564xC;

/* JADX INFO: loaded from: classes.dex */
public final class b extends AnimatorListenerAdapter {
    public final /* synthetic */ InterfaceC7564xC d;
    public final /* synthetic */ Drawable e;

    public b(InterfaceC7564xC interfaceC7564xC, Drawable drawable) {
        this.d = interfaceC7564xC;
        this.e = drawable;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        this.d.setCircularRevealOverlayDrawable(null);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        this.d.setCircularRevealOverlayDrawable(this.e);
    }
}
