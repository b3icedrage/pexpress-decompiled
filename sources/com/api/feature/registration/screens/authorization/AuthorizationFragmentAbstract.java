package com.api.feature.registration.screens.authorization;

import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.CompoundButton;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment;
import com.base.feature.registration.screens.authorization.AuthorizationFragmentBase;
import defpackage.AbstractC7959z50;
import defpackage.C5794om;
import defpackage.InterfaceC1455Ll;
import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/feature/registration/screens/authorization/AuthorizationFragmentAbstract;", "Lz50;", "VM", "Lcom/api/library/registration/screens/emailandpassword/EmailAndPasswordFieldsFragment;", "FeatureRegistrationApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AuthorizationFragmentAbstract<VM extends AbstractC7959z50> extends EmailAndPasswordFieldsFragment<VM> {
    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        w();
        final AuthorizationFragmentBase authorizationFragmentBase = (AuthorizationFragmentBase) this;
        authorizationFragmentBase.p();
        authorizationFragmentBase.q();
        authorizationFragmentBase.n();
        InterfaceC1455Ll interfaceC1455Ll = authorizationFragmentBase.n;
        interfaceC1455Ll.l().setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() { // from class: gm
            @Override // android.widget.CompoundButton.OnCheckedChangeListener
            public final void onCheckedChanged(CompoundButton compoundButton, boolean z) {
                Intrinsics.checkNotNullParameter(compoundButton, "<unused var>");
                Object obj = authorizationFragmentBase.i;
                Intrinsics.checkNotNull(obj);
                ((AbstractC1394Kq1) obj).s(z);
            }
        });
        ViewGroup viewGroupG = interfaceC1455Ll.g();
        Intrinsics.c(viewGroupG, "null cannot be cast to non-null type androidx.constraintlayout.motion.widget.MotionLayout");
        MotionLayout motionLayout = (MotionLayout) viewGroupG;
        C5794om c5794om = new C5794om(authorizationFragmentBase);
        if (motionLayout.j0 == null) {
            motionLayout.j0 = new CopyOnWriteArrayList<>();
        }
        motionLayout.j0.add(c5794om);
        o();
    }
}
