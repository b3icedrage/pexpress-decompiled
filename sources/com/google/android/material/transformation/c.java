package com.google.android.material.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import defpackage.InterfaceC7564xC;

/* JADX INFO: loaded from: classes.dex */
public final class c extends AnimatorListenerAdapter {
    public final /* synthetic */ InterfaceC7564xC d;

    public c(InterfaceC7564xC interfaceC7564xC) {
        this.d = interfaceC7564xC;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        InterfaceC7564xC interfaceC7564xC = this.d;
        InterfaceC7564xC.d revealInfo = interfaceC7564xC.getRevealInfo();
        revealInfo.c = Float.MAX_VALUE;
        interfaceC7564xC.setRevealInfo(revealInfo);
    }
}
