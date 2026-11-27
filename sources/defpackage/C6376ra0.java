package defpackage;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.view.ViewGroup;
import com.google.android.gms.common.api.Api;
import com.jivosite.sdk.ui.views.ExpandableTextView;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: renamed from: ra0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6376ra0 extends AnimatorListenerAdapter {
    public final /* synthetic */ ExpandableTextView d;

    public C6376ra0(ExpandableTextView expandableTextView) {
        this.d = expandableTextView;
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationEnd(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int i = ExpandableTextView.p;
        ExpandableTextView expandableTextView = this.d;
        if (!expandableTextView.h() && expandableTextView.m) {
            expandableTextView.setMaxLines(2);
            expandableTextView.g();
            expandableTextView.m = false;
        }
        ViewGroup.LayoutParams layoutParams = expandableTextView.getLayoutParams();
        layoutParams.height = -2;
        expandableTextView.setLayoutParams(layoutParams);
    }

    @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
    public final void onAnimationStart(@NotNull Animator animation) {
        Intrinsics.checkNotNullParameter(animation, "animation");
        int i = ExpandableTextView.p;
        ExpandableTextView expandableTextView = this.d;
        if (!expandableTextView.h()) {
            expandableTextView.m = true;
            return;
        }
        expandableTextView.m = false;
        expandableTextView.setMaxLines(Api.BaseClientBuilder.API_PRIORITY_OTHER);
        CharSequence charSequence = expandableTextView.n;
        if (charSequence != null) {
            expandableTextView.setText(charSequence);
        } else {
            Intrinsics.l("originalText");
            throw null;
        }
    }
}
