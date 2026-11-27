package defpackage;

import android.database.Cursor;
import android.widget.Filter;
import androidx.appcompat.widget.SearchView;
import io.sentry.android.core.b0;

/* JADX INFO: renamed from: fR, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C3778fR extends Filter {
    public AbstractC3568eR a;

    @Override // android.widget.Filter
    public final CharSequence convertResultToString(Object obj) {
        return ((WU1) this.a).d((Cursor) obj);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0034  */
    @Override // android.widget.Filter
    public final Filter.FilterResults performFiltering(CharSequence charSequence) {
        String string;
        Cursor cursorH;
        WU1 wu1 = (WU1) this.a;
        if (charSequence == null) {
            string = "";
        } else {
            wu1.getClass();
            string = charSequence.toString();
        }
        SearchView searchView = wu1.o;
        if (searchView.getVisibility() == 0 && searchView.getWindowVisibility() == 0) {
            try {
                cursorH = wu1.h(wu1.p, string);
                if (cursorH != null) {
                    cursorH.getCount();
                } else {
                    cursorH = null;
                }
            } catch (RuntimeException e) {
                b0.f("SuggestionsAdapter", "Search suggestions query threw an exception.", e);
            }
        } else {
            cursorH = null;
        }
        Filter.FilterResults filterResults = new Filter.FilterResults();
        if (cursorH != null) {
            filterResults.count = cursorH.getCount();
            filterResults.values = cursorH;
        } else {
            filterResults.count = 0;
            filterResults.values = null;
        }
        return filterResults;
    }

    @Override // android.widget.Filter
    public final void publishResults(CharSequence charSequence, Filter.FilterResults filterResults) {
        AbstractC3568eR abstractC3568eR = this.a;
        Cursor cursor = abstractC3568eR.g;
        Object obj = filterResults.values;
        if (obj == null || obj == cursor) {
            return;
        }
        ((WU1) abstractC3568eR).c((Cursor) obj);
    }
}
