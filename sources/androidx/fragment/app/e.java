package androidx.fragment.app;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class e extends AnimatorListenerAdapter {
    public final /* synthetic */ d d;
    public final /* synthetic */ View e;
    public final /* synthetic */ boolean g;
    public final /* synthetic */ s.b h;
    public final /* synthetic */ d.a i;

    public e(d dVar, View view, boolean z, s.b bVar, d.a aVar) {
        this.d = dVar;
        this.e = view;
        this.g = z;
        this.h = bVar;
        this.i = aVar;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator anim) {
        Intrinsics.checkNotNullParameter(anim, "anim");
        ViewGroup viewGroup = this.d.a;
        View viewToAnimate = this.e;
        viewGroup.endViewTransition(viewToAnimate);
        boolean z = this.g;
        s.b bVar = this.h;
        if (z) {
            s.b.EnumC0232b enumC0232b = bVar.a;
            Intrinsics.checkNotNullExpressionValue(viewToAnimate, "viewToAnimate");
            enumC0232b.b(viewToAnimate);
        }
        this.i.a();
        if (FragmentManager.G(2)) {
            Objects.toString(bVar);
        }
    }
}
