package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import defpackage.C2083Tl1;
import defpackage.C2261Vt;
import defpackage.C2603Zt;
import defpackage.C7001uY1;
import defpackage.Fe2;
import defpackage.WZ1;
import defpackage.Y21;

/* JADX INFO: loaded from: classes.dex */
public class BottomNavigationView extends Y21 {

    @Deprecated
    public interface a extends Y21.a {
    }

    @Deprecated
    public interface b extends Y21.b {
    }

    public BottomNavigationView(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        WZ1 wz1E = C7001uY1.e(getContext(), attributeSet, C2083Tl1.e, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, new int[0]);
        TypedArray typedArray = wz1E.b;
        setItemHorizontalTranslationEnabled(typedArray.getBoolean(2, true));
        if (typedArray.hasValue(0)) {
            setMinimumHeight(typedArray.getDimensionPixelSize(0, 0));
        }
        typedArray.getBoolean(1, true);
        wz1E.f();
        Fe2.a(this, new C2603Zt());
    }

    @Override // defpackage.Y21
    public int getMaxItemCount() {
        return 5;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        int suggestedMinimumHeight = getSuggestedMinimumHeight();
        if (View.MeasureSpec.getMode(i2) != 1073741824 && suggestedMinimumHeight > 0) {
            i2 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i2), getPaddingBottom() + getPaddingTop() + suggestedMinimumHeight), 1073741824);
        }
        super.onMeasure(i, i2);
    }

    public void setItemHorizontalTranslationEnabled(boolean z) {
        C2261Vt c2261Vt = (C2261Vt) getMenuView();
        if (c2261Vt.N != z) {
            c2261Vt.setItemHorizontalTranslationEnabled(z);
            getPresenter().d(false);
        }
    }

    @Deprecated
    public void setOnNavigationItemReselectedListener(a aVar) {
        setOnItemReselectedListener(aVar);
    }

    @Deprecated
    public void setOnNavigationItemSelectedListener(b bVar) {
        setOnItemSelectedListener(bVar);
    }
}
