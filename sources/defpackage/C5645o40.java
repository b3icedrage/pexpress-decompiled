package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.motion.widget.MotionLayout;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.google.android.material.textview.MaterialTextView;
import com.pexpress.tool.R;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: renamed from: o40, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5645o40 implements InterfaceC5435n40 {

    @Nullable
    public C7745y40 d;

    @Override // defpackage.InterfaceC6856tq
    public final void E() {
        this.d = null;
    }

    @Override // defpackage.InterfaceC5435n40
    @NotNull
    public final MaterialButton O() {
        C7745y40 c7745y40 = this.d;
        Intrinsics.checkNotNull(c7745y40);
        MaterialButton duoAuthVerifyButton = c7745y40.j;
        Intrinsics.checkNotNullExpressionValue(duoAuthVerifyButton, "duoAuthVerifyButton");
        return duoAuthVerifyButton;
    }

    @Override // defpackage.InterfaceC5435n40
    @NotNull
    public final TextInputEditText R() {
        C7745y40 c7745y40 = this.d;
        Intrinsics.checkNotNull(c7745y40);
        TextInputEditText duoAuthEditText = c7745y40.h;
        Intrinsics.checkNotNullExpressionValue(duoAuthEditText, "duoAuthEditText");
        return duoAuthEditText;
    }

    @Override // defpackage.InterfaceC6856tq
    @Nullable
    public final View V(@NotNull LayoutInflater inflater, @Nullable ViewGroup viewGroup) {
        Intrinsics.checkNotNullParameter(inflater, "inflater");
        View viewInflate = inflater.inflate(R.layout.duo_auth_fragment, viewGroup, false);
        int i = R.id.duo_auth_back_button;
        AppCompatImageButton appCompatImageButton = (AppCompatImageButton) C3476e.h(viewInflate, R.id.duo_auth_back_button);
        if (appCompatImageButton != null) {
            i = R.id.duo_auth_caption;
            MaterialTextView materialTextView = (MaterialTextView) C3476e.h(viewInflate, R.id.duo_auth_caption);
            if (materialTextView != null) {
                i = R.id.duo_auth_edit_text;
                TextInputEditText textInputEditText = (TextInputEditText) C3476e.h(viewInflate, R.id.duo_auth_edit_text);
                if (textInputEditText != null) {
                    i = R.id.duo_auth_icon;
                    if (((AppCompatImageView) C3476e.h(viewInflate, R.id.duo_auth_icon)) != null) {
                        i = R.id.duo_auth_motion_container;
                        MotionLayout motionLayout = (MotionLayout) C3476e.h(viewInflate, R.id.duo_auth_motion_container);
                        if (motionLayout != null) {
                            FrameLayout frameLayout = (FrameLayout) viewInflate;
                            i = R.id.duo_auth_subtitle;
                            if (((MaterialTextView) C3476e.h(viewInflate, R.id.duo_auth_subtitle)) != null) {
                                i = R.id.duo_auth_text_input_layout;
                                if (((TextInputLayout) C3476e.h(viewInflate, R.id.duo_auth_text_input_layout)) != null) {
                                    i = R.id.duo_auth_verify_button;
                                    MaterialButton materialButton = (MaterialButton) C3476e.h(viewInflate, R.id.duo_auth_verify_button);
                                    if (materialButton != null) {
                                        this.d = new C7745y40(frameLayout, appCompatImageButton, materialTextView, textInputEditText, motionLayout, materialButton);
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

    @Override // defpackage.InterfaceC5435n40
    @NotNull
    public final MotionLayout g() {
        C7745y40 c7745y40 = this.d;
        Intrinsics.checkNotNull(c7745y40);
        MotionLayout duoAuthMotionContainer = c7745y40.i;
        Intrinsics.checkNotNullExpressionValue(duoAuthMotionContainer, "duoAuthMotionContainer");
        return duoAuthMotionContainer;
    }

    @Override // defpackage.InterfaceC5435n40
    @NotNull
    public final MaterialTextView o() {
        C7745y40 c7745y40 = this.d;
        Intrinsics.checkNotNull(c7745y40);
        MaterialTextView duoAuthCaption = c7745y40.g;
        Intrinsics.checkNotNullExpressionValue(duoAuthCaption, "duoAuthCaption");
        return duoAuthCaption;
    }

    @Override // defpackage.InterfaceC5435n40
    @NotNull
    public final AppCompatImageButton q() {
        C7745y40 c7745y40 = this.d;
        Intrinsics.checkNotNull(c7745y40);
        AppCompatImageButton duoAuthBackButton = c7745y40.e;
        Intrinsics.checkNotNullExpressionValue(duoAuthBackButton, "duoAuthBackButton");
        return duoAuthBackButton;
    }
}
