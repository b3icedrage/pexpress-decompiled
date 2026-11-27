package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.floatingactionbutton.b;

/* JADX INFO: renamed from: mf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5347mf0 extends AnimatorListenerAdapter {
    public final /* synthetic */ boolean d;
    public final /* synthetic */ a e;
    public final /* synthetic */ b g;

    public C5347mf0(b bVar, boolean z, a aVar) {
        this.g = bVar;
        this.d = z;
        this.e = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b bVar = this.g;
        bVar.r = 0;
        bVar.l = null;
        a aVar = this.e;
        if (aVar != null) {
            aVar.a.b();
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        b bVar = this.g;
        bVar.v.b(0, this.d);
        bVar.r = 2;
        bVar.l = animator;
    }
}
