package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.ContextWrapper;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.BaseAdapter;
import androidx.appcompat.app.AlertController;
import com.pexpress.tool.R;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes.dex */
public final class d implements j, AdapterView.OnItemClickListener {
    public Context d;
    public LayoutInflater e;
    public f g;
    public ExpandedMenuView h;
    public j.a i;
    public a j;

    public class a extends BaseAdapter {
        public int d = -1;

        public a() {
            b();
        }

        public final void b() {
            f fVar = d.this.g;
            h hVar = fVar.v;
            if (hVar != null) {
                fVar.i();
                ArrayList<h> arrayList = fVar.j;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    if (arrayList.get(i) == hVar) {
                        this.d = i;
                        return;
                    }
                }
            }
            this.d = -1;
        }

        @Override // android.widget.Adapter
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final h getItem(int i) {
            d dVar = d.this;
            f fVar = dVar.g;
            fVar.i();
            ArrayList<h> arrayList = fVar.j;
            dVar.getClass();
            int i2 = this.d;
            if (i2 >= 0 && i >= i2) {
                i++;
            }
            return arrayList.get(i);
        }

        @Override // android.widget.Adapter
        public final int getCount() {
            d dVar = d.this;
            f fVar = dVar.g;
            fVar.i();
            int size = fVar.j.size();
            dVar.getClass();
            return this.d < 0 ? size : size - 1;
        }

        @Override // android.widget.Adapter
        public final long getItemId(int i) {
            return i;
        }

        @Override // android.widget.Adapter
        public final View getView(int i, View view, ViewGroup viewGroup) {
            if (view == null) {
                view = d.this.e.inflate(R.layout.abc_list_menu_item_layout, viewGroup, false);
            }
            ((k.a) view).d(getItem(i));
            return view;
        }

        @Override // android.widget.BaseAdapter
        public final void notifyDataSetChanged() {
            b();
            super.notifyDataSetChanged();
        }
    }

    public d(ContextWrapper contextWrapper) {
        this.d = contextWrapper;
        this.e = LayoutInflater.from(contextWrapper);
    }

    @Override // androidx.appcompat.view.menu.j
    public final void c(f fVar, boolean z) {
        j.a aVar = this.i;
        if (aVar != null) {
            aVar.c(fVar, z);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void d(boolean z) {
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean e() {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void f(j.a aVar) {
        throw null;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean g(h hVar) {
        return false;
    }

    @Override // androidx.appcompat.view.menu.j
    public final int getId() {
        return 0;
    }

    @Override // androidx.appcompat.view.menu.j
    public final void h(Context context, f fVar) {
        if (this.d != null) {
            this.d = context;
            if (this.e == null) {
                this.e = LayoutInflater.from(context);
            }
        }
        this.g = fVar;
        a aVar = this.j;
        if (aVar != null) {
            aVar.notifyDataSetChanged();
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final void i(Parcelable parcelable) {
        SparseArray<Parcelable> sparseParcelableArray = ((Bundle) parcelable).getSparseParcelableArray("android:menu:list");
        if (sparseParcelableArray != null) {
            this.h.restoreHierarchyState(sparseParcelableArray);
        }
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean k(m mVar) {
        if (!mVar.hasVisibleItems()) {
            return false;
        }
        g gVar = new g();
        gVar.d = mVar;
        Context context = mVar.a;
        androidx.appcompat.app.b.a aVar = new androidx.appcompat.app.b.a(context);
        AlertController.b bVar = aVar.a;
        d dVar = new d(bVar.a);
        gVar.g = dVar;
        dVar.i = gVar;
        mVar.b(dVar, context);
        d dVar2 = gVar.g;
        if (dVar2.j == null) {
            dVar2.j = dVar2.new a();
        }
        bVar.g = dVar2.j;
        bVar.h = gVar;
        View view = mVar.o;
        if (view != null) {
            bVar.e = view;
        } else {
            bVar.c = mVar.n;
            bVar.d = mVar.m;
        }
        bVar.f = gVar;
        androidx.appcompat.app.b bVarA = aVar.a();
        gVar.e = bVarA;
        bVarA.setOnDismissListener(gVar);
        WindowManager.LayoutParams attributes = gVar.e.getWindow().getAttributes();
        attributes.type = 1003;
        attributes.flags |= 131072;
        gVar.e.show();
        j.a aVar2 = this.i;
        if (aVar2 == null) {
            return true;
        }
        aVar2.d(mVar);
        return true;
    }

    @Override // androidx.appcompat.view.menu.j
    public final Parcelable l() {
        if (this.h == null) {
            return null;
        }
        Bundle bundle = new Bundle();
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        ExpandedMenuView expandedMenuView = this.h;
        if (expandedMenuView != null) {
            expandedMenuView.saveHierarchyState(sparseArray);
        }
        bundle.putSparseParcelableArray("android:menu:list", sparseArray);
        return bundle;
    }

    @Override // androidx.appcompat.view.menu.j
    public final boolean m(h hVar) {
        return false;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        this.g.q(this.j.getItem(i), this, 0);
    }
}
