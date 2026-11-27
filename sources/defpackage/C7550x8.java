package defpackage;

/* JADX INFO: renamed from: x8, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes3.dex */
public final class C7550x8 extends AbstractC3297d70 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7550x8(QA1 qa1, int i) {
        super(qa1);
        this.d = i;
    }

    @Override // defpackage.CK1
    public final String c() {
        switch (this.d) {
            case 0:
                return "INSERT OR IGNORE INTO `agent` (`id`,`name`,`title`,`photo`) VALUES (?,?,?,?)";
            default:
                return "INSERT OR REPLACE INTO `SystemIdInfo` (`work_spec_id`,`generation`,`system_id`) VALUES (?,?,?)";
        }
    }

    @Override // defpackage.AbstractC3297d70
    public final void e(InterfaceC4005gW1 interfaceC4005gW1, Object obj) {
        switch (this.d) {
            case 0:
                XT xt = (XT) obj;
                interfaceC4005gW1.n0(1, xt.a);
                String str = xt.b;
                if (str == null) {
                    interfaceC4005gW1.P0(2);
                } else {
                    interfaceC4005gW1.F(2, str);
                }
                String str2 = xt.c;
                if (str2 == null) {
                    interfaceC4005gW1.P0(3);
                } else {
                    interfaceC4005gW1.F(3, str2);
                }
                String str3 = xt.d;
                if (str3 != null) {
                    interfaceC4005gW1.F(4, str3);
                } else {
                    interfaceC4005gW1.P0(4);
                }
                break;
            default:
                UW1 uw1 = (UW1) obj;
                String str4 = uw1.a;
                if (str4 == null) {
                    interfaceC4005gW1.P0(1);
                } else {
                    interfaceC4005gW1.F(1, str4);
                }
                interfaceC4005gW1.n0(2, uw1.b);
                interfaceC4005gW1.n0(3, uw1.c);
                break;
        }
    }
}
