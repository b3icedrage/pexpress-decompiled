package androidx.appcompat.view.menu;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import defpackage.WZ1;

/* JADX INFO: loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements f.b, k, AdapterView.OnItemClickListener {
    public static final int[] e = {R.attr.background, R.attr.divider};
    public f d;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        WZ1 wz1E = WZ1.e(context, attributeSet, e, R.attr.listViewStyle);
        TypedArray typedArray = wz1E.b;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(wz1E.b(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(wz1E.b(1));
        }
        wz1E.f();
    }

    @Override // androidx.appcompat.view.menu.f.b
    public final boolean a(h hVar) {
        return this.d.q(hVar, null, 0);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(f fVar) {
        this.d = fVar;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        a((h) getAdapter().getItem(i));
    }
}
