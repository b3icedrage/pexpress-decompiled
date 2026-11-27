package com.google.android.material.chip;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import com.pexpress.tool.R;
import defpackage.C2083Tl1;
import defpackage.C5345me2;
import defpackage.C5426n2;
import defpackage.C7001uY1;
import defpackage.C7451wg0;
import defpackage.Cd2;
import defpackage.IX0;
import defpackage.JB;
import defpackage.KB;
import defpackage.OX0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ChipGroup extends C7451wg0 {
    public int i;
    public int j;
    public d k;
    public final KB<Chip> l;
    public final int m;

    @NonNull
    public final e n;

    public class a implements d {
        public a() {
        }

        @Override // com.google.android.material.chip.ChipGroup.d
        public final void a(@NonNull ChipGroup chipGroup, @NonNull ArrayList arrayList) {
            ChipGroup chipGroup2 = ChipGroup.this;
            if (chipGroup2.l.d) {
                chipGroup2.getCheckedChipId();
                throw null;
            }
        }
    }

    public static class b extends ViewGroup.MarginLayoutParams {
    }

    @Deprecated
    public interface c {
    }

    public interface d {
        void a(@NonNull ChipGroup chipGroup, @NonNull ArrayList arrayList);
    }

    public class e implements ViewGroup.OnHierarchyChangeListener {
        public ViewGroup.OnHierarchyChangeListener d;

        public e() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewAdded(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                if (view2.getId() == -1) {
                    WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                    view2.setId(View.generateViewId());
                }
                Chip chip = (Chip) view2;
                KB<Chip> kb = chipGroup.l;
                kb.a.put(Integer.valueOf(chip.getId()), chip);
                if (chip.isChecked()) {
                    kb.a(chip);
                }
                chip.setInternalOnCheckedChangeListener(new JB(kb));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.d;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public final void onChildViewRemoved(View view, View view2) {
            ChipGroup chipGroup = ChipGroup.this;
            if (view == chipGroup && (view2 instanceof Chip)) {
                Chip chip = (Chip) view2;
                KB<Chip> kb = chipGroup.l;
                kb.getClass();
                chip.setInternalOnCheckedChangeListener(null);
                kb.a.remove(Integer.valueOf(chip.getId()));
                kb.b.remove(Integer.valueOf(chip.getId()));
            }
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = this.d;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    public ChipGroup(Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup), attributeSet, R.attr.chipGroupStyle);
        KB<Chip> kb = new KB<>();
        this.l = kb;
        e eVar = new e();
        this.n = eVar;
        TypedArray typedArrayD = C7001uY1.d(getContext(), attributeSet, C2083Tl1.i, R.attr.chipGroupStyle, R.style.Widget_MaterialComponents_ChipGroup, new int[0]);
        int dimensionPixelOffset = typedArrayD.getDimensionPixelOffset(1, 0);
        setChipSpacingHorizontal(typedArrayD.getDimensionPixelOffset(2, dimensionPixelOffset));
        setChipSpacingVertical(typedArrayD.getDimensionPixelOffset(3, dimensionPixelOffset));
        setSingleLine(typedArrayD.getBoolean(5, false));
        setSingleSelection(typedArrayD.getBoolean(6, false));
        setSelectionRequired(typedArrayD.getBoolean(4, false));
        this.m = typedArrayD.getResourceId(0, -1);
        typedArrayD.recycle();
        kb.c = new com.google.android.material.chip.b(this);
        super.setOnHierarchyChangeListener(eVar);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        setImportantForAccessibility(1);
    }

    private int getVisibleChipCount() {
        int i = 0;
        for (int i2 = 0; i2 < getChildCount(); i2++) {
            if ((getChildAt(i2) instanceof Chip) && getChildAt(i2).getVisibility() == 0) {
                i++;
            }
        }
        return i;
    }

    @Override // defpackage.C7451wg0
    public final boolean a() {
        return this.g;
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return super.checkLayoutParams(layoutParams) && (layoutParams instanceof b);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new b(-2, -2);
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    public int getCheckedChipId() {
        return this.l.c();
    }

    @NonNull
    public List<Integer> getCheckedChipIds() {
        return this.l.b(this);
    }

    public int getChipSpacingHorizontal() {
        return this.i;
    }

    public int getChipSpacingVertical() {
        return this.j;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        int i = this.m;
        if (i != -1) {
            KB<Chip> kb = this.l;
            IX0<T> ix0 = (IX0) kb.a.get(Integer.valueOf(i));
            if (ix0 != 0 && kb.a(ix0)) {
                kb.d();
            }
        }
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(C5426n2.e.a(getRowCount(), this.g ? getVisibleChipCount() : -1, this.l.d ? 1 : 2).a);
    }

    public void setChipSpacing(int i) {
        setChipSpacingHorizontal(i);
        setChipSpacingVertical(i);
    }

    public void setChipSpacingHorizontal(int i) {
        if (this.i != i) {
            this.i = i;
            setItemSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingHorizontalResource(int i) {
        setChipSpacingHorizontal(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingResource(int i) {
        setChipSpacing(getResources().getDimensionPixelOffset(i));
    }

    public void setChipSpacingVertical(int i) {
        if (this.j != i) {
            this.j = i;
            setLineSpacing(i);
            requestLayout();
        }
    }

    public void setChipSpacingVerticalResource(int i) {
        setChipSpacingVertical(getResources().getDimensionPixelOffset(i));
    }

    @Deprecated
    public void setDividerDrawableHorizontal(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setDividerDrawableVertical(Drawable drawable) {
        throw new UnsupportedOperationException("Changing divider drawables have no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setFlexWrap(int i) {
        throw new UnsupportedOperationException("Changing flex wrap not allowed. ChipGroup exposes a singleLine attribute instead.");
    }

    @Deprecated
    public void setOnCheckedChangeListener(c cVar) {
        if (cVar == null) {
            setOnCheckedStateChangeListener(null);
        } else {
            setOnCheckedStateChangeListener(new a());
        }
    }

    public void setOnCheckedStateChangeListener(d dVar) {
        this.k = dVar;
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.n.d = onHierarchyChangeListener;
    }

    public void setSelectionRequired(boolean z) {
        this.l.e = z;
    }

    @Deprecated
    public void setShowDividerHorizontal(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Deprecated
    public void setShowDividerVertical(int i) {
        throw new UnsupportedOperationException("Changing divider modes has no effect. ChipGroup do not use divider drawables as spacing.");
    }

    @Override // defpackage.C7451wg0
    public void setSingleLine(boolean z) {
        super.setSingleLine(z);
    }

    public void setSingleSelection(boolean z) {
        KB<Chip> kb = this.l;
        if (kb.d != z) {
            kb.d = z;
            boolean zIsEmpty = kb.b.isEmpty();
            Iterator it = kb.a.values().iterator();
            while (it.hasNext()) {
                kb.e((IX0) it.next(), false);
            }
            if (zIsEmpty) {
                return;
            }
            kb.d();
        }
    }

    public void setSingleLine(int i) {
        setSingleLine(getResources().getBoolean(i));
    }

    @Override // android.view.ViewGroup
    @NonNull
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new b(layoutParams);
    }

    public void setSingleSelection(int i) {
        setSingleSelection(getResources().getBoolean(i));
    }
}
