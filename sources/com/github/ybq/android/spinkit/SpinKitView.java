package com.github.ybq.android.spinkit;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.ProgressBar;
import com.pexpress.tool.R;
import defpackage.C1755Pg0;
import defpackage.C2005Sl1;
import defpackage.C2578Zk1;
import defpackage.C2789al1;
import defpackage.C4153hC;
import defpackage.C5296mQ;
import defpackage.C7010ub0;
import defpackage.Ef2;
import defpackage.Hf2;
import defpackage.IO1;
import defpackage.N11;
import defpackage.NY1;
import defpackage.O11;
import defpackage.QA;
import defpackage.V31;
import defpackage.X20;
import defpackage.XA1;
import defpackage.YA1;
import defpackage.YT1;

/* JADX INFO: loaded from: classes.dex */
public class SpinKitView extends ProgressBar {
    public int d;
    public IO1 e;

    public SpinKitView(Context context, AttributeSet attributeSet) {
        IO1 ya1;
        super(context, attributeSet, R.attr.SpinKitViewStyle, R.style.SpinKitView);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C2005Sl1.a, R.attr.SpinKitViewStyle, R.style.SpinKitView);
        YT1 yt1 = YT1.values()[typedArrayObtainStyledAttributes.getInt(1, 0)];
        this.d = typedArrayObtainStyledAttributes.getColor(0, -1);
        typedArrayObtainStyledAttributes.recycle();
        switch (yt1.ordinal()) {
            case 0:
                ya1 = new YA1();
                break;
            case 1:
                ya1 = new X20();
                break;
            case 2:
                ya1 = new Hf2();
                break;
            case 3:
                ya1 = new Ef2();
                break;
            case 4:
                ya1 = new C2578Zk1();
                break;
            case 5:
                ya1 = new QA();
                break;
            case 6:
                ya1 = new NY1();
                break;
            case 7:
                ya1 = new C4153hC();
                break;
            case 8:
                ya1 = new C5296mQ();
                break;
            case 9:
                ya1 = new C7010ub0();
                break;
            case 10:
                ya1 = new C1755Pg0();
                break;
            case 11:
                ya1 = new XA1();
                break;
            case V31.CUSTOM_ATTRIBUTES_FIELD_NUMBER /* 12 */:
                ya1 = new N11();
                break;
            case 13:
                ya1 = new C2789al1();
                break;
            case 14:
                ya1 = new O11();
                break;
            default:
                ya1 = null;
                break;
        }
        ya1.g(this.d);
        setIndeterminateDrawable(ya1);
        setIndeterminate(true);
    }

    @Override // android.view.View
    public final void onScreenStateChanged(int i) {
        IO1 io1;
        super.onScreenStateChanged(i);
        if (i != 0 || (io1 = this.e) == null) {
            return;
        }
        io1.stop();
    }

    @Override // android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z && this.e != null && getVisibility() == 0) {
            this.e.start();
        }
    }

    public void setColor(int i) {
        this.d = i;
        IO1 io1 = this.e;
        if (io1 != null) {
            io1.g(i);
        }
        invalidate();
    }

    @Override // android.widget.ProgressBar
    public void setIndeterminateDrawable(Drawable drawable) {
        if (!(drawable instanceof IO1)) {
            throw new IllegalArgumentException("this d must be instanceof Sprite");
        }
        setIndeterminateDrawable((IO1) drawable);
    }

    @Override // android.view.View
    public final void unscheduleDrawable(Drawable drawable) {
        super.unscheduleDrawable(drawable);
        if (drawable instanceof IO1) {
            ((IO1) drawable).stop();
        }
    }

    @Override // android.widget.ProgressBar
    public IO1 getIndeterminateDrawable() {
        return this.e;
    }

    public void setIndeterminateDrawable(IO1 io1) {
        super.setIndeterminateDrawable((Drawable) io1);
        this.e = io1;
        if (io1.e() == 0) {
            this.e.g(this.d);
        }
        onSizeChanged(getWidth(), getHeight(), getWidth(), getHeight());
        if (getVisibility() == 0) {
            this.e.start();
        }
    }
}
