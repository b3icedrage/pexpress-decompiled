package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.api.resources.IndicatorRadioGroup;
import com.github.ybq.android.spinkit.SpinKitView;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.checkbox.MaterialCheckBox;
import com.google.android.material.textfield.TextInputLayout;

/* JADX INFO: renamed from: pm, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6004pm implements InterfaceC7441wd2 {

    @NonNull
    public final FrameLayout d;

    @NonNull
    public final AppCompatEditText e;

    @NonNull
    public final FA0 g;

    @NonNull
    public final TextInputLayout h;

    @NonNull
    public final ConstraintLayout i;

    @NonNull
    public final MaterialButton j;

    @NonNull
    public final TextView k;

    @NonNull
    public final TextView l;

    @NonNull
    public final TextView m;

    @NonNull
    public final AppCompatEditText n;

    @NonNull
    public final FA0 o;

    @NonNull
    public final TextInputLayout p;

    @NonNull
    public final IndicatorRadioGroup q;

    @NonNull
    public final MaterialCheckBox r;

    @NonNull
    public final TextView s;

    @NonNull
    public final View t;

    @NonNull
    public final SpinKitView u;

    @NonNull
    public final MaterialButton v;

    @NonNull
    public final TextView w;

    @NonNull
    public final MotionLayout x;

    @NonNull
    public final ImageView y;

    @NonNull
    public final TextView z;

    public C6004pm(@NonNull FrameLayout frameLayout, @NonNull AppCompatEditText appCompatEditText, @NonNull FA0 fa0, @NonNull TextInputLayout textInputLayout, @NonNull ConstraintLayout constraintLayout, @NonNull MaterialButton materialButton, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull AppCompatEditText appCompatEditText2, @NonNull FA0 fa1, @NonNull TextInputLayout textInputLayout2, @NonNull IndicatorRadioGroup indicatorRadioGroup, @NonNull MaterialCheckBox materialCheckBox, @NonNull TextView textView4, @NonNull View view, @NonNull SpinKitView spinKitView, @NonNull MaterialButton materialButton2, @NonNull TextView textView5, @NonNull MotionLayout motionLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ProgressBar progressBar, @NonNull TextView textView6, @NonNull SpinKitView spinKitView2, @NonNull TextView textView7) {
        this.d = frameLayout;
        this.e = appCompatEditText;
        this.g = fa0;
        this.h = textInputLayout;
        this.i = constraintLayout;
        this.j = materialButton;
        this.k = textView;
        this.l = textView2;
        this.m = textView3;
        this.n = appCompatEditText2;
        this.o = fa1;
        this.p = textInputLayout2;
        this.q = indicatorRadioGroup;
        this.r = materialCheckBox;
        this.s = textView4;
        this.t = view;
        this.u = spinKitView;
        this.v = materialButton2;
        this.w = textView5;
        this.x = motionLayout;
        this.y = imageView;
        this.z = textView7;
    }

    @Override // defpackage.InterfaceC7441wd2
    @NonNull
    public final View a() {
        return this.d;
    }
}
