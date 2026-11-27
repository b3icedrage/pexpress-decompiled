package defpackage;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityManager;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Filterable;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Locale;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: uX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6997uX0 extends C1823Qd {

    @NonNull
    public final NQ0 i;
    public final AccessibilityManager j;

    @NonNull
    public final Rect k;
    public final int l;
    public final float m;
    public int n;
    public ColorStateList o;

    /* JADX INFO: renamed from: uX0$a */
    public class a<T> extends ArrayAdapter<String> {
        public ColorStateList d;
        public ColorStateList e;

        public a(Context context, @NonNull int i, String[] strArr) {
            super(context, i, strArr);
            b();
        }

        public final void b() {
            ColorStateList colorStateList;
            C6997uX0 c6997uX0 = C6997uX0.this;
            ColorStateList colorStateList2 = c6997uX0.o;
            ColorStateList colorStateList3 = null;
            if (colorStateList2 != null) {
                int[] iArr = {R.attr.state_pressed};
                colorStateList = new ColorStateList(new int[][]{iArr, new int[0]}, new int[]{colorStateList2.getColorForState(iArr, 0), 0});
            } else {
                colorStateList = null;
            }
            this.e = colorStateList;
            if (c6997uX0.n != 0 && c6997uX0.o != null) {
                int[] iArr2 = {R.attr.state_hovered, -16842919};
                int[] iArr3 = {R.attr.state_selected, -16842919};
                colorStateList3 = new ColorStateList(new int[][]{iArr3, iArr2, new int[0]}, new int[]{C4162hF.b(c6997uX0.o.getColorForState(iArr3, 0), c6997uX0.n), C4162hF.b(c6997uX0.o.getColorForState(iArr2, 0), c6997uX0.n), c6997uX0.n});
            }
            this.d = colorStateList3;
        }

        @Override // android.widget.ArrayAdapter, android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            View view2 = super.getView(i, view, viewGroup);
            if (view2 instanceof TextView) {
                TextView textView = (TextView) view2;
                C6997uX0 c6997uX0 = C6997uX0.this;
                Drawable rippleDrawable = null;
                if (c6997uX0.getText().toString().contentEquals(textView.getText()) && c6997uX0.n != 0) {
                    ColorDrawable colorDrawable = new ColorDrawable(c6997uX0.n);
                    if (this.e != null) {
                        A30.a.h(colorDrawable, this.d);
                        rippleDrawable = new RippleDrawable(this.e, colorDrawable, null);
                    } else {
                        rippleDrawable = colorDrawable;
                    }
                }
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                textView.setBackground(rippleDrawable);
            }
            return view2;
        }
    }

    public C6997uX0(@NonNull Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, com.pexpress.tool.R.attr.autoCompleteTextViewStyle, 0), attributeSet, 0);
        this.k = new Rect();
        Context context2 = getContext();
        TypedArray typedArrayD = C7001uY1.d(context2, attributeSet, C2083Tl1.r, com.pexpress.tool.R.attr.autoCompleteTextViewStyle, com.pexpress.tool.R.style.Widget_AppCompat_AutoCompleteTextView, new int[0]);
        if (typedArrayD.hasValue(0) && typedArrayD.getInt(0, 0) == 0) {
            setKeyListener(null);
        }
        this.l = typedArrayD.getResourceId(2, com.pexpress.tool.R.layout.mtrl_auto_complete_simple_item);
        this.m = typedArrayD.getDimensionPixelOffset(1, com.pexpress.tool.R.dimen.mtrl_exposed_dropdown_menu_popup_elevation);
        this.n = typedArrayD.getColor(3, 0);
        this.o = MX0.b(context2, typedArrayD, 4);
        this.j = (AccessibilityManager) context2.getSystemService("accessibility");
        NQ0 nq0 = new NQ0(context2, null, com.pexpress.tool.R.attr.listPopupWindowStyle);
        this.i = nq0;
        nq0.C = true;
        nq0.D.setFocusable(true);
        nq0.s = this;
        nq0.D.setInputMethodMode(2);
        nq0.p(getAdapter());
        nq0.t = new C6787tX0(this);
        if (typedArrayD.hasValue(5)) {
            setSimpleItems(typedArrayD.getResourceId(5, 0));
        }
        typedArrayD.recycle();
    }

    public static void a(C6997uX0 c6997uX0, Object obj) {
        c6997uX0.setText(c6997uX0.convertSelectionToString(obj), false);
    }

    public final TextInputLayout b() {
        for (ViewParent parent = getParent(); parent != null; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.AutoCompleteTextView
    public final void dismissDropDown() {
        AccessibilityManager accessibilityManager = this.j;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.dismissDropDown();
        } else {
            this.i.dismiss();
        }
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayoutB = b();
        return (textInputLayoutB == null || !textInputLayoutB.G) ? super.getHint() : textInputLayoutB.getHint();
    }

    public float getPopupElevation() {
        return this.m;
    }

    public int getSimpleItemSelectedColor() {
        return this.n;
    }

    public ColorStateList getSimpleItemSelectedRippleColor() {
        return this.o;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null && textInputLayoutB.G && super.getHint() == null && Build.MANUFACTURER.toLowerCase(Locale.ENGLISH).equals("meizu")) {
            setHint("");
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.i.dismiss();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        if (View.MeasureSpec.getMode(i) == Integer.MIN_VALUE) {
            int measuredWidth = getMeasuredWidth();
            ListAdapter adapter = getAdapter();
            TextInputLayout textInputLayoutB = b();
            int measuredWidth2 = 0;
            if (adapter != null && textInputLayoutB != null) {
                int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
                int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
                NQ0 nq0 = this.i;
                int iMin = Math.min(adapter.getCount(), Math.max(0, !nq0.D.isShowing() ? -1 : nq0.g.getSelectedItemPosition()) + 15);
                View view = null;
                int iMax = 0;
                for (int iMax2 = Math.max(0, iMin - 15); iMax2 < iMin; iMax2++) {
                    int itemViewType = adapter.getItemViewType(iMax2);
                    if (itemViewType != measuredWidth2) {
                        view = null;
                        measuredWidth2 = itemViewType;
                    }
                    view = adapter.getView(iMax2, view, textInputLayoutB);
                    if (view.getLayoutParams() == null) {
                        view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
                    }
                    view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
                    iMax = Math.max(iMax, view.getMeasuredWidth());
                }
                Drawable background = nq0.D.getBackground();
                if (background != null) {
                    Rect rect = this.k;
                    background.getPadding(rect);
                    iMax += rect.left + rect.right;
                }
                measuredWidth2 = textInputLayoutB.getEndIconView().getMeasuredWidth() + iMax;
            }
            setMeasuredDimension(Math.min(Math.max(measuredWidth, measuredWidth2), View.MeasureSpec.getSize(i)), getMeasuredHeight());
        }
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        AccessibilityManager accessibilityManager = this.j;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.onWindowFocusChanged(z);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public <T extends ListAdapter & Filterable> void setAdapter(T t) {
        super.setAdapter(t);
        this.i.p(getAdapter());
    }

    @Override // android.widget.AutoCompleteTextView
    public void setDropDownBackgroundDrawable(Drawable drawable) {
        super.setDropDownBackgroundDrawable(drawable);
        NQ0 nq0 = this.i;
        if (nq0 != null) {
            nq0.i(drawable);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setOnItemSelectedListener(AdapterView.OnItemSelectedListener onItemSelectedListener) {
        super.setOnItemSelectedListener(onItemSelectedListener);
        this.i.u = getOnItemSelectedListener();
    }

    @Override // android.widget.TextView
    public void setRawInputType(int i) {
        super.setRawInputType(i);
        TextInputLayout textInputLayoutB = b();
        if (textInputLayoutB != null) {
            textInputLayoutB.r();
        }
    }

    public void setSimpleItemSelectedColor(int i) {
        this.n = i;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItemSelectedRippleColor(ColorStateList colorStateList) {
        this.o = colorStateList;
        if (getAdapter() instanceof a) {
            ((a) getAdapter()).b();
        }
    }

    public void setSimpleItems(int i) {
        setSimpleItems(getResources().getStringArray(i));
    }

    @Override // android.widget.AutoCompleteTextView
    public final void showDropDown() {
        AccessibilityManager accessibilityManager = this.j;
        if (accessibilityManager == null || !accessibilityManager.isTouchExplorationEnabled()) {
            super.showDropDown();
        } else {
            this.i.b();
        }
    }

    public void setSimpleItems(@NonNull String[] strArr) {
        setAdapter(new a(getContext(), this.l, strArr));
    }
}
