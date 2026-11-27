package defpackage;

import android.app.Activity;
import android.util.SparseIntArray;
import androidx.core.app.FrameMetricsAggregator;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.HashMap;

/* JADX INFO: renamed from: Zi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C2571Zi0 {
    public static final C6170qb e = C6170qb.d();
    public final Activity a;
    public final FrameMetricsAggregator b;
    public final HashMap c;
    public boolean d;

    @VisibleForTesting
    public C2571Zi0() {
        throw null;
    }

    public C2571Zi0(Activity activity) {
        FrameMetricsAggregator frameMetricsAggregator = new FrameMetricsAggregator();
        HashMap map = new HashMap();
        this.d = false;
        this.a = activity;
        this.b = frameMetricsAggregator;
        this.c = map;
    }

    public final C2745aa1<C2493Yi0> a() {
        boolean z = this.d;
        C6170qb c6170qb = e;
        if (!z) {
            c6170qb.a();
            return new C2745aa1<>();
        }
        SparseIntArray sparseIntArray = this.b.a.b[0];
        if (sparseIntArray == null) {
            c6170qb.a();
            return new C2745aa1<>();
        }
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < sparseIntArray.size(); i4++) {
            int iKeyAt = sparseIntArray.keyAt(i4);
            int iValueAt = sparseIntArray.valueAt(i4);
            i += iValueAt;
            if (iKeyAt > 700) {
                i3 += iValueAt;
            }
            if (iKeyAt > 16) {
                i2 += iValueAt;
            }
        }
        return new C2745aa1<>(new C2493Yi0(i, i2, i3));
    }
}
