package defpackage;

import com.base.feature.account.screens.settings.AccountSettingsPartBase;
import com.base.feature.stub.screens.stub_results.StubResultsFragment;
import com.impl.feature.platform.screens.deposit.DepositFragmentImpl;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* JADX INFO: renamed from: t4, reason: case insensitive filesystem */
/* JADX INFO: loaded from: classes.dex */
public final /* synthetic */ class C6693t4 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    public /* synthetic */ C6693t4(Object obj, int i) {
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return ((AccountSettingsPartBase) this.e).l;
            case 1:
                ((C8141zy) this.e).invoke();
                return Unit.a;
            case 2:
                return ((DepositFragmentImpl) this.e).y;
            case 3:
                ((C2360Wy1) this.e).l(L80.MAX_PROFIT);
                return Unit.a;
            case 4:
                ((C4617jA1) this.e).g.c();
                return Unit.a;
            case 5:
                return ((StubResultsFragment) this.e).j;
            default:
                return ((M22) this.e).b.F();
        }
    }
}
