package com.base.feature.registration.screens.forgetpassword;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.lifecycle.RepeatOnLifecycleKt;
import androidx.lifecycle.g;
import com.api.library.registration.screens.email.EmailFieldFragment;
import com.google.android.material.button.MaterialButton;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.ActivityC1745Pd;
import defpackage.C1621Nn1;
import defpackage.C1795Pt1;
import defpackage.C3296d7;
import defpackage.C5189lv;
import defpackage.C5421n02;
import defpackage.C6614sh0;
import defpackage.C7455wh0;
import defpackage.C7652xe;
import defpackage.EnumC6594sc0;
import defpackage.FP0;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC5910pK1;
import defpackage.InterfaceC5985ph0;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC6606sf0;
import defpackage.JM;
import defpackage.KN;
import defpackage.M50;
import defpackage.MN;
import defpackage.ViewOnClickListenerC6713t9;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/base/feature/registration/screens/forgetpassword/ForgetPasswordFragment;", "Lwh0;", "VM", "Lcom/api/library/registration/screens/email/EmailFieldFragment;", "FeatureRegistrationBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ForgetPasswordFragment<VM extends C7455wh0> extends EmailFieldFragment<VM> {

    @NotNull
    public final InterfaceC5985ph0 k;

    @NotNull
    public final C3296d7 l;

    @Nullable
    public final Integer m;

    @Nullable
    public String n;

    @InterfaceC3368dU(c = "com.base.feature.registration.screens.forgetpassword.ForgetPasswordFragment$initViewListeners$$inlined$launchAndCollectIn$default$1", f = "ForgetPasswordFragment.kt", l = {48}, m = "invokeSuspend")
    public final class a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ FP0 e;
        public final /* synthetic */ InterfaceC5910pK1 g;
        public final /* synthetic */ ForgetPasswordFragment h;

        /* JADX INFO: renamed from: com.base.feature.registration.screens.forgetpassword.ForgetPasswordFragment$a$a, reason: collision with other inner class name */
        @InterfaceC3368dU(c = "com.base.feature.registration.screens.forgetpassword.ForgetPasswordFragment$initViewListeners$$inlined$launchAndCollectIn$default$1$1", f = "ForgetPasswordFragment.kt", l = {49}, m = "invokeSuspend")
        public static final class C0280a extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
            public int d;
            public /* synthetic */ Object e;
            public final /* synthetic */ InterfaceC5910pK1 g;
            public final /* synthetic */ ForgetPasswordFragment h;

            /* JADX INFO: renamed from: com.base.feature.registration.screens.forgetpassword.ForgetPasswordFragment$a$a$a, reason: collision with other inner class name */
            public static final class C0281a<T> implements InterfaceC6606sf0 {
                public final /* synthetic */ KN d;
                public final /* synthetic */ ForgetPasswordFragment e;

                public C0281a(KN kn, ForgetPasswordFragment forgetPasswordFragment) {
                    this.e = forgetPasswordFragment;
                    this.d = kn;
                }

                @Override // defpackage.InterfaceC6606sf0
                public final Object a(Object obj, JM jm) {
                    this.e.l.a();
                    return Unit.a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0280a(InterfaceC5910pK1 interfaceC5910pK1, JM jm, ForgetPasswordFragment forgetPasswordFragment) {
                super(2, jm);
                this.g = interfaceC5910pK1;
                this.h = forgetPasswordFragment;
            }

            @Override // defpackage.AbstractC7487wq
            public final JM<Unit> create(Object obj, JM<?> jm) {
                C0280a c0280a = new C0280a(this.g, jm, this.h);
                c0280a.e = obj;
                return c0280a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(KN kn, JM<? super Unit> jm) {
                return ((C0280a) create(kn, jm)).invokeSuspend(Unit.a);
            }

            @Override // defpackage.AbstractC7487wq
            public final Object invokeSuspend(Object obj) {
                MN mn = MN.d;
                int i = this.d;
                if (i == 0) {
                    C1795Pt1.b(obj);
                    C0281a c0281a = new C0281a((KN) this.e, this.h);
                    this.d = 1;
                    if (this.g.c(c0281a, this) == mn) {
                        return mn;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C1795Pt1.b(obj);
                }
                return Unit.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(FP0 fp0, InterfaceC5910pK1 interfaceC5910pK1, JM jm, ForgetPasswordFragment forgetPasswordFragment) {
            super(2, jm);
            this.e = fp0;
            this.g = interfaceC5910pK1;
            this.h = forgetPasswordFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new a(this.e, this.g, jm, this.h);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((a) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                C0280a c0280a = new C0280a(this.g, null, this.h);
                this.d = 1;
                if (RepeatOnLifecycleKt.a(this.e, g.b.h, c0280a, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ForgetPasswordFragment(@NotNull InterfaceC5985ph0 bindingProvider, @NotNull C3296d7 activityOnBackPressedProvider) {
        super(bindingProvider);
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(activityOnBackPressedProvider, "activityOnBackPressedProvider");
        this.k = bindingProvider;
        this.l = activityOnBackPressedProvider;
        this.m = Integer.valueOf(R.color.toolbarBackground);
    }

    @Override // com.api.core.BaseFragment
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getS() {
        return this.m;
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public final void m() {
        InterfaceC5985ph0 interfaceC5985ph0 = this.k;
        interfaceC5985ph0.c().setVisibility(8);
        interfaceC5985ph0.B().setEnabled(true);
        MaterialButton materialButtonB = interfaceC5985ph0.B();
        String str = this.n;
        if (str != null) {
            materialButtonB.setText(str);
        }
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public void n() {
        super.n();
        this.k.B().setOnClickListener(new ViewOnClickListenerC6713t9(this, 1));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        this.j.a().requestFocus();
        p();
        q();
        n();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C1621Nn1 c1621Nn1 = ((C7455wh0) obj).u;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new a(viewLifecycleOwner, c1621Nn1, null, this), 3);
        super.o();
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        InterfaceC6396rf0<Boolean> interfaceC6396rf0L = ((M50) obj2).l();
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C6614sh0(viewLifecycleOwner2, interfaceC6396rf0L, null, this), 3);
        Toolbar toolbarD = this.k.d();
        androidx.fragment.app.g gVarRequireActivity = requireActivity();
        Intrinsics.c(gVarRequireActivity, "null cannot be cast to non-null type androidx.appcompat.app.AppCompatActivity");
        C5421n02.a(toolbarD, (ActivityC1745Pd) gVarRequireActivity);
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public final void s(@NotNull EnumC6594sc0 fieldError) {
        Intrinsics.checkNotNullParameter(fieldError, "fieldError");
        InterfaceC5985ph0 interfaceC5985ph0 = this.k;
        t(interfaceC5985ph0.X(), interfaceC5985ph0.U());
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public final void u() {
        InterfaceC5985ph0 interfaceC5985ph0 = this.k;
        this.n = interfaceC5985ph0.B().getText().toString();
        interfaceC5985ph0.c().setVisibility(0);
        interfaceC5985ph0.B().setEnabled(false);
        interfaceC5985ph0.B().setText("");
    }
}
