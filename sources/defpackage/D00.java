package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;

/* JADX INFO: loaded from: classes3.dex */
public abstract class D00 extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;

    @NonNull
    public final TextInputEditText A;

    @NonNull
    public final TextInputEditText B;

    @NonNull
    public final TextInputEditText C;
    public C6960uL D;

    @NonNull
    public final AppCompatTextView y;

    @NonNull
    public final MaterialButton z;

    public D00(InterfaceC5089lS interfaceC5089lS, View view, AppCompatTextView appCompatTextView, MaterialButton materialButton, TextInputEditText textInputEditText, TextInputEditText textInputEditText2, TextInputEditText textInputEditText3) {
        super(interfaceC5089lS, view, 9);
        this.y = appCompatTextView;
        this.z = materialButton;
        this.A = textInputEditText;
        this.B = textInputEditText2;
        this.C = textInputEditText3;
    }

    public abstract void A(C6960uL c6960uL);
}
