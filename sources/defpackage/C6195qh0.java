package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.cardview.widget.CardView;
import com.api.resources.CenteredToolbar;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: qh0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C6195qh0 implements InterfaceC5985ph0 {

    @Nullable
    public C0820Dh0 d;

    @Override // defpackage.InterfaceC5985ph0
    @NotNull
    public final MaterialButton B() {
        C0820Dh0 c0820Dh0 = this.d;
        Intrinsics.checkNotNull(c0820Dh0);
        MaterialButton forgotPasswordResetButton = c0820Dh0.i;
        Intrinsics.checkNotNullExpressionValue(forgotPasswordResetButton, "forgotPasswordResetButton");
        return forgotPasswordResetButton;
    }

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.A50
    @NotNull
    public final TextInputLayout U() {
        C0820Dh0 c0820Dh0 = this.d;
        Intrinsics.checkNotNull(c0820Dh0);
        TextInputLayout emailTextInputLayout = c0820Dh0.g;
        Intrinsics.checkNotNullExpressionValue(emailTextInputLayout, "emailTextInputLayout");
        return emailTextInputLayout;
    }

    @Override // defpackage.InterfaceC6856tq
    @Nullable
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.forgot_password_fragment, viewGroup, false);
        int i = R.id.emailHint;
        View viewH = C3476e.h(viewInflate, R.id.emailHint);
        if (viewH != null) {
            FA0 fa0B = FA0.b(viewH);
            i = R.id.emailTextInputLayout;
            TextInputLayout textInputLayout = (TextInputLayout) C3476e.h(viewInflate, R.id.emailTextInputLayout);
            if (textInputLayout != null) {
                i = R.id.forgetPassEditText;
                TextInputEditText textInputEditText = (TextInputEditText) C3476e.h(viewInflate, R.id.forgetPassEditText);
                if (textInputEditText != null) {
                    i = R.id.forget_password_description_text;
                    if (((TextView) C3476e.h(viewInflate, R.id.forget_password_description_text)) != null) {
                        i = R.id.forgot_password_app_bar_layout;
                        if (((AppBarLayout) C3476e.h(viewInflate, R.id.forgot_password_app_bar_layout)) != null) {
                            i = R.id.forgot_password_reset_button;
                            MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.forgot_password_reset_button);
                            if (materialButton != null) {
                                FrameLayout frameLayout = (FrameLayout) viewInflate;
                                i = R.id.forgot_password_toolbar;
                                CenteredToolbar centeredToolbar = (CenteredToolbar) C3476e.h(viewInflate, R.id.forgot_password_toolbar);
                                if (centeredToolbar != null) {
                                    i = R.id.loadingProgressBar;
                                    SpinKitView spinKitView = (SpinKitView) C3476e.h(viewInflate, R.id.loadingProgressBar);
                                    if (spinKitView != null) {
                                        this.d = new C0820Dh0(frameLayout, fa0B, textInputLayout, textInputEditText, materialButton, centeredToolbar, spinKitView);
                                        return frameLayout;
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
        C0820Dh0 c0820Dh0 = this.d;
        Intrinsics.checkNotNull(c0820Dh0);
        CardView cardView = c0820Dh0.e.d;
        Intrinsics.checkNotNullExpressionValue(cardView, "getRoot(...)");
        return cardView;
    }

    @Override // defpackage.A50
    @NotNull
    public final FrameLayout a() {
        C0820Dh0 c0820Dh0 = this.d;
        Intrinsics.checkNotNull(c0820Dh0);
        FrameLayout frameLayout = c0820Dh0.d;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        return frameLayout;
    }

    @Override // defpackage.A50
    @NotNull
    public final EditText b0() {
        C0820Dh0 c0820Dh0 = this.d;
        Intrinsics.checkNotNull(c0820Dh0);
        TextInputEditText forgetPassEditText = c0820Dh0.h;
        Intrinsics.checkNotNullExpressionValue(forgetPassEditText, "forgetPassEditText");
        return forgetPassEditText;
    }

    @Override // defpackage.InterfaceC5985ph0
    @NotNull
    public final SpinKitView c() {
        C0820Dh0 c0820Dh0 = this.d;
        Intrinsics.checkNotNull(c0820Dh0);
        SpinKitView loadingProgressBar = c0820Dh0.k;
        Intrinsics.checkNotNullExpressionValue(loadingProgressBar, "loadingProgressBar");
        return loadingProgressBar;
    }

    @Override // defpackage.InterfaceC5985ph0
    @NotNull
    public final Toolbar d() {
        C0820Dh0 c0820Dh0 = this.d;
        Intrinsics.checkNotNull(c0820Dh0);
        CenteredToolbar forgotPasswordToolbar = c0820Dh0.j;
        Intrinsics.checkNotNullExpressionValue(forgotPasswordToolbar, "forgotPasswordToolbar");
        return forgotPasswordToolbar;
    }

    @Override // defpackage.A50
    @NotNull
    public final ViewGroup g() {
        C0820Dh0 c0820Dh0 = this.d;
        Intrinsics.checkNotNull(c0820Dh0);
        FrameLayout frameLayout = c0820Dh0.d;
        Intrinsics.checkNotNullExpressionValue(frameLayout, "getRoot(...)");
        return frameLayout;
    }
}
