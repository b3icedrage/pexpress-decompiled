package defpackage;

import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.TransitionDrawable;
import android.widget.ImageView;

/* JADX INFO: loaded from: classes.dex */
public final class C30 implements H42<Drawable> {
    public final boolean a;

    public C30(boolean z) {
        this.a = z;
    }

    @Override // defpackage.H42
    public final boolean a(Object obj, AbstractC0865Dw0 abstractC0865Dw0) {
        Drawable drawable = (Drawable) obj;
        ImageView imageView = abstractC0865Dw0.d;
        Drawable drawable2 = imageView.getDrawable();
        if (drawable2 == null) {
            drawable2 = new ColorDrawable(0);
        }
        TransitionDrawable transitionDrawable = new TransitionDrawable(new Drawable[]{drawable2, drawable});
        transitionDrawable.setCrossFadeEnabled(this.a);
        transitionDrawable.startTransition(300);
        imageView.setImageDrawable(transitionDrawable);
        return true;
    }
}
