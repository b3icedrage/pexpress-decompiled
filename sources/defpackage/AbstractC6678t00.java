package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: renamed from: t00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6678t00 extends ViewDataBinding {
    public static final /* synthetic */ int E = 0;

    @NonNull
    public final LinearLayout A;

    @NonNull
    public final TextView B;
    public I8 C;
    public J8 D;

    @NonNull
    public final AppCompatImageView y;

    @NonNull
    public final AppCompatImageView z;

    public AbstractC6678t00(InterfaceC5089lS interfaceC5089lS, View view, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, LinearLayout linearLayout, TextView textView) {
        super(interfaceC5089lS, view, 4);
        this.y = appCompatImageView;
        this.z = appCompatImageView2;
        this.A = linearLayout;
        this.B = textView;
    }

    public abstract void A(I8 i8);

    public abstract void B(J8 j8);
}
