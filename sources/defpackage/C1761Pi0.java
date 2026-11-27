package defpackage;

import androidx.annotation.NonNull;
import java.util.ArrayList;

/* JADX INFO: renamed from: Pi0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C1761Pi0 extends J42 {
    public final /* synthetic */ Object d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ Object g;
    public final /* synthetic */ ArrayList h;
    public final /* synthetic */ C1683Oi0 i;

    public C1761Pi0(C1683Oi0 c1683Oi0, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.i = c1683Oi0;
        this.d = obj;
        this.e = arrayList;
        this.g = obj2;
        this.h = arrayList2;
    }

    @Override // E42.d
    public final void b(@NonNull E42 e42) {
        e42.z(this);
    }

    @Override // defpackage.J42, E42.d
    public final void d() {
        C1683Oi0 c1683Oi0 = this.i;
        Object obj = this.d;
        if (obj != null) {
            c1683Oi0.s(obj, this.e, null);
        }
        Object obj2 = this.g;
        if (obj2 != null) {
            c1683Oi0.s(obj2, this.h, null);
        }
    }
}
