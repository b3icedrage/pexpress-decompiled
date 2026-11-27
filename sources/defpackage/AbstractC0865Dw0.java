package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Dw0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0865Dw0<Z> extends AbstractC7024ue2<ImageView, Z> {
    public Animatable g;

    public abstract void c(Z z);

    @Override // defpackage.InterfaceC5529nX1
    public final void h(Drawable drawable) {
        c(null);
        this.g = null;
        this.d.setImageDrawable(drawable);
    }

    @Override // defpackage.InterfaceC5529nX1
    public final void i(Drawable drawable) {
        c(null);
        this.g = null;
        this.d.setImageDrawable(drawable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC5529nX1
    public final void j(@NonNull Z z, H42<? super Z> h42) {
        if (h42 != null && h42.a(z, this)) {
            if (!(z instanceof Animatable)) {
                this.g = null;
                return;
            }
            Animatable animatable = (Animatable) z;
            this.g = animatable;
            animatable.start();
            return;
        }
        c(z);
        if (!(z instanceof Animatable)) {
            this.g = null;
            return;
        }
        Animatable animatable2 = (Animatable) z;
        this.g = animatable2;
        animatable2.start();
    }

    @Override // defpackage.AbstractC7024ue2, defpackage.InterfaceC5529nX1
    public final void k(Drawable drawable) {
        super.k(drawable);
        Animatable animatable = this.g;
        if (animatable != null) {
            animatable.stop();
        }
        c(null);
        this.g = null;
        this.d.setImageDrawable(drawable);
    }

    @Override // defpackage.DP0
    public final void onStart() {
        Animatable animatable = this.g;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.DP0
    public final void onStop() {
        Animatable animatable = this.g;
        if (animatable != null) {
            animatable.stop();
        }
    }
}
