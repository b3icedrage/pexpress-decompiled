package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.appbar.MaterialToolbar;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.google.android.material.textfield.TextInputEditText;
import com.jivosite.sdk.ui.chat.JivoChatFragment;

/* JADX INFO: renamed from: ki0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC4936ki0 extends ViewDataBinding {
    public static final /* synthetic */ int M = 0;

    @NonNull
    public final CircularProgressIndicator A;

    @NonNull
    public final TextView B;

    @NonNull
    public final CardView C;

    @NonNull
    public final TextView D;

    @NonNull
    public final ConstraintLayout E;

    @NonNull
    public final LinearLayoutCompat F;

    @NonNull
    public final TextInputEditText G;

    @NonNull
    public final RecyclerView H;

    @NonNull
    public final MaterialButton I;

    @NonNull
    public final MaterialToolbar J;
    public JivoChatFragment K;
    public SF0 L;

    @NonNull
    public final AppCompatImageButton y;

    @NonNull
    public final AppCompatTextView z;

    public AbstractC4936ki0(InterfaceC5089lS interfaceC5089lS, View view, AppCompatImageButton appCompatImageButton, AppCompatTextView appCompatTextView, CircularProgressIndicator circularProgressIndicator, TextView textView, CardView cardView, TextView textView2, ConstraintLayout constraintLayout, LinearLayoutCompat linearLayoutCompat, TextInputEditText textInputEditText, RecyclerView recyclerView, MaterialButton materialButton, MaterialToolbar materialToolbar) {
        super(interfaceC5089lS, view, 7);
        this.y = appCompatImageButton;
        this.z = appCompatTextView;
        this.A = circularProgressIndicator;
        this.B = textView;
        this.C = cardView;
        this.D = textView2;
        this.E = constraintLayout;
        this.F = linearLayoutCompat;
        this.G = textInputEditText;
        this.H = recyclerView;
        this.I = materialButton;
        this.J = materialToolbar;
    }

    public abstract void A(JivoChatFragment jivoChatFragment);

    public abstract void B(SF0 sf0);
}
