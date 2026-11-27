package androidx.fragment.app;

import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import androidx.fragment.app.d;
import java.util.Objects;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
public final class f implements Animation.AnimationListener {
    public final /* synthetic */ s.b a;
    public final /* synthetic */ d b;
    public final /* synthetic */ View c;
    public final /* synthetic */ d.a d;

    public f(View view, d.a aVar, d dVar, s.b bVar) {
        this.a = bVar;
        this.b = dVar;
        this.c = view;
        this.d = aVar;
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationEnd(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        final d dVar = this.b;
        ViewGroup viewGroup = dVar.a;
        final d.a aVar = this.d;
        final View view = this.c;
        viewGroup.post(new Runnable() { // from class: iW
            @Override // java.lang.Runnable
            public final void run() {
                d this$0 = dVar;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                d.a animationInfo = aVar;
                Intrinsics.checkNotNullParameter(animationInfo, "$animationInfo");
                this$0.a.endViewTransition(view);
                animationInfo.a();
            }
        });
        if (FragmentManager.G(2)) {
            Objects.toString(this.a);
        }
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationRepeat(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
    }

    @Override // android.view.animation.Animation.AnimationListener
    public final void onAnimationStart(@NotNull Animation animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        if (FragmentManager.G(2)) {
            Objects.toString(this.a);
        }
    }
}
