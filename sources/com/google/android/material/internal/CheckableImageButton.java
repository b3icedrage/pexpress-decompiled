package com.google.android.material.internal;

import android.R;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Checkable;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageButton;
import defpackage.AbstractC7727y;
import defpackage.Cd2;
import defpackage.LB;

/* JADX INFO: loaded from: classes.dex */
public class CheckableImageButton extends AppCompatImageButton implements Checkable {
    public static final int[] k = {R.attr.state_checked};
    public boolean h;
    public boolean i;
    public boolean j;

    public static class a extends AbstractC7727y {
        public static final Parcelable.Creator<a> CREATOR = new C0312a();
        public boolean g;

        /* JADX INFO: renamed from: com.google.android.material.internal.CheckableImageButton$a$a, reason: collision with other inner class name */
        public class C0312a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final a createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new a[i];
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new a(parcel, null);
            }
        }

        public a(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = parcel.readInt() == 1;
        }

        @Override // defpackage.AbstractC7727y, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.g ? 1 : 0);
        }
    }

    public CheckableImageButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, com.pexpress.tool.R.attr.imageButtonStyle);
        this.i = true;
        this.j = true;
        Cd2.l(this, new LB(this));
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.h;
    }

    @Override // android.widget.ImageView, android.view.View
    public final int[] onCreateDrawableState(int i) {
        return this.h ? View.mergeDrawableStates(super.onCreateDrawableState(i + 1), k) : super.onCreateDrawableState(i);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.d);
        setChecked(aVar.g);
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        aVar.g = this.h;
        return aVar;
    }

    public void setCheckable(boolean z) {
        if (this.i != z) {
            this.i = z;
            sendAccessibilityEvent(0);
        }
    }

    @Override // android.widget.Checkable
    public void setChecked(boolean z) {
        if (!this.i || this.h == z) {
            return;
        }
        this.h = z;
        refreshDrawableState();
        sendAccessibilityEvent(2048);
    }

    public void setPressable(boolean z) {
        this.j = z;
    }

    @Override // android.view.View
    public void setPressed(boolean z) {
        if (this.j) {
            super.setPressed(z);
        }
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        setChecked(!this.h);
    }
}
