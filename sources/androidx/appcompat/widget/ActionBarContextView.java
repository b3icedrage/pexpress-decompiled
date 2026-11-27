package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.k;
import com.pexpress.tool.R;
import defpackage.AbstractC6907u5;
import defpackage.AbstractC7517x;
import defpackage.C3855fm1;
import defpackage.C5345me2;
import defpackage.C7652xe;
import defpackage.Cd2;
import defpackage.Je2;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: classes.dex */
public class ActionBarContextView extends AbstractC7517x {
    public CharSequence m;
    public CharSequence n;
    public View o;
    public View p;
    public View q;
    public LinearLayout r;
    public TextView s;
    public TextView t;
    public final int u;
    public final int v;
    public boolean w;
    public final int x;

    public class a implements View.OnClickListener {
        public final /* synthetic */ AbstractC6907u5 d;

        public a(AbstractC6907u5 abstractC6907u5) {
            this.d = abstractC6907u5;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            this.d.c();
        }
    }

    public ActionBarContextView(@NonNull Context context, AttributeSet attributeSet) {
        int resourceId;
        super(context, attributeSet, R.attr.actionModeStyle);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, C3855fm1.d, R.attr.actionModeStyle, 0);
        Drawable drawable = (!typedArrayObtainStyledAttributes.hasValue(0) || (resourceId = typedArrayObtainStyledAttributes.getResourceId(0, 0)) == 0) ? typedArrayObtainStyledAttributes.getDrawable(0) : C7652xe.d(context, resourceId);
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        setBackground(drawable);
        this.u = typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.v = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        this.i = typedArrayObtainStyledAttributes.getLayoutDimension(3, 0);
        this.x = typedArrayObtainStyledAttributes.getResourceId(2, R.layout.abc_action_mode_close_item_material);
        typedArrayObtainStyledAttributes.recycle();
    }

    public final void f(AbstractC6907u5 abstractC6907u5) {
        View view = this.o;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.x, (ViewGroup) this, false);
            this.o = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.o);
        }
        View viewFindViewById = this.o.findViewById(R.id.action_mode_close_button);
        this.p = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(abstractC6907u5));
        f fVarE = abstractC6907u5.e();
        androidx.appcompat.widget.a aVar = this.h;
        if (aVar != null) {
            aVar.b();
            androidx.appcompat.widget.a.C0220a c0220a = aVar.y;
            if (c0220a != null && c0220a.b()) {
                c0220a.i.dismiss();
            }
        }
        androidx.appcompat.widget.a aVar2 = new androidx.appcompat.widget.a(getContext());
        this.h = aVar2;
        aVar2.q = true;
        aVar2.r = true;
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        fVarE.b(this.h, this.e);
        androidx.appcompat.widget.a aVar3 = this.h;
        k kVar = aVar3.l;
        if (kVar == null) {
            k kVar2 = (k) aVar3.h.inflate(aVar3.j, (ViewGroup) this, false);
            aVar3.l = kVar2;
            kVar2.b(aVar3.g);
            aVar3.d(true);
        }
        k kVar3 = aVar3.l;
        if (kVar != kVar3) {
            ((ActionMenuView) kVar3).setPresenter(aVar3);
        }
        ActionMenuView actionMenuView = (ActionMenuView) kVar3;
        this.g = actionMenuView;
        WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
        actionMenuView.setBackground(null);
        addView(this.g, layoutParams);
    }

    public final void g() {
        if (this.r == null) {
            LayoutInflater.from(getContext()).inflate(R.layout.abc_action_bar_title_item, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.r = linearLayout;
            this.s = (TextView) linearLayout.findViewById(R.id.action_bar_title);
            this.t = (TextView) this.r.findViewById(R.id.action_bar_subtitle);
            int i = this.u;
            if (i != 0) {
                this.s.setTextAppearance(getContext(), i);
            }
            int i2 = this.v;
            if (i2 != 0) {
                this.t.setTextAppearance(getContext(), i2);
            }
        }
        this.s.setText(this.m);
        this.t.setText(this.n);
        boolean zIsEmpty = TextUtils.isEmpty(this.m);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.n);
        this.t.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.r.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.r.getParent() == null) {
            addView(this.r);
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // defpackage.AbstractC7517x
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // defpackage.AbstractC7517x
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.n;
    }

    public CharSequence getTitle() {
        return this.m;
    }

    public final void h() {
        removeAllViews();
        this.q = null;
        this.g = null;
        this.h = null;
        View view = this.p;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.appcompat.widget.a aVar = this.h;
        if (aVar != null) {
            aVar.b();
            androidx.appcompat.widget.a.C0220a c0220a = this.h.y;
            if (c0220a == null || !c0220a.b()) {
                return;
            }
            c0220a.i.dismiss();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        boolean zA = Je2.a(this);
        int paddingRight = zA ? (i3 - i) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i4 - i2) - getPaddingTop()) - getPaddingBottom();
        View view = this.o;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            int i5 = zA ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i6 = zA ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int i7 = zA ? paddingRight - i5 : paddingRight + i5;
            int iD = AbstractC7517x.d(i7, paddingTop, paddingTop2, this.o, zA) + i7;
            paddingRight = zA ? iD - i6 : iD + i6;
        }
        LinearLayout linearLayout = this.r;
        if (linearLayout != null && this.q == null && linearLayout.getVisibility() != 8) {
            paddingRight += AbstractC7517x.d(paddingRight, paddingTop, paddingTop2, this.r, zA);
        }
        View view2 = this.q;
        if (view2 != null) {
            AbstractC7517x.d(paddingRight, paddingTop, paddingTop2, view2, zA);
        }
        int paddingLeft = zA ? getPaddingLeft() : (i3 - i) - getPaddingRight();
        ActionMenuView actionMenuView = this.g;
        if (actionMenuView != null) {
            AbstractC7517x.d(paddingLeft, paddingTop, paddingTop2, actionMenuView, !zA);
        }
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        if (View.MeasureSpec.getMode(i) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_width=\"match_parent\" (or fill_parent)"));
        }
        if (View.MeasureSpec.getMode(i2) == 0) {
            throw new IllegalStateException(getClass().getSimpleName().concat(" can only be used with android:layout_height=\"wrap_content\""));
        }
        int size = View.MeasureSpec.getSize(i);
        int size2 = this.i;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i2);
        }
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingBottom;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.o;
        if (view != null) {
            int iC = AbstractC7517x.c(view, paddingLeft, iMakeMeasureSpec);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.o.getLayoutParams();
            paddingLeft = iC - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.g;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = AbstractC7517x.c(this.g, paddingLeft, iMakeMeasureSpec);
        }
        LinearLayout linearLayout = this.r;
        if (linearLayout != null && this.q == null) {
            if (this.w) {
                this.r.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.r.getMeasuredWidth();
                boolean z = measuredWidth <= paddingLeft;
                if (z) {
                    paddingLeft -= measuredWidth;
                }
                this.r.setVisibility(z ? 0 : 8);
            } else {
                paddingLeft = AbstractC7517x.c(linearLayout, paddingLeft, iMakeMeasureSpec);
            }
        }
        View view2 = this.q;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i3 = layoutParams.width;
            int i4 = i3 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i3 >= 0) {
                paddingLeft = Math.min(i3, paddingLeft);
            }
            int i5 = layoutParams.height;
            int i6 = i5 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i5 >= 0) {
                iMin = Math.min(i5, iMin);
            }
            this.q.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i4), View.MeasureSpec.makeMeasureSpec(iMin, i6));
        }
        if (this.i > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            int measuredHeight = getChildAt(i8).getMeasuredHeight() + paddingBottom;
            if (measuredHeight > i7) {
                i7 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i7);
    }

    @Override // defpackage.AbstractC7517x
    public void setContentHeight(int i) {
        this.i = i;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.q;
        if (view2 != null) {
            removeView(view2);
        }
        this.q = view;
        if (view != null && (linearLayout = this.r) != null) {
            removeView(linearLayout);
            this.r = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.n = charSequence;
        g();
    }

    public void setTitle(CharSequence charSequence) {
        this.m = charSequence;
        g();
        Cd2.m(this, charSequence);
    }

    public void setTitleOptional(boolean z) {
        if (z != this.w) {
            requestLayout();
        }
        this.w = z;
    }

    @Override // defpackage.AbstractC7517x, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i) {
        super.setVisibility(i);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }
}
