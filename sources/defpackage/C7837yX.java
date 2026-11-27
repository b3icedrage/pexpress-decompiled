package defpackage;

/* JADX INFO: renamed from: yX, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C7837yX extends AbstractC3297d70 {
    @Override // defpackage.CK1
    public final String c() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }

    @Override // defpackage.AbstractC3297d70
    public final void e(InterfaceC4005gW1 interfaceC4005gW1, Object obj) {
        C6786tX c6786tX = (C6786tX) obj;
        String str = c6786tX.a;
        if (str == null) {
            interfaceC4005gW1.P0(1);
        } else {
            interfaceC4005gW1.F(1, str);
        }
        String str2 = c6786tX.b;
        if (str2 == null) {
            interfaceC4005gW1.P0(2);
        } else {
            interfaceC4005gW1.F(2, str2);
        }
    }
}
