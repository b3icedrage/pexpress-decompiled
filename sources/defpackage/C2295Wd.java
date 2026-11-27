package defpackage;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Wd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2295Wd {

    @NonNull
    public final C2213Vd a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public C2295Wd(@NonNull C2213Vd c2213Vd) {
        this.a = c2213Vd;
    }

    public final void a() {
        C2213Vd c2213Vd = this.a;
        Drawable checkMarkDrawable = c2213Vd.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = checkMarkDrawable.mutate();
                if (this.d) {
                    A30.a.h(drawableMutate, this.b);
                }
                if (this.e) {
                    A30.a.i(drawableMutate, this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(c2213Vd.getDrawableState());
                }
                c2213Vd.setCheckMarkDrawable(drawableMutate);
            }
        }
    }
}
