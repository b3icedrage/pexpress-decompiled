package defpackage;

import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;
import com.google.android.material.chip.ChipGroup;

/* JADX INFO: renamed from: v00, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public abstract class AbstractC7098v00 extends ViewDataBinding {
    public static final /* synthetic */ int F = 0;

    @NonNull
    public final ChipGroup A;

    @NonNull
    public final AppCompatTextView B;

    @NonNull
    public final TextView C;

    @NonNull
    public final TextView D;
    public C5454n9 E;

    @NonNull
    public final AppCompatTextView y;

    @NonNull
    public final AppCompatImageView z;

    public AbstractC7098v00(InterfaceC5089lS interfaceC5089lS, View view, AppCompatTextView appCompatTextView, AppCompatImageView appCompatImageView, ChipGroup chipGroup, AppCompatTextView appCompatTextView2, TextView textView, TextView textView2) {
        super(interfaceC5089lS, view, 5);
        this.y = appCompatTextView;
        this.z = appCompatImageView;
        this.A = chipGroup;
        this.B = appCompatTextView2;
        this.C = textView;
        this.D = textView2;
    }

    public abstract void A(C5454n9 c5454n9);
}
