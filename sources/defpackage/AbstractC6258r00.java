package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: renamed from: r00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC6258r00 extends ViewDataBinding {
    public static final /* synthetic */ int H = 0;

    @NonNull
    public final AppCompatImageView A;

    @NonNull
    public final AppCompatTextView B;

    @NonNull
    public final AppCompatTextView C;

    @NonNull
    public final ShapeableImageView D;

    @NonNull
    public final TextView E;
    public C8 F;
    public E8 G;

    @NonNull
    public final AppCompatTextView y;

    @NonNull
    public final TextView z;

    public AbstractC6258r00(InterfaceC5089lS interfaceC5089lS, View view, AppCompatTextView appCompatTextView, TextView textView, AppCompatImageView appCompatImageView, AppCompatTextView appCompatTextView2, AppCompatTextView appCompatTextView3, ShapeableImageView shapeableImageView, TextView textView2) {
        super(interfaceC5089lS, view, 8);
        this.y = appCompatTextView;
        this.z = textView;
        this.A = appCompatImageView;
        this.B = appCompatTextView2;
        this.C = appCompatTextView3;
        this.D = shapeableImageView;
        this.E = textView2;
    }

    public abstract void A(C8 c8);

    public abstract void B(E8 e8);
}
