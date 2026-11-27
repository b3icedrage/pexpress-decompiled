package com.api.library.registration.screens.email;

import android.content.res.Resources;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.EditText;
import com.api.core.ViewModelFragment;
import com.google.android.material.textfield.TextInputLayout;
import defpackage.A50;
import defpackage.AW1;
import defpackage.B9;
import defpackage.C1699On1;
import defpackage.C1795Pt1;
import defpackage.C50;
import defpackage.C5189lv;
import defpackage.C7644xc;
import defpackage.C7652xe;
import defpackage.D50;
import defpackage.E50;
import defpackage.EnumC6594sc0;
import defpackage.F50;
import defpackage.FP0;
import defpackage.IW;
import defpackage.InterfaceC3368dU;
import defpackage.JM;
import defpackage.KN;
import defpackage.M50;
import defpackage.MN;
import defpackage.RunnableC3329dH;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/library/registration/screens/email/EmailFieldFragment;", "LM50;", "VM", "Lcom/api/core/ViewModelFragment;", "LibraryRegistrationApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EmailFieldFragment<VM extends M50> extends ViewModelFragment<VM> {

    @NotNull
    public final A50 j;

    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Nullable Editable editable) {
            Object obj = EmailFieldFragment.this.i;
            Intrinsics.checkNotNull(obj);
            ((M50) obj).m(String.valueOf(editable));
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    @InterfaceC3368dU(c = "com.api.library.registration.screens.email.EmailFieldFragment$showError$1", f = "EmailFieldFragment.kt", l = {104}, m = "invokeSuspend")
    public static final class b extends AW1 implements Function2<KN, JM<? super Unit>, Object> {
        public int d;
        public final /* synthetic */ View e;
        public final /* synthetic */ EmailFieldFragment<VM> g;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(View view, EmailFieldFragment<VM> emailFieldFragment, JM<? super b> jm) {
            super(2, jm);
            this.e = view;
            this.g = emailFieldFragment;
        }

        @Override // defpackage.AbstractC7487wq
        public final JM<Unit> create(Object obj, JM<?> jm) {
            return new b(this.e, this.g, jm);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(KN kn, JM<? super Unit> jm) {
            return ((b) create(kn, jm)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.AbstractC7487wq
        public final Object invokeSuspend(Object obj) {
            MN mn = MN.d;
            int i = this.d;
            if (i == 0) {
                C1795Pt1.b(obj);
                this.d = 1;
                if (IW.b(100L, this) == mn) {
                    return mn;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C1795Pt1.b(obj);
            }
            Resources resources = this.g.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            C7644xc.e(this.e, C7644xc.i(resources));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailFieldFragment(@NotNull A50 bindingProvider) {
        super(bindingProvider);
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        this.j = bindingProvider;
    }

    public final void l(@NotNull View hint, @NotNull TextInputLayout inputLayout) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(inputLayout, "inputLayout");
        hint.animate().cancel();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        C7644xc.d(1, C7644xc.i(resources), hint);
        inputLayout.setErrorEnabled(false);
    }

    public abstract void m();

    public void n() {
        this.j.g().setOnClickListener(new B9(this, 2));
    }

    public void o() {
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        M50 m50 = (M50) obj;
        C1699On1 c1699On1 = m50.f;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C50(viewLifecycleOwner, c1699On1, null, this), 3);
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new D50(viewLifecycleOwner2, m50.h, null, this), 3);
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new E50(viewLifecycleOwner3, m50.j, null, this), 3);
        Object obj2 = this.i;
        Intrinsics.checkNotNull(obj2);
        C1699On1 c1699On2 = ((M50) obj2).l;
        FP0 viewLifecycleOwner4 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner4, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner4), null, new F50(viewLifecycleOwner4, c1699On2, null, this), 3);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDetach() {
        super.onDetach();
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        ((M50) obj).m("");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewStateRestored(@Nullable Bundle bundle) {
        super.onViewStateRestored(bundle);
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        ((M50) obj).n();
    }

    public void p() {
        this.j.b0().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: B50
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Object obj = this.a.i;
                Intrinsics.checkNotNull(obj);
                M50 m50 = (M50) obj;
                C1273Jc0 c1273Jc0 = m50.d;
                if (c1273Jc0.b && !z) {
                    c1273Jc0.b = false;
                }
                c1273Jc0.d = z;
                m50.e.setValue(c1273Jc0.c());
            }
        });
    }

    public void q() {
        this.j.b0().addTextChangedListener(new a());
    }

    public void r() {
        EditText editTextB0 = this.j.b0();
        editTextB0.post(new RunnableC3329dH(editTextB0, 1));
    }

    public abstract void s(@NotNull EnumC6594sc0 enumC6594sc0);

    public final void t(@NotNull View hint, @NotNull TextInputLayout inputLayout) {
        Intrinsics.checkNotNullParameter(hint, "hint");
        Intrinsics.checkNotNullParameter(inputLayout, "inputLayout");
        hint.animate().cancel();
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        C7644xc.e(hint, C7644xc.i(resources));
        inputLayout.setError(" ");
        Intrinsics.checkNotNullParameter(inputLayout, "<this>");
        if (inputLayout.getChildCount() == 2) {
            View childAt = inputLayout.getChildAt(1);
            Intrinsics.checkNotNullExpressionValue(childAt, "getChildAt(...)");
            childAt.setVisibility(8);
        }
        C7652xe.f(this).d(new b(hint, this, null));
    }

    public abstract void u();
}
