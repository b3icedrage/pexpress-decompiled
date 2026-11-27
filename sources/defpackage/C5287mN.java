package defpackage;

import androidx.annotation.NonNull;
import java.util.Iterator;

/* JADX INFO: renamed from: mN, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C5287mN implements InterfaceC4895kX0<RX1> {
    public final /* synthetic */ C7176vN a;

    public C5287mN(C7176vN c7176vN) {
        this.a = c7176vN;
    }

    @Override // defpackage.InterfaceC4895kX0
    public final void a(@NonNull C5318mX0 c5318mX0, @NonNull AbstractC6909u51 abstractC6909u51) {
        String str = ((RX1) abstractC6909u51).f;
        c5318mX0.c.d.append(str);
        C7176vN c7176vN = this.a;
        if (c7176vN.a.isEmpty()) {
            return;
        }
        int iC = c5318mX0.c() - str.length();
        Iterator it = c7176vN.a.iterator();
        while (it.hasNext()) {
            ((C7176vN.a) it.next()).a(c5318mX0, str, iC);
        }
    }
}
