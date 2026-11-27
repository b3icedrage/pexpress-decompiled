package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.k;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.pexpress.tool.R;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes.dex */
public abstract class Y21 extends FrameLayout {

    @NonNull
    public final U21 d;

    @NonNull
    public final V21 e;

    @NonNull
    public final W21 g;
    public GV1 h;
    public b i;

    public interface a {
    }

    public interface b {
    }

    public static class c extends AbstractC7727y {
        public static final Parcelable.Creator<c> CREATOR = new a();
        public Bundle g;

        public class a implements Parcelable.ClassLoaderCreator<c> {
            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            public final c createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new c(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final Object[] newArray(int i) {
                return new c[i];
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(@NonNull Parcel parcel) {
                return new c(parcel, null);
            }
        }

        public c(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.g = parcel.readBundle(classLoader == null ? c.class.getClassLoader() : classLoader);
        }

        @Override // defpackage.AbstractC7727y, android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeBundle(this.g);
        }
    }

    public Y21(@NonNull Context context, AttributeSet attributeSet) {
        super(OX0.a(context, attributeSet, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView), attributeSet, R.attr.bottomNavigationStyle);
        W21 w21 = new W21();
        w21.e = false;
        this.g = w21;
        Context context2 = getContext();
        WZ1 wz1E = C7001uY1.e(context2, attributeSet, C2083Tl1.E, R.attr.bottomNavigationStyle, R.style.Widget_Design_BottomNavigationView, 10, 9);
        U21 u21 = new U21(context2, getClass(), getMaxItemCount());
        this.d = u21;
        C2261Vt c2261Vt = new C2261Vt(context2);
        this.e = c2261Vt;
        w21.d = c2261Vt;
        w21.g = 1;
        c2261Vt.setPresenter(w21);
        u21.b(w21, u21.a);
        getContext();
        w21.d.G = u21;
        TypedArray typedArray = wz1E.b;
        if (typedArray.hasValue(5)) {
            c2261Vt.setIconTintList(wz1E.a(5));
        } else {
            c2261Vt.setIconTintList(c2261Vt.c());
        }
        setItemIconSize(typedArray.getDimensionPixelSize(4, getResources().getDimensionPixelSize(R.dimen.mtrl_navigation_bar_item_default_icon_size)));
        if (typedArray.hasValue(10)) {
            setItemTextAppearanceInactive(typedArray.getResourceId(10, 0));
        }
        if (typedArray.hasValue(9)) {
            setItemTextAppearanceActive(typedArray.getResourceId(9, 0));
        }
        if (typedArray.hasValue(11)) {
            setItemTextColor(wz1E.a(11));
        }
        if (getBackground() == null || (getBackground() instanceof ColorDrawable)) {
            NX0 nx0 = new NX0();
            Drawable background = getBackground();
            if (background instanceof ColorDrawable) {
                nx0.l(ColorStateList.valueOf(((ColorDrawable) background).getColor()));
            }
            nx0.j(context2);
            WeakHashMap<View, C5345me2> weakHashMap = Cd2.a;
            setBackground(nx0);
        }
        if (typedArray.hasValue(7)) {
            setItemPaddingTop(typedArray.getDimensionPixelSize(7, 0));
        }
        if (typedArray.hasValue(6)) {
            setItemPaddingBottom(typedArray.getDimensionPixelSize(6, 0));
        }
        if (typedArray.hasValue(1)) {
            setElevation(typedArray.getDimensionPixelSize(1, 0));
        }
        A30.a.h(getBackground().mutate(), MX0.a(context2, wz1E, 0));
        setLabelVisibilityMode(typedArray.getInteger(12, -1));
        int resourceId = typedArray.getResourceId(3, 0);
        if (resourceId != 0) {
            c2261Vt.setItemBackgroundRes(resourceId);
        } else {
            setItemRippleColor(MX0.a(context2, wz1E, 8));
        }
        int resourceId2 = typedArray.getResourceId(2, 0);
        if (resourceId2 != 0) {
            setItemActiveIndicatorEnabled(true);
            TypedArray typedArrayObtainStyledAttributes = context2.obtainStyledAttributes(resourceId2, C2083Tl1.D);
            setItemActiveIndicatorWidth(typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0));
            setItemActiveIndicatorHeight(typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0));
            setItemActiveIndicatorMarginHorizontal(typedArrayObtainStyledAttributes.getDimensionPixelOffset(3, 0));
            setItemActiveIndicatorColor(MX0.b(context2, typedArrayObtainStyledAttributes, 2));
            setItemActiveIndicatorShapeAppearance(RJ1.a(context2, typedArrayObtainStyledAttributes.getResourceId(4, 0), 0, new A(0)).a());
            typedArrayObtainStyledAttributes.recycle();
        }
        if (typedArray.hasValue(13)) {
            int resourceId3 = typedArray.getResourceId(13, 0);
            w21.e = true;
            getMenuInflater().inflate(resourceId3, u21);
            w21.e = false;
            w21.d(true);
        }
        wz1E.f();
        addView(c2261Vt);
        u21.e = new X21((BottomNavigationView) this);
    }

    private MenuInflater getMenuInflater() {
        if (this.h == null) {
            this.h = new GV1(getContext());
        }
        return this.h;
    }

    @NonNull
    public final C1937Rp a(int i) {
        V21 v21 = this.e;
        v21.getClass();
        V21.f(i);
        SparseArray<C1937Rp> sparseArray = v21.v;
        C1937Rp c1937Rp = sparseArray.get(i);
        S21 s21 = null;
        if (c1937Rp == null) {
            C1937Rp c1937Rp2 = new C1937Rp(v21.getContext(), null);
            sparseArray.put(i, c1937Rp2);
            c1937Rp = c1937Rp2;
        }
        V21.f(i);
        S21[] s21Arr = v21.j;
        if (s21Arr != null) {
            for (S21 s22 : s21Arr) {
                if (s22.getId() == i) {
                    s21 = s22;
                    break;
                }
            }
        }
        if (s21 != null) {
            s21.setBadge(c1937Rp);
        }
        return c1937Rp;
    }

    public ColorStateList getItemActiveIndicatorColor() {
        return this.e.getItemActiveIndicatorColor();
    }

    public int getItemActiveIndicatorHeight() {
        return this.e.getItemActiveIndicatorHeight();
    }

    public int getItemActiveIndicatorMarginHorizontal() {
        return this.e.getItemActiveIndicatorMarginHorizontal();
    }

    public RJ1 getItemActiveIndicatorShapeAppearance() {
        return this.e.getItemActiveIndicatorShapeAppearance();
    }

    public int getItemActiveIndicatorWidth() {
        return this.e.getItemActiveIndicatorWidth();
    }

    public Drawable getItemBackground() {
        return this.e.getItemBackground();
    }

    @Deprecated
    public int getItemBackgroundResource() {
        return this.e.getItemBackgroundRes();
    }

    public int getItemIconSize() {
        return this.e.getItemIconSize();
    }

    public ColorStateList getItemIconTintList() {
        return this.e.getIconTintList();
    }

    public int getItemPaddingBottom() {
        return this.e.getItemPaddingBottom();
    }

    public int getItemPaddingTop() {
        return this.e.getItemPaddingTop();
    }

    public ColorStateList getItemRippleColor() {
        return this.e.getItemRippleColor();
    }

    public int getItemTextAppearanceActive() {
        return this.e.getItemTextAppearanceActive();
    }

    public int getItemTextAppearanceInactive() {
        return this.e.getItemTextAppearanceInactive();
    }

    public ColorStateList getItemTextColor() {
        return this.e.getItemTextColor();
    }

    public int getLabelVisibilityMode() {
        return this.e.getLabelVisibilityMode();
    }

    public abstract int getMaxItemCount();

    @NonNull
    public Menu getMenu() {
        return this.d;
    }

    @NonNull
    public k getMenuView() {
        return this.e;
    }

    @NonNull
    public W21 getPresenter() {
        return this.g;
    }

    public int getSelectedItemId() {
        return this.e.getSelectedItemId();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        C0564Aa.y(this);
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof c)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        c cVar = (c) parcelable;
        super.onRestoreInstanceState(cVar.d);
        Bundle bundle = cVar.g;
        U21 u21 = this.d;
        u21.getClass();
        SparseArray sparseParcelableArray = bundle.getSparseParcelableArray("android:menu:presenters");
        if (sparseParcelableArray != null) {
            CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = u21.u;
            if (copyOnWriteArrayList.isEmpty()) {
                return;
            }
            for (WeakReference<j> weakReference : copyOnWriteArrayList) {
                j jVar = weakReference.get();
                if (jVar == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    int id = jVar.getId();
                    if (id > 0 && (parcelable2 = (Parcelable) sparseParcelableArray.get(id)) != null) {
                        jVar.i(parcelable2);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    @NonNull
    public final Parcelable onSaveInstanceState() {
        Parcelable parcelableL;
        c cVar = new c(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        cVar.g = bundle;
        CopyOnWriteArrayList<WeakReference<j>> copyOnWriteArrayList = this.d.u;
        if (copyOnWriteArrayList.isEmpty()) {
            return cVar;
        }
        SparseArray<? extends Parcelable> sparseArray = new SparseArray<>();
        for (WeakReference<j> weakReference : copyOnWriteArrayList) {
            j jVar = weakReference.get();
            if (jVar == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                int id = jVar.getId();
                if (id > 0 && (parcelableL = jVar.l()) != null) {
                    sparseArray.put(id, parcelableL);
                }
            }
        }
        bundle.putSparseParcelableArray("android:menu:presenters", sparseArray);
        return cVar;
    }

    @Override // android.view.View
    public void setElevation(float f) {
        super.setElevation(f);
        C0564Aa.w(this, f);
    }

    public void setItemActiveIndicatorColor(ColorStateList colorStateList) {
        this.e.setItemActiveIndicatorColor(colorStateList);
    }

    public void setItemActiveIndicatorEnabled(boolean z) {
        this.e.setItemActiveIndicatorEnabled(z);
    }

    public void setItemActiveIndicatorHeight(int i) {
        this.e.setItemActiveIndicatorHeight(i);
    }

    public void setItemActiveIndicatorMarginHorizontal(int i) {
        this.e.setItemActiveIndicatorMarginHorizontal(i);
    }

    public void setItemActiveIndicatorShapeAppearance(RJ1 rj1) {
        this.e.setItemActiveIndicatorShapeAppearance(rj1);
    }

    public void setItemActiveIndicatorWidth(int i) {
        this.e.setItemActiveIndicatorWidth(i);
    }

    public void setItemBackground(Drawable drawable) {
        this.e.setItemBackground(drawable);
    }

    public void setItemBackgroundResource(int i) {
        this.e.setItemBackgroundRes(i);
    }

    public void setItemIconSize(int i) {
        this.e.setItemIconSize(i);
    }

    public void setItemIconSizeRes(int i) {
        setItemIconSize(getResources().getDimensionPixelSize(i));
    }

    public void setItemIconTintList(ColorStateList colorStateList) {
        this.e.setIconTintList(colorStateList);
    }

    public void setItemPaddingBottom(int i) {
        this.e.setItemPaddingBottom(i);
    }

    public void setItemPaddingTop(int i) {
        this.e.setItemPaddingTop(i);
    }

    public void setItemRippleColor(ColorStateList colorStateList) {
        this.e.setItemRippleColor(colorStateList);
    }

    public void setItemTextAppearanceActive(int i) {
        this.e.setItemTextAppearanceActive(i);
    }

    public void setItemTextAppearanceInactive(int i) {
        this.e.setItemTextAppearanceInactive(i);
    }

    public void setItemTextColor(ColorStateList colorStateList) {
        this.e.setItemTextColor(colorStateList);
    }

    public void setLabelVisibilityMode(int i) {
        V21 v21 = this.e;
        if (v21.getLabelVisibilityMode() != i) {
            v21.setLabelVisibilityMode(i);
            this.g.d(false);
        }
    }

    public void setOnItemSelectedListener(b bVar) {
        this.i = bVar;
    }

    public void setSelectedItemId(int i) {
        U21 u21 = this.d;
        MenuItem menuItemFindItem = u21.findItem(i);
        if (menuItemFindItem == null || u21.q(menuItemFindItem, this.g, 0)) {
            return;
        }
        menuItemFindItem.setChecked(true);
    }

    public void setOnItemReselectedListener(a aVar) {
    }
}
