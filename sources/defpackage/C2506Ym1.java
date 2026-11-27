package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.api.resources.CenteredToolbar;
import com.api.resources.IndicatorRadioGroup;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ym1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2506Ym1 implements InterfaceC2428Xm1 {

    @Nullable
    public C4488in1 d;

    @Override // defpackage.InterfaceC6698t50
    @NotNull
    public final TextInputLayout D() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        TextInputLayout passwordTextInputLayout = c4488in1.l;
        Intrinsics.checkNotNullExpressionValue(passwordTextInputLayout, "passwordTextInputLayout");
        return passwordTextInputLayout;
    }

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.InterfaceC6698t50
    @NotNull
    public final View H() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        View reRegistrationBlockingView = c4488in1.n;
        Intrinsics.checkNotNullExpressionValue(reRegistrationBlockingView, "reRegistrationBlockingView");
        return reRegistrationBlockingView;
    }

    @Override // defpackage.InterfaceC6698t50
    @NotNull
    public final EditText J() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        TextInputEditText passwordEditText = c4488in1.k;
        Intrinsics.checkNotNullExpressionValue(passwordEditText, "passwordEditText");
        return passwordEditText;
    }

    @Override // defpackage.InterfaceC2428Xm1
    @NotNull
    public final TextView L() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        TextView hintText = c4488in1.e.e;
        Intrinsics.checkNotNullExpressionValue(hintText, "hintText");
        return hintText;
    }

    @Override // defpackage.InterfaceC2428Xm1
    @NotNull
    public final MaterialButton M() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        MaterialButton reRegistrationRegistrationButton = c4488in1.p;
        Intrinsics.checkNotNullExpressionValue(reRegistrationRegistrationButton, "reRegistrationRegistrationButton");
        return reRegistrationRegistrationButton;
    }

    @Override // defpackage.A50
    @NotNull
    public final TextInputLayout U() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        TextInputLayout emailTextInputLayout = c4488in1.i;
        Intrinsics.checkNotNullExpressionValue(emailTextInputLayout, "emailTextInputLayout");
        return emailTextInputLayout;
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.re_registration_fragment, viewGroup, false);
        int i = R.id.activation_email_error_label;
        View viewH = C3476e.h(viewInflate, R.id.activation_email_error_label);
        if (viewH != null) {
            FA0 fa0B = FA0.b(viewH);
            i = R.id.activation_password_error_label;
            View viewH2 = C3476e.h(viewInflate, R.id.activation_password_error_label);
            if (viewH2 != null) {
                FA0 fa0B2 = FA0.b(viewH2);
                i = R.id.emailEditText;
                TextInputEditText textInputEditText = (TextInputEditText) C3476e.h(viewInflate, R.id.emailEditText);
                if (textInputEditText != null) {
                    i = R.id.emailTextInputLayout;
                    TextInputLayout textInputLayout = (TextInputLayout) C3476e.h(viewInflate, R.id.emailTextInputLayout);
                    if (textInputLayout != null) {
                        i = R.id.licenceCheckBox;
                        MaterialCheckBox materialCheckBox = (MaterialCheckBox) C3476e.h(viewInflate, R.id.licenceCheckBox);
                        if (materialCheckBox != null) {
                            i = R.id.passwordEditText;
                            TextInputEditText textInputEditText2 = (TextInputEditText) C3476e.h(viewInflate, R.id.passwordEditText);
                            if (textInputEditText2 != null) {
                                i = R.id.passwordTextInputLayout;
                                TextInputLayout textInputLayout2 = (TextInputLayout) C3476e.h(viewInflate, R.id.passwordTextInputLayout);
                                if (textInputLayout2 != null) {
                                    i = R.id.radio_group;
                                    IndicatorRadioGroup indicatorRadioGroup = (IndicatorRadioGroup) C3476e.h(viewInflate, R.id.radio_group);
                                    if (indicatorRadioGroup != null) {
                                        i = R.id.re_registration_app_bar_layout;
                                        if (((AppBarLayout) C3476e.h(viewInflate, R.id.re_registration_app_bar_layout)) != null) {
                                            i = R.id.re_registration_blocking_view;
                                            View viewH3 = C3476e.h(viewInflate, R.id.re_registration_blocking_view);
                                            if (viewH3 != null) {
                                                FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                i = R.id.re_registration_loading_spin_kit_view;
                                                SpinKitView spinKitView = (SpinKitView) C3476e.h(viewInflate, R.id.re_registration_loading_spin_kit_view);
                                                if (spinKitView != null) {
                                                    i = R.id.re_registration_registration_button;
                                                    MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.re_registration_registration_button);
                                                    if (materialButton != null) {
                                                        i = R.id.re_registration_root;
                                                        if (((ConstraintLayout) C3476e.h(viewInflate, R.id.re_registration_root)) != null) {
                                                            i = R.id.re_registration_title;
                                                            AppCompatTextView appCompatTextView = (AppCompatTextView) C3476e.h(viewInflate, R.id.re_registration_title);
                                                            if (appCompatTextView != null) {
                                                                i = R.id.re_registration_toolbar;
                                                                CenteredToolbar centeredToolbar = (CenteredToolbar) C3476e.h(viewInflate, R.id.re_registration_toolbar);
                                                                if (centeredToolbar != null) {
                                                                    i = R.id.registrationAgreementText;
                                                                    TextView textView = (TextView) C3476e.h(viewInflate, R.id.registrationAgreementText);
                                                                    if (textView != null) {
                                                                        C4488in1 c4488in1 = new C4488in1(frameLayout, fa0B, fa0B2, textInputEditText, textInputLayout, materialCheckBox, textInputEditText2, textInputLayout2, indicatorRadioGroup, viewH3, spinKitView, materialButton, appCompatTextView, centeredToolbar, textView);
                                                                        this.d = c4488in1;
                                                                        Intrinsics.checkNotNull(c4488in1);
                                                                        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
                                                                        return frameLayout;
                                                                    }
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.A50
    @NotNull
    public final CardView X() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        CardView cardView = c4488in1.e.d;
        Intrinsics.checkNotNullExpressionValue(cardView, "getRoot(...)");
        return cardView;
    }

    @Override // defpackage.A50
    @NotNull
    public final FrameLayout a() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        FrameLayout frameLayout = c4488in1.d;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        return frameLayout;
    }

    @Override // defpackage.A50
    @NotNull
    public final EditText b0() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        TextInputEditText emailEditText = c4488in1.h;
        Intrinsics.checkNotNullExpressionValue(emailEditText, "emailEditText");
        return emailEditText;
    }

    @Override // defpackage.InterfaceC2428Xm1
    @NotNull
    public final SpinKitView c() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        SpinKitView reRegistrationLoadingSpinKitView = c4488in1.o;
        Intrinsics.checkNotNullExpressionValue(reRegistrationLoadingSpinKitView, "reRegistrationLoadingSpinKitView");
        return reRegistrationLoadingSpinKitView;
    }

    @Override // defpackage.InterfaceC2428Xm1
    @NotNull
    public final Toolbar d() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        CenteredToolbar reRegistrationToolbar = c4488in1.r;
        Intrinsics.checkNotNullExpressionValue(reRegistrationToolbar, "reRegistrationToolbar");
        return reRegistrationToolbar;
    }

    @Override // defpackage.InterfaceC6698t50
    @NotNull
    public final CardView d0() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        CardView cardView = c4488in1.g.d;
        Intrinsics.checkNotNullExpressionValue(cardView, "getRoot(...)");
        return cardView;
    }

    @Override // defpackage.InterfaceC2428Xm1
    @NotNull
    public final TextView f0() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        TextView registrationAgreementText = c4488in1.s;
        Intrinsics.checkNotNullExpressionValue(registrationAgreementText, "registrationAgreementText");
        return registrationAgreementText;
    }

    @Override // defpackage.A50
    @NotNull
    public final ViewGroup g() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        FrameLayout frameLayout = c4488in1.d;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        return frameLayout;
    }

    @Override // defpackage.InterfaceC2428Xm1
    @NotNull
    public final TextView getTitle() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        AppCompatTextView reRegistrationTitle = c4488in1.q;
        Intrinsics.checkNotNullExpressionValue(reRegistrationTitle, "reRegistrationTitle");
        return reRegistrationTitle;
    }

    @Override // defpackage.InterfaceC2428Xm1
    @NotNull
    public final MaterialCheckBox t() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        MaterialCheckBox licenceCheckBox = c4488in1.j;
        Intrinsics.checkNotNullExpressionValue(licenceCheckBox, "licenceCheckBox");
        return licenceCheckBox;
    }

    @Override // defpackage.InterfaceC2428Xm1
    @NotNull
    public final TextInputLayout u() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        TextInputLayout emailTextInputLayout = c4488in1.i;
        Intrinsics.checkNotNullExpressionValue(emailTextInputLayout, "emailTextInputLayout");
        return emailTextInputLayout;
    }

    @Override // defpackage.InterfaceC2428Xm1
    @NotNull
    public final IndicatorRadioGroup v() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        IndicatorRadioGroup radioGroup = c4488in1.m;
        Intrinsics.checkNotNullExpressionValue(radioGroup, "radioGroup");
        return radioGroup;
    }

    @Override // defpackage.InterfaceC6698t50
    @NotNull
    public final TextView w() {
        C4488in1 c4488in1 = this.d;
        Intrinsics.checkNotNull(c4488in1);
        TextView hintText = c4488in1.g.e;
        Intrinsics.checkNotNullExpressionValue(hintText, "hintText");
        return hintText;
    }
}
