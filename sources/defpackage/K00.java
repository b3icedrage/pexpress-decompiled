package defpackage;

import android.util.SparseIntArray;
import com.pexpress.tool.R;

/* JADX INFO: loaded from: classes3.dex */
public final class K00 extends J00 {
    public static final SparseIntArray D;
    public long C;

    static {
        SparseIntArray sparseIntArray = new SparseIntArray();
        D = sparseIntArray;
        sparseIntArray.put(R.id.error, 2);
        sparseIntArray.put(R.id.title, 3);
    }

    @Override // defpackage.J00
    public final void A(H92 h92) {
        this.A = h92;
        synchronized (this) {
            this.C |= 4;
        }
        j(3);
        v();
    }

    @Override // androidx.databinding.ViewDataBinding
    public final void o() {
        long j;
        synchronized (this) {
            j = this.C;
            this.C = 0L;
        }
        H92 h92 = this.A;
        long j2 = j & 13;
        String string = null;
        if (j2 != 0) {
            EY0 ey0 = h92 != null ? h92.e : null;
            z(0, ey0);
            string = this.y.getResources().getString(R.string.unsupported_message_description, ey0 != null ? (String) ey0.d() : null);
        }
        if (j2 != 0) {
            C4689jY1.a(this.y, string);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.C != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean t(Object obj, int i, int i2) {
        if (i != 0) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.C |= 1;
        }
        return true;
    }
}
