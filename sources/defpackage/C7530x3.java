package defpackage;

import com.api.feature.alertdialog.screens.AlertDialogWithBinding;
import com.base.feature.account.screens.maininfo.AccountMainInfoPartBase;
import com.base.feature.analytics.reporters.ReporterBase;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: renamed from: x3, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C7530x3 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C7530x3(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return ((AccountMainInfoPartBase) this.e).l;
            case 1:
                Object obj = ((AlertDialogWithBinding) this.e).d;
                Intrinsics.checkNotNull(obj);
                return obj;
            case 2:
                ((Function0) this.e).invoke();
                return Unit.a;
            case 3:
                Integer numA = ((Oc2) this.e).a();
                return Integer.valueOf(numA != null ? numA.intValue() : 6);
            case 4:
                F80 f80 = new F80();
                f80.i = ((ReporterBase) this.e).c.a();
                return f80;
            case 5:
                return Long.valueOf(((C2817ap1) this.e).d);
            default:
                C7293vv1 c7293vv1 = (C7293vv1) this.e;
                if (!((Boolean) c7293vv1.d.B.d.getValue()).booleanValue()) {
                    c7293vv1.n("watchdog");
                }
                return Unit.a;
        }
    }
}
