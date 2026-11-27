package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import com.api.resources.CenteredToolbar;
import com.api.resources.IndicatorRadioGroup;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: in1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C4488in1 implements InterfaceC7441wd2 {

    @NonNull
    public final FrameLayout d;

    @NonNull
    public final FA0 e;

    @NonNull
    public final FA0 g;

    @NonNull
    public final TextInputEditText h;

    @NonNull
    public final TextInputLayout i;

    @NonNull
    public final MaterialCheckBox j;

    @NonNull
    public final TextInputEditText k;

    @NonNull
    public final TextInputLayout l;

    @NonNull
    public final IndicatorRadioGroup m;

    @NonNull
    public final View n;

    @NonNull
    public final SpinKitView o;

    @NonNull
    public final MaterialButton p;

    @NonNull
    public final AppCompatTextView q;

    @NonNull
    public final CenteredToolbar r;

    @NonNull
    public final TextView s;

    public C4488in1(@NonNull FrameLayout frameLayout, @NonNull FA0 fa0, @NonNull FA0 fa1, @NonNull TextInputEditText textInputEditText, @NonNull TextInputLayout textInputLayout, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextInputEditText textInputEditText2, @NonNull TextInputLayout textInputLayout2, @NonNull IndicatorRadioGroup indicatorRadioGroup, @NonNull View view, @NonNull SpinKitView spinKitView, @NonNull MaterialButton materialButton, @NonNull AppCompatTextView appCompatTextView, @NonNull CenteredToolbar centeredToolbar, @NonNull TextView textView) {
        this.d = frameLayout;
        this.e = fa0;
        this.g = fa1;
        this.h = textInputEditText;
        this.i = textInputLayout;
        this.j = materialCheckBox;
        this.k = textInputEditText2;
        this.l = textInputLayout2;
        this.m = indicatorRadioGroup;
        this.n = view;
        this.o = spinKitView;
        this.p = materialButton;
        this.q = appCompatTextView;
        this.r = centeredToolbar;
        this.s = textView;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
