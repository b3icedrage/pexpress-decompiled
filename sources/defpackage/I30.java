package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
public abstract class I30<T extends Drawable> implements InterfaceC3667et1<T>, InterfaceC3518eA0 {
    public final T d;

    public I30(T t) {
        UE.e(t, "Argument must not be null");
        this.d = t;
    }

    public void a() {
        T t = this.d;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (t instanceof C0988Fl0) {
            ((C0988Fl0) t).d.a.l.prepareToDraw();
        }
    }

    @Override // defpackage.InterfaceC3667et1
    @NonNull
    public final Object get() {
        T t = this.d;
        Drawable.ConstantState constantState = t.getConstantState();
        return constantState == null ? t : constantState.newDrawable();
    }
}
