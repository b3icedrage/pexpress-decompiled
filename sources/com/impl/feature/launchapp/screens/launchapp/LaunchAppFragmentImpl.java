package com.impl.feature.launchapp.screens.launchapp;

import android.graphics.drawable.Animatable;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.ImageView;
import com.base.feature.launchapp.screens.launchapp.LaunchAppFragmentBase;
import com.pexpress.tool.R;
import defpackage.C2879b71;
import defpackage.InterfaceC2394Xb0;
import defpackage.InterfaceC5569ni0;
import defpackage.InterfaceC6856tq;
import defpackage.Sd2;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/impl/feature/launchapp/screens/launchapp/LaunchAppFragmentImpl;", "Lcom/base/feature/launchapp/screens/launchapp/LaunchAppFragmentBase;", "FeatureLaunchAppImpl_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class LaunchAppFragmentImpl extends LaunchAppFragmentBase {

    @NotNull
    public final InterfaceC5569ni0 o;

    @Nullable
    public final Integer p;
    public final long q;
    public int r;

    public static final class a implements Animation.AnimationListener {
        public a() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
            Intrinsics.checkNotNullParameter(animation, "animation");
            View view = LaunchAppFragmentImpl.this.getView();
            if (view != null) {
                view.setLayerType(0, null);
            }
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LaunchAppFragmentImpl(@NotNull Sd2 viewModelFactory, @NotNull InterfaceC2394Xb0 callback, @NotNull InterfaceC5569ni0 binding, @NotNull C2879b71 notificationsPermissionUseCase) {
        super(viewModelFactory, callback, binding, notificationsPermissionUseCase);
        Intrinsics.checkNotNullParameter(viewModelFactory, "viewModelFactory");
        Intrinsics.checkNotNullParameter(callback, "callback");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(notificationsPermissionUseCase, "notificationsPermissionUseCase");
        this.o = binding;
        this.p = Integer.valueOf(R.color.background);
        this.q = 1000L;
    }

    @Override // com.api.core.BaseFragment
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getP() {
        return this.p;
    }

    @Override // com.api.core.BindingFragment
    public final InterfaceC6856tq k() {
        return this.o;
    }

    @Override // androidx.fragment.app.Fragment
    @Nullable
    public final Animation onCreateAnimation(int i, boolean z, int i2) {
        Animation animationOnCreateAnimation = super.onCreateAnimation(i, z, i2);
        if (animationOnCreateAnimation != null) {
            requireView().setLayerType(2, null);
            animationOnCreateAnimation.setAnimationListener(new a());
        }
        return animationOnCreateAnimation;
    }

    @Override // com.base.feature.launchapp.screens.launchapp.LaunchAppFragmentBase, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        InterfaceC5569ni0 interfaceC5569ni0 = this.o;
        interfaceC5569ni0.N().setLayerType(2, null);
        ImageView imageViewN = interfaceC5569ni0.N();
        Intrinsics.checkNotNullParameter(imageViewN, "<this>");
        Object drawable = imageViewN.getDrawable();
        Animatable animatable = drawable instanceof Animatable ? (Animatable) drawable : null;
        if (animatable != null) {
            animatable.start();
        }
    }
}
