package com.api.library.registration.screens.emailandpassword;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.TextView;
import com.api.library.registration.screens.email.EmailFieldFragment;
import com.pexpress.tool.R;
import defpackage.AbstractC7959z50;
import defpackage.C1273Jc0;
import defpackage.C1699On1;
import defpackage.C5189lv;
import defpackage.C7118v50;
import defpackage.C7239vg;
import defpackage.C7328w50;
import defpackage.C7539x50;
import defpackage.C7652xe;
import defpackage.FP0;
import defpackage.GP1;
import defpackage.InterfaceC6698t50;
import defpackage.InterfaceC7749y50;
import defpackage.KW1;
import defpackage.XO0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/api/library/registration/screens/emailandpassword/EmailAndPasswordFieldsFragment;", "Lz50;", "VM", "Lcom/api/library/registration/screens/email/EmailFieldFragment;", "LibraryRegistrationApi_pbRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
public abstract class EmailAndPasswordFieldsFragment<VM extends AbstractC7959z50> extends EmailFieldFragment<VM> {

    @NotNull
    public final InterfaceC6698t50 k;

    @NotNull
    public final InterfaceC7749y50 l;

    @NotNull
    public final KW1 m;

    public static final class a implements TextWatcher {
        public a() {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(@Nullable Editable editable) {
            Object obj = EmailAndPasswordFieldsFragment.this.i;
            Intrinsics.checkNotNull(obj);
            AbstractC7959z50 abstractC7959z50 = (AbstractC7959z50) obj;
            String newValue = String.valueOf(editable);
            abstractC7959z50.getClass();
            Intrinsics.checkNotNullParameter(newValue, "password");
            GP1 gp1 = abstractC7959z50.q;
            gp1.getClass();
            gp1.m(null, newValue);
            C1273Jc0 c1273Jc0 = abstractC7959z50.n;
            c1273Jc0.getClass();
            Intrinsics.checkNotNullParameter(newValue, "newValue");
            c1273Jc0.c = newValue;
            abstractC7959z50.o.setValue(c1273Jc0.c());
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(@Nullable CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmailAndPasswordFieldsFragment(@NotNull InterfaceC6698t50 bindingProvider, @NotNull InterfaceC7749y50 resourcesProvider) {
        super(bindingProvider);
        Intrinsics.checkNotNullParameter(bindingProvider, "bindingProvider");
        Intrinsics.checkNotNullParameter(resourcesProvider, "resourcesProvider");
        this.k = bindingProvider;
        this.l = resourcesProvider;
        this.m = XO0.b(new C7239vg(this, 1));
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public void o() {
        Object obj = this.i;
        Intrinsics.checkNotNull(obj);
        AbstractC7959z50 abstractC7959z50 = (AbstractC7959z50) obj;
        super.o();
        C1699On1 c1699On1 = abstractC7959z50.r;
        FP0 viewLifecycleOwner = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner), null, new C7118v50(viewLifecycleOwner, c1699On1, null, this), 3);
        FP0 viewLifecycleOwner2 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner2, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner2), null, new C7328w50(viewLifecycleOwner2, abstractC7959z50.p, null, this), 3);
        FP0 viewLifecycleOwner3 = getViewLifecycleOwner();
        Intrinsics.checkNotNullExpressionValue(viewLifecycleOwner3, "getViewLifecycleOwner(...)");
        C5189lv.k(C7652xe.f(viewLifecycleOwner3), null, new C7539x50(viewLifecycleOwner3, abstractC7959z50.s, null, this), 3);
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public final void p() {
        super.p();
        getK().J().setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: u50
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                Object obj = this.a.i;
                Intrinsics.checkNotNull(obj);
                AbstractC7959z50 abstractC7959z50 = (AbstractC7959z50) obj;
                C1273Jc0 c1273Jc0 = abstractC7959z50.n;
                if (c1273Jc0.b && !z) {
                    c1273Jc0.b = false;
                }
                c1273Jc0.d = z;
                abstractC7959z50.o.setValue(c1273Jc0.c());
            }
        });
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public final void q() {
        super.q();
        getK().J().addTextChangedListener(new a());
    }

    @Override // com.api.library.registration.screens.email.EmailFieldFragment
    public final void r() {
        super.r();
        getK().J().clearFocus();
    }

    @NotNull
    /* JADX INFO: renamed from: v, reason: from getter */
    public InterfaceC6698t50 getK() {
        return this.k;
    }

    public void w() {
        InterfaceC6698t50 k = getK();
        this.j.a().requestFocus();
        TextView textViewW = k.w();
        this.l.getClass();
        textViewW.setText(getString(R.string.password_rules_rule_1, String.valueOf(6)));
    }
}
