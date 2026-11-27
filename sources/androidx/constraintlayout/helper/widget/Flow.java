package androidx.constraintlayout.helper.widget;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import androidx.constraintlayout.widget.c;
import androidx.constraintlayout.widget.d;
import defpackage.C2425Xl1;
import defpackage.C6187qf0;
import defpackage.C6641so0;
import defpackage.TK;
import defpackage.Ve2;
import defpackage.We2;

/* JADX INFO: loaded from: classes.dex */
public class Flow extends Ve2 {
    public C6187qf0 o;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // defpackage.Ve2, androidx.constraintlayout.widget.b
    public final void j(AttributeSet attributeSet) {
        super.j(attributeSet);
        this.o = new C6187qf0();
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2425Xl1.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.o.Z0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C6187qf0 c6187qf0 = this.o;
                    int dimensionPixelSize = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c6187qf0.w0 = dimensionPixelSize;
                    c6187qf0.x0 = dimensionPixelSize;
                    c6187qf0.y0 = dimensionPixelSize;
                    c6187qf0.z0 = dimensionPixelSize;
                } else if (index == 18) {
                    C6187qf0 c6187qf1 = this.o;
                    int dimensionPixelSize2 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c6187qf1.y0 = dimensionPixelSize2;
                    c6187qf1.A0 = dimensionPixelSize2;
                    c6187qf1.B0 = dimensionPixelSize2;
                } else if (index == 19) {
                    this.o.z0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.o.A0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.o.w0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.o.B0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.o.x0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.o.X0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.o.H0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.o.I0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.o.J0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.o.L0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.o.K0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.o.M0 = typedArrayObtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.o.N0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.o.P0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.o.R0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.o.Q0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.o.S0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.o.O0 = typedArrayObtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.o.V0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.o.W0 = typedArrayObtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.o.T0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.o.U0 = typedArrayObtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.o.Y0 = typedArrayObtainStyledAttributes.getInt(index, -1);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
        this.h = this.o;
        n();
    }

    @Override // androidx.constraintlayout.widget.b
    public final void k(c.a aVar, C6641so0 c6641so0, d.a aVar2, SparseArray sparseArray) {
        super.k(aVar, c6641so0, aVar2, sparseArray);
        if (c6641so0 instanceof C6187qf0) {
            C6187qf0 c6187qf0 = (C6187qf0) c6641so0;
            int i = aVar2.V;
            if (i != -1) {
                c6187qf0.Z0 = i;
            }
        }
    }

    @Override // androidx.constraintlayout.widget.b
    public final void l(TK tk, boolean z) {
        C6187qf0 c6187qf0 = this.o;
        int i = c6187qf0.y0;
        if (i > 0 || c6187qf0.z0 > 0) {
            if (z) {
                c6187qf0.A0 = c6187qf0.z0;
                c6187qf0.B0 = i;
            } else {
                c6187qf0.A0 = i;
                c6187qf0.B0 = c6187qf0.z0;
            }
        }
    }

    @Override // defpackage.Ve2
    public final void o(We2 we2, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (we2 == null) {
            setMeasuredDimension(0, 0);
        } else {
            we2.W(mode, size, mode2, size2);
            setMeasuredDimension(we2.D0, we2.E0);
        }
    }

    @Override // androidx.constraintlayout.widget.b, android.view.View
    @SuppressLint({"WrongCall"})
    public final void onMeasure(int i, int i2) {
        o(this.o, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.o.P0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.o.J0 = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.o.Q0 = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.o.K0 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.o.V0 = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.o.N0 = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.o.T0 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.o.H0 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.o.R0 = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.o.L0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.o.S0 = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.o.M0 = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.o.Y0 = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.o.Z0 = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C6187qf0 c6187qf0 = this.o;
        c6187qf0.w0 = i;
        c6187qf0.x0 = i;
        c6187qf0.y0 = i;
        c6187qf0.z0 = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.o.x0 = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.o.A0 = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.o.B0 = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.o.w0 = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.o.W0 = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.o.O0 = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.o.U0 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.o.I0 = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.o.X0 = i;
        requestLayout();
    }
}
