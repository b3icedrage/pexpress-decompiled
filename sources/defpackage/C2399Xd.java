package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;
import androidx.annotation.NonNull;

/* JADX INFO: renamed from: Xd, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2399Xd {

    @NonNull
    public final CompoundButton a;
    public ColorStateList b = null;
    public PorterDuff.Mode c = null;
    public boolean d = false;
    public boolean e = false;
    public boolean f;

    public C2399Xd(@NonNull CompoundButton compoundButton) {
        this.a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.a;
        Drawable drawableA = NH.a(compoundButton);
        if (drawableA != null) {
            if (this.d || this.e) {
                Drawable drawableMutate = drawableA.mutate();
                if (this.d) {
                    A30.a.h(drawableMutate, this.b);
                }
                if (this.e) {
                    A30.a.i(drawableMutate, this.c);
                }
                if (drawableMutate.isStateful()) {
                    drawableMutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(drawableMutate);
            }
        }
    }

    public final void b(AttributeSet attributeSet, int i) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.a;
        Context context = compoundButton.getContext();
        int[] iArr = C3855fm1.m;
        WZ1 wz1E = WZ1.e(context, attributeSet, iArr, i);
        TypedArray typedArray = wz1E.b;
        Cd2.k(compoundButton, compoundButton.getContext(), iArr, attributeSet, wz1E.b, i);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(C7652xe.d(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                    if (typedArray.hasValue(0)) {
                        compoundButton.setButtonDrawable(C7652xe.d(compoundButton.getContext(), resourceId));
                    }
                }
            } else if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(C7652xe.d(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
                MH.c(compoundButton, wz1E.a(2));
            }
            if (typedArray.hasValue(3)) {
                MH.d(compoundButton, R30.c(typedArray.getInt(3, -1), null));
            }
        } finally {
            wz1E.f();
        }
    }
}
