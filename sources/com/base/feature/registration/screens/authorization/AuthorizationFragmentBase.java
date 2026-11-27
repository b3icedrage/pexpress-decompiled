package com.base.feature.registration.screens.authorization;

import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import com.api.feature.analytics.reporters.ReporterApi;
import com.api.feature.registration.screens.authorization.AuthorizationFragmentAbstract;
import com.google.android.material.button.MaterialButton;
import com.impl.feature.registration.screens.authorization.AuthorizationFragmentImpl;
import com.pexpress.tool.R;
import defpackage.AW1;
import defpackage.AbstractC1394Kq1;
import defpackage.C0990Fm;
import defpackage.C1146Hm;
import defpackage.C1699On1;
import defpackage.C1795Pt1;
import defpackage.C2784ak0;
import defpackage.C3296d7;
import defpackage.C4482im;
import defpackage.C4741jm;
import defpackage.C4951km;
import defpackage.C5161lm;
import defpackage.C5189lv;
import defpackage.C5289mN1;
import defpackage.C5374mm;
import defpackage.C5584nm;
import defpackage.C5770og;
import defpackage.C6610sg0;
import defpackage.C7178vN1;
import defpackage.C7599xN1;
import defpackage.C7652xe;
import defpackage.EnumC5028l80;
import defpackage.EnumC6594sc0;
import defpackage.FP0;
import defpackage.GP1;
import defpackage.InterfaceC1455Ll;
import defpackage.InterfaceC3368dU;
import defpackage.InterfaceC3728fA0;
import defpackage.InterfaceC6396rf0;
import defpackage.InterfaceC6698t50;
import defpackage.InterfaceC6843tm;
import defpackage.InterfaceC8112zo0;
import defpackage.JM;
import defpackage.KN;
import defpackage.MN;
import defpackage.Q62;
import defpackage.RunnableC2411Xh;
import defpackage.ViewOnClickListenerC3434dm;
import defpackage.ViewOnClickListenerC3643em;
import defpackage.ViewOnClickListenerC3853fm;
import defpackage.ViewOnClickListenerC5228m5;
import defpackage.ViewOnClickListenerC7526x2;
import defpackage.ViewOnClickListenerC7736y2;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/base/feature/registration/screens/authorization/AuthorizationFragmentBase;", "LHm;", "VM", "Lcom/api/feature/registration/screens/authorization/AuthorizationFragmentAbstract;", "", "FeatureRegistrationBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class AuthorizationFragmentBase<VM extends C1146Hm> extends AuthorizationFragmentAbstract<VM> {

    @NotNull
    public final InterfaceC1455Ll n;

    @NotNull
    public final InterfaceC6843tm o;

    @NotNull
    public final C7178vN1 p;

    @NotNull
    public final C7599xN1 q;

    @NotNull
    public final C3296d7 r;

    @NotNull
    public final InterfaceC3728fA0 s;

    @NotNull
    public final InterfaceC8112zo0 t;

    public /* synthetic */ class a extends C2784ak0 implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AbstractC1394Kq1 abstractC1394Kq1 = (AbstractC1394Kq1) this.e;
            ReporterApi.a.b(abstractC1394Kq1.q(), EnumC5028l80.s, new Q62("Platform Terms"), null, 12);
            abstractC1394Kq1.A.g();
            return Unit.a;
        }
    }

    public /* synthetic */ class b extends C2784ak0 implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AbstractC1394Kq1 abstractC1394Kq1 = (AbstractC1394Kq1) this.e;
            ReporterApi.a.b(abstractC1394Kq1.q(), EnumC5028l80.s, new Q62("Platform Policy"), null, 12);
            abstractC1394Kq1.A.j();
            return Unit.a;
        }
    }

    public /* synthetic */ class c extends C2784ak0 implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AbstractC1394Kq1 abstractC1394Kq1 = (AbstractC1394Kq1) this.e;
            ReporterApi.a.b(abstractC1394Kq1.q(), EnumC5028l80.s, new Q62("Our Privacy"), null, 12);
            abstractC1394Kq1.A.d();
            return Unit.a;
        }
    }

    public /* synthetic */ class d extends C2784ak0 implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AbstractC1394Kq1 abstractC1394Kq1 = (AbstractC1394Kq1) this.e;
            ReporterApi.a.b(abstractC1394Kq1.q(), EnumC5028l80.s, new Q62("Our Terms"), null, 12);
            abstractC1394Kq1.A.a();
            return Unit.a;
        }
    }

    public /* synthetic */ class e extends C2784ak0 implements Function0<Unit> {
        @Override // kotlin.jvm.functions.Function0
        public final Unit invoke() {
            AbstractC1394Kq1 abstractC1394Kq1 = (AbstractC1394Kq1) this.e;
            ReporterApi.a.b(abstractC1394Kq1.q(), EnumC5028l80.s, new Q62("Platform Public Offer"), null, 12);
            abstractC1394Kq1.A.e();
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationFragmentBase$onHide$1", f = "AuthorizationFragmentBase.kt", l = {}, m = "invokeSuspend")
    public static final class f extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ AuthorizationFragmentBase<VM> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(AuthorizationFragmentBase<VM> authorizationFragmentBase, JM<? super f> jm) {
            super(2, jm);
            this.d = authorizationFragmentBase;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new f(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((f) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            Object obj2 = this.d.i;
            Intrinsics.checkNotNull(obj2);
            GP1 gp1 = ((C1146Hm) obj2).a0;
            Boolean bool = Boolean.FALSE;
            gp1.getClass();
            gp1.m(null, bool);
            return Unit.a;
        }
    }

    @InterfaceC3368dU(c = "com.base.feature.registration.screens.authorization.AuthorizationFragmentBase$onShow$2", f = "AuthorizationFragmentBase.kt", l = {}, m = "invokeSuspend")
    public static final class g extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public final /* synthetic */ AuthorizationFragmentBase<VM> d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(AuthorizationFragmentBase<VM> authorizationFragmentBase, JM<? super g> jm) {
            super(2, jm);
            this.d = authorizationFragmentBase;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new g(this.d, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((g) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            C1795Pt1.b(obj);
            Object obj2 = this.d.i;
            Intrinsics.checkNotNull(obj2);
            GP1 gp1 = ((C1146Hm) obj2).a0;
            Boolean bool = Boolean.TRUE;
            gp1.getClass();
            gp1.m(null, bool);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AuthorizationFragmentBase(@NotNull InterfaceC1455Ll bindingProvider, @NotNull InterfaceC6843tm resourceProvider, @NotNull C7178vN1 socialLoginWithWebView, @NotNull C7599xN1 socialRegisterWithWebView, @NotNull C5289mN1 socialLoginLoadingUseCase, @NotNull C3296d7 activityOnBackPressedProvider, @NotNull InterfaceC3728fA0 initializeCurrenciesGroupViewUseCase, @NotNull InterfaceC8112zo0 highlightedAgreementProvider) {
        super(bindingProvider, resourceProvider);
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(socialLoginWithWebView, "socialLoginWithWebView");
        Intrinsics.checkNotNullParameter(socialRegisterWithWebView, "socialRegisterWithWebView");
        Intrinsics.checkNotNullParameter(socialLoginLoadingUseCase, "socialLoginLoadingUseCase");
        Intrinsics.checkNotNullParameter(activityOnBackPressedProvider, "activityOnBackPressedProvider");
        Intrinsics.checkNotNullParameter(initializeCurrenciesGroupViewUseCase, "initializeCurrenciesGroupViewUseCase");
        Intrinsics.checkNotNullParameter(highlightedAgreementProvider, "highlightedAgreementProvider");
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        this.n = bindingProvider;
        this.o = resourceProvider;
        this.p = socialLoginWithWebView;
        this.q = socialRegisterWithWebView;
        this.r = activityOnBackPressedProvider;
        this.s = initializeCurrenciesGroupViewUseCase;
        this.t = highlightedAgreementProvider;
    }

    @Override // com.api.core.BaseFragment, defpackage.InterfaceC7271vo0
    public final void d() {
        this.r.a = null;
        C7652xe.f(this).d(new f(this, null));
    }

    @Override // com.api.core.BaseFragment, defpackage.InterfaceC7271vo0
    public final void f() {
        this.r.a = new C5770og(this, 1);
        C7652xe.f(this).d(new g(this, null));
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public final void m() {
        x(false);
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public void n() {
        super.n();
        InterfaceC1455Ll interfaceC1455Ll = this.n;
        int i = 1;
        interfaceC1455Ll.Z().setOnClickListener(new ViewOnClickListenerC7526x2(this, i));
        interfaceC1455Ll.P().setOnClickListener(new ViewOnClickListenerC7736y2(this, i));
        int i2 = 0;
        interfaceC1455Ll.T().setOnClickListener(new ViewOnClickListenerC3434dm(this, i2));
        interfaceC1455Ll.i().setOnClickListener(new ViewOnClickListenerC3643em(this, i2));
        interfaceC1455Ll.k().setOnClickListener(new ViewOnClickListenerC3853fm(this, i2));
        interfaceC1455Ll.e0().setOnClickListener(new ViewOnClickListenerC5228m5(this, 1));
    }

    @Override // com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment, com.api.library.registration.screens.email.EmailFieldFragment
    public void o() {
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C1146Hm c1146Hm = (C1146Hm) obj;
        super.o();
        C1699On1 c1699On1 = c1146Hm.F;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        AuthorizationFragmentImpl authorizationFragmentImpl = (AuthorizationFragmentImpl) this;
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C4741jm(viewLifecycleOwner, c1699On1, null, authorizationFragmentImpl), 3);
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C4951km(viewLifecycleOwner2, c1146Hm.D, null, authorizationFragmentImpl), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1699On1 c1699On2 = ((C1146Hm) obj2).c0;
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C4482im(viewLifecycleOwner3, c1699On2, null, authorizationFragmentImpl), 3);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        InterfaceC6396rf0<Boolean> interfaceC6396rf0 = ((C1146Hm) obj3).t;
        FP0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new C5161lm(viewLifecycleOwner4, interfaceC6396rf0, null, authorizationFragmentImpl), 3);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        C1146Hm c1146Hm2 = (C1146Hm) obj4;
        C6610sg0 c6610sg0 = new C6610sg0(c1146Hm2.t, c1146Hm2.F, new C0990Fm(3, null));
        FP0 viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner5), null, new C5374mm(viewLifecycleOwner5, c6610sg0, null, authorizationFragmentImpl), 3);
        Object obj5 = this.i;
        Intrinsics.checkNotNull(obj5);
        C1699On1 c1699On3 = ((C1146Hm) obj5).Z;
        FP0 viewLifecycleOwner6 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner6, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner6), null, new C5584nm(viewLifecycleOwner6, c1699On3, null, authorizationFragmentImpl), 3);
    }

    @Override // com.api.core.BindingFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.r.a = null;
        super.onDestroyView();
    }

    @Override // com.api.feature.registration.screens.authorization.AuthorizationFragmentAbstract, androidx.fragment.app.Fragment
    public final void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        AuthorizationFragmentImpl authorizationFragmentImpl = (AuthorizationFragmentImpl) this;
        View view2 = authorizationFragmentImpl.getView();
        if (view2 != null) {
            view2.post(new RunnableC2411Xh(authorizationFragmentImpl, 1));
        }
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public final void s(@NotNull EnumC6594sc0 fieldError) {
        Intrinsics.checkNotNullParameter(fieldError, "fieldError");
        InterfaceC1455Ll interfaceC1455Ll = this.n;
        t(interfaceC1455Ll.X(), interfaceC1455Ll.U());
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public final void u() {
        x(true);
    }

    @Override // com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment
    /* JADX INFO: renamed from: v */
    public final InterfaceC6698t50 getK() {
        return this.n;
    }

    @Override // com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment
    public final void w() {
        super.w();
        InterfaceC1455Ll interfaceC1455Ll = this.n;
        TextView textViewX = interfaceC1455Ll.x();
        InterfaceC6843tm interfaceC6843tm = this.o;
        String strI = interfaceC6843tm.i();
        InterfaceC8112zo0 interfaceC8112zo0 = this.t;
        textViewX.setText(interfaceC8112zo0.b(strI));
        interfaceC1455Ll.m().setText(interfaceC8112zo0.b(interfaceC6843tm.k()));
        TextView textViewC0 = interfaceC1455Ll.c0();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        a aVar = new a(0, obj, AbstractC1394Kq1.class, "onPlatformTermsAndConditionsClick", "onPlatformTermsAndConditionsClick()V", 0);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        b bVar = new b(0, obj2, AbstractC1394Kq1.class, "onPlatformPrivacyPolicyClick", "onPlatformPrivacyPolicyClick()V", 0);
        Object obj3 = this.i;
        Intrinsics.checkNotNull(obj3);
        c cVar = new c(0, obj3, AbstractC1394Kq1.class, "onRobotPrivacyPolicyClick", "onRobotPrivacyPolicyClick()V", 0);
        Object obj4 = this.i;
        Intrinsics.checkNotNull(obj4);
        d dVar = new d(0, obj4, AbstractC1394Kq1.class, "onRobotTermsAndConditionsClick", "onRobotTermsAndConditionsClick()V", 0);
        Object obj5 = this.i;
        Intrinsics.checkNotNull(obj5);
        SpannableString spannable = this.t.a(aVar, bVar, dVar, cVar, new e(0, obj5, AbstractC1394Kq1.class, "onPublicOfferClick", "onPublicOfferClick()V", 0));
        Intrinsics.checkNotNullParameter(textViewC0, "<this>");
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        textViewC0.setText(spannable);
        textViewC0.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public final void x(boolean z) {
        String string;
        InterfaceC1455Ll interfaceC1455Ll = this.n;
        interfaceC1455Ll.c().setVisibility(!z ? 4 : 0);
        MaterialButton materialButtonP = interfaceC1455Ll.P();
        String string2 = "";
        if (z) {
            string = "";
        } else {
            string = getString(R.string.register);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        materialButtonP.setText(string);
        boolean z2 = !z;
        interfaceC1455Ll.P().setEnabled(z2);
        MaterialButton materialButtonZ = interfaceC1455Ll.Z();
        if (!z) {
            string2 = getString(R.string.log_in);
            Intrinsics.checkNotNullExpressionValue(string2, "getString(...)");
        }
        materialButtonZ.setText(string2);
        interfaceC1455Ll.Z().setEnabled(z2);
        interfaceC1455Ll.H().setVisibility(z ? 0 : 8);
    }
}
