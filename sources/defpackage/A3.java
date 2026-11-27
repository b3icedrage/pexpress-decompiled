package defpackage;

import com.base.feature.account.screens.maininfo.AccountMainInfoPartBase;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: classes.dex */
public final class A3 extends ML0 implements Function0 {
    public final /* synthetic */ int d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ A3(Object obj, int i) {
        super(0);
        this.d = i;
        this.e = obj;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.d) {
            case 0:
                return (AccountMainInfoPartBase) this.e;
            default:
                return (Wd2) ((C7127v71) this.e).invoke();
        }
    }
}
