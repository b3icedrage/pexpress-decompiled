package defpackage;

import androidx.work.b;

/* JADX INFO: renamed from: sk2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6628sk2 extends AbstractC3297d70 {
    @Override // defpackage.CK1
    public final String c() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }

    @Override // defpackage.AbstractC3297d70
    public final void e(InterfaceC4005gW1 interfaceC4005gW1, Object obj) throws Throwable {
        C6209qk2 c6209qk2 = (C6209qk2) obj;
        String str = c6209qk2.a;
        if (str == null) {
            interfaceC4005gW1.P0(1);
        } else {
            interfaceC4005gW1.F(1, str);
        }
        byte[] bArrC = b.c(c6209qk2.b);
        if (bArrC == null) {
            interfaceC4005gW1.P0(2);
        } else {
            interfaceC4005gW1.v0(2, bArrC);
        }
    }
}
