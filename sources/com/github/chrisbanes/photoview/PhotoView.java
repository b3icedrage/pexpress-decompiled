package com.github.chrisbanes.photoview;

import android.content.Context;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.widget.AppCompatImageView;
import defpackage.C6386rc2;
import defpackage.InterfaceC2887b91;
import defpackage.InterfaceC3306d91;
import defpackage.InterfaceC3515e91;
import defpackage.InterfaceC4355i91;
import defpackage.InterfaceC4823k91;
import defpackage.InterfaceC5876p91;
import defpackage.InterfaceC6086q91;
import defpackage.ViewOnTouchListenerC8070zd1;

/* JADX INFO: loaded from: classes.dex */
public class PhotoView extends AppCompatImageView {
    public final ViewOnTouchListenerC8070zd1 h;
    public ImageView.ScaleType i;

    public PhotoView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.h = new ViewOnTouchListenerC8070zd1(this);
        super.setScaleType(ImageView.ScaleType.MATRIX);
        ImageView.ScaleType scaleType = this.i;
        if (scaleType != null) {
            setScaleType(scaleType);
            this.i = null;
        }
    }

    public ViewOnTouchListenerC8070zd1 getAttacher() {
        return this.h;
    }

    public RectF getDisplayRect() {
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.h;
        viewOnTouchListenerC8070zd1.b();
        Matrix matrixC = viewOnTouchListenerC8070zd1.c();
        Drawable drawable = viewOnTouchListenerC8070zd1.l.getDrawable();
        if (drawable == null) {
            return null;
        }
        RectF rectF = viewOnTouchListenerC8070zd1.r;
        rectF.set(0.0f, 0.0f, drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight());
        matrixC.mapRect(rectF);
        return rectF;
    }

    @Override // android.widget.ImageView
    public Matrix getImageMatrix() {
        return this.h.p;
    }

    public float getMaximumScale() {
        return this.h.i;
    }

    public float getMediumScale() {
        return this.h.h;
    }

    public float getMinimumScale() {
        return this.h.g;
    }

    public float getScale() {
        return this.h.d();
    }

    @Override // android.widget.ImageView
    public ImageView.ScaleType getScaleType() {
        return this.h.z;
    }

    public void setAllowParentInterceptOnEdge(boolean z) {
        this.h.j = z;
    }

    @Override // android.widget.ImageView
    public final boolean setFrame(int i, int i2, int i3, int i4) {
        boolean frame = super.setFrame(i, i2, i3, i4);
        if (frame) {
            this.h.f();
        }
        return frame;
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.h;
        if (viewOnTouchListenerC8070zd1 != null) {
            viewOnTouchListenerC8070zd1.f();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageResource(int i) {
        super.setImageResource(i);
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.h;
        if (viewOnTouchListenerC8070zd1 != null) {
            viewOnTouchListenerC8070zd1.f();
        }
    }

    @Override // androidx.appcompat.widget.AppCompatImageView, android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.h;
        if (viewOnTouchListenerC8070zd1 != null) {
            viewOnTouchListenerC8070zd1.f();
        }
    }

    public void setMaximumScale(float f) {
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.h;
        C6386rc2.a(viewOnTouchListenerC8070zd1.g, viewOnTouchListenerC8070zd1.h, f);
        viewOnTouchListenerC8070zd1.i = f;
    }

    public void setMediumScale(float f) {
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.h;
        C6386rc2.a(viewOnTouchListenerC8070zd1.g, f, viewOnTouchListenerC8070zd1.i);
        viewOnTouchListenerC8070zd1.h = f;
    }

    public void setMinimumScale(float f) {
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.h;
        C6386rc2.a(f, viewOnTouchListenerC8070zd1.h, viewOnTouchListenerC8070zd1.i);
        viewOnTouchListenerC8070zd1.g = f;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.h.t = onClickListener;
    }

    public void setOnDoubleTapListener(GestureDetector.OnDoubleTapListener onDoubleTapListener) {
        this.h.m.setOnDoubleTapListener(onDoubleTapListener);
    }

    @Override // android.view.View
    public void setOnLongClickListener(View.OnLongClickListener onLongClickListener) {
        this.h.u = onLongClickListener;
    }

    public void setOnMatrixChangeListener(InterfaceC2887b91 interfaceC2887b91) {
        this.h.getClass();
    }

    public void setOnOutsidePhotoTapListener(InterfaceC3306d91 interfaceC3306d91) {
        this.h.getClass();
    }

    public void setOnPhotoTapListener(InterfaceC3515e91 interfaceC3515e91) {
        this.h.getClass();
    }

    public void setOnScaleChangeListener(InterfaceC4355i91 interfaceC4355i91) {
        this.h.getClass();
    }

    public void setOnSingleFlingListener(InterfaceC4823k91 interfaceC4823k91) {
        this.h.getClass();
    }

    public void setOnViewDragListener(InterfaceC5876p91 interfaceC5876p91) {
        this.h.getClass();
    }

    public void setOnViewTapListener(InterfaceC6086q91 interfaceC6086q91) {
        this.h.getClass();
    }

    public void setRotationBy(float f) {
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.h;
        viewOnTouchListenerC8070zd1.q.postRotate(f % 360.0f);
        viewOnTouchListenerC8070zd1.a();
    }

    public void setRotationTo(float f) {
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.h;
        viewOnTouchListenerC8070zd1.q.setRotate(f % 360.0f);
        viewOnTouchListenerC8070zd1.a();
    }

    public void setScale(float f) {
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.h;
        PhotoView photoView = viewOnTouchListenerC8070zd1.l;
        viewOnTouchListenerC8070zd1.e(f, photoView.getRight() / 2, photoView.getBottom() / 2, false);
    }

    @Override // android.widget.ImageView
    public void setScaleType(ImageView.ScaleType scaleType) {
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.h;
        if (viewOnTouchListenerC8070zd1 == null) {
            this.i = scaleType;
            return;
        }
        viewOnTouchListenerC8070zd1.getClass();
        if (scaleType == null) {
            return;
        }
        if (C6386rc2.a.a[scaleType.ordinal()] == 1) {
            throw new IllegalStateException("Matrix scale type is not supported");
        }
        if (scaleType != viewOnTouchListenerC8070zd1.z) {
            viewOnTouchListenerC8070zd1.z = scaleType;
            viewOnTouchListenerC8070zd1.f();
        }
    }

    public void setZoomTransitionDuration(int i) {
        this.h.e = i;
    }

    public void setZoomable(boolean z) {
        ViewOnTouchListenerC8070zd1 viewOnTouchListenerC8070zd1 = this.h;
        viewOnTouchListenerC8070zd1.y = z;
        viewOnTouchListenerC8070zd1.f();
    }
}
