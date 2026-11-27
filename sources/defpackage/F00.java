package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.databinding.ViewDataBinding;

/* JADX INFO: loaded from: classes3.dex */
public abstract class F00 extends ViewDataBinding {
    public static final /* synthetic */ int A = 0;

    @NonNull
    public final AppCompatTextView y;
    public C6920u80 z;

    public F00(InterfaceC5089lS interfaceC5089lS, View view, AppCompatTextView appCompatTextView) {
        super(interfaceC5089lS, view, 2);
        this.y = appCompatTextView;
    }

    public abstract void A(C6920u80 c6920u80);
}
