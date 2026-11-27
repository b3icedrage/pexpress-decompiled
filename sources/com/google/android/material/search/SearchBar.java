package com.google.android.material.search;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.AbstractC7727y;
import defpackage.C0564Aa;
import defpackage.C5345me2;
import defpackage.Cd2;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public final class SearchBar extends Toolbar {
    public Drawable b0;
    public int c0;
    public boolean d0;

    public static class a extends AbstractC7727y {
        public static final Parcelable.Creator<a> CREATOR = new C0313a();
        public String g;

        /* JADX INFO: renamed from: com.google.android.material.search.SearchBar$a$a, reason: collision with other inner class name */
        public class C0313a implements Parcelable.ClassLoaderCreator<a> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            public final a createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new a(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new a[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new a(parcel, null);
            }
        }

        public a(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = parcel.readString();
        }

        @Override // defpackage.AbstractC7727y, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeString(this.g);
        }
    }

    private void setNavigationIconDecorative(boolean z) {
        ImageButton imageButton;
        Drawable navigationIcon = getNavigationIcon();
        if (navigationIcon != null) {
            int i = 0;
            while (true) {
                if (i >= getChildCount()) {
                    imageButton = null;
                    break;
                }
                View childAt = getChildAt(i);
                if (childAt instanceof ImageButton) {
                    imageButton = (ImageButton) childAt;
                    if (imageButton.getDrawable() == navigationIcon) {
                        break;
                    }
                }
                i++;
            }
        } else {
            imageButton = null;
            break;
        }
        if (imageButton == null) {
            return;
        }
        boolean z2 = !z;
        imageButton.setClickable(z2);
        imageButton.setFocusable(z2);
        Drawable background = imageButton.getBackground();
        if (background != null) {
            this.b0 = background;
        }
        imageButton.setBackgroundDrawable(z ? null : this.b0);
    }

    public View getCenterView() {
        return null;
    }

    public float getCompatElevation() {
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        return Cd2.d.i(this);
    }

    public float getCornerSize() {
        throw null;
    }

    public CharSequence getHint() {
        throw null;
    }

    public int getMenuResId() {
        return this.c0;
    }

    public int getStrokeColor() {
        throw null;
    }

    public float getStrokeWidth() {
        throw null;
    }

    public CharSequence getText() {
        throw null;
    }

    @NonNull
    public TextView getTextView() {
        return null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public final void l(int i) {
        super.l(i);
        this.c0 = i;
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0564Aa.x(this, null);
        throw null;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        if (Build.VERSION.SDK_INT >= 26) {
            accessibilityNodeInfo.setHintText(getHint());
            accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        }
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof a)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        a aVar = (a) parcelable;
        super.onRestoreInstanceState(aVar.d);
        setText(aVar.g);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        a aVar = new a(super.onSaveInstanceState());
        CharSequence text = getText();
        aVar.g = text == null ? null : text.toString();
        return aVar;
    }

    public void setCenterView(View view) {
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z) {
        this.d0 = z;
        if (getLayoutParams() instanceof AppBarLayout.c) {
            AppBarLayout.c cVar = (AppBarLayout.c) getLayoutParams();
            if (this.d0) {
                if (cVar.a == 0) {
                    cVar.a = 53;
                }
            } else if (cVar.a == 53) {
                cVar.a = 0;
            }
        }
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
    }

    public void setHint(CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(Drawable drawable) {
        super.setNavigationIcon(drawable);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z) {
        throw null;
    }

    public void setStrokeColor(int i) {
        if (getStrokeColor() == i) {
            return;
        }
        ColorStateList.valueOf(i);
        throw null;
    }

    public void setStrokeWidth(float f) {
        if (getStrokeWidth() != f) {
            throw null;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(CharSequence charSequence) {
        throw null;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
        public boolean g;

        public ScrollingViewBehavior() {
            this.g = false;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public final boolean d(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            super.d(coordinatorLayout, view, view2);
            if (!this.g && (view2 instanceof AppBarLayout)) {
                this.g = true;
                AppBarLayout appBarLayout = (AppBarLayout) view2;
                appBarLayout.setBackgroundColor(0);
                appBarLayout.setTargetElevation(0.0f);
            }
            return false;
        }

        public ScrollingViewBehavior(@NonNull Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.g = false;
        }
    }

    public void setHint(int i) {
        throw null;
    }

    public void setText(int i) {
        throw null;
    }
}
