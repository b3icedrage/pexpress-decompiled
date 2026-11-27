package defpackage;

import android.R;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.PopupWindow;
import android.widget.Spinner;
import android.widget.SpinnerAdapter;
import android.widget.ThemedSpinnerAdapter;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertController;
import io.sentry.android.core.b0;
import java.util.Objects;
import java.util.WeakHashMap;

/* JADX INFO: renamed from: Be, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C0654Be extends Spinner {

    @SuppressLint({"ResourceType"})
    public static final int[] m = {R.attr.spinnerMode};
    public final C1901Rd d;
    public final Context e;
    public final C0576Ae g;
    public SpinnerAdapter h;
    public final boolean i;
    public final i j;
    public int k;
    public final Rect l;

    /* JADX INFO: renamed from: Be$a */
    public class a implements ViewTreeObserver.OnGlobalLayoutListener {
        public a() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            C0654Be c0654Be = C0654Be.this;
            if (!c0654Be.getInternalPopup().a()) {
                c0654Be.j.m(c.b(c0654Be), c.a(c0654Be));
            }
            ViewTreeObserver viewTreeObserver = c0654Be.getViewTreeObserver();
            if (viewTreeObserver != null) {
                b.a(viewTreeObserver, this);
            }
        }
    }

    /* JADX INFO: renamed from: Be$b */
    public static final class b {
        public static void a(@NonNull ViewTreeObserver viewTreeObserver, ViewTreeObserver.OnGlobalLayoutListener onGlobalLayoutListener) {
            viewTreeObserver.removeOnGlobalLayoutListener(onGlobalLayoutListener);
        }
    }

    /* JADX INFO: renamed from: Be$c */
    public static final class c {
        public static int a(@NonNull View view) {
            return view.getTextAlignment();
        }

        public static int b(@NonNull View view) {
            return view.getTextDirection();
        }

        public static void c(@NonNull View view, int i) {
            view.setTextAlignment(i);
        }

        public static void d(@NonNull View view, int i) {
            view.setTextDirection(i);
        }
    }

    /* JADX INFO: renamed from: Be$d */
    public static final class d {
        public static void a(@NonNull ThemedSpinnerAdapter themedSpinnerAdapter, Resources.Theme theme) {
            if (Objects.equals(themedSpinnerAdapter.getDropDownViewTheme(), theme)) {
                return;
            }
            themedSpinnerAdapter.setDropDownViewTheme(theme);
        }
    }

    /* JADX INFO: renamed from: Be$e */
    public class e implements i, DialogInterface.OnClickListener {
        public androidx.appcompat.app.b d;
        public f e;
        public CharSequence g;

        public e() {
        }

        @Override // defpackage.C0654Be.i
        public final boolean a() {
            androidx.appcompat.app.b bVar = this.d;
            if (bVar != null) {
                return bVar.isShowing();
            }
            return false;
        }

        @Override // defpackage.C0654Be.i
        public final int c() {
            return 0;
        }

        @Override // defpackage.C0654Be.i
        public final void dismiss() {
            androidx.appcompat.app.b bVar = this.d;
            if (bVar != null) {
                bVar.dismiss();
                this.d = null;
            }
        }

        @Override // defpackage.C0654Be.i
        public final void e(int i) {
            b0.c("AppCompatSpinner", "Cannot set horizontal offset for MODE_DIALOG, ignoring");
        }

        @Override // defpackage.C0654Be.i
        public final CharSequence f() {
            return this.g;
        }

        @Override // defpackage.C0654Be.i
        public final Drawable g() {
            return null;
        }

        @Override // defpackage.C0654Be.i
        public final void h(CharSequence charSequence) {
            this.g = charSequence;
        }

        @Override // defpackage.C0654Be.i
        public final void i(Drawable drawable) {
            b0.c("AppCompatSpinner", "Cannot set popup background for MODE_DIALOG, ignoring");
        }

        @Override // defpackage.C0654Be.i
        public final void k(int i) {
            b0.c("AppCompatSpinner", "Cannot set vertical offset for MODE_DIALOG, ignoring");
        }

        @Override // defpackage.C0654Be.i
        public final void l(int i) {
            b0.c("AppCompatSpinner", "Cannot set horizontal (original) offset for MODE_DIALOG, ignoring");
        }

        @Override // defpackage.C0654Be.i
        public final void m(int i, int i2) {
            if (this.e == null) {
                return;
            }
            C0654Be c0654Be = C0654Be.this;
            androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(c0654Be.getPopupContext());
            CharSequence charSequence = this.g;
            AlertController.b bVar = aVar.a;
            if (charSequence != null) {
                bVar.d = charSequence;
            }
            f fVar = this.e;
            int selectedItemPosition = c0654Be.getSelectedItemPosition();
            bVar.g = fVar;
            bVar.h = this;
            bVar.j = selectedItemPosition;
            bVar.i = true;
            androidx.appcompat.app.b bVarA = aVar.a();
            this.d = bVarA;
            AlertController.RecycleListView recycleListView = bVarA.j.e;
            c.d(recycleListView, i);
            c.c(recycleListView, i2);
            this.d.show();
        }

        @Override // defpackage.C0654Be.i
        public final int n() {
            return 0;
        }

        @Override // android.content.DialogInterface.OnClickListener
        public final void onClick(DialogInterface dialogInterface, int i) {
            C0654Be c0654Be = C0654Be.this;
            c0654Be.setSelection(i);
            if (c0654Be.getOnItemClickListener() != null) {
                c0654Be.performItemClick(null, i, this.e.getItemId(i));
            }
            dismiss();
        }

        @Override // defpackage.C0654Be.i
        public final void p(ListAdapter listAdapter) {
            this.e = (f) listAdapter;
        }
    }

    /* JADX INFO: renamed from: Be$f */
    public static class f implements ListAdapter, SpinnerAdapter {
        public SpinnerAdapter d;
        public ListAdapter e;

        @Override // android.widget.ListAdapter
        public final boolean areAllItemsEnabled() {
            ListAdapter listAdapter = this.e;
            if (listAdapter != null) {
                return listAdapter.areAllItemsEnabled();
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter == null) {
                return 0;
            }
            return spinnerAdapter.getCount();
        }

        @Override // android.widget.SpinnerAdapter
        public final View getDropDownView(int i, View view, ViewGroup viewGroup) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final Object getItem(int i) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter == null) {
                return null;
            }
            return spinnerAdapter.getItem(i);
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter == null) {
                return -1L;
            }
            return spinnerAdapter.getItemId(i);
        }

        @Override // android.widget.Adapter
        public final int getItemViewType(int i) {
            return 0;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            return getDropDownView(i, view, viewGroup);
        }

        @Override // android.widget.Adapter
        public final int getViewTypeCount() {
            return 1;
        }

        @Override // android.widget.Adapter
        public final boolean hasStableIds() {
            SpinnerAdapter spinnerAdapter = this.d;
            return spinnerAdapter != null && spinnerAdapter.hasStableIds();
        }

        @Override // android.widget.Adapter
        public final boolean isEmpty() {
            return getCount() == 0;
        }

        @Override // android.widget.ListAdapter
        public final boolean isEnabled(int i) {
            ListAdapter listAdapter = this.e;
            if (listAdapter != null) {
                return listAdapter.isEnabled(i);
            }
            return true;
        }

        @Override // android.widget.Adapter
        public final void registerDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter != null) {
                spinnerAdapter.registerDataSetObserver(dataSetObserver);
            }
        }

        @Override // android.widget.Adapter
        public final void unregisterDataSetObserver(DataSetObserver dataSetObserver) {
            SpinnerAdapter spinnerAdapter = this.d;
            if (spinnerAdapter != null) {
                spinnerAdapter.unregisterDataSetObserver(dataSetObserver);
            }
        }
    }

    /* JADX INFO: renamed from: Be$g */
    public class g extends NQ0 implements i {
        public CharSequence G;
        public f H;
        public final Rect I;
        public int J;

        /* JADX INFO: renamed from: Be$g$a */
        public class a implements AdapterView.OnItemClickListener {
            public a() {
            }

            @Override // android.widget.AdapterView.OnItemClickListener
            public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
                g gVar = g.this;
                C0654Be.this.setSelection(i);
                C0654Be c0654Be = C0654Be.this;
                if (c0654Be.getOnItemClickListener() != null) {
                    c0654Be.performItemClick(view, i, gVar.H.getItemId(i));
                }
                gVar.dismiss();
            }
        }

        /* JADX INFO: renamed from: Be$g$b */
        public class b implements ViewTreeObserver.OnGlobalLayoutListener {
            public b() {
            }

            @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
            public final void onGlobalLayout() {
                g gVar = g.this;
                C0654Be c0654Be = C0654Be.this;
                gVar.getClass();
                WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
                if (!c0654Be.isAttachedToWindow() || !c0654Be.getGlobalVisibleRect(gVar.I)) {
                    gVar.dismiss();
                } else {
                    gVar.s();
                    gVar.b();
                }
            }
        }

        /* JADX INFO: renamed from: Be$g$c */
        public class c implements PopupWindow.OnDismissListener {
            public final /* synthetic */ b d;

            public c(b bVar) {
                this.d = bVar;
            }

            @Override // android.widget.PopupWindow.OnDismissListener
            public final void onDismiss() {
                ViewTreeObserver viewTreeObserver = C0654Be.this.getViewTreeObserver();
                if (viewTreeObserver != null) {
                    viewTreeObserver.removeGlobalOnLayoutListener(this.d);
                }
            }
        }

        public g(Context context, AttributeSet attributeSet, int i) {
            super(context, attributeSet, i);
            this.I = new Rect();
            this.s = C0654Be.this;
            this.C = true;
            this.D.setFocusable(true);
            this.t = new a();
        }

        @Override // defpackage.C0654Be.i
        public final CharSequence f() {
            return this.G;
        }

        @Override // defpackage.C0654Be.i
        public final void h(CharSequence charSequence) {
            this.G = charSequence;
        }

        @Override // defpackage.C0654Be.i
        public final void l(int i) {
            this.J = i;
        }

        @Override // defpackage.C0654Be.i
        public final void m(int i, int i2) {
            ViewTreeObserver viewTreeObserver;
            C6601se c6601se = this.D;
            boolean zIsShowing = c6601se.isShowing();
            s();
            this.D.setInputMethodMode(2);
            b();
            Z30 z30 = this.g;
            z30.setChoiceMode(1);
            c.d(z30, i);
            c.c(z30, i2);
            C0654Be c0654Be = C0654Be.this;
            int selectedItemPosition = c0654Be.getSelectedItemPosition();
            Z30 z31 = this.g;
            if (c6601se.isShowing() && z31 != null) {
                z31.setListSelectionHidden(false);
                z31.setSelection(selectedItemPosition);
                if (z31.getChoiceMode() != 0) {
                    z31.setItemChecked(selectedItemPosition, true);
                }
            }
            if (zIsShowing || (viewTreeObserver = c0654Be.getViewTreeObserver()) == null) {
                return;
            }
            b bVar = new b();
            viewTreeObserver.addOnGlobalLayoutListener(bVar);
            this.D.setOnDismissListener(new c(bVar));
        }

        @Override // defpackage.NQ0, defpackage.C0654Be.i
        public final void p(ListAdapter listAdapter) {
            super.p(listAdapter);
            this.H = (f) listAdapter;
        }

        public final void s() {
            int i;
            C6601se c6601se = this.D;
            Drawable background = c6601se.getBackground();
            C0654Be c0654Be = C0654Be.this;
            if (background != null) {
                background.getPadding(c0654Be.l);
                boolean zA = Je2.a(c0654Be);
                Rect rect = c0654Be.l;
                i = zA ? rect.right : -rect.left;
            } else {
                Rect rect2 = c0654Be.l;
                rect2.right = 0;
                rect2.left = 0;
                i = 0;
            }
            int paddingLeft = c0654Be.getPaddingLeft();
            int paddingRight = c0654Be.getPaddingRight();
            int width = c0654Be.getWidth();
            int i2 = c0654Be.k;
            if (i2 == -2) {
                int iA = c0654Be.a(this.H, c6601se.getBackground());
                int i3 = c0654Be.getContext().getResources().getDisplayMetrics().widthPixels;
                Rect rect3 = c0654Be.l;
                int i4 = (i3 - rect3.left) - rect3.right;
                if (iA > i4) {
                    iA = i4;
                }
                r(Math.max(iA, (width - paddingLeft) - paddingRight));
            } else if (i2 == -1) {
                r((width - paddingLeft) - paddingRight);
            } else {
                r(i2);
            }
            this.j = Je2.a(c0654Be) ? (((width - paddingRight) - this.i) - this.J) + i : paddingLeft + this.J + i;
        }
    }

    /* JADX INFO: renamed from: Be$h */
    public static class h extends View.BaseSavedState {
        public static final Parcelable.Creator<h> CREATOR = new a();
        public boolean d;

        /* JADX INFO: renamed from: Be$h$a */
        public class a implements Parcelable.Creator<h> {
            @Override // android.os.Parcelable.Creator
            public final h createFromParcel(Parcel parcel) {
                h hVar = new h(parcel);
                hVar.d = parcel.readByte() != 0;
                return hVar;
            }

            @Override // android.os.Parcelable.Creator
            public final h[] newArray(int i) {
                return new h[i];
            }
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeByte(this.d ? (byte) 1 : (byte) 0);
        }
    }

    /* JADX INFO: renamed from: Be$i */
    public interface i {
        boolean a();

        int c();

        void dismiss();

        void e(int i);

        CharSequence f();

        Drawable g();

        void h(CharSequence charSequence);

        void i(Drawable drawable);

        void k(int i);

        void l(int i);

        void m(int i, int i2);

        int n();

        void p(ListAdapter listAdapter);
    }

    /* JADX WARN: Code duplicated, block: B:25:0x005d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0060  */
    /* JADX WARN: Code duplicated, block: B:28:0x0091  */
    /* JADX WARN: Code duplicated, block: B:31:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00be  */
    public C0654Be(@NonNull Context context, AttributeSet attributeSet, int i2) throws Throwable {
        TypedArray typedArrayObtainStyledAttributes;
        CharSequence[] textArray;
        SpinnerAdapter spinnerAdapter;
        super(context, attributeSet, i2);
        this.l = new Rect();
        C7211vY1.a(this, getContext());
        int[] iArr = C3855fm1.v;
        WZ1 wz1E = WZ1.e(context, attributeSet, iArr, i2);
        this.d = new C1901Rd(this);
        TypedArray typedArray = wz1E.b;
        int resourceId = typedArray.getResourceId(4, 0);
        if (resourceId != 0) {
            this.e = new HM(context, resourceId);
        } else {
            this.e = context;
        }
        int i3 = -1;
        TypedArray typedArray2 = null;
        try {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, m, i2, 0);
            try {
                if (typedArrayObtainStyledAttributes.hasValue(0)) {
                    i3 = typedArrayObtainStyledAttributes.getInt(0, 0);
                }
            } catch (Exception unused) {
                if (typedArrayObtainStyledAttributes != null) {
                }
                if (i3 != 0) {
                    e eVar = new e();
                    this.j = eVar;
                    eVar.g = typedArray.getString(2);
                } else if (i3 == 1) {
                    g gVar = new g(this.e, attributeSet, i2);
                    WZ1 wz1E2 = WZ1.e(this.e, attributeSet, iArr, i2);
                    this.k = wz1E2.b.getLayoutDimension(3, -2);
                    gVar.i(wz1E2.b(1));
                    gVar.G = typedArray.getString(2);
                    wz1E2.f();
                    this.j = gVar;
                    this.g = new C0576Ae(this, this, gVar);
                }
                textArray = typedArray.getTextArray(0);
                if (textArray != null) {
                    ArrayAdapter arrayAdapter = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
                    arrayAdapter.setDropDownViewResource(com.pexpress.tool.R.layout.support_simple_spinner_dropdown_item);
                    setAdapter((SpinnerAdapter) arrayAdapter);
                }
                wz1E.f();
                this.i = true;
                spinnerAdapter = this.h;
                if (spinnerAdapter != null) {
                    setAdapter(spinnerAdapter);
                    this.h = null;
                }
                this.d.d(attributeSet, i2);
            } catch (Throwable th) {
                th = th;
                typedArray2 = typedArrayObtainStyledAttributes;
                if (typedArray2 != null) {
                    typedArray2.recycle();
                }
                throw th;
            }
        } catch (Exception unused2) {
            typedArrayObtainStyledAttributes = null;
        } catch (Throwable th2) {
            th = th2;
        }
        typedArrayObtainStyledAttributes.recycle();
        if (i3 != 0) {
            e eVar2 = new e();
            this.j = eVar2;
            eVar2.g = typedArray.getString(2);
        } else if (i3 == 1) {
            g gVar2 = new g(this.e, attributeSet, i2);
            WZ1 wz1E3 = WZ1.e(this.e, attributeSet, iArr, i2);
            this.k = wz1E3.b.getLayoutDimension(3, -2);
            gVar2.i(wz1E3.b(1));
            gVar2.G = typedArray.getString(2);
            wz1E3.f();
            this.j = gVar2;
            this.g = new C0576Ae(this, this, gVar2);
        }
        textArray = typedArray.getTextArray(0);
        if (textArray != null) {
            ArrayAdapter arrayAdapter2 = new ArrayAdapter(context, R.layout.simple_spinner_item, textArray);
            arrayAdapter2.setDropDownViewResource(com.pexpress.tool.R.layout.support_simple_spinner_dropdown_item);
            setAdapter((SpinnerAdapter) arrayAdapter2);
        }
        wz1E.f();
        this.i = true;
        spinnerAdapter = this.h;
        if (spinnerAdapter != null) {
            setAdapter(spinnerAdapter);
            this.h = null;
        }
        this.d.d(attributeSet, i2);
    }

    public final int a(SpinnerAdapter spinnerAdapter, Drawable drawable) {
        int i2 = 0;
        if (spinnerAdapter == null) {
            return 0;
        }
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 0);
        int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 0);
        int iMax = Math.max(0, getSelectedItemPosition());
        int iMin = Math.min(spinnerAdapter.getCount(), iMax + 15);
        View view = null;
        int iMax2 = 0;
        for (int iMax3 = Math.max(0, iMax - (15 - (iMin - iMax))); iMax3 < iMin; iMax3++) {
            int itemViewType = spinnerAdapter.getItemViewType(iMax3);
            if (itemViewType != i2) {
                view = null;
                i2 = itemViewType;
            }
            view = spinnerAdapter.getView(iMax3, view, this);
            if (view.getLayoutParams() == null) {
                view.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
            }
            view.measure(iMakeMeasureSpec, iMakeMeasureSpec2);
            iMax2 = Math.max(iMax2, view.getMeasuredWidth());
        }
        if (drawable == null) {
            return iMax2;
        }
        Rect rect = this.l;
        drawable.getPadding(rect);
        return rect.left + rect.right + iMax2;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.a();
        }
    }

    @Override // android.widget.Spinner
    public int getDropDownHorizontalOffset() {
        i iVar = this.j;
        return iVar != null ? iVar.c() : super.getDropDownHorizontalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownVerticalOffset() {
        i iVar = this.j;
        return iVar != null ? iVar.n() : super.getDropDownVerticalOffset();
    }

    @Override // android.widget.Spinner
    public int getDropDownWidth() {
        return this.j != null ? this.k : super.getDropDownWidth();
    }

    public final i getInternalPopup() {
        return this.j;
    }

    @Override // android.widget.Spinner
    public Drawable getPopupBackground() {
        i iVar = this.j;
        return iVar != null ? iVar.g() : super.getPopupBackground();
    }

    @Override // android.widget.Spinner
    public Context getPopupContext() {
        return this.e;
    }

    @Override // android.widget.Spinner
    public CharSequence getPrompt() {
        i iVar = this.j;
        return iVar != null ? iVar.f() : super.getPrompt();
    }

    public ColorStateList getSupportBackgroundTintList() {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            return c1901Rd.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            return c1901Rd.c();
        }
        return null;
    }

    @Override // android.widget.Spinner, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        i iVar = this.j;
        if (iVar == null || !iVar.a()) {
            return;
        }
        iVar.dismiss();
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onMeasure(int i2, int i3) {
        super.onMeasure(i2, i3);
        if (this.j == null || View.MeasureSpec.getMode(i2) != Integer.MIN_VALUE) {
            return;
        }
        setMeasuredDimension(Math.min(Math.max(getMeasuredWidth(), a(getAdapter(), getBackground())), View.MeasureSpec.getSize(i2)), getMeasuredHeight());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        ViewTreeObserver viewTreeObserver;
        h hVar = (h) parcelable;
        super.onRestoreInstanceState(hVar.getSuperState());
        if (!hVar.d || (viewTreeObserver = getViewTreeObserver()) == null) {
            return;
        }
        viewTreeObserver.addOnGlobalLayoutListener(new a());
    }

    @Override // android.widget.Spinner, android.widget.AbsSpinner, android.view.View
    public final Parcelable onSaveInstanceState() {
        h hVar = new h(super.onSaveInstanceState());
        i iVar = this.j;
        hVar.d = iVar != null && iVar.a();
        return hVar;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0576Ae c0576Ae = this.g;
        if (c0576Ae == null || !c0576Ae.onTouch(this, motionEvent)) {
            return super.onTouchEvent(motionEvent);
        }
        return true;
    }

    @Override // android.widget.Spinner, android.view.View
    public final boolean performClick() {
        i iVar = this.j;
        if (iVar == null) {
            return super.performClick();
        }
        if (iVar.a()) {
            return true;
        }
        this.j.m(c.b(this), c.a(this));
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.f(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownHorizontalOffset(int i2) {
        i iVar = this.j;
        if (iVar == null) {
            super.setDropDownHorizontalOffset(i2);
        } else {
            iVar.l(i2);
            iVar.e(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownVerticalOffset(int i2) {
        i iVar = this.j;
        if (iVar != null) {
            iVar.k(i2);
        } else {
            super.setDropDownVerticalOffset(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setDropDownWidth(int i2) {
        if (this.j != null) {
            this.k = i2;
        } else {
            super.setDropDownWidth(i2);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundDrawable(Drawable drawable) {
        i iVar = this.j;
        if (iVar != null) {
            iVar.i(drawable);
        } else {
            super.setPopupBackgroundDrawable(drawable);
        }
    }

    @Override // android.widget.Spinner
    public void setPopupBackgroundResource(int i2) {
        setPopupBackgroundDrawable(C7652xe.d(getPopupContext(), i2));
    }

    @Override // android.widget.Spinner
    public void setPrompt(CharSequence charSequence) {
        i iVar = this.j;
        if (iVar != null) {
            iVar.h(charSequence);
        } else {
            super.setPrompt(charSequence);
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C1901Rd c1901Rd = this.d;
        if (c1901Rd != null) {
            c1901Rd.i(mode);
        }
    }

    @Override // android.widget.AdapterView
    public void setAdapter(SpinnerAdapter spinnerAdapter) {
        if (!this.i) {
            this.h = spinnerAdapter;
            return;
        }
        super.setAdapter(spinnerAdapter);
        i iVar = this.j;
        if (iVar != null) {
            Context context = this.e;
            if (context == null) {
                context = getContext();
            }
            Resources.Theme theme = context.getTheme();
            f fVar = new f();
            fVar.d = spinnerAdapter;
            if (spinnerAdapter instanceof ListAdapter) {
                fVar.e = (ListAdapter) spinnerAdapter;
            }
            if (theme != null) {
                if (spinnerAdapter instanceof ThemedSpinnerAdapter) {
                    d.a((ThemedSpinnerAdapter) spinnerAdapter, theme);
                } else if (spinnerAdapter instanceof InterfaceC7422wY1) {
                    InterfaceC7422wY1 interfaceC7422wY1 = (InterfaceC7422wY1) spinnerAdapter;
                    if (interfaceC7422wY1.getDropDownViewTheme() == null) {
                        interfaceC7422wY1.a();
                    }
                }
            }
            iVar.p(fVar);
        }
    }
}
