package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import defpackage.C1379Kl1;
import defpackage.C2425Xl1;
import defpackage.C6641so0;
import defpackage.TK;
import io.sentry.android.core.b0;
import java.util.Arrays;
import java.util.HashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class b extends View {
    public int[] d;
    public int e;
    public Context g;
    public C6641so0 h;
    public String i;
    public String j;
    public View[] k;
    public HashMap<Integer, String> l;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.d = new int[32];
        this.k = null;
        this.l = new HashMap<>();
        this.g = context;
        j(attributeSet);
    }

    public final void b(String str) {
        if (str == null || str.length() == 0 || this.g == null) {
            return;
        }
        String strTrim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int i = i(strTrim);
        if (i != 0) {
            this.l.put(Integer.valueOf(i), strTrim);
            c(i);
        } else {
            b0.e("ConstraintHelper", "Could not find id of \"" + strTrim + "\"");
        }
    }

    public final void c(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.e + 1;
        int[] iArr = this.d;
        if (i2 > iArr.length) {
            this.d = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.d;
        int i3 = this.e;
        iArr2[i3] = i;
        this.e = i3 + 1;
    }

    public final void d(String str) {
        if (str == null || str.length() == 0 || this.g == null) {
            return;
        }
        String strTrim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            b0.e("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.a) && strTrim.equals(((ConstraintLayout.a) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    b0.e("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    c(childAt.getId());
                }
            }
        }
    }

    public final void e() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        f((ConstraintLayout) parent);
    }

    public final void f(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.e; i++) {
            View viewC = constraintLayout.c(this.d[i]);
            if (viewC != null) {
                viewC.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewC.setTranslationZ(viewC.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void g(ConstraintLayout constraintLayout) {
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.d, this.e);
    }

    public final int h(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String resourceEntryName;
        if (str != null && (resources = this.g.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        resourceEntryName = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        resourceEntryName = null;
                    }
                    if (str.equals(resourceEntryName)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:19:0x0038  */
    public final int i(String str) {
        int iH;
        HashMap<String, Integer> map;
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (!isInEditMode() || constraintLayout == null) {
            iH = 0;
        } else {
            Integer num = (str == null || (map = constraintLayout.q) == null || !map.containsKey(str)) ? null : constraintLayout.q.get(str);
            if (num instanceof Integer) {
                iH = num.intValue();
            } else {
                iH = 0;
            }
        }
        if (iH == 0 && constraintLayout != null) {
            iH = h(constraintLayout, str);
        }
        if (iH == 0) {
            try {
                iH = C1379Kl1.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (iH != 0) {
            return iH;
        }
        Context context = this.g;
        return context.getResources().getIdentifier(str, "id", context.getPackageName());
    }

    public void j(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray typedArrayObtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, C2425Xl1.b);
            int indexCount = typedArrayObtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = typedArrayObtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = typedArrayObtainStyledAttributes.getString(index);
                    this.i = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = typedArrayObtainStyledAttributes.getString(index);
                    this.j = string2;
                    setReferenceTags(string2);
                }
            }
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public void k(c.a aVar, C6641so0 c6641so0, d.a aVar2, SparseArray sparseArray) {
        c.b bVar = aVar.e;
        int[] iArr = bVar.j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = bVar.k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] strArrSplit = bVar.k0.split(",");
                    getContext();
                    int[] iArrCopyOf = new int[strArrSplit.length];
                    int i2 = 0;
                    for (String str2 : strArrSplit) {
                        int i3 = i(str2.trim());
                        if (i3 != 0) {
                            iArrCopyOf[i2] = i3;
                            i2++;
                        }
                    }
                    if (i2 != strArrSplit.length) {
                        iArrCopyOf = Arrays.copyOf(iArrCopyOf, i2);
                    }
                    bVar.j0 = iArrCopyOf;
                } else {
                    bVar.j0 = null;
                }
            }
        }
        c6641so0.b();
        if (bVar.j0 == null) {
            return;
        }
        while (true) {
            int[] iArr2 = bVar.j0;
            if (i >= iArr2.length) {
                return;
            }
            TK tk = (TK) sparseArray.get(iArr2[i]);
            if (tk != null) {
                c6641so0.a(tk);
            }
            i++;
        }
    }

    public final void n() {
        if (this.h == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.a) {
            ((ConstraintLayout.a) layoutParams).q0 = this.h;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.i;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.j;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.i = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.e = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                b(str.substring(i));
                return;
            } else {
                b(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.j = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.e = 0;
        while (true) {
            int iIndexOf = str.indexOf(44, i);
            if (iIndexOf == -1) {
                d(str.substring(i));
                return;
            } else {
                d(str.substring(i, iIndexOf));
                i = iIndexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.i = null;
        this.e = 0;
        for (int i : iArr) {
            c(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.i == null) {
            c(i);
        }
    }

    public void m() {
    }

    public void l(TK tk, boolean z) {
    }
}
