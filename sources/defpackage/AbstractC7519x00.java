package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.imageview.ShapeableImageView;

/* JADX INFO: renamed from: x00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7519x00 extends ViewDataBinding {
    public static final /* synthetic */ int F = 0;

    @NonNull
    public final ShapeableImageView A;

    @NonNull
    public final AppCompatImageView B;

    @NonNull
    public final TextView C;
    public HD D;
    public KD E;

    @NonNull
    public final AppCompatTextView y;

    @NonNull
    public final AppCompatTextView z;

    public AbstractC7519x00(InterfaceC5089lS interfaceC5089lS, View view, AppCompatTextView appCompatTextView, AppCompatTextView appCompatTextView2, ShapeableImageView shapeableImageView, AppCompatImageView appCompatImageView, TextView textView) {
        super(interfaceC5089lS, view, 4);
        this.y = appCompatTextView;
        this.z = appCompatTextView2;
        this.A = shapeableImageView;
        this.B = appCompatImageView;
        this.C = textView;
    }

    public abstract void A(HD hd);

    public abstract void B(KD kd);
}
