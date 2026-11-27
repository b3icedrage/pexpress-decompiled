package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.jivosite.sdk.ui.views.JivoRatingBar;

/* JADX INFO: loaded from: classes3.dex */
public abstract class H00 extends ViewDataBinding {
    public static final /* synthetic */ int D = 0;

    @NonNull
    public final JivoRatingBar A;

    @NonNull
    public final MaterialButton B;
    public C6845tm1 C;

    @NonNull
    public final AppCompatImageButton y;

    @NonNull
    public final TextInputEditText z;

    public H00(InterfaceC5089lS interfaceC5089lS, View view, AppCompatImageButton appCompatImageButton, TextInputEditText textInputEditText, JivoRatingBar jivoRatingBar, MaterialButton materialButton) {
        super(interfaceC5089lS, view, 1);
        this.y = appCompatImageButton;
        this.z = textInputEditText;
        this.A = jivoRatingBar;
        this.B = materialButton;
    }

    public abstract void A(C6845tm1 c6845tm1);
}
