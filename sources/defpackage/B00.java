package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes3.dex */
public abstract class B00 extends ViewDataBinding {
    public static final /* synthetic */ int C = 0;

    @NonNull
    public final TextView A;
    public C2677aE B;

    @NonNull
    public final AppCompatTextView y;

    @NonNull
    public final AppCompatImageView z;

    public B00(InterfaceC5089lS interfaceC5089lS, View view, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, TextView textView) {
        super(interfaceC5089lS, view, 3);
        this.y = appCompatTextView;
        this.z = appCompatImageView;
        this.A = textView;
    }

    public abstract void A(C2677aE c2677aE);
}
