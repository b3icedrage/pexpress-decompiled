package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.k;
import java.lang.ref.WeakReference;
import java.util.HashSet;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public abstract class V21 extends ViewGroup implements k {
    public static final int[] H = {R.attr.state_checked};
    public static final int[] I = {-16842910};
    public int A;
    public int B;
    public RJ1 C;
    public boolean D;
    public ColorStateList E;
    public W21 F;
    public f G;
    public final C1697On d;

    @NonNull
    public final a e;
    public final C1516Mf1 g;

    @NonNull
    public final SparseArray<View.OnTouchListener> h;
    public int i;
    public S21[] j;
    public int k;
    public int l;
    public ColorStateList m;
    public int n;
    public ColorStateList o;
    public final ColorStateList p;
    public int q;
    public int r;
    public Drawable s;
    public ColorStateList t;
    public int u;

    @NonNull
    public final SparseArray<C1937Rp> v;
    public int w;
    public int x;
    public boolean y;
    public int z;

    public class a implements View.OnClickListener {
        public final /* synthetic */ C2261Vt d;

        public a(C2261Vt c2261Vt) {
            this.d = c2261Vt;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            h itemData = ((S21) view).getItemData();
            C2261Vt c2261Vt = this.d;
            if (c2261Vt.G.q(itemData, c2261Vt.F, 0)) {
                return;
            }
            itemData.setChecked(true);
        }
    }

    public V21(@NonNull Context context) {
        super(context);
        this.g = new C1516Mf1(5);
        this.h = new SparseArray<>(5);
        this.k = 0;
        this.l = 0;
        this.v = new SparseArray<>(5);
        this.w = -1;
        this.x = -1;
        this.D = false;
        this.p = c();
        if (isInEditMode()) {
            this.d = null;
        } else {
            C1697On c1697On = new C1697On();
            this.d = c1697On;
            c1697On.P(0);
            c1697On.N(C7103v11.c(getContext(), com.pexpress.tool.R.attr.motionDurationMedium4, getResources().getInteger(com.pexpress.tool.R.integer.material_motion_duration_long_1)));
            c1697On.G(C7103v11.d(getContext(), com.pexpress.tool.R.attr.motionEasingStandard, C7013uc.b));
            c1697On.M(new C4011gY1());
        }
        this.e = new a((C2261Vt) this);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        setImportantForAccessibility(1);
    }

    public static void f(int i) {
        if (i != -1) {
            return;
        }
        throw new IllegalArgumentException(i + " is not a valid view id");
    }

    private S21 getNewItem() {
        S21 s21 = (S21) this.g.a();
        return s21 == null ? e(getContext()) : s21;
    }

    private void setBadgeIfNeeded(@NonNull S21 s21) {
        C1937Rp c1937Rp;
        int id = s21.getId();
        if (id == -1 || (c1937Rp = this.v.get(id)) == null) {
            return;
        }
        s21.setBadge(c1937Rp);
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void a() {
        removeAllViews();
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                if (s21 != null) {
                    this.g.b(s21);
                    if (s21.H != null) {
                        ImageView imageView = s21.q;
                        if (imageView != null) {
                            s21.setClipChildren(true);
                            s21.setClipToPadding(true);
                            C1937Rp c1937Rp = s21.H;
                            if (c1937Rp != null) {
                                WeakReference<FrameLayout> weakReference = c1937Rp.q;
                                if ((weakReference != null ? weakReference.get() : null) != null) {
                                    WeakReference<FrameLayout> weakReference2 = c1937Rp.q;
                                    (weakReference2 != null ? weakReference2.get() : null).setForeground(null);
                                } else {
                                    imageView.getOverlay().remove(c1937Rp);
                                }
                            }
                        }
                        s21.H = null;
                    }
                    s21.v = null;
                    s21.B = 0.0f;
                    s21.d = false;
                }
            }
        }
        if (this.G.f.size() == 0) {
            this.k = 0;
            this.l = 0;
            this.j = null;
            return;
        }
        HashSet hashSet = new HashSet();
        for (int i = 0; i < this.G.f.size(); i++) {
            hashSet.add(Integer.valueOf(this.G.getItem(i).getItemId()));
        }
        int i2 = 0;
        while (true) {
            SparseArray<C1937Rp> sparseArray = this.v;
            if (i2 >= sparseArray.size()) {
                break;
            }
            int iKeyAt = sparseArray.keyAt(i2);
            if (!hashSet.contains(Integer.valueOf(iKeyAt))) {
                sparseArray.delete(iKeyAt);
            }
            i2++;
        }
        this.j = new S21[this.G.f.size()];
        int i3 = this.i;
        boolean z = i3 != -1 ? i3 == 0 : this.G.l().size() > 3;
        for (int i4 = 0; i4 < this.G.f.size(); i4++) {
            this.F.e = true;
            this.G.getItem(i4).setCheckable(true);
            this.F.e = false;
            S21 newItem = getNewItem();
            this.j[i4] = newItem;
            newItem.setIconTintList(this.m);
            newItem.setIconSize(this.n);
            newItem.setTextColor(this.p);
            newItem.setTextAppearanceInactive(this.q);
            newItem.setTextAppearanceActive(this.r);
            newItem.setTextColor(this.o);
            int i5 = this.w;
            if (i5 != -1) {
                newItem.setItemPaddingTop(i5);
            }
            int i6 = this.x;
            if (i6 != -1) {
                newItem.setItemPaddingBottom(i6);
            }
            newItem.setActiveIndicatorWidth(this.z);
            newItem.setActiveIndicatorHeight(this.A);
            newItem.setActiveIndicatorMarginHorizontal(this.B);
            newItem.setActiveIndicatorDrawable(d());
            newItem.setActiveIndicatorResizeable(this.D);
            newItem.setActiveIndicatorEnabled(this.y);
            Drawable drawable = this.s;
            if (drawable != null) {
                newItem.setItemBackground(drawable);
            } else {
                newItem.setItemBackground(this.u);
            }
            newItem.setItemRippleColor(this.t);
            newItem.setShifting(z);
            newItem.setLabelVisibilityMode(this.i);
            h hVar = (h) this.G.getItem(i4);
            newItem.d(hVar);
            newItem.setItemPosition(i4);
            SparseArray<View.OnTouchListener> sparseArray2 = this.h;
            int i7 = hVar.a;
            newItem.setOnTouchListener(sparseArray2.get(i7));
            newItem.setOnClickListener(this.e);
            int i8 = this.k;
            if (i8 != 0 && i7 == i8) {
                this.l = i4;
            }
            setBadgeIfNeeded(newItem);
            addView(newItem);
        }
        int iMin = Math.min(this.G.f.size() - 1, this.l);
        this.l = iMin;
        this.G.getItem(iMin).setChecked(true);
    }

    @Override // androidx.appcompat.view.menu.k
    public final void b(@NonNull f fVar) {
        this.G = fVar;
    }

    public final ColorStateList c() {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(R.attr.textColorSecondary, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateList = C6333rM.getColorStateList(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(com.pexpress.tool.R.attr.colorPrimary, typedValue, true)) {
            return null;
        }
        int i = typedValue.data;
        int defaultColor = colorStateList.getDefaultColor();
        int[] iArr = I;
        return new ColorStateList(new int[][]{iArr, H, ViewGroup.EMPTY_STATE_SET}, new int[]{colorStateList.getColorForState(iArr, defaultColor), i, defaultColor});
    }

    public final NX0 d() {
        if (this.C == null || this.E == null) {
            return null;
        }
        NX0 nx0 = new NX0(this.C);
        nx0.l(this.E);
        return nx0;
    }

    @NonNull
    public abstract C1871Qt e(@NonNull Context context);

    public SparseArray<C1937Rp> getBadgeDrawables() {
        return this.v;
    }

    public ColorStateList getIconTintList() {
        return this.m;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.E;
    }

    public boolean getItemActiveIndicatorEnabled() {
        return this.y;
    }

    public int getItemActiveIndicatorHeight() {
        return this.A;
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.B;
    }

    public RJ1 getItemActiveIndicatorShapeAppearance() {
        return this.C;
    }

    public int getItemActiveIndicatorWidth() {
        return this.z;
    }

    public Drawable getItemBackground() {
        S21[] s21Arr = this.j;
        return (s21Arr == null || s21Arr.length <= 0) ? this.s : s21Arr[0].getBackground();
    }

    @Deprecated
    public int getItemBackgroundRes() {
        return this.u;
    }

    public int getItemIconSize() {
        return this.n;
    }

    public int getItemPaddingBottom() {
        return this.x;
    }

    public int getItemPaddingTop() {
        return this.w;
    }

    public ColorStateList getItemRippleColor() {
        return this.t;
    }

    public int getItemTextAppearanceActive() {
        return this.r;
    }

    public int getItemTextAppearanceInactive() {
        return this.q;
    }

    public ColorStateList getItemTextColor() {
        return this.o;
    }

    public int getLabelVisibilityMode() {
        return this.i;
    }

    public f getMenu() {
        return this.G;
    }

    public int getSelectedItemId() {
        return this.k;
    }

    public int getSelectedItemPosition() {
        return this.l;
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(@NonNull AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setCollectionInfo(C5426n2.e.a(1, this.G.l().size(), 1).a);
    }

    public void setIconTintList(ColorStateList colorStateList) {
        this.m = colorStateList;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setIconTintList(colorStateList);
            }
        }
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.E = colorStateList;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.y = z;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setActiveIndicatorEnabled(z);
            }
        }
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.A = i;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setActiveIndicatorHeight(i);
            }
        }
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.B = i;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setActiveIndicatorMarginHorizontal(i);
            }
        }
    }

    public void setItemActiveIndicatorResizeable(boolean z) {
        this.D = z;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setActiveIndicatorResizeable(z);
            }
        }
    }

    public void setItemActiveIndicatorShapeAppearance(RJ1 rj1) {
        this.C = rj1;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setActiveIndicatorDrawable(d());
            }
        }
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.z = i;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setActiveIndicatorWidth(i);
            }
        }
    }

    public void setItemBackground(Drawable drawable) {
        this.s = drawable;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setItemBackground(drawable);
            }
        }
    }

    public void setItemBackgroundRes(int i) {
        this.u = i;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setItemBackground(i);
            }
        }
    }

    public void setItemIconSize(int i) {
        this.n = i;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setIconSize(i);
            }
        }
    }

    public void setItemPaddingBottom(int i) {
        this.x = i;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setItemPaddingBottom(i);
            }
        }
    }

    public void setItemPaddingTop(int i) {
        this.w = i;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setItemPaddingTop(i);
            }
        }
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.t = colorStateList;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setItemRippleColor(colorStateList);
            }
        }
    }

    public void setItemTextAppearanceActive(int i) {
        this.r = i;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setTextAppearanceActive(i);
                ColorStateList colorStateList = this.o;
                if (colorStateList != null) {
                    s21.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextAppearanceInactive(int i) {
        this.q = i;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setTextAppearanceInactive(i);
                ColorStateList colorStateList = this.o;
                if (colorStateList != null) {
                    s21.setTextColor(colorStateList);
                }
            }
        }
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.o = colorStateList;
        S21[] s21Arr = this.j;
        if (s21Arr != null) {
            for (S21 s21 : s21Arr) {
                s21.setTextColor(colorStateList);
            }
        }
    }

    public void setLabelVisibilityMode(int i) {
        this.i = i;
    }

    public void setPresenter(@NonNull W21 w21) {
        this.F = w21;
    }
}
