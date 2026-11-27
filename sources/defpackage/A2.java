package defpackage;

import com.base.feature.account.screens.balance.AccountBalancePartBase;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class A2 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A2(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    /* JADX WARN: Type inference failed for: r0v3, types: [fO0, java.lang.Object] */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (AccountBalancePartBase) this.e;
            case 1:
                return ((Wd2) this.e.getValue()).getViewModelStore();
            default:
                return (Wd2) ((C7542x6) this.e).invoke();
        }
    }
}
