package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import defpackage.C1901Rd;
import defpackage.C6182qe;
import defpackage.C7211vY1;
import defpackage.TZ1;
import defpackage.UZ1;

/* JADX INFO: loaded from: classes.dex */
public class AppCompatImageButton extends ImageButton {
    public final C1901Rd d;
    public final C6182qe e;
    public boolean g;

    public AppCompatImageButton(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.imageButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.a();
        }
        C6182qe c6182qe = this.e;
        if (c6182qe != null) {
            c6182qe.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            return c1901Rd.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            return c1901Rd.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        UZ1 uz1;
        C6182qe c6182qe = this.e;
        if (c6182qe == null || (uz1 = c6182qe.b) == null) {
            return null;
        }
        return uz1.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        UZ1 uz1;
        C6182qe c6182qe = this.e;
        if (c6182qe == null || (uz1 = c6182qe.b) == null) {
            return null;
        }
        return uz1.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(this.e.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C6182qe c6182qe = this.e;
        if (c6182qe != null) {
            c6182qe.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C6182qe c6182qe = this.e;
        if (c6182qe != null && drawable != null && !this.g) {
            c6182qe.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c6182qe != null) {
            c6182qe.a();
            if (this.g) {
                return;
            }
            ImageView imageView = c6182qe.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(c6182qe.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.g = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        this.e.c(i);
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C6182qe c6182qe = this.e;
        if (c6182qe != null) {
            c6182qe.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        C6182qe c6182qe = this.e;
        if (c6182qe != null) {
            if (c6182qe.b == null) {
                c6182qe.b = new UZ1();
            }
            UZ1 uz1 = c6182qe.b;
            uz1.a = colorStateList;
            uz1.d = true;
            c6182qe.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C6182qe c6182qe = this.e;
        if (c6182qe != null) {
            if (c6182qe.b == null) {
                c6182qe.b = new UZ1();
            }
            UZ1 uz1 = c6182qe.b;
            uz1.b = mode;
            uz1.c = true;
            c6182qe.a();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageButton(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        TZ1.a(context);
        this.g = false;
        C7211vY1.a(this, getContext());
        C1901Rd c1901Rd = new C1901Rd(this);
        this.d = c1901Rd;
        c1901Rd.d(attributeSet, i);
        C6182qe c6182qe = new C6182qe(this);
        this.e = c6182qe;
        c6182qe.b(attributeSet, i);
    }
}
