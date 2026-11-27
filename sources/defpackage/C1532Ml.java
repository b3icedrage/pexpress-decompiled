package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.api.resources.IndicatorRadioGroup;
import com.api.resources.RadioIndicatorButton;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputLayout;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: Ml, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C1532Ml implements InterfaceC1455Ll {

    @Nullable
    public C6004pm d;

    @Override // defpackage.InterfaceC1455Ll
    @NotNull
    public final IndicatorRadioGroup A() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        IndicatorRadioGroup radioGroup = c6004pm.q;
        Intrinsics.checkNotNullExpressionValue(radioGroup, "radioGroup");
        return radioGroup;
    }

    @Override // defpackage.InterfaceC6698t50
    @NotNull
    public final TextInputLayout D() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        TextInputLayout passwordTextInputLayout = c6004pm.p;
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
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        View registrationAndLoginBlockingView = c6004pm.t;
        Intrinsics.checkNotNullExpressionValue(registrationAndLoginBlockingView, "registrationAndLoginBlockingView");
        return registrationAndLoginBlockingView;
    }

    @Override // defpackage.InterfaceC6698t50
    @NotNull
    public final EditText J() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        AppCompatEditText passwordEditText = c6004pm.n;
        Intrinsics.checkNotNullExpressionValue(passwordEditText, "passwordEditText");
        return passwordEditText;
    }

    @Override // defpackage.InterfaceC1455Ll
    @NotNull
    public final ConstraintLayout K() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        ConstraintLayout fullScreenLoading = c6004pm.i;
        Intrinsics.checkNotNullExpressionValue(fullScreenLoading, "fullScreenLoading");
        return fullScreenLoading;
    }

    @Override // defpackage.InterfaceC1455Ll
    @NotNull
    public final MaterialButton P() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        MaterialButton registrationButton = c6004pm.v;
        Intrinsics.checkNotNullExpressionValue(registrationButton, "registrationButton");
        return registrationButton;
    }

    @Override // defpackage.InterfaceC1455Ll
    @NotNull
    public final TextView T() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        TextView loginForgotPasswordTextButton = c6004pm.k;
        Intrinsics.checkNotNullExpressionValue(loginForgotPasswordTextButton, "loginForgotPasswordTextButton");
        return loginForgotPasswordTextButton;
    }

    @Override // defpackage.A50
    @NotNull
    public final TextInputLayout U() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        TextInputLayout emailTextInputLayout = c6004pm.h;
        Intrinsics.checkNotNullExpressionValue(emailTextInputLayout, "emailTextInputLayout");
        return emailTextInputLayout;
    }

    @Override // defpackage.InterfaceC6856tq
    @NotNull
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.authorization_fragment, viewGroup, false);
        int i = R.id.curr_radio_group_container;
        if (((FrameLayout) C3476e.h(viewInflate, R.id.curr_radio_group_container)) != null) {
            i = R.id.emailEditText;
            AppCompatEditText appCompatEditText = (AppCompatEditText) C3476e.h(viewInflate, R.id.emailEditText);
            if (appCompatEditText != null) {
                i = R.id.emailHint;
                View viewH = C3476e.h(viewInflate, R.id.emailHint);
                if (viewH != null) {
                    FA0 fa0B = FA0.b(viewH);
                    i = R.id.emailTextInputLayout;
                    TextInputLayout textInputLayout = (TextInputLayout) C3476e.h(viewInflate, R.id.emailTextInputLayout);
                    if (textInputLayout != null) {
                        i = R.id.full_screen_loading;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C3476e.h(viewInflate, R.id.full_screen_loading);
                        if (constraintLayout != null) {
                            i = R.id.loginButton;
                            MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.loginButton);
                            if (materialButton != null) {
                                i = R.id.loginButtonFrame;
                                if (((FrameLayout) C3476e.h(viewInflate, R.id.loginButtonFrame)) != null) {
                                    i = R.id.login_forgot_password_text_button;
                                    TextView textView = (TextView) C3476e.h(viewInflate, R.id.login_forgot_password_text_button);
                                    if (textView != null) {
                                        i = R.id.login_header;
                                        TextView textView2 = (TextView) C3476e.h(viewInflate, R.id.login_header);
                                        if (textView2 != null) {
                                            i = R.id.login_title;
                                            TextView textView3 = (TextView) C3476e.h(viewInflate, R.id.login_title);
                                            if (textView3 != null) {
                                                i = R.id.passwordEditText;
                                                AppCompatEditText appCompatEditText2 = (AppCompatEditText) C3476e.h(viewInflate, R.id.passwordEditText);
                                                if (appCompatEditText2 != null) {
                                                    i = R.id.passwordHint;
                                                    View viewH2 = C3476e.h(viewInflate, R.id.passwordHint);
                                                    if (viewH2 != null) {
                                                        FA0 fa0B2 = FA0.b(viewH2);
                                                        i = R.id.passwordTextInputLayout;
                                                        TextInputLayout textInputLayout2 = (TextInputLayout) C3476e.h(viewInflate, R.id.passwordTextInputLayout);
                                                        if (textInputLayout2 != null) {
                                                            i = R.id.radio_btn_one;
                                                            if (((RadioIndicatorButton) C3476e.h(viewInflate, R.id.radio_btn_one)) != null) {
                                                                i = R.id.radio_btn_three;
                                                                if (((RadioIndicatorButton) C3476e.h(viewInflate, R.id.radio_btn_three)) != null) {
                                                                    i = R.id.radio_btn_two;
                                                                    if (((RadioIndicatorButton) C3476e.h(viewInflate, R.id.radio_btn_two)) != null) {
                                                                        i = R.id.radio_group;
                                                                        IndicatorRadioGroup indicatorRadioGroup = (IndicatorRadioGroup) C3476e.h(viewInflate, R.id.radio_group);
                                                                        if (indicatorRadioGroup != null) {
                                                                            i = R.id.registration_agreement_check_box;
                                                                            MaterialCheckBox materialCheckBox = (MaterialCheckBox) C3476e.h(viewInflate, R.id.registration_agreement_check_box);
                                                                            if (materialCheckBox != null) {
                                                                                i = R.id.registration_agreement_container;
                                                                                if (((LinearLayout) C3476e.h(viewInflate, R.id.registration_agreement_container)) != null) {
                                                                                    i = R.id.registration_agreement_text;
                                                                                    TextView textView4 = (TextView) C3476e.h(viewInflate, R.id.registration_agreement_text);
                                                                                    if (textView4 != null) {
                                                                                        i = R.id.registration_and_login_barrier;
                                                                                        if (((Barrier) C3476e.h(viewInflate, R.id.registration_and_login_barrier)) != null) {
                                                                                            i = R.id.registration_and_login_blocking_view;
                                                                                            View viewH3 = C3476e.h(viewInflate, R.id.registration_and_login_blocking_view);
                                                                                            if (viewH3 != null) {
                                                                                                i = R.id.registration_and_login_loading_frame;
                                                                                                if (((FrameLayout) C3476e.h(viewInflate, R.id.registration_and_login_loading_frame)) != null) {
                                                                                                    i = R.id.registration_and_login_loading_progress_bar;
                                                                                                    SpinKitView spinKitView = (SpinKitView) C3476e.h(viewInflate, R.id.registration_and_login_loading_progress_bar);
                                                                                                    if (spinKitView != null) {
                                                                                                        FrameLayout frameLayout = (FrameLayout) viewInflate;
                                                                                                        i = R.id.registration_and_login_slider;
                                                                                                        if (((ImageView) C3476e.h(viewInflate, R.id.registration_and_login_slider)) != null) {
                                                                                                            i = R.id.registrationButton;
                                                                                                            MaterialButton materialButton2 = (MaterialButton) C3476e.h(viewInflate, R.id.registrationButton);
                                                                                                            if (materialButton2 != null) {
                                                                                                                i = R.id.registrationButtonFrame;
                                                                                                                if (((FrameLayout) C3476e.h(viewInflate, R.id.registrationButtonFrame)) != null) {
                                                                                                                    i = R.id.registration_header;
                                                                                                                    TextView textView5 = (TextView) C3476e.h(viewInflate, R.id.registration_header);
                                                                                                                    if (textView5 != null) {
                                                                                                                        i = R.id.registration_motion_container;
                                                                                                                        MotionLayout motionLayout = (MotionLayout) C3476e.h(viewInflate, R.id.registration_motion_container);
                                                                                                                        if (motionLayout != null) {
                                                                                                                            i = R.id.registration_soc_login_close_image_button;
                                                                                                                            ImageView imageView = (ImageView) C3476e.h(viewInflate, R.id.registration_soc_login_close_image_button);
                                                                                                                            if (imageView != null) {
                                                                                                                                i = R.id.registration_soc_login_loading_image;
                                                                                                                                ImageView imageView2 = (ImageView) C3476e.h(viewInflate, R.id.registration_soc_login_loading_image);
                                                                                                                                if (imageView2 != null) {
                                                                                                                                    i = R.id.registration_soc_login_loading_progress_bar;
                                                                                                                                    ProgressBar progressBar = (ProgressBar) C3476e.h(viewInflate, R.id.registration_soc_login_loading_progress_bar);
                                                                                                                                    if (progressBar != null) {
                                                                                                                                        i = R.id.registration_soc_login_loading_text;
                                                                                                                                        TextView textView6 = (TextView) C3476e.h(viewInflate, R.id.registration_soc_login_loading_text);
                                                                                                                                        if (textView6 != null) {
                                                                                                                                            i = R.id.registration_soc_login_logged_progress_bar;
                                                                                                                                            SpinKitView spinKitView2 = (SpinKitView) C3476e.h(viewInflate, R.id.registration_soc_login_logged_progress_bar);
                                                                                                                                            if (spinKitView2 != null) {
                                                                                                                                                i = R.id.registration_title;
                                                                                                                                                TextView textView7 = (TextView) C3476e.h(viewInflate, R.id.registration_title);
                                                                                                                                                if (textView7 != null) {
                                                                                                                                                    C6004pm c6004pm = new C6004pm(frameLayout, appCompatEditText, fa0B, textInputLayout, constraintLayout, materialButton, textView, textView2, textView3, appCompatEditText2, fa0B2, textInputLayout2, indicatorRadioGroup, materialCheckBox, textView4, viewH3, spinKitView, materialButton2, textView5, motionLayout, imageView, imageView2, progressBar, textView6, spinKitView2, textView7);
                                                                                                                                                    this.d = c6004pm;
                                                                                                                                                    Intrinsics.checkNotNull(c6004pm);
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
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(viewInflate.getResources().getResourceName(i)));
    }

    @Override // defpackage.A50
    @NotNull
    public final CardView X() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        CardView cardView = c6004pm.g.d;
        Intrinsics.checkNotNullExpressionValue(cardView, "getRoot(...)");
        return cardView;
    }

    @Override // defpackage.InterfaceC1455Ll
    @NotNull
    public final MaterialButton Z() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        MaterialButton loginButton = c6004pm.j;
        Intrinsics.checkNotNullExpressionValue(loginButton, "loginButton");
        return loginButton;
    }

    @Override // defpackage.A50
    @NotNull
    public final FrameLayout a() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        FrameLayout frameLayout = c6004pm.d;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        return frameLayout;
    }

    @Override // defpackage.A50
    @NotNull
    public final EditText b0() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        AppCompatEditText emailEditText = c6004pm.e;
        Intrinsics.checkNotNullExpressionValue(emailEditText, "emailEditText");
        return emailEditText;
    }

    @Override // defpackage.InterfaceC1455Ll
    @NotNull
    public final SpinKitView c() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        SpinKitView registrationAndLoginLoadingProgressBar = c6004pm.u;
        Intrinsics.checkNotNullExpressionValue(registrationAndLoginLoadingProgressBar, "registrationAndLoginLoadingProgressBar");
        return registrationAndLoginLoadingProgressBar;
    }

    @Override // defpackage.InterfaceC1455Ll
    @NotNull
    public final TextView c0() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        TextView registrationAgreementText = c6004pm.s;
        Intrinsics.checkNotNullExpressionValue(registrationAgreementText, "registrationAgreementText");
        return registrationAgreementText;
    }

    @Override // defpackage.InterfaceC6698t50
    @NotNull
    public final CardView d0() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        CardView cardView = c6004pm.o.d;
        Intrinsics.checkNotNullExpressionValue(cardView, "getRoot(...)");
        return cardView;
    }

    @Override // defpackage.InterfaceC1455Ll
    @NotNull
    public final ImageView e0() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        ImageView registrationSocLoginCloseImageButton = c6004pm.y;
        Intrinsics.checkNotNullExpressionValue(registrationSocLoginCloseImageButton, "registrationSocLoginCloseImageButton");
        return registrationSocLoginCloseImageButton;
    }

    @Override // defpackage.A50
    public final ViewGroup g() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        MotionLayout registrationMotionContainer = c6004pm.x;
        Intrinsics.checkNotNullExpressionValue(registrationMotionContainer, "registrationMotionContainer");
        return registrationMotionContainer;
    }

    @Override // defpackage.InterfaceC1455Ll
    @NotNull
    public final TextView i() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        TextView registrationTitle = c6004pm.z;
        Intrinsics.checkNotNullExpressionValue(registrationTitle, "registrationTitle");
        return registrationTitle;
    }

    @Override // defpackage.InterfaceC1455Ll
    @NotNull
    public final TextView k() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        TextView loginTitle = c6004pm.m;
        Intrinsics.checkNotNullExpressionValue(loginTitle, "loginTitle");
        return loginTitle;
    }

    @Override // defpackage.InterfaceC1455Ll
    @NotNull
    public final MaterialCheckBox l() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        MaterialCheckBox registrationAgreementCheckBox = c6004pm.r;
        Intrinsics.checkNotNullExpressionValue(registrationAgreementCheckBox, "registrationAgreementCheckBox");
        return registrationAgreementCheckBox;
    }

    @Override // defpackage.InterfaceC1455Ll
    @NotNull
    public final TextView m() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        TextView loginHeader = c6004pm.l;
        Intrinsics.checkNotNullExpressionValue(loginHeader, "loginHeader");
        return loginHeader;
    }

    @Override // defpackage.InterfaceC6698t50
    @NotNull
    public final TextView w() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        TextView hintText = c6004pm.o.e;
        Intrinsics.checkNotNullExpressionValue(hintText, "hintText");
        return hintText;
    }

    @Override // defpackage.InterfaceC1455Ll
    @NotNull
    public final TextView x() {
        C6004pm c6004pm = this.d;
        Intrinsics.checkNotNull(c6004pm);
        TextView registrationHeader = c6004pm.w;
        Intrinsics.checkNotNullExpressionValue(registrationHeader, "registrationHeader");
        return registrationHeader;
    }
}
