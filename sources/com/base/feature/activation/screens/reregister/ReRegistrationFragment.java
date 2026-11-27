package com.base.feature.activation.screens.reregister;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.g;
import androidx.lifecycle.LifecycleCoroutineScopeImpl;
import com.api.feature.analytics.reporters.ReporterApi;
import com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment;
import com.google.android.material.button.MaterialButton;
import com.impl.feature.activation.register.ReRegistrationFragmentImpl;
import com.pexpress.tool.R;
import defpackage.AbstractC1394Kq1;
import defpackage.C1699On1;
import defpackage.C2784ak0;
import defpackage.C3021bn1;
import defpackage.C3296d7;
import defpackage.C3440dn1;
import defpackage.C3649en1;
import defpackage.C3859fn1;
import defpackage.C4069gn1;
import defpackage.C4279hn1;
import defpackage.C5189lv;
import defpackage.C5421n02;
import defpackage.C5800on1;
import defpackage.C6333rM;
import defpackage.C6429rn1;
import defpackage.C6610sg0;
import defpackage.C7652xe;
import defpackage.EnumC5028l80;
import defpackage.EnumC6594sc0;
import defpackage.FP0;
import defpackage.InterfaceC2428Xm1;
import defpackage.InterfaceC3728fA0;
import defpackage.InterfaceC5167ln1;
import defpackage.InterfaceC8112zo0;
import defpackage.Q62;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/base/feature/activation/screens/reregister/ReRegistrationFragment;", "Lon1;", "VM", "Lcom/api/library/registration/screens/emailandpassword/EmailAndPasswordFieldsFragment;", "FeatureActivationBase_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class ReRegistrationFragment<VM extends C5800on1> extends EmailAndPasswordFieldsFragment<VM> {

    @NotNull
    public final InterfaceC2428Xm1 n;

    @NotNull
    public final InterfaceC5167ln1 o;

    @NotNull
    public final C3296d7 p;

    @NotNull
    public final InterfaceC3728fA0 q;

    @NotNull
    public final InterfaceC8112zo0 r;

    @Nullable
    public final Integer s;

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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReRegistrationFragment(@NotNull InterfaceC2428Xm1 binding, @NotNull InterfaceC5167ln1 resourceProvider, @NotNull C3296d7 activityOnBackPressedProvider, @NotNull InterfaceC3728fA0 initializeCurrenciesGroupViewUseCase, @NotNull InterfaceC8112zo0 highlightedResourcesProvider) {
        super(binding, resourceProvider);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(resourceProvider, "resourceProvider");
        Intrinsics.checkNotNullParameter(activityOnBackPressedProvider, "activityOnBackPressedProvider");
        Intrinsics.checkNotNullParameter(initializeCurrenciesGroupViewUseCase, "initializeCurrenciesGroupViewUseCase");
        Intrinsics.checkNotNullParameter(highlightedResourcesProvider, "highlightedResourcesProvider");
        this.n = binding;
        this.o = resourceProvider;
        this.p = activityOnBackPressedProvider;
        this.q = initializeCurrenciesGroupViewUseCase;
        this.r = highlightedResourcesProvider;
        this.s = Integer.valueOf(R.color.toolbarBackground);
    }

    @Override // com.api.core.BaseFragment, defpackage.InterfaceC7271vo0
    public final void d() {
        this.p.a = null;
    }

    @Override // com.api.core.BaseFragment
    @Nullable
    /* JADX INFO: renamed from: j, reason: from getter */
    public final Integer getK() {
        return this.s;
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public final void m() {
        y(false);
    }

    @Override // com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment, com.api.library.registration.screens.email.EmailFieldFragment
    public final void o() {
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        C5800on1 c5800on1 = (C5800on1) obj;
        super.o();
        C1699On1 c1699On1 = c5800on1.D;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C3440dn1(viewLifecycleOwner, c1699On1, null, this), 3);
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        LifecycleCoroutineScopeImpl lifecycleCoroutineScopeImplF = C7652xe.f(viewLifecycleOwner2);
        C1699On1 c1699On2 = c5800on1.F;
        C5189lv.k(lifecycleCoroutineScopeImplF, null, new C3649en1(viewLifecycleOwner2, c1699On2, null, this), 3);
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C3859fn1(viewLifecycleOwner3, c5800on1.H, null, this), 3);
        C6610sg0 c6610sg0 = new C6610sg0(c5800on1.t, c1699On2, new C6429rn1(3, null));
        FP0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new C4069gn1(viewLifecycleOwner4, c6610sg0, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1699On1 c1699On3 = ((C5800on1) obj2).N;
        FP0 viewLifecycleOwner5 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner5, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner5), null, new C4279hn1(viewLifecycleOwner5, c1699On3, null, this), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(@NotNull View view, @Nullable Bundle bundle) {
        Intrinsics.checkNotNullParameter(view, "view");
        super.onViewCreated(view, bundle);
        w();
        x();
        o();
        Toolbar toolbarD = ((ReRegistrationFragmentImpl) this).t.d();
        g gVarRequireActivity = requireActivity();
        Intrinsics.checkNotNullExpressionValue(gVarRequireActivity, "requireActivity(...)");
        C5421n02.a(toolbarD, gVarRequireActivity);
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public final void s(@NotNull EnumC6594sc0 fieldError) {
        Intrinsics.checkNotNullParameter(fieldError, "fieldError");
        EnumC6594sc0 enumC6594sc0 = EnumC6594sc0.e;
        InterfaceC2428Xm1 interfaceC2428Xm1 = ((ReRegistrationFragmentImpl) this).t;
        if (fieldError == enumC6594sc0 || fieldError == EnumC6594sc0.g) {
            interfaceC2428Xm1.L().setText(getString(R.string.email_already_registered_text_with_platform_name, this.o.d()));
        } else {
            interfaceC2428Xm1.L().setText(getString(R.string.email_error_hint_text));
        }
        t(interfaceC2428Xm1.X(), interfaceC2428Xm1.u());
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public final void u() {
        y(true);
    }

    @Override // com.api.library.registration.screens.emailandpassword.EmailAndPasswordFieldsFragment
    public final void w() {
        super.w();
        InterfaceC2428Xm1 interfaceC2428Xm1 = ((ReRegistrationFragmentImpl) this).t;
        interfaceC2428Xm1.t().setButtonTintList(null);
        TextView title = interfaceC2428Xm1.getTitle();
        String string = getString(R.string.create_new_account_platform_tittle);
        Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        title.setText(this.r.b(string));
        TextView textViewF0 = interfaceC2428Xm1.f0();
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
        SpannableString spannable = this.r.a(aVar, bVar, dVar, cVar, new e(0, obj5, AbstractC1394Kq1.class, "onPublicOfferClick", "onPublicOfferClick()V", 0));
        Intrinsics.checkNotNullParameter(textViewF0, "<this>");
        Intrinsics.checkNotNullParameter(spannable, "spannable");
        textViewF0.setText(spannable);
        textViewF0.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public abstract void x();

    public final void y(boolean z) {
        String string;
        Drawable drawable;
        InterfaceC2428Xm1 interfaceC2428Xm1 = ((ReRegistrationFragmentImpl) this).t;
        interfaceC2428Xm1.H().setVisibility(z ? 0 : 8);
        interfaceC2428Xm1.c().setVisibility(z ? 0 : 8);
        interfaceC2428Xm1.M().setEnabled(!z);
        MaterialButton materialButtonM = interfaceC2428Xm1.M();
        if (z) {
            string = "";
        } else {
            string = getString(R.string.create_new_account_button);
            Intrinsics.checkNotNullExpressionValue(string, "getString(...)");
        }
        materialButtonM.setText(string);
        Toolbar toolbarD = interfaceC2428Xm1.d();
        Intrinsics.checkNotNullParameter(toolbarD, "<this>");
        if (z) {
            drawable = null;
        } else {
            Context context = toolbarD.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            Intrinsics.checkNotNullParameter(context, "<this>");
            drawable = C6333rM.getDrawable(context, R.drawable.ic_previous);
        }
        toolbarD.setNavigationIcon(drawable);
        this.p.a = z ? new C3021bn1() : null;
    }
}
