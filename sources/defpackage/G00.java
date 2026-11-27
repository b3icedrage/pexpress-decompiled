package defpackage;

import com.pexpress.tool.R;

/* JADX INFO: loaded from: classes3.dex */
public final class G00 extends F00 {
    public long B;

    @Override // defpackage.F00
    public final void A(C6920u80 c6920u80) {
        this.z = c6920u80;
        synchronized (this) {
            this.B |= 8;
        }
        j(3);
        v();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.databinding.ViewDataBinding
    public final void o() {
        long j;
        EY0 ey0;
        EY0 ey1;
        synchronized (this) {
            j = this.B;
            this.B = 0L;
        }
        C6920u80 c6920u80 = this.z;
        long j2 = j & 27;
        String string = null;
        if (j2 != 0) {
            if (c6920u80 != null) {
                ey0 = c6920u80.f;
                ey1 = c6920u80.e;
            } else {
                ey0 = null;
                ey1 = null;
            }
            z(0, ey0);
            z(1, ey1);
            string = this.y.getResources().getString(R.string.chat_system_disconnected, ey1 != null ? (Integer) ey1.d() : null, ey0 != null ? (String) ey0.d() : null);
        }
        if (j2 != 0) {
            C4689jY1.a(this.y, string);
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean p() {
        synchronized (this) {
            try {
                return this.B != 0;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // androidx.databinding.ViewDataBinding
    public final boolean t(Object obj, int i, int i2) {
        if (i == 0) {
            if (i2 != 0) {
                return false;
            }
            synchronized (this) {
                this.B |= 1;
            }
            return true;
        }
        if (i != 1) {
            return false;
        }
        if (i2 != 0) {
            return false;
        }
        synchronized (this) {
            this.B |= 2;
        }
        return true;
    }
}
