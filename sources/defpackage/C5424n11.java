package defpackage;

import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;

/* JADX INFO: renamed from: n11, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5424n11 extends b implements MotionLayout.h {
    public boolean m;
    public boolean n;
    public float o;
    public View[] p;

    public float getProgress() {
        return this.o;
    }

    @Override // androidx.constraintlayout.widget.b
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2425Xl1.m);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 1) {
                    this.m = typedArrayObtainStyledAttributes.getBoolean(index, this.m);
                } else if (index == 0) {
                    this.n = typedArrayObtainStyledAttributes.getBoolean(index, this.n);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void setProgress(float f) {
        this.o = f;
        int i = 0;
        if (this.e <= 0) {
            ViewGroup viewGroup = (ViewGroup) getParent();
            int childCount = viewGroup.getChildCount();
            while (i < childCount) {
                boolean z = viewGroup.getChildAt(i) instanceof C5424n11;
                i++;
            }
            return;
        }
        ConstraintLayout constraintLayout = (ConstraintLayout) getParent();
        View[] viewArr = this.k;
        if (viewArr == null || viewArr.length != this.e) {
            this.k = new View[this.e];
        }
        for (int i2 = 0; i2 < this.e; i2++) {
            this.k[i2] = constraintLayout.c(this.d[i2]);
        }
        this.p = this.k;
        while (i < this.e) {
            View view = this.p[i];
            i++;
        }
    }

    @Override // androidx.constraintlayout.motion.widget.MotionLayout.h
    public final void a() {
    }
}
