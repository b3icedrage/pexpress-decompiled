package defpackage;

/* JADX INFO: renamed from: rg1, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final class C6401rg1 extends AbstractC3297d70 {
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6401rg1(QA1 qa1, int i) {
        super(qa1);
        this.d = i;
    }

    @Override // defpackage.CK1
    public final String c() {
        switch (this.d) {
            case 0:
                return "INSERT OR REPLACE INTO `Preference` (`key`,`long_value`) VALUES (?,?)";
            default:
                return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
        }
    }

    @Override // defpackage.AbstractC3297d70
    public final void e(InterfaceC4005gW1 interfaceC4005gW1, Object obj) {
        switch (this.d) {
            case 0:
                C5562ng1 c5562ng1 = (C5562ng1) obj;
                interfaceC4005gW1.F(1, c5562ng1.a);
                interfaceC4005gW1.n0(2, c5562ng1.b.longValue());
                break;
            default:
                Rk2 rk2 = (Rk2) obj;
                String str = rk2.a;
                if (str == null) {
                    interfaceC4005gW1.P0(1);
                } else {
                    interfaceC4005gW1.F(1, str);
                }
                String str2 = rk2.b;
                if (str2 != null) {
                    interfaceC4005gW1.F(2, str2);
                } else {
                    interfaceC4005gW1.P0(2);
                }
                break;
        }
    }
}
