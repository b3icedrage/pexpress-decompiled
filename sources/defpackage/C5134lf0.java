package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import com.google.android.material.floatingactionbutton.a;
import com.google.android.material.floatingactionbutton.b;

/* JADX INFO: renamed from: lf0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5134lf0 extends AnimatorListenerAdapter {
    public boolean d;
    public final /* synthetic */ boolean e;
    public final /* synthetic */ a g;
    public final /* synthetic */ b h;

    public C5134lf0(b bVar, boolean z, a aVar) {
        this.h = bVar;
        this.e = z;
        this.g = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationCancel(Animator animator) {
        this.d = true;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(Animator animator) {
        b bVar = this.h;
        bVar.r = 0;
        bVar.l = null;
        if (this.d) {
            return;
        }
        boolean z = this.e;
        bVar.v.b(z ? 8 : 4, z);
        a aVar = this.g;
        if (aVar != null) {
            aVar.a.a(aVar.b);
        }
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(Animator animator) {
        b bVar = this.h;
        bVar.v.b(0, this.e);
        bVar.r = 1;
        bVar.l = animator;
        this.d = false;
    }
}
