package defpackage;

import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: loaded from: classes3.dex */
public abstract class L00 extends ViewDataBinding {
    public static final /* synthetic */ int F = 0;

    @NonNull
    public final ProgressBar A;

    @NonNull
    public final AppCompatImageView B;

    @NonNull
    public final TextView C;

    @NonNull
    public final AppCompatTextView D;
    public Da2 E;

    @NonNull
    public final AppCompatTextView y;

    @NonNull
    public final ShapeableImageView z;

    public L00(InterfaceC5089lS interfaceC5089lS, View view, AppCompatTextView appCompatTextView, ShapeableImageView shapeableImageView, ProgressBar progressBar, AppCompatImageView appCompatImageView, TextView textView, AppCompatTextView appCompatTextView2) {
        super(interfaceC5089lS, view, 4);
        this.y = appCompatTextView;
        this.z = shapeableImageView;
        this.A = progressBar;
        this.B = appCompatImageView;
        this.C = textView;
        this.D = appCompatTextView2;
    }

    public abstract void A(Da2 da2);
}
