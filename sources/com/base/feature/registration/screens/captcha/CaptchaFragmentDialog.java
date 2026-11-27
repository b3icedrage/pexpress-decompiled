package com.base.feature.registration.screens.captcha;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentManager;
import com.api.core.BaseFragment;
import defpackage.AbstractC1104Gy;
import defpackage.C0636Ay;
import defpackage.C1571My;
import defpackage.C1985Sf;
import defpackage.C2017Sp1;
import defpackage.C3296d7;
import defpackage.C4923kf;
import defpackage.C5560ng;
import defpackage.GP1;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/base/feature/registration/screens/captcha/CaptchaFragmentDialog;", "Lcom/api/core/BaseFragment;", "FeatureRegistrationBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public final class CaptchaFragmentDialog extends BaseFragment {

    @NotNull
    public final FragmentManager h;
    public final int i;

    @NotNull
    public final C3296d7 j;

    @NotNull
    public final C1571My k;

    @NotNull
    public final C4923kf l;

    @NotNull
    public final C0636Ay m;

    @NotNull
    public final AbstractC1104Gy.b n;

    @NotNull
    public final C5560ng o;

    @NotNull
    public final AbstractC1104Gy.c p;

    @Nullable
    public Function0<Unit> q;

    @NotNull
    public final String r;
    public boolean s;

    public CaptchaFragmentDialog(@NotNull FragmentManager manager, int i, @NotNull C3296d7 onBackPressedProvider, @NotNull C1571My binding, @NotNull C4923kf appDataRepository, @NotNull C0636Ay onCreateCallback, @NotNull AbstractC1104Gy.b onUserCancel, @NotNull C5560ng onBackgrounded, @NotNull AbstractC1104Gy.c onDismissedBySystem) {
        Intrinsics.checkNotNullParameter(manager, "manager");
        Intrinsics.checkNotNullParameter(onBackPressedProvider, "onBackPressedProvider");
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(appDataRepository, "appDataRepository");
        Intrinsics.checkNotNullParameter(onCreateCallback, "onCreateCallback");
        Intrinsics.checkNotNullParameter(onUserCancel, "onUserCancel");
        Intrinsics.checkNotNullParameter(onBackgrounded, "onBackgrounded");
        Intrinsics.checkNotNullParameter(onDismissedBySystem, "onDismissedBySystem");
        this.h = manager;
        this.i = i;
        this.j = onBackPressedProvider;
        this.k = binding;
        this.l = appDataRepository;
        this.m = onCreateCallback;
        this.n = onUserCancel;
        this.o = onBackgrounded;
        this.p = onDismissedBySystem;
        this.r = String.valueOf(C2017Sp1.a.b(CaptchaFragmentDialog.class).d());
    }

    @Override // androidx.fragment.app.Fragment
    @NotNull
    public final View onCreateView(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        GP1 gp1 = this.l.z;
        Boolean bool = Boolean.TRUE;
        gp1.getClass();
        gp1.m(null, bool);
        ConstraintLayout constraintLayout = this.k.d;
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        return constraintLayout;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        if (this.s) {
            this.s = false;
            this.j.a = this.q;
            this.p.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        GP1 gp1 = this.l.z;
        Boolean bool = Boolean.FALSE;
        gp1.getClass();
        gp1.m(null, bool);
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        if (this.s) {
            this.o.invoke();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.m.invoke(this);
        C3296d7 c3296d7 = this.j;
        this.q = c3296d7.a;
        c3296d7.a = new C1985Sf(this, 1);
    }
}
