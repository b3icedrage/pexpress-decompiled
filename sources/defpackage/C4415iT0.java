package defpackage;

import com.api.feature.analytics.reporters.ReporterApi;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: iT0, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C4415iT0 extends C2784ak0 implements Function1 {
    public final /* synthetic */ int m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C4415iT0(int i, Object obj, Class cls, String str, String str2, int i2, int i3) {
        super(i, obj, cls, str, str2, i2);
        this.m = i3;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.m) {
            case 0:
                return ((InterfaceC6211ql0) this.e).b((JM) obj);
            default:
                C3496e42 strategy = (C3496e42) obj;
                Intrinsics.checkNotNullParameter(strategy, "p0");
                PR1 pr1 = (PR1) this.e;
                pr1.getClass();
                Intrinsics.checkNotNullParameter(strategy, "strategy");
                pr1.f.a(strategy);
                pr1.e.d();
                EnumC5028l80 enumC5028l80 = EnumC5028l80.P;
                EnumC2644a42 enumC2644a42 = strategy.a;
                DR1 dr1 = new DR1(enumC2644a42.name());
                ReporterApi reporterApi = pr1.g;
                ReporterApi.a.b(reporterApi, enumC5028l80, dr1, null, 12);
                ReporterApi.a.b(reporterApi, EnumC5028l80.O0, new SR1(enumC2644a42.name()), null, 12);
                return Unit.a;
        }
    }
}
