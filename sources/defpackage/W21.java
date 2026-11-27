package defpackage;

import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
import androidx.annotation.NonNull;
import androidx.appcompat.view.menu.f;
import androidx.appcompat.view.menu.h;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.view.menu.m;

/* JADX INFO: loaded from: classes.dex */
public final class W21 implements j {
    public V21 d;
    public boolean e;
    public int g;

    public static class a implements Parcelable {
        public static final Parcelable.Creator<a> CREATOR = new C0168a();
        public int d;
        public C3396dc1 e;

        /* JADX INFO: renamed from: W21$a$a, reason: collision with other inner class name */
        public class C0168a implements Parcelable.Creator<a> {
            @Override // android.os.Parcelable.Creator
            @NonNull
            public final a createFromParcel(@NonNull Parcel parcel) {
                a aVar = new a();
                aVar.d = parcel.readInt();
                aVar.e = (C3396dc1) parcel.readParcelable(a.class.getClassLoader());
                return aVar;
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            public final a[] newArray(int i) {
                return new a[i];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@NonNull Parcel parcel, int i) {
            parcel.writeInt(this.d);
            parcel.writeParcelable(this.e, 0);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z) {
        C1697On c1697On;
        if (this.e) {
            return;
        }
        if (z) {
            this.d.a();
            return;
        }
        V21 v21 = this.d;
        f fVar = v21.G;
        if (fVar == null || v21.j == null) {
            return;
        }
        int size = fVar.f.size();
        if (size != v21.j.length) {
            v21.a();
            return;
        }
        int i = v21.k;
        for (int i2 = 0; i2 < size; i2++) {
            MenuItem item = v21.G.getItem(i2);
            if (item.isChecked()) {
                v21.k = item.getItemId();
                v21.l = i2;
            }
        }
        if (i != v21.k && (c1697On = v21.d) != null) {
            K42.a(v21, c1697On);
        }
        int i3 = v21.i;
        boolean z2 = i3 != -1 ? i3 == 0 : v21.G.l().size() > 3;
        for (int i4 = 0; i4 < size; i4++) {
            v21.F.e = true;
            v21.j[i4].setLabelVisibilityMode(v21.i);
            v21.j[i4].setShifting(z2);
            v21.j[i4].d((h) v21.G.getItem(i4));
            v21.F.e = false;
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return this.g;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(@NonNull Context context, @NonNull f fVar) {
        this.d.G = fVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(@NonNull Parcelable parcelable) {
        SparseArray<C1937Rp> sparseArray;
        if (parcelable instanceof a) {
            V21 v21 = this.d;
            a aVar = (a) parcelable;
            int i = aVar.d;
            int size = v21.G.f.size();
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = v21.G.getItem(i2);
                if (i == item.getItemId()) {
                    v21.k = i;
                    v21.l = i2;
                    item.setChecked(true);
                    break;
                }
            }
            Context context = this.d.getContext();
            C3396dc1 c3396dc1 = aVar.e;
            SparseArray sparseArray2 = new SparseArray(c3396dc1.size());
            for (int i3 = 0; i3 < c3396dc1.size(); i3++) {
                int iKeyAt = c3396dc1.keyAt(i3);
                C2015Sp.a aVar2 = (C2015Sp.a) c3396dc1.valueAt(i3);
                if (aVar2 == null) {
                    throw new IllegalArgumentException("BadgeDrawable's savedState cannot be null");
                }
                sparseArray2.put(iKeyAt, new C1937Rp(context, aVar2));
            }
            V21 v22 = this.d;
            v22.getClass();
            int i4 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = v22.v;
                if (i4 >= size2) {
                    break;
                }
                int iKeyAt2 = sparseArray2.keyAt(i4);
                if (sparseArray.indexOfKey(iKeyAt2) < 0) {
                    sparseArray.append(iKeyAt2, (C1937Rp) sparseArray2.get(iKeyAt2));
                }
                i4++;
            }
            S21[] s21Arr = v22.j;
            if (s21Arr != null) {
                for (S21 s21 : s21Arr) {
                    s21.setBadge(sparseArray.get(s21.getId()));
                }
            }
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    @NonNull
    public final Parcelable l() {
        a aVar = new a();
        aVar.d = this.d.getSelectedItemId();
        SparseArray<C1937Rp> badgeDrawables = this.d.getBadgeDrawables();
        C3396dc1 c3396dc1 = new C3396dc1();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int iKeyAt = badgeDrawables.keyAt(i);
            C1937Rp c1937RpValueAt = badgeDrawables.valueAt(i);
            if (c1937RpValueAt == null) {
                throw new IllegalArgumentException("badgeDrawable cannot be null");
            }
            c3396dc1.put(iKeyAt, c1937RpValueAt.i.a);
        }
        aVar.e = c3396dc1;
        return aVar;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
    }
}
