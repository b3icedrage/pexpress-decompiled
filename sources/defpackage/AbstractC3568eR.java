package defpackage;

import android.database.ContentObserver;
import android.database.Cursor;
import android.database.DataSetObserver;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.Filter;
import android.widget.Filterable;

/* JADX INFO: renamed from: eR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC3568eR extends BaseAdapter implements Filterable {
    public boolean d;
    public boolean e;
    public Cursor g;
    public int h;
    public a i;
    public b j;
    public C3778fR k;

    /* JADX INFO: renamed from: eR$a */
    public class a extends ContentObserver {
        public final /* synthetic */ WU1 a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(WU1 wu1) {
            super(new Handler());
            this.a = wu1;
        }

        @Override // android.database.ContentObserver
        public final boolean deliverSelfNotifications() {
            return true;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z) {
            Cursor cursor;
            WU1 wu1 = this.a;
            if (!wu1.e || (cursor = wu1.g) == null || cursor.isClosed()) {
                return;
            }
            wu1.d = wu1.g.requery();
        }
    }

    /* JADX INFO: renamed from: eR$b */
    public class b extends DataSetObserver {
        public final /* synthetic */ WU1 a;

        public b(WU1 wu1) {
            this.a = wu1;
        }

        @Override // android.database.DataSetObserver
        public final void onChanged() {
            WU1 wu1 = this.a;
            wu1.d = true;
            wu1.notifyDataSetChanged();
        }

        @Override // android.database.DataSetObserver
        public final void onInvalidated() {
            WU1 wu1 = this.a;
            wu1.d = false;
            wu1.notifyDataSetInvalidated();
        }
    }

    public abstract void b(View view, Cursor cursor);

    public void c(Cursor cursor) {
        Cursor cursor2 = this.g;
        if (cursor == cursor2) {
            cursor2 = null;
        } else {
            if (cursor2 != null) {
                a aVar = this.i;
                if (aVar != null) {
                    cursor2.unregisterContentObserver(aVar);
                }
                b bVar = this.j;
                if (bVar != null) {
                    cursor2.unregisterDataSetObserver(bVar);
                }
            }
            this.g = cursor;
            if (cursor != null) {
                a aVar2 = this.i;
                if (aVar2 != null) {
                    cursor.registerContentObserver(aVar2);
                }
                b bVar2 = this.j;
                if (bVar2 != null) {
                    cursor.registerDataSetObserver(bVar2);
                }
                this.h = cursor.getColumnIndexOrThrow("_id");
                this.d = true;
                notifyDataSetChanged();
            } else {
                this.h = -1;
                this.d = false;
                notifyDataSetInvalidated();
            }
        }
        if (cursor2 != null) {
            cursor2.close();
        }
    }

    public abstract String d(Cursor cursor);

    public abstract View e(ViewGroup viewGroup);

    @Override // android.widget.Adapter
    public final int getCount() {
        Cursor cursor;
        if (!this.d || (cursor = this.g) == null) {
            return 0;
        }
        return cursor.getCount();
    }

    @Override // android.widget.BaseAdapter, android.widget.SpinnerAdapter
    public View getDropDownView(int i, View view, ViewGroup viewGroup) {
        if (!this.d) {
            return null;
        }
        this.g.moveToPosition(i);
        if (view == null) {
            AbstractC4545it1 abstractC4545it1 = (AbstractC4545it1) this;
            view = abstractC4545it1.n.inflate(abstractC4545it1.m, viewGroup, false);
        }
        b(view, this.g);
        return view;
    }

    @Override // android.widget.Filterable
    public final Filter getFilter() {
        if (this.k == null) {
            C3778fR c3778fR = new C3778fR();
            c3778fR.a = this;
            this.k = c3778fR;
        }
        return this.k;
    }

    @Override // android.widget.Adapter
    public final Object getItem(int i) {
        Cursor cursor;
        if (!this.d || (cursor = this.g) == null) {
            return null;
        }
        cursor.moveToPosition(i);
        return this.g;
    }

    @Override // android.widget.Adapter
    public final long getItemId(int i) {
        Cursor cursor;
        if (this.d && (cursor = this.g) != null && cursor.moveToPosition(i)) {
            return this.g.getLong(this.h);
        }
        return 0L;
    }

    @Override // android.widget.Adapter
    public View getView(int i, View view, ViewGroup viewGroup) {
        if (!this.d) {
            throw new IllegalStateException("this should only be called when the cursor is valid");
        }
        if (!this.g.moveToPosition(i)) {
            throw new IllegalStateException(EK.e(i, "couldn't move cursor to position "));
        }
        if (view == null) {
            view = e(viewGroup);
        }
        b(view, this.g);
        return view;
    }
}
