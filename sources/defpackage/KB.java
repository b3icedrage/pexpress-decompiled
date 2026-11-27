package defpackage;

import android.view.View;
import androidx.annotation.NonNull;
import com.google.android.material.chip.ChipGroup;
import com.google.android.material.chip.b;
import defpackage.IX0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

/* JADX INFO: loaded from: classes.dex */
public final class KB<T extends IX0<T>> {
    public final HashMap a = new HashMap();
    public final HashSet b = new HashSet();
    public b c;
    public boolean d;
    public boolean e;

    public final boolean a(@NonNull IX0<T> ix0) {
        int id = ix0.getId();
        HashSet hashSet = this.b;
        if (hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        IX0<T> ix1 = (IX0) this.a.get(Integer.valueOf(c()));
        if (ix1 != null) {
            e(ix1, false);
        }
        boolean zAdd = hashSet.add(Integer.valueOf(id));
        if (!ix0.isChecked()) {
            ix0.setChecked(true);
        }
        return zAdd;
    }

    @NonNull
    public final ArrayList b(@NonNull ChipGroup chipGroup) {
        HashSet hashSet = new HashSet(this.b);
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < chipGroup.getChildCount(); i++) {
            View childAt = chipGroup.getChildAt(i);
            if ((childAt instanceof IX0) && hashSet.contains(Integer.valueOf(childAt.getId()))) {
                arrayList.add(Integer.valueOf(childAt.getId()));
            }
        }
        return arrayList;
    }

    public final int c() {
        if (!this.d) {
            return -1;
        }
        HashSet hashSet = this.b;
        if (hashSet.isEmpty()) {
            return -1;
        }
        return ((Integer) hashSet.iterator().next()).intValue();
    }

    public final void d() {
        b bVar = this.c;
        if (bVar != null) {
            new HashSet(this.b);
            ChipGroup chipGroup = bVar.a;
            ChipGroup.d dVar = chipGroup.k;
            if (dVar != null) {
                dVar.a(chipGroup, chipGroup.l.b(chipGroup));
            }
        }
    }

    public final boolean e(@NonNull IX0<T> ix0, boolean z) {
        int id = ix0.getId();
        HashSet hashSet = this.b;
        if (!hashSet.contains(Integer.valueOf(id))) {
            return false;
        }
        if (z && hashSet.size() == 1 && hashSet.contains(Integer.valueOf(id))) {
            ix0.setChecked(true);
            return false;
        }
        boolean zRemove = hashSet.remove(Integer.valueOf(id));
        if (ix0.isChecked()) {
            ix0.setChecked(false);
        }
        return zRemove;
    }
}
