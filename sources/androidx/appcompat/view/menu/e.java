package androidx.appcompat.view.menu;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class e extends BaseAdapter {
    public final f d;
    public int e = -1;
    public boolean g;
    public final boolean h;
    public final LayoutInflater i;
    public final int j;

    public e(f fVar, LayoutInflater layoutInflater, boolean z, int i) {
        this.h = z;
        this.i = layoutInflater;
        this.d = fVar;
        this.j = i;
        b();
    }

    public final void b() {
        f fVar = this.d;
        h hVar = fVar.v;
        if (hVar != null) {
            fVar.i();
            ArrayList<h> arrayList = fVar.j;
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                if (arrayList.get(i) == hVar) {
                    this.e = i;
                    return;
                }
            }
        }
        this.e = -1;
    }

    @Override // android.widget.Adapter
    /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
    public final h getItem(int i) {
        ArrayList<h> arrayListL;
        f fVar = this.d;
        if (this.h) {
            fVar.i();
            arrayListL = fVar.j;
        } else {
            arrayListL = fVar.l();
        }
        int i2 = this.e;
        if (i2 >= 0 && i >= i2) {
            i++;
        }
        return arrayListL.get(i);
    }

    @Override // android.widget.Adapter
    public final int getCount() {
        ArrayList<h> arrayListL;
        f fVar = this.d;
        if (this.h) {
            fVar.i();
            arrayListL = fVar.j;
        } else {
            arrayListL = fVar.l();
        }
        return this.e < 0 ? arrayListL.size() : arrayListL.size() - 1;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        return i;
    }

    @Override // android.widget.Adapter
    public final View getView(int i, View view, ViewGroup viewGroup) {
        boolean z = false;
        if (view == null) {
            view = this.i.inflate(this.j, viewGroup, false);
        }
        int i2 = getItem(i).b;
        int i3 = i - 1;
        int i4 = i3 >= 0 ? getItem(i3).b : i2;
        ListMenuItemView listMenuItemView = (ListMenuItemView) view;
        if (this.d.m() && i2 != i4) {
            z = true;
        }
        listMenuItemView.setGroupDividerEnabled(z);
        k.a aVar = (k.a) view;
        if (this.g) {
            listMenuItemView.setForceShowIcon(true);
        }
        aVar.d(getItem(i));
        return view;
    }

    @Override // android.widget.BaseAdapter
    public final void notifyDataSetChanged() {
        b();
        super.notifyDataSetChanged();
    }
}
