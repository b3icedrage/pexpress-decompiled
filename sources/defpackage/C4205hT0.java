package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: hT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4205hT0 extends C2784ak0 implements Function1 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4205hT0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                return ((XS0) this.e).c((JM) obj);
            default:
                C3496e42 strategy = (C3496e42) obj;
                Intrinsics.checkNotNullParameter(strategy, "p0");
                PR1 pr1 = (PR1) this.e;
                pr1.getClass();
                Intrinsics.checkNotNullParameter(strategy, "strategy");
                boolean z = strategy.l;
                InterfaceC6350rR1 interfaceC6350rR1 = pr1.f;
                JR1 jr1 = pr1.e;
                if (z) {
                    interfaceC6350rR1.a(strategy);
                    jr1.d();
                } else {
                    boolean z2 = pr1.j;
                    EnumC2644a42 enumC2644a42 = strategy.a;
                    if (z2) {
                        C5189lv.k(C8056za.j(pr1), null, new OR1(pr1, enumC2644a42, null), 3);
                        jr1.k();
                    } else {
                        interfaceC6350rR1.a(strategy);
                        jr1.d();
                        EnumC5028l80 enumC5028l80 = EnumC5028l80.P;
                        DR1 dr1 = new DR1(enumC2644a42.name());
                        ReporterApi reporterApi = pr1.g;
                        ReporterApi.a.b(reporterApi, enumC5028l80, dr1, null, 12);
                        ReporterApi.a.b(reporterApi, EnumC5028l80.O0, new SR1(enumC2644a42.name()), null, 12);
                    }
                }
                return Unit.a;
        }
    }
}
