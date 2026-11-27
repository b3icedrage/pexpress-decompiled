package defpackage;

import android.view.View;
import android.widget.AdapterView;

/* JADX INFO: renamed from: tX0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6787tX0 implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C6997uX0 d;

    public C6787tX0(C6997uX0 c6997uX0) {
        this.d = c6997uX0;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
        Object item;
        C6997uX0 c6997uX0 = this.d;
        if (i < 0) {
            NQ0 nq0 = c6997uX0.i;
            item = !nq0.D.isShowing() ? null : nq0.g.getSelectedItem();
        } else {
            item = c6997uX0.getAdapter().getItem(i);
        }
        C6997uX0.a(c6997uX0, item);
        AdapterView.OnItemClickListener onItemClickListener = c6997uX0.getOnItemClickListener();
        NQ0 nq1 = c6997uX0.i;
        if (onItemClickListener != null) {
            if (view == null || i < 0) {
                view = nq1.D.isShowing() ? nq1.g.getSelectedView() : null;
                i = !nq1.D.isShowing() ? -1 : nq1.g.getSelectedItemPosition();
                j = !nq1.D.isShowing() ? Long.MIN_VALUE : nq1.g.getSelectedItemId();
            }
            onItemClickListener.onItemClick(nq1.g, view, i, j);
        }
        nq1.dismiss();
    }
}
