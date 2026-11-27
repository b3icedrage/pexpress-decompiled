package defpackage;

/* JADX INFO: renamed from: ok2, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C5789ok2 extends AbstractC3297d70 {
    @Override // defpackage.CK1
    public final String c() {
        return "INSERT OR IGNORE INTO `WorkName` (`name`,`work_spec_id`) VALUES (?,?)";
    }

    @Override // defpackage.AbstractC3297d70
    public final void e(InterfaceC4005gW1 interfaceC4005gW1, Object obj) {
        C5369mk2 c5369mk2 = (C5369mk2) obj;
        String str = c5369mk2.a;
        if (str == null) {
            interfaceC4005gW1.P0(1);
        } else {
            interfaceC4005gW1.F(1, str);
        }
        String str2 = c5369mk2.b;
        if (str2 == null) {
            interfaceC4005gW1.P0(2);
        } else {
            interfaceC4005gW1.F(2, str2);
        }
    }
}
